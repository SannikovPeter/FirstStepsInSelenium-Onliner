package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObject.ProductPage.ProductPage;

public class ProductPageSteps extends BasePageSteps {

    private ProductPage productPage;

    public ProductPageSteps(WebDriver driver) {
        super(driver);
        productPage = PageFactory.initElements(driver, ProductPage.class);
    }

    public void addCheapestOffer() {
        productPage.getProductOffers().getCheapestOffer().getAddToCart().click();
    }

    public void openAllOffers() {
        productPage.getAllOffersButton().click();
        productPage.getProductOffers().getChangeDestination().click();
        productPage.wait.until(ExpectedConditions.elementToBeClickable(productPage.getProductOffers().getClosePopUpButton())).click();
    }
}
