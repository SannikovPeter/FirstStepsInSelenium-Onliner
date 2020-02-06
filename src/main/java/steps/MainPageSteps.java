package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObject.MainPage;
import pageObject.LoginPage;

public class MainPageSteps extends BaseSteps {

    private static final String ONLINER_TITLE = "Onliner";
    private static final String CATALOG_ONLINER_TITLE = "Каталог Onliner";
    private static final String BUY_AUTO_TITLE = "Купить авто в Беларуси - Автобарахолка Onliner";
    private static final String BUY_FLAT_TITLE = "Купить квартиру в Минске";
    private static final String SERVICES_TITLE = "Заказы на услуги";
    private static final String FLUE_MARKET_TITLE = "Барахолка onliner.by - Главная страница";
    private static final String FORUM_TITLE = "Форум onliner.by - Главная страница";
    private MainPage mainPage;

    public MainPageSteps(MainPage mainPage, WebDriver driver) {
        super(driver);
        this.mainPage = mainPage;
    }

    public LoginSteps openLoginPage() {
        mainPage.OpenInsertForm();
        return new LoginSteps(PageFactory.initElements(driver, LoginPage.class), driver);
    }

    public void openCatalog() {
        mainPage.clickCatalogButton();
        Assert.assertEquals(mainPage.getTitle(), CATALOG_ONLINER_TITLE);
    }

    public void openNews() {
        mainPage.clickNewsButton();
        Assert.assertEquals(mainPage.getTitle(), ONLINER_TITLE);
    }

    public void openAuto() {
        mainPage.clickAutoButton();
        Assert.assertEquals(mainPage.getTitle(), BUY_AUTO_TITLE);
    }

    public void openHouses() {
        mainPage.clickHousesButton();
        Assert.assertEquals(mainPage.getTitle(), BUY_FLAT_TITLE);
    }

    public void openServices() {
        mainPage.clickServicesButton();
        Assert.assertEquals(mainPage.getTitle(), SERVICES_TITLE);
    }

    public void openFleaMarket() {
        mainPage.clickFleaMarketButton();
        Assert.assertEquals(mainPage.getTitle(), FLUE_MARKET_TITLE);
    }

    public void openForum() {
        mainPage.clickForumButton();
        Assert.assertEquals(mainPage.getTitle(), FORUM_TITLE);
    }
}
