import org.testng.annotations.Test;
import steps.LoginSteps;

public class UnVerifyBarTests extends WebDriverSettings {

    private LoginSteps loginSteps;

    @Test
    public void firstQuestTest() {
        FirstQuest firstQuest = new FirstQuest(driver);
        firstQuest.test1();
    }

//    @BeforeTest
//    public void startInsertTests() {
//        MainPageSteps mainPageSteps = new MainPageSteps(PageFactory.initElements(driver, MainPage.class), driver);
//        loginSteps = mainPageSteps.openLoginPage();
//    }
//
//    @Test
//    public void unSuccessLogin() {
//        String pass = "123455";
//        String name = "Name";
//        loginSteps.login(name, pass);
//    }
//
//    @Test
//    public void successFaceBookInsert() {
//        loginSteps.faceBookLogin();
//    }
//
//    @Test
//    public void successVKInsert() {
//        loginSteps.vKLogin();
//    }
//
//    @Test
//    public void successGoogleInsert() {
//        loginSteps.checkGoogleLogin();
//    }
//
//    @Test
//    public void successOpenRecoveryForm() {
//        loginSteps.openRecoveryForm();
//    }
//
//    @Test
//    public void successOpenSignInForm() {
//        loginSteps.openSignInForm();
//    }

}
