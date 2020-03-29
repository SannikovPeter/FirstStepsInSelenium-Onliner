import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.*;

import static pageObject.BasePage.SearchPage.SearchPage.SearchCategory.CATALOG;

public class FirstQuest extends WebDriverSettings {

    private MainPageSteps mainPageSteps;
    private ProductPageSteps productPageSteps;
    private CartPageSteps cartPageSteps;
    private SearchPageSteps searchPageSteps;
    private ComparePageSteps comparePageSteps;

    @BeforeTest
    public void startInit() {
        mainPageSteps = new MainPageSteps(driver);
    }

    @Test
    public void firstQuest() {
        String SEARCH_TEXT = "Пылесос";
        int[] searchIndex = {1, 2};

        for (int index : searchIndex) {
            mainPageSteps.openSearchPage(SEARCH_TEXT);
            searchPageSteps = new SearchPageSteps(driver);
            searchPageSteps.switchFrameToSearchPage(SEARCH_TEXT);
            searchPageSteps.selectSearchCategory(CATALOG);
            searchPageSteps.openCatalogSearchResult(index);

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
        String SEARCH_TEXT = "Пылесос";
        int[] searchIndex = {1, 2};

        mainPageSteps.openSearchPage(SEARCH_TEXT);
        searchPageSteps = new SearchPageSteps(driver);
        searchPageSteps.switchFrameToSearchPage(SEARCH_TEXT);
        searchPageSteps.selectSearchCategory(CATALOG);

        for (int index : searchIndex) {
            searchPageSteps.addToCompareList(index);
        }
        mainPageSteps.openComparePage();
        comparePageSteps = new ComparePageSteps(driver);

        Assert.assertEquals(comparePageSteps.amountOfCompareItems(), searchIndex.length, "Колличество товаров на странице сравнения не совпадает с заданием");
    }
}
