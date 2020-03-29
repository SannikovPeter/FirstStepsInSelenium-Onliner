package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObject.ProductPage.CatalogPage;

public class ProductPageSteps extends BasePageSteps {

    private CatalogPage catalogPage;

    public ProductPageSteps(WebDriver driver) {
        super(driver);
        catalogPage = PageFactory.initElements(driver, CatalogPage.class);
    }

    public void addCheapestOffer() {
        catalogPage.getProductOffers().getCheapestOffer().getAddToCart().click();
    }

    public void openAllOffers() {
        catalogPage.getAllOffersButton().click();
        catalogPage.getProductOffers().getChangeDestination().click();
        catalogPage.wait.until(ExpectedConditions.elementToBeClickable(catalogPage.getProductOffers().getClosePopUpButton())).click();
    }
}
