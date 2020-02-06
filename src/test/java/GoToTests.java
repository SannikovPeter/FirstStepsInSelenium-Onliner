import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.MainPage;
import steps.MainPageSteps;

public class GoToTests extends WebDriverSettings {

    MainPageSteps mainPageSteps;

    @BeforeTest
    public void startTestSettings() {
        mainPageSteps = new MainPageSteps(PageFactory.initElements(driver, MainPage.class), driver);
    }

    @Test
    public void successOpenCatalog() {
        mainPageSteps.openCatalog();
    }

    @Test
    public void successOpenNews() {
        mainPageSteps.openNews();
    }

    @Test
    public void successOpenAuto() {
        mainPageSteps.openAuto();
    }

    @Test
    public void successOpenHouses() {
        mainPageSteps.openHouses();
    }

    @Test
    public void successOpenServices() {
        mainPageSteps.openServices();
    }

    @Test
    public void successOpenFleaMarket() {
        mainPageSteps.openFleaMarket();
    }

    @Test
    public void successOpenForum() {
        mainPageSteps.openForum();
    }
}
