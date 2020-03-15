package pageObject.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.Base;
import pageObject.BasePage.SearchPage.SearchPage;
import pageObject.BasePage.header.Header;

public class BasePage extends Base {

    private static final By searchFrameLocator = By.cssSelector(".modal-iframe");

    private LoginPage loginPage;
    private SearchPage searchPage;
    private Header header;
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public SearchPage getSearchPage() {
        searchPage = new SearchPage(driver);
        return searchPage;
    }

    public Header getHeader() {
        header = new Header(driver);
        return header;
    }

    public void switchFrame() {
        driver.switchTo().frame(driver.findElement(searchFrameLocator));
    }
}

