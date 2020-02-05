package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObject.BasePage;
import pageObject.MainPage;
import pageObject.LoginPage;

public class MainPageSteps extends BaseSteps {

    private static final String КАТАЛОГ_ONLINER = "Каталог Onliner";
    private MainPage mainPage;

    public MainPageSteps(MainPage mainPage, WebDriver driver) {
        super(driver);
        this.mainPage = mainPage;
    }

    public LoginSteps openLoginPage() {
        mainPage.OpenInsertForm();
        return new LoginSteps(PageFactory.initElements(driver, LoginPage.class), driver);
    }

    public void openCatalog(){
        mainPage.openMainNavigation(BasePage.mainNavigationLinks.CATALOG);
        Assert.assertEquals(mainPage.getTitle(), КАТАЛОГ_ONLINER);
    }

    public void openNews(){
        mainPage.openMainNavigation(BasePage.mainNavigationLinks.NEWS);
        System.out.println(mainPage.getTitle());
        Assert.assertEquals(mainPage.getTitle(), КАТАЛОГ_ONLINER);
    }
}
