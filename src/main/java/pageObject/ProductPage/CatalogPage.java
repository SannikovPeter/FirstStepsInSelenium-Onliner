package pageObject.ProductPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage.BasePage;

import java.util.List;

public class CatalogPage extends BasePage {

    private static final By productOffersLocator = By.id("product-prices-body");
    private static final By navigationLinkLocator = By.cssSelector(".catalog-navigation-classifier__item-title");
    private static final By allOffersButtonLocator = By.cssSelector(".button_big");

    private ProductOffersPage productOffers;
    private List<WebElement> navigationLinks;
    private WebElement allOffersButton;
    private WebDriver driver;


    public CatalogPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public List<WebElement> getNavigationLinks() {
        navigationLinks = driver.findElements(navigationLinkLocator);
        return navigationLinks;
    }

    public WebElement getAllOffersButton() {
        allOffersButton = driver.findElement(allOffersButtonLocator);
        return allOffersButton;
    }

    public ProductOffersPage getProductOffers() {
        productOffers = new ProductOffersPage(driver.findElement(productOffersLocator), driver);
        return productOffers;
    }

}
