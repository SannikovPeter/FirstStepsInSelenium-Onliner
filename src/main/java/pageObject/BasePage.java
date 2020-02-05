package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {

    private WebDriver driver;
    public static final int TIME = 10;

    @FindBy(css = ".auth-bar__item--text")
    private WebElement insert;
    @FindBy(css = ".fast-search__input")
    private WebElement fastSearchBar;
    @FindBy(css = ".modal-iframe")
    private WebElement newFrame;
    @FindBy(css = ".search__input")
    private WebElement searchBar;
    @FindAll(@FindBy(css =".b-main-navigation__text"))
    private  List<WebElement> mainNavigationSelectors;

    public void OpenInsertForm() {
        insert.click();
    }

    public void Search(String searchItem) {
        try {
            fastSearchBar.sendKeys(searchItem);
        } catch (ElementNotInteractableException e) {
            driver.findElement(By.cssSelector(".button-style_primary")).click();
            fastSearchBar.sendKeys(searchItem);
        }
        driver.switchTo().frame(newFrame);
        searchBar.clear();
        searchBar.sendKeys(searchItem);
        driver.manage().timeouts().implicitlyWait(TIME, TimeUnit.SECONDS);
    }

    public enum mainNavigationLinks {CATALOG,NEWS,AUTO,HOUSES,SERVICES,FLEA_MARKET,FORUM}

    public void openMainNavigation(mainNavigationLinks h){
        switch (h){
            case CATALOG: mainNavigationSelectors.get(0).click();
                break;
            case NEWS: mainNavigationSelectors.get(1).click();
                break;
            case AUTO: mainNavigationSelectors.get(2).click();
                break;
            case HOUSES: mainNavigationSelectors.get(3).click();
                break;
            case SERVICES: mainNavigationSelectors.get(4).click();
                break;
            case FLEA_MARKET: mainNavigationSelectors.get(5).click();
                break;
            case FORUM: mainNavigationSelectors.get(6).click();
                break;
        }
    }

}

