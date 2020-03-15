package pageObject.BasePage.header.UserBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static pageObject.BasePage.header.UserBar.UserBarDropDownMenu.UserBarDropDownButtons.MY_ADVERTISING_ARROW;

public class UserBarDropDownMenu {

    private static final By profileSettingsLocator = By.cssSelector(".b-top-profile__settings");
    private static final By dropDownMenuButtonLocator = By.cssSelector(".b-top-profile__link");

    private WebElement userBarDropDownMenuLocator;
    private List<WebElement> dropDownMenuButton;

    public enum UserBarDropDownButtons {
        NAME, LOG_OUT, DROP_DOWN_CART, HISTORY, SUBSCRIBES, MY_ADVERTISING_ARROW, BARAHOLKA_ADVERT, CATALOG_ADVERT,
        CAR_ADVERT, MOTO_ADVERT, RENT_APART_ADVERT, SELL_APART_ADVERT, SERVICES, REVIEWS, ON_FORUM, MESSAGES, USER_AGREEMENT
    }

    public UserBarDropDownMenu(WebElement userBarDropDownMenuLocator) {
        this.userBarDropDownMenuLocator = userBarDropDownMenuLocator;
        dropDownMenuButton = userBarDropDownMenuLocator.findElements(dropDownMenuButtonLocator);
    }

    private void activateSubMenu() {
        dropDownMenuButton.get(MY_ADVERTISING_ARROW.ordinal()).click();
    }

    public WebElement getUserBarDropDownButton(UserBarDropDownButtons button) {
        activateSubMenu();
        return dropDownMenuButton.get(button.ordinal());
    }

    public WebElement getDropDownMenuProfileSettings() {
        return userBarDropDownMenuLocator.findElement(profileSettingsLocator);
    }
}
