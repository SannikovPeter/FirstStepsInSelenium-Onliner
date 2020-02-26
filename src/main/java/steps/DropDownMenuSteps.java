package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObject.Category;
import pageObject.DropDownMenuPage;
import pageObject.DropDownMenuPage.DropDownMenu;

import static pageObject.DropDownMenuPage.DropDownMenu.*;

public class DropDownMenuSteps extends BaseSteps {

    private DropDownMenuPage dropDownMenuPage;


    DropDownMenuSteps(DropDownMenuPage dropDownMenuPage, WebDriver driver) {
        super(driver);
        this.dropDownMenuPage = dropDownMenuPage;
    }

    private void checkCorrectFollowTheLink(Category category){
        Assert.assertEquals(driver.getCurrentUrl(), category.getTitle(), "URL are not equal:");
    }

    public void checkSuccessClickOnTitle(DropDownMenu menu, Category category) {
        dropDownMenuPage.activateDropDownMenu(menu);
        dropDownMenuPage.getTitle(category).click();
        checkCorrectFollowTheLink(category);
    }

    public void checkSuccessClickOnSectionButton(DropDownMenu menu, Category category) {
        dropDownMenuPage.activateDropDownMenu(menu);
        dropDownMenuPage.getCategoriesButton(category).click();
        checkCorrectFollowTheLink(category);
    }

    public void clickOnNewsNumber(Category category, Integer numberOfNews) {
        dropDownMenuPage.activateDropDownMenu(NEWS_MENU);
        WebElement newsLink = dropDownMenuPage.getNewsNumber(category, numberOfNews);
//        waitUntilItWillBeVisibly(newsLink);
        String expectedLink = dropDownMenuPage.getLinksUrl(newsLink);
        newsLink.click();
        Assert.assertEquals(driver.getCurrentUrl(), expectedLink);
    }
}
