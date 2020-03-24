package pageObject.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public enum LoginPageButton {
        INSERT(".auth-button_primary"),
        NAME("[placeholder=\"Ник или e-mail\"]"),
        PASSWORD("[type=\"password\"]"),
        RECOVER_PASSWORD("[href=\"https://profile.onliner.by/recover-password\"]"),
        REGISTRATION("[href=\"https://profile.onliner.by/registration\"]"),
        FACE_BOOK(".auth-form__button_fb"),
        VK(".auth-form__button_vk"),
        GOOGLE(".auth-form__button_gg"),
        CLOSE(".auth-form__close");
        private String title;

        LoginPageButton(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginPageLocator(LoginPageButton button) {
        return driver.findElement(By.cssSelector(button.title));
    }
}
