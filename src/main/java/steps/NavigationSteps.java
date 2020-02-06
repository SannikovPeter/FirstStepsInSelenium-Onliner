package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObject.NavigationPage;

public class NavigationSteps extends BaseSteps {
    private NavigationPage navigationPage;

    private static final String ONLINER_TITLE = "Onliner";
    private static final String CATALOG_ONLINER_TITLE = "Каталог Onliner";
    private static final String BUY_AUTO_TITLE = "Купить авто в Беларуси - Автобарахолка Onliner";
    private static final String BUY_FLAT_TITLE = "Купить квартиру в Минске";
    private static final String SERVICES_TITLE = "Заказы на услуги";
    private static final String FLUE_MARKET_TITLE = "Барахолка onliner.by - Главная страница";
    private static final String FORUM_TITLE = "Форум onliner.by - Главная страница";

    public NavigationSteps(NavigationPage navigationPage, WebDriver driver) {
        super(driver);
        this.navigationPage = navigationPage;
    }

    public void openCatalog() {
        navigationPage.clickCatalogButton();
        Assert.assertEquals(navigationPage.getTitle(), CATALOG_ONLINER_TITLE);
    }

    public void openNews() {
        navigationPage.clickNewsButton();
        Assert.assertEquals(navigationPage.getTitle(), ONLINER_TITLE);
    }

    public void openAuto() {
        navigationPage.clickAutoButton();
        Assert.assertEquals(navigationPage.getTitle(), BUY_AUTO_TITLE);
    }

    public void openHouses() {
        navigationPage.clickHousesButton();
        Assert.assertEquals(navigationPage.getTitle(), BUY_FLAT_TITLE);
    }

    public void openServices() {
        navigationPage.clickServicesButton();
        Assert.assertEquals(navigationPage.getTitle(), SERVICES_TITLE);
    }

    public void openFleaMarket() {
        navigationPage.clickFleaMarketButton();
        Assert.assertEquals(navigationPage.getTitle(), FLUE_MARKET_TITLE);
    }

    public void openForum() {
        navigationPage.clickForumButton();
        Assert.assertEquals(navigationPage.getTitle(), FORUM_TITLE);
    }
}
