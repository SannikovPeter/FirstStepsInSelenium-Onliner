package steps;

import org.openqa.selenium.WebDriver;
import pageObject.Pages.MainPage;

public class MainPageSteps extends BaseSteps {

    private MainPage mainPage;

    public MainPageSteps(MainPage mainPage, WebDriver driver) {
        super(driver);
        this.mainPage = mainPage;
    }



}
