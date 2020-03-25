package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.CartPage.CartPage;

public class CartPageSteps {

    private CartPage cartPage;
    private WebDriver driver;

    public CartPageSteps(WebDriver driver) {
        this.driver = driver;
        cartPage = PageFactory.initElements(driver, CartPage.class);
    }

    public int amountUnitsInCart() {
        return cartPage.getCartOfferUnitsList().size();
    }

    public void removeItem(int indexOfItem) {
        cartPage.getCartOffersUnit(indexOfItem).getRemoveButton().click();
        cartPage.getCartOffersUnit(indexOfItem).getCloseItemButton().click();
    }

    public void back() {
        cartPage.closeCartPage().click();
    }
}
