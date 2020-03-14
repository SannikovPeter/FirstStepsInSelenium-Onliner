package pageObject;

import org.openqa.selenium.WebDriver;
import pageObject.SearchPage.SearchPage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SearchPage getSearchPage() {
        return super.getSearchPage();
    }
}
