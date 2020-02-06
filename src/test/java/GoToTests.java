import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.MainPage;
import steps.MainPageSteps;
import steps.NavigationSteps;

public class GoToTests extends WebDriverSettings {

    NavigationSteps navigationSteps;

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
}
