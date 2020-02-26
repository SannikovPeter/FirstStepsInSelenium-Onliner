import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.MainPage;
import steps.DropDownMenuSteps;
import steps.MainPageSteps;
import steps.NavigationSteps;

import static pageObject.Category.*;
import static pageObject.DropDownMenuPage.DropDownMenu.*;
import static pageObject.NavigationPage.*;
import static pageObject.NavigationPage.NavigationBar.*;

public class GoToTests extends WebDriverSettings {

    private MainPageSteps mainPageSteps;
    private NavigationSteps navigationSteps;

    @BeforeTest
    public void startTestSettings() {
        mainPageSteps = new MainPageSteps(PageFactory.initElements(driver, MainPage.class), driver);
        navigationSteps = mainPageSteps.openNavigationPage();
    }

    @Test
    public void successOpenCatalog() {
        NavigationBar button = CATALOG;

        navigationSteps.checkSuccessFollowTheLink(button);
    }

    @Test
    public void successOpenNewsTest() {
        navigationSteps.checkSuccessFollowTheLink(NEWS);
    }

    @Test
    public void successOpenAutoTest() {
        navigationSteps.checkSuccessFollowTheLink(AUTOMOBILE);
    }

    @Test
    public void successOpenHousesTest() {
        navigationSteps.checkSuccessFollowTheLink(HOUSES);
    }

    @Test
    public void successOpenServicesTest() {
        navigationSteps.checkSuccessFollowTheLink(SERVICES);
    }

    @Test
    public void successOpenFlueMarketTest() {
        navigationSteps.checkSuccessFollowTheLink(FLUE_MARKET);
    }

    @Test
    public void successOpenForumTest() {
        navigationSteps.checkSuccessFollowTheLink(FORUM);
    }

    @Test
    public void testNewsTitle() {
        DropDownMenuSteps dropDownMenuSteps;

        dropDownMenuSteps = mainPageSteps.openDropDownNewsPage();
        dropDownMenuSteps.checkSuccessClickOnTitle(NEWS_MENU, PEOPLE);
    }

    @Test
    public void testNewsPeopleButton() {
        DropDownMenuSteps dropDownMenuSteps;

        dropDownMenuSteps = mainPageSteps.openDropDownNewsPage();
        dropDownMenuSteps.checkSuccessClickOnSectionButton(NEWS_MENU, PEOPLE);
    }

    @Test
    public void testNewsNumberOne() {
        int numberOfNews = 1;

        DropDownMenuSteps dropDownMenuSteps;

        dropDownMenuSteps = mainPageSteps.openDropDownNewsPage();
        dropDownMenuSteps.clickOnNewsNumber(PEOPLE, numberOfNews);
    }

    @Test
    public void testCarMarketTitle() {
        DropDownMenuSteps dropDownMenuSteps;

        dropDownMenuSteps = mainPageSteps.openDropDownNewsPage();
        dropDownMenuSteps.checkSuccessClickOnTitle(CAR_MARKET_MENU, CAR_MARKET);
    }

    @Test
    public void testHousesTitle() {
        DropDownMenuSteps dropDownMenuSteps;

        dropDownMenuSteps = mainPageSteps.openDropDownNewsPage();
        dropDownMenuSteps.checkSuccessClickOnTitle(HOUSE_MARKET_MENU, HOUSE_RENT);
    }
}
