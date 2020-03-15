package pageObject.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static final By insertButtonLocator = By.cssSelector(".auth-button_primary");
    private static final By userNameLocator = By.cssSelector("[placeholder=\"Ник или e-mail\"]");
    private static final By passwordBarLocator = By.cssSelector("[type=\"password\"]");
    private static final By recoverPasswordLocator = By.cssSelector("[href=\"https://profile.onliner.by/recover-password\"]");
    private static final By registrationLocator = By.cssSelector("[href=\"https://profile.onliner.by/registration\"]");
    private static final By faceBookInsertLocator = By.cssSelector(".auth-form__button_fb");
    private static final By vKLocator = By.cssSelector(".auth-form__button_vk");
    private static final By googleInsertLocator = By.cssSelector(".auth-form__button_gg");

    private WebDriver driver;

    private WebElement insertButton;
    private WebElement userNameBar;
    private WebElement passwordBar;
    private WebElement registration;
    private WebElement recoverPassword;
    private WebElement fbInsertButton;
    private WebElement vkInsertButton;
    private WebElement ggInsertButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement insertButton() {
        insertButton = driver.findElement(insertButtonLocator);
        return insertButton;
    }

    public WebElement login() {
        userNameBar = driver.findElement(userNameLocator);
        return userNameBar;
    }

    public WebElement password() {
        passwordBar = driver.findElement(passwordBarLocator);
        return passwordBar;
    }

    public WebElement recoverForgottenPassword() {
        recoverPassword = driver.findElement(recoverPasswordLocator);
        return recoverPassword;
    }

    public WebElement registration() {
        registration = driver.findElement(registrationLocator);
        return registration;
    }

    public WebElement facebookInsert() {
        fbInsertButton = driver.findElement(faceBookInsertLocator);
        return fbInsertButton;
    }

    public WebElement vkInsert() {
        vkInsertButton = driver.findElement(vKLocator);
        return vkInsertButton;
    }

    public WebElement googleInsert() {
        ggInsertButton = driver.findElement(googleInsertLocator);
        return ggInsertButton;
    }
}
