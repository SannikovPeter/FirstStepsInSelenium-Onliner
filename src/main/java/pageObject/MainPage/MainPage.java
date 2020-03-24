package pageObject.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage.BasePage;

import java.util.List;

public class MainPage extends BasePage {

    private static final By middleNavigationBarLinkLocator = By.cssSelector(".project-navigation__link");
    private static final By middleNavigationBarLocator = By.cssSelector(".project-navigation__sign");
    private static final By samsungButtonLocator = By.cssSelector(".project-navigation__samsung");
    private static final By fastTilesFieldLocator = By.cssSelector(".b-tiles-outer");
    private static final By tileLocator = By.cssSelector(".b-tile");

    private WebDriver driver;
    private WebElement fastTilesField;//
    private List<WebElement> tiles;//b-tile

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    private WebElement getMiddleNavigationBar() {
        return driver.findElement(middleNavigationBarLocator);
    }

    public List<WebElement> getMiddleNavigationBarLinks() {
        return getMiddleNavigationBar().findElements(middleNavigationBarLinkLocator);
    }

    public WebElement getSamsungButton(){
        return getMiddleNavigationBar().findElement(samsungButtonLocator);
    }

    private WebElement getFastTilesField(){
        return driver.findElement(fastTilesFieldLocator);
    }

    public List<WebElement> getTiles() {
        return getFastTilesField().findElements(tileLocator);
    }
}
