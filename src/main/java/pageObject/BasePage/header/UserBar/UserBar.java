package pageObject.BasePage.header.UserBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.CartPage;

public class UserBar {

    public enum UnVerifyBar {
        INSERT_BUTTON(".auth-bar__item--text"),
        FACEBOOK(".auth-bar__item--fb"),
        VK_BUTTON(".auth-bar__item--vk-alter"),
        GOOGLE_BUTTON("auth-bar__item--gg"),
        CART_BUTTON(".auth-bar__item--cart");
        private String title;

        UnVerifyBar(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }

    private WebElement userBarLocator;
    private WebDriver driver;

    public UserBar(WebElement userBarLocator, WebDriver driver) {
        this.driver = driver;
        this.userBarLocator = userBarLocator;
    }

    public WebElement getUserBarButton(UnVerifyBar unVerifyBarButton) {
        return userBarLocator.findElement(By.cssSelector(unVerifyBarButton.title));
    }

    public VerifyUserBar getVerifyUserBar() {
        return new VerifyUserBar(userBarLocator);
    }

    public CartPage getCartPage(){
        return new CartPage(driver);
    }

}
