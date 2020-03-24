package pageObject.ProductPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Offer {
    private static final By priceLocator = By.cssSelector(".price-primary");
    private static final By addToCartButtonLocator = By.cssSelector(".offers-list__button_basket");
    private static final By contactsButtonLocator = By.cssSelector(".offers-list__button_contacts");
    private WebElement offerLocator;
    private WebElement price;//price-primary
    private WebElement addToCart;//offers-list__button_basket
    private WebElement contacts;//offers-list__button_contacts

    public Offer(WebElement offerLocator) {
        this.offerLocator = offerLocator;
    }

    public WebElement getPrice() {
        price = offerLocator.findElement(priceLocator).findElement(By.cssSelector("span"));
        return price;
    }

    public WebElement getAddToCart() {
        return addToCart = offerLocator.findElement(addToCartButtonLocator);
    }

    public WebElement getContacts() {
        return contacts = offerLocator.findElement(contactsButtonLocator);
    }
}
