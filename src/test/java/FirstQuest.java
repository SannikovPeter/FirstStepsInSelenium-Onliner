import org.testng.Assert;
import org.testng.annotations.Test;
import steps.MainPageSteps;
import steps.ProductPageSteps;

public class FirstQuest extends WebDriverSettings {

    @Test
    public void firstQuest() {
        String SEARCH_TEXT = "Пылесос";
        int[] searchIndex = {1,2};

        MainPageSteps mainPageSteps = new MainPageSteps(driver);
        ProductPageSteps productPageSteps;

        for (int i = 0; i < searchIndex.length; i++) {
            mainPageSteps.search(SEARCH_TEXT);
            mainPageSteps.getSearchResult(searchIndex[i]).click();

            productPageSteps = new ProductPageSteps(driver);
            productPageSteps.openAllOffers();
            productPageSteps.addCheapestOffer();
        }

        int amountOfUnitsInCart = mainPageSteps.amountUnitsInCart();
        Assert.assertEquals(searchIndex.length,amountOfUnitsInCart,"Колличество товаров в корзине не совпадает с заданием");
    }

}
