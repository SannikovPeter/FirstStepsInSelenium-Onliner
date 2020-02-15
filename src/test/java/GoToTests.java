import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.MainPage;
import steps.DropDownNewsSteps;
import steps.MainPageSteps;
import steps.NavigationSteps;

public class GoToTests extends WebDriverSettings {

    private NavigationSteps navigationSteps;

    @BeforeTest
    public void startTestSettings() {
        MainPageSteps mainPageSteps = new MainPageSteps(PageFactory.initElements(driver, MainPage.class), driver);
        navigationSteps = mainPageSteps.openNavigationPage();
    }

    @Test
    public void successOpenCatalog() {
        navigationSteps.openCatalog();
    }

    @Test
    public void successOpenNews() {
        navigationSteps.openNews();
    }

    @Test
    public void successOpenAuto() {
        navigationSteps.openAuto();
    }

    @Test
    public void successOpenHouses() {
        navigationSteps.openHouses();
    }

    @Test
    public void successOpenServices() {
        navigationSteps.openServices();
    }

    @Test
    public void successOpenFleaMarket() {
        navigationSteps.openFleaMarket();
    }

    @Test
    public void successOpenForum() {
        navigationSteps.openForum();
    }

    @Test
    public void testNewsTitle() {
        MainPageSteps mainPageSteps2 = new MainPageSteps(PageFactory.initElements(driver, MainPage.class), driver);
        DropDownNewsSteps dropDownNewsSteps = mainPageSteps2.openDropDownNewsPage();
        dropDownNewsSteps.clickOnTitle(DropDownNewsSteps.Categories.PEOPLE);
    }

    @Test
    public void testNewsButton() {
        MainPageSteps mainPageSteps2 = new MainPageSteps(PageFactory.initElements(driver, MainPage.class), driver);
        DropDownNewsSteps dropDownNewsSteps = mainPageSteps2.openDropDownNewsPage();
        dropDownNewsSteps.clickOnNewsButton(DropDownNewsSteps.Categories.PEOPLE);
    }

    @Test
    public void testNewsNumberOne() {
        MainPageSteps mainPageSteps2 = new MainPageSteps(PageFactory.initElements(driver, MainPage.class), driver);
        DropDownNewsSteps dropDownNewsSteps = mainPageSteps2.openDropDownNewsPage();
        dropDownNewsSteps.clickOnNewsNumberOne(DropDownNewsSteps.Categories.PEOPLE);
    }

    @Test
    public void testCarMarketTitle() {
        MainPageSteps mainPageSteps2 = new MainPageSteps(PageFactory.initElements(driver, MainPage.class), driver);
        DropDownNewsSteps dropDownNewsSteps = mainPageSteps2.openDropDownNewsPage();
        dropDownNewsSteps.clickOnCarMarketTitle(DropDownNewsSteps.Categories.CAR_MARKET);
    }

}
