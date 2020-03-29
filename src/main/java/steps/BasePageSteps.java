package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.BasePage.BasePage;
import pageObject.BasePage.header.UserBar.UserBar;

import static pageObject.BasePage.header.UserBar.UserBar.UnVerifyBar.CART_BUTTON;
import static pageObject.BasePage.header.UserBar.UserBar.UnVerifyBar.INSERT_BUTTON;

public class BasePageSteps {

    private BasePage basePage;

    public BasePageSteps(WebDriver driver) {
        basePage = PageFactory.initElements(driver, BasePage.class);
    }

    public void openSearchPage(String searchText) {
        basePage.getHeader().getFastSearchBar().sendKeys(searchText);
        basePage.switchToSearchFrame();
    }

    public void openLoginPage() {
        basePage.getHeader().getUserBar().getUserBarButton(INSERT_BUTTON).click();
    }

    public void openCartPage() {
        UserBar userBar = basePage.getHeader().getUserBar();
        userBar.getUserBarButton(CART_BUTTON).click();
    }

    public void openComparePage() {
        basePage.getCompareButton().click();
    }
}

