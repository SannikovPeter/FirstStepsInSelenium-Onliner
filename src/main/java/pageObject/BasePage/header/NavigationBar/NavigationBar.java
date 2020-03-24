package pageObject.BasePage.header.NavigationBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class NavigationBar {

    private static final By arrowButtonLocator = By.cssSelector(".b-main-navigation__item_arrow");
    private static final By dropDownMenuLocator = By.cssSelector(".b-main-navigation__dropdown");
    private static final By navigationButtonLocator = By.cssSelector(".b-main-navigation__text");
    private static final By pizzaLocator = By.cssSelector(".b-main-navigation__advert_specific");
    private static final By currencyLocator = By.id("currency-informer");
    private static final By weatherLocator = By.id("weather-informer");
    private static final By sellCarLocator = By.cssSelector(".b-main-navigation__advert_secondary");

    public enum DropDownMenuType {NEWS_MENU, CAR_MARKET_MENU, HOUSE_MARKET_MENU}

    public enum NavigationButton {CATALOG_BUTTON, NEWS_BUTTON, CAR_MARKET_BUTTON, HOUSE_MARKET_BUTTON, SERVICES_BUTTON, FLEA_MARKET_BUTTON, FORUM_BUTTON}

    private WebDriver driver;

    private List<WebElement> navigationBarButtons;
    private List<WebElement> arrowButtonsLocators;
    private List<WebElement> dropDownMenuLocators;

    private WebElement navigationBarLocator;

    public NavigationBar(WebElement navigationBarLocator, WebDriver driver) {
        this.navigationBarLocator = navigationBarLocator;
        this.driver = driver;
    }

    private void activateDropDownMenu(DropDownMenuType menu) {
        arrowButtonsLocators = navigationBarLocator.findElements(arrowButtonLocator);
        WebElement arrow = arrowButtonsLocators.get(menu.ordinal());
        Actions action = new Actions(driver);
        action.moveToElement(arrow).build().perform();
    }

    public WebElement getNavigationButton(NavigationButton navigationButton) {
        navigationBarButtons = navigationBarLocator.findElements(navigationButtonLocator);
        return navigationBarButtons.get(navigationButton.ordinal());
    }

    public DropDownMenu getDropDownMenu(DropDownMenuType menuType) {
        dropDownMenuLocators = navigationBarLocator.findElements(dropDownMenuLocator);
        activateDropDownMenu(menuType);
        return new DropDownMenu(dropDownMenuLocators.get(menuType.ordinal()));
    }

    public WebElement getCurrency() {
        return navigationBarLocator.findElement(currencyLocator);
    }

    public WebElement getWeather() {
        return navigationBarLocator.findElement(weatherLocator);
    }

    public WebElement getSellCar() {
        return  navigationBarLocator.findElement(sellCarLocator);
    }

    public WebElement getPizza() {
        return navigationBarLocator.findElement(pizzaLocator);
    }
}
