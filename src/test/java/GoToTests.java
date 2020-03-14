import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.BasePage;
import steps.BaseSteps;

import static pageObject.header.DropDownMenu.DropDownCategory.CAR_NEWS;
import static pageObject.header.NavigationBar.DropDownMenuType.*;

public class GoToTests extends WebDriverSettings {

    BaseSteps baseSteps;

    @BeforeTest
    public void start(){
        baseSteps = new BaseSteps(PageFactory.initElements(driver, BasePage.class), driver);
    }

    @Test
    public void testNewsTitle() {
        baseSteps.checkSuccessClickOnTitle(NEWS_MENU, CAR_NEWS);
    }

     @Test
    public void fastSearchTest(){
        baseSteps.search("Пылесос");
    }
}
