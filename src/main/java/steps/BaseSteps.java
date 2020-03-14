package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.BasePage;
import pageObject.SearchPage.SearchPage;
import pageObject.header.DropDownMenu;
import pageObject.header.NavigationBar;

import java.time.Duration;

import static pageObject.SearchPage.NewsSearchFilterBar.Filters.*;

public class BaseSteps {
    private static final int WAIT_TIME = 5;
    private BasePage basePage;
    protected WebDriver driver;
    private WebDriverWait wait;

    public BaseSteps(BasePage basePage,WebDriver driver) {
        this.basePage = basePage;
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
    }

    public BaseSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String searchText){
        basePage.getHeader().getFastSearchBar().sendKeys(searchText);
        basePage.switchFrame();
        SearchPage searchPage = basePage.getSearchPage();
        searchPage.getSearchInputField().clear();
        searchPage.getSearchInputField().sendKeys(searchText);

        System.out.println(searchPage.getNewsResultField().getFilterBar().getDropDownCheckBoxes(SECTION).get(0).getText());
    }

    public void checkSuccessClickOnTitle(NavigationBar.DropDownMenuType menu, DropDownMenu.DropDownCategory category) {
        basePage.getHeader().getNavigationBar().getDropDownMenu(menu).getCategory(category).getCategoryTitle().click();
        System.out.println("Yes!");
    }
}

