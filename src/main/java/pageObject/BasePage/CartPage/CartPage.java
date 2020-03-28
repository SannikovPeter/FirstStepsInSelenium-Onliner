package pageObject.BasePage.CartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {
    private static final By offerUnitLocator = By.cssSelector(".cart-form__offers-unit");
    private static final By closeCartLocator = By.cssSelector(".cart-form__image_logo");
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCartOfferUnitsList() {
        return driver.findElements(offerUnitLocator);
    }

    public CartOffersUnit getCartOffersUnit(int indexOfUnit) {
        return new CartOffersUnit(getCartOfferUnitsList().get(indexOfUnit));
    }

    public WebElement closeCartPage() {
        return driver.findElement(closeCartLocator);
    }

}
