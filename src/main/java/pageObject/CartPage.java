package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage{
    private static final By offerUnitLocator = By.cssSelector(".cart-form__offers-unit");
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCartOfferUnitsList(){
        return driver.findElements(offerUnitLocator);
    }

}
