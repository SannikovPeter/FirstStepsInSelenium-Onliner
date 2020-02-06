package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObject.MainPage;
import pageObject.LoginPage;

public class MainPageSteps extends BaseSteps {

    private MainPage mainPage;
    private static final String КАТАЛОГ_ONLINER = "Каталог Onliner";

    public MainPageSteps(MainPage mainPage, WebDriver driver) {
        super(driver);
        this.mainPage = mainPage;
    }

    public LoginSteps openLoginPage() {
        mainPage.OpenInsertForm();
        return new LoginSteps(PageFactory.initElements(driver, LoginPage.class), driver);
    }


    public void openCatalog(){
        mainPage.clickCatalogButton();
        Assert.assertEquals(mainPage.getTitle(), КАТАЛОГ_ONLINER);
    }

    public void openNews(){
        mainPage.clickNewsButton();
        Assert.assertEquals(mainPage.getTitle(), КАТАЛОГ_ONLINER);
    }

}
