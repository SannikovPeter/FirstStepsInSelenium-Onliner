package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NavigationPage extends BasePage {
    private WebDriver driver;

    @FindAll(@FindBy(css = ".b-main-navigation__text"))
    private List<WebElement> mainNavigationSelectors;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickCatalogButton() {
        mainNavigationSelectors.get(0).click();
    }

    public void clickNewsButton() {
        mainNavigationSelectors.get(1).click();
    }

    public void clickAutoButton() {
        mainNavigationSelectors.get(2).click();
    }

    public void clickHousesButton() {
        mainNavigationSelectors.get(3).click();
    }

    public void clickServicesButton() {
        mainNavigationSelectors.get(4).click();
    }

    public void clickFleaMarketButton() {
        mainNavigationSelectors.get(5).click();
    }

    public void clickForumButton() {
        mainNavigationSelectors.get(6).click();
    }


}
