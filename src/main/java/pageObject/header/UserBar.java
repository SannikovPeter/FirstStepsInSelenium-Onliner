package pageObject.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserBar {

    private boolean activity;
    @FindBy(css = ".auth-bar__item--text")
    private WebElement insertButton;
    @FindBy(css = ".auth-bar__item--fb")
    private WebElement fastFBInsertButton;
    @FindBy(css = ".auth-bar__item--vk-alter")
    private WebElement fastVKInsertButton;
    @FindBy(css = "auth-bar__item--gg")
    private WebElement fastGoogleInsertButton;
    @FindBy(css = ".auth-bar__item--cart")
    private WebElement cartButton;
    @FindBy(css = ".onliner_logo")
    private WebElement onlinerLogo;

    private WebElement userBarSelector;
    private WebDriver driver;

    public UserBar(WebElement userBarSelector, WebDriver driver) {
        this.userBarSelector = userBarSelector;
        this.driver = driver;
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

    public WebElement getInsertButton() {
        return insertButton;
    }

    public WebElement getFastFBInsertButton() {
        return fastFBInsertButton;
    }

    public WebElement getFastVKInsertButton() {
        return fastVKInsertButton;
    }

    public WebElement getFastGoogleInsertButton() {
        return fastGoogleInsertButton;
    }

    public WebElement getCartButton() {
        return cartButton;
    }

    public WebElement getOnlinerLogo() {
        return onlinerLogo;
    }

}
