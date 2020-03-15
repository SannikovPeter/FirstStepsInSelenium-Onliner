package pageObject.BasePage.header.UserBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyUserBar {

    private static final By dropDownMenuLocator = By.cssSelector(".b-top-profile__dropdown_user");
    private WebElement verifyUserBar;

    public enum VerifyUserBarButton {
        MESSAGE_BUTTON(".b-top-profile__message"),
        NOTICE_BUTTON(".b-top-profile__notice"),
        FAVORITES_BUTTON(".b-top-profile__favorites"),
        PROFILE_CART_BUTTON(".b-top-profile__cart"),
        DROP_DOWN_ARROW(".b-top-profile__item_arrow");
        private String title;

        VerifyUserBarButton(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }

    public VerifyUserBar(WebElement verifyUserBar) {
        this.verifyUserBar = verifyUserBar;
    }

    public WebElement getVerifyUserBarButton(VerifyUserBarButton button) {
        return verifyUserBar.findElement(By.cssSelector(button.title));
    }

    private void activateDropDownMenu() {
        getVerifyUserBarButton(VerifyUserBarButton.DROP_DOWN_ARROW).click();
    }

    public UserBarDropDownMenu getUserBarDropDownMenu() {
        activateDropDownMenu();
        return new UserBarDropDownMenu(verifyUserBar.findElement(dropDownMenuLocator));
    }

}
