package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.SearchPage.SearchPage;
import pageObject.header.Header;

public class BasePage extends Base {

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

    public void switchFrame(){
        driver.switchTo().frame(driver.findElement(By.cssSelector(".modal-iframe")));
    }
}

