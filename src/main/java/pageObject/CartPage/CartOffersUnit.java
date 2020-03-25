package pageObject.CartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartOffersUnit {

    private static final By removeButtonLocator = By.cssSelector(".cart-form__button_remove");
    private static final By closeItemButtonLocator = By.cssSelector(".cart-form__link_small");
    private WebElement CartOffersUnitLocator;

    public CartOffersUnit(WebElement cartOffersUnitLocator) {
        CartOffersUnitLocator = cartOffersUnitLocator;
    }

    public WebElement getRemoveButton() {
        return CartOffersUnitLocator.findElement(removeButtonLocator);
    }

    public WebElement getCloseItemButton() {
        return CartOffersUnitLocator.findElements(closeItemButtonLocator).get(1);
    }

}
