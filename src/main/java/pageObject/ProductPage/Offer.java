package pageObject.ProductPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Offer {

    private static final By priceLocator = By.cssSelector(".price-primary");
    private static final By addToCartButtonLocator = By.cssSelector(".offers-list__button_basket");
    private static final By contactsButtonLocator = By.cssSelector(".offers-list__button_contacts");
    private static final By priceWithoutRubles = By.cssSelector("span");

    private WebElement offerLocator;

    public Offer(WebElement offerLocator) {
        this.offerLocator = offerLocator;
    }

    public WebElement getPrice() {
        return offerLocator.findElement(priceLocator).findElement(priceWithoutRubles);
    }

    public WebElement getAddToCart() {
        return offerLocator.findElement(addToCartButtonLocator);
    }

    public WebElement getContacts() {
        return offerLocator.findElement(contactsButtonLocator);
    }
}
