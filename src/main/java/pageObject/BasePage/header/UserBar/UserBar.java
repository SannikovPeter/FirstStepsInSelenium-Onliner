package pageObject.BasePage.header.UserBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

    private boolean activity;

    private WebElement userBarLocator;

    public UserBar(WebElement userBarLocator) {
        this.userBarLocator = userBarLocator;
        activity = false;
    }

    public boolean isActivity() {
        return activity;
    }

    public void activate() {
        activity = true;
    }

    public void deactivate() {
        activity = false;
    }

    public WebElement getUserBarButton(UnVerifyBar unVerifyBarButton) {
        return userBarLocator.findElement(By.cssSelector(unVerifyBarButton.title));
    }

    public VerifyUserBar getVerifyUserBar() {
        return new VerifyUserBar(userBarLocator);
    }

}
