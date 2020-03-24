package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.MainPage.MainPage;

public class MainPageSteps extends BasePageSteps {

    private MainPage mainPage;

    public MainPageSteps(WebDriver driver) {
        super(driver);
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    public void middleNavigationClick(Integer index) {
        mainPage.getMiddleNavigationBarLinks().get(index).click();
    }

    public void fastTilesFieldClick(Integer index) {
        mainPage.getTiles().get(index).click();
    }

}
