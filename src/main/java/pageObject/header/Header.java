package pageObject.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

    private static final By navigationBarLocator = By.cssSelector(".b-top-menu");
    private static final By userBarLocator = By.id("userbar");
    private static final By fastSearchBarLocator = By.cssSelector(".fast-search__input");

    private NavigationBar navigationBar;
    private UserBar userBar;
    private WebElement fastSearchBar;

    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public NavigationBar getNavigationBar() {
        navigationBar = new NavigationBar(driver.findElement(navigationBarLocator),driver);
        return navigationBar;
    }

    public UserBar getUserBar() {
        userBar = new UserBar(driver.findElement(userBarLocator),driver);
        return userBar;
    }

    public WebElement getFastSearchBar() {
        fastSearchBar = driver.findElement(fastSearchBarLocator);
        return fastSearchBar;
    }
}
