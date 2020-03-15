package pageObject.Pages;

import org.openqa.selenium.WebDriver;
import pageObject.BasePage.BasePage;
import pageObject.BasePage.SearchPage.SearchPage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SearchPage getSearchPage() {
        return super.getSearchPage();
    }
}
