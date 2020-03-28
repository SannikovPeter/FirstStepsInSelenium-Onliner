import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.CartPageSteps;
import steps.MainPageSteps;
import steps.ProductPageSteps;
import steps.SearchPageSteps;

public class FirstQuest extends WebDriverSettings {

    MainPageSteps mainPageSteps;
    ProductPageSteps productPageSteps;
    CartPageSteps cartPageSteps;
    SearchPageSteps searchPageSteps;

    @BeforeTest
    public void startInit() {
        mainPageSteps = new MainPageSteps(driver);
    }

    @Test
    public void firstQuest() {
        String SEARCH_TEXT = "Пылесос";
        int[] searchIndex = {1, 2};

        for (int i = 0; i < searchIndex.length; i++) {
            mainPageSteps.search(SEARCH_TEXT);

            searchPageSteps = new SearchPageSteps(driver);
            searchPageSteps.switchToSearchPage(SEARCH_TEXT);
            searchPageSteps.openSearchResult(searchIndex[i]);

            productPageSteps = new ProductPageSteps(driver);
            productPageSteps.openAllOffers();
            productPageSteps.addCheapestOffer();
        }
        mainPageSteps.openCartPage();
        cartPageSteps = new CartPageSteps(driver);

        int amountOfUnitsInCart = cartPageSteps.amountUnitsInCart();
        Assert.assertEquals(amountOfUnitsInCart, searchIndex.length, "Колличество товаров в корзине не совпадает с заданием");
    }

    @Test
    public void compareTest() {
        
    }
}
