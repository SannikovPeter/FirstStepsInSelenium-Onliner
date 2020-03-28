package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.BasePage.BasePage;
import pageObject.BasePage.LoginPage;
import pageObject.BasePage.header.UserBar.UserBar;

import static pageObject.BasePage.LoginPage.LoginPageButton.*;
import static pageObject.BasePage.header.UserBar.UserBar.UnVerifyBar.CART_BUTTON;
import static pageObject.BasePage.header.UserBar.UserBar.UnVerifyBar.INSERT_BUTTON;

public class BasePageSteps {

    private BasePage basePage;

    public BasePageSteps(WebDriver driver) {
        basePage = PageFactory.initElements(driver, BasePage.class);
    }

    public void search(String searchText) {
        basePage.getHeader().getFastSearchBar().sendKeys(searchText);
        basePage.switchFrame();
    }

    public void login(String name, String password) {
        basePage.getHeader().getUserBar().getUserBarButton(INSERT_BUTTON).click();
        LoginPage loginPage = basePage.getLoginPage();

        loginPage.getLoginPageLocator(NAME).sendKeys(name);
        loginPage.getLoginPageLocator(PASSWORD).sendKeys(password);
        loginPage.getLoginPageLocator(INSERT).click();
    }

    public void openCartPage() {
        UserBar userBar = basePage.getHeader().getUserBar();
        userBar.getUserBarButton(CART_BUTTON).click();
    }
}

