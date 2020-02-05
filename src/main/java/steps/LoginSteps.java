package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObject.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends BaseSteps {
    private static final String НЕВЕРНЫЙ_ЛОГИН_ИЛИ_ПАРОЛЬ = "Неверный логин или пароль";
    private static final String ВОЙДИТЕ_НА_FACEBOOK_FACEBOOK = "Войдите на Facebook | Facebook";
    private static final String ВКОНТАКТЕ_ВХОД = "ВКонтакте | Вход";
    private static final String ВХОД_GOOGLE_АККАУНТЫ = "Вход – Google Аккаунты";
    private static final String ВОССТАНОВЛЕНИЕ_ПАРОЛЯ = "Восстановление пароля";
    private static final String РЕГИСТРАЦИЯ = "Регистрация";

    private LoginPage loginPage;

    LoginSteps(LoginPage loginPage, WebDriver driver) {
        super(driver);
        this.loginPage = loginPage;
    }

    public void login(String login, String pass) {
        loginPage.insertName(login);
        loginPage.insertPassword(pass);
        loginPage.clickInsertButton();
        Assert.assertEquals(loginPage.errorMessage(), НЕВЕРНЫЙ_ЛОГИН_ИЛИ_ПАРОЛЬ);
    }

    public void faceBookLogin() {
        loginPage.facebookInsert();
        Assert.assertEquals(loginPage.SuccessInsertPageTitle(), ВОЙДИТЕ_НА_FACEBOOK_FACEBOOK);
    }

    public void vKLogin() {
        loginPage.vkInsert();
        Assert.assertEquals(loginPage.SuccessInsertPageTitle(), ВКОНТАКТЕ_ВХОД);
    }

    public void googleLogin() {
        loginPage.googleInsert();
        Assert.assertEquals(loginPage.SuccessInsertPageTitle(), ВХОД_GOOGLE_АККАУНТЫ);
    }

    public void openRecoveryForm() {
        loginPage.clickForgetPassword();
        Assert.assertEquals(loginPage.FormTitle(), ВОССТАНОВЛЕНИЕ_ПАРОЛЯ);
    }

    public void openSignInForm(){
        loginPage.registration();
        Assert.assertEquals(loginPage.FormTitle(), РЕГИСТРАЦИЯ);
    }
}
