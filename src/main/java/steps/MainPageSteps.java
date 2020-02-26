package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.DropDownMenuPage;
import pageObject.MainPage;
import pageObject.LoginPage;
import pageObject.NavigationPage;

public class MainPageSteps extends BaseSteps {

    private MainPage mainPage;

    public MainPageSteps(MainPage mainPage, WebDriver driver) {
        super(driver);
        this.mainPage = mainPage;
    }

    public LoginSteps openLoginPage() {
        mainPage.openInsertForm();
        return new LoginSteps(PageFactory.initElements(driver, LoginPage.class), driver);
    }

    public NavigationSteps openNavigationPage(){
        return new NavigationSteps(PageFactory.initElements(driver, NavigationPage.class), driver);
    }

    public DropDownMenuSteps openDropDownNewsPage(){
        return new DropDownMenuSteps(PageFactory.initElements(driver, DropDownMenuPage.class),driver);
    }

}
