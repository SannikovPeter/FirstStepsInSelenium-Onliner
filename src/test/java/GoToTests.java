import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.LoginPageSteps;
import steps.MainPageSteps;
import steps.SearchPageSteps;

import static pageObject.BasePage.SearchPage.SearchPage.SearchCategory.NEWS;

public class GoToTests extends WebDriverSettings {

    MainPageSteps mainPageSteps;
    SearchPageSteps searchPageSteps;
    LoginPageSteps loginPageSteps;

    @BeforeTest
    public void start() {
        mainPageSteps = new MainPageSteps(driver);
    }

    @Test
    public void insertTest() {
        String loginName = "Piter";
        String loginPassword = "12345";

        mainPageSteps.openLoginPage();
        loginPageSteps = new LoginPageSteps(driver);
        loginPageSteps.login(loginName, loginPassword);
    }

    @Test
    public void newsSearchTest() {
        String searchingNews = "Sony";
        int indexOfNews = 0;
        mainPageSteps.openSearchPage(searchingNews);

        searchPageSteps = new SearchPageSteps(driver);
        searchPageSteps.switchFrameToSearchPage(searchingNews);
        searchPageSteps.selectSearchCategory(NEWS);

        searchPageSteps.openNewsSearchResult(indexOfNews);
    }

    @Test
    public void middleNavigationBarTest() {
        mainPageSteps.fastTilesFieldClick(1);
    }

}
