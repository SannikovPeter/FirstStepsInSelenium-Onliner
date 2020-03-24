import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.BasePageSteps;
import steps.MainPageSteps;

public class GoToTests extends WebDriverSettings {

    BasePageSteps basePageSteps;
    MainPageSteps mainPageSteps;

    @BeforeTest
    public void start() {
        basePageSteps = new BasePageSteps(driver);
    }

    @Test
    public void fastSearchTest() {
        basePageSteps.search("Пылесос");
    }

    @Test
    public void insertTest() {
        basePageSteps.login("Piter", "12345");
    }

    @Test
    public void middleNavigationBarTest() {
        mainPageSteps = new MainPageSteps(driver);
        mainPageSteps.fastTilesFieldClick(1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insertFaceBookTest(){
        basePageSteps.faceBookLogin();
    }
}
