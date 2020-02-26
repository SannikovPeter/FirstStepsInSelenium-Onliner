package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObject.NavigationPage;
import pageObject.NavigationPage.NavigationBar;

public class NavigationSteps extends BaseSteps {
    private NavigationPage navigationPage;

    NavigationSteps(NavigationPage navigationPage, WebDriver driver) {
        super(driver);
        this.navigationPage = navigationPage;
    }

    public void checkSuccessFollowTheLink(NavigationBar button) {
        clickOnButtonNavigationBar(button);
        Assert.assertEquals(navigationPage.getTitle(), button.getTitle(), "Titles are not equal:");
    }

    public void clickOnButtonNavigationBar(NavigationBar button) {
        navigationPage.getButton(button).click();
    }

}
