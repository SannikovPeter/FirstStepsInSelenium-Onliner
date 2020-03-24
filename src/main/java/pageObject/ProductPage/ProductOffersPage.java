package pageObject.ProductPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductOffersPage {

    private static final By changeDestinationLocator = By.cssSelector(".offers-list__link_base");
    private static final By offersLocator = By.cssSelector(".state_add-to-cart");
    private static final By closePopUpButtonLocator = By.cssSelector(".auth-popup__close");
    private WebElement productOffersPageLocator;
    private WebElement changeDestination;
    private WebElement closePopUpButton;                           //нужны ли эти переменные?
    private List<WebElement> offersLocators;
    private WebDriver driver;

    public ProductOffersPage(WebElement productOffersPageLocator, WebDriver driver) {
        this.driver = driver;
        this.productOffersPageLocator = productOffersPageLocator;
    }

    public List<WebElement> getOffersLocators() {
        offersLocators = productOffersPageLocator.findElements(offersLocator);
        return offersLocators;
    }

    private Offer getOffer(int index) {
        return new Offer(getOffersLocators().get(index));
    }

    public Offer getCheapestOffer() {
        int indexOfCheapestOffer = 0;
        double valueOfCheapestOffer = 0;
        for (int i = 0; i < getOffersLocators().size(); i++) {
            String price = getOffer(i).getPrice().getText();
            Double priceDouble = Double.parseDouble(price.replace(',', '.'));
            if (i == 0) {
                valueOfCheapestOffer = priceDouble;
            }
            if (priceDouble < valueOfCheapestOffer) {
                indexOfCheapestOffer = i;
                valueOfCheapestOffer = priceDouble;
            }
        }
        return getOffer(indexOfCheapestOffer);
    }

    public WebElement getChangeDestination() {
        changeDestination = driver.findElement(changeDestinationLocator);
        return changeDestination;
    }

    public WebElement getClosePopUpButton() {
        closePopUpButton = driver.findElement(closePopUpButtonLocator);
        return closePopUpButton;
    }
}
