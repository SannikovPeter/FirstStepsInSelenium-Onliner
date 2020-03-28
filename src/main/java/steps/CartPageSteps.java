package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.BasePage.CartPage.CartPage;

public class CartPageSteps {

    private CartPage cartPage;

    public CartPageSteps(WebDriver driver) {
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
