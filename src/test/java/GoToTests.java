import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.BasePage.BasePage;
import steps.BaseSteps;

import static pageObject.BasePage.header.NavigationBar.DropDownMenu.DropDownCategory.CAR_NEWS;
import static pageObject.BasePage.header.NavigationBar.NavigationBar.DropDownMenuType.NEWS_MENU;

public class GoToTests extends WebDriverSettings {

    BaseSteps baseSteps;

    @BeforeTest
    public void start() {
        baseSteps = new BaseSteps(PageFactory.initElements(driver, BasePage.class), driver);
    }

    @Test
    public void testNewsTitle() {
        baseSteps.checkSuccessClickOnTitle(NEWS_MENU, CAR_NEWS);
    }

    @Test
    public void fastSearchTest() {
        baseSteps.search("Пылесос");
    }
}
