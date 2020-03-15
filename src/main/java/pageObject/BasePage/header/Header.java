package pageObject.BasePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage.header.NavigationBar.NavigationBar;
import pageObject.BasePage.header.UserBar.UserBar;

public class Header {

    private static final By navigationBarLocator = By.cssSelector(".b-top-menu");
    private static final By userBarLocator = By.id("userbar");
    private static final By fastSearchBarLocator = By.cssSelector(".fast-search__input");
    private static final By onlinerLogoLocator = By.cssSelector(".onliner_logo");

    private NavigationBar navigationBar;
    private UserBar userBar;
    private WebElement fastSearchBar;
    private WebElement onlinerLogo;

    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public NavigationBar getNavigationBar() {
        navigationBar = new NavigationBar(driver.findElement(navigationBarLocator), driver);
        return navigationBar;
    }

    public UserBar getUserBar() {
        userBar = new UserBar(driver.findElement(userBarLocator));
        return userBar;
    }

    public WebElement getFastSearchBar() {
        fastSearchBar = driver.findElement(fastSearchBarLocator);
        return fastSearchBar;
    }

    public WebElement getOnlinerLogo() {
        onlinerLogo = driver.findElement(onlinerLogoLocator);
        return onlinerLogo;
    }
}
