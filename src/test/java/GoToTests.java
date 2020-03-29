import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.BasePageSteps;
import steps.LoginPageSteps;
import steps.MainPageSteps;

public class GoToTests extends WebDriverSettings {

    BasePageSteps basePageSteps;
    MainPageSteps mainPageSteps;
    LoginPageSteps loginPageSteps;

    @BeforeTest
    public void start() {
        basePageSteps = new BasePageSteps(driver);
    }

    @Test
    public void insertTest() {
        String loginName = "Piter";
        String loginPassword = "12345";

        basePageSteps.openLoginPage();
        loginPageSteps = new LoginPageSteps(driver);
        loginPageSteps.login(loginName, loginPassword);
    }

    @Test
    public void middleNavigationBarTest() {
        mainPageSteps = new MainPageSteps(driver);

        mainPageSteps.fastTilesFieldClick(1);
    }

}
