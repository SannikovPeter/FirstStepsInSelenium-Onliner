package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObject.BasePage.BasePage;
import pageObject.BasePage.LoginPage;
import pageObject.BasePage.SearchPage.SearchPage;
import pageObject.BasePage.header.UserBar.UserBar;

import static pageObject.BasePage.LoginPage.LoginPageButton.*;
import static pageObject.BasePage.header.UserBar.UserBar.UnVerifyBar.*;

public class BasePageSteps {

    private BasePage basePage;
    protected WebDriver driver;

    public BasePageSteps(WebDriver driver) {
        this.driver = driver;
        basePage = PageFactory.initElements(driver, BasePage.class);
    }

    public void search(String searchText) {
        basePage.getHeader().getFastSearchBar().sendKeys(searchText);
        basePage.switchFrame();
        SearchPage searchPage = basePage.getSearchPage();
        searchPage.getSearchInputField().clear();
        searchPage.getSearchInputField().sendKeys(searchText);
    }

    public WebElement getSearchResult(Integer index) {
        return basePage.getSearchPage().getCatalogResultField().getResultProductsList().get(index);
    }

    public void login(String name, String password) {
        basePage.getHeader().getUserBar().getUserBarButton(INSERT_BUTTON).click();
        LoginPage loginPage = basePage.getLoginPage();

        loginPage.getLoginPageLocator(NAME).sendKeys(name);
        loginPage.getLoginPageLocator(PASSWORD).sendKeys(password);
        loginPage.getLoginPageLocator(INSERT).click();
    }

    public void faceBookLogin(){
        basePage.getHeader().getUserBar().getUserBarButton(FACEBOOK).click();
    }

    public int amountUnitsInCart(){
        UserBar userBar = basePage.getHeader().getUserBar();

        userBar.getUserBarButton(CART_BUTTON).click();
        return userBar.getCartPage().getCartOfferUnitsList().size();
    }
}

