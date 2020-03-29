package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.BasePage.LoginPage;

import static pageObject.BasePage.LoginPage.LoginPageButton.*;

public class LoginPageSteps {

    private LoginPage loginPage;

    public LoginPageSteps(WebDriver driver) {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public void login(String name, String password) {
        loginPage.getLoginPageLocator(NAME).sendKeys(name);
        loginPage.getLoginPageLocator(PASSWORD).sendKeys(password);
        loginPage.getLoginPageLocator(INSERT).click();
    }

}
