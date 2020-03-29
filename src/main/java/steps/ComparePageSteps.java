package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.BasePage.ComparePage;

public class ComparePageSteps extends BasePageSteps {

    private ComparePage comparePage;

    public ComparePageSteps(WebDriver driver) {
        super(driver);
        comparePage = PageFactory.initElements(driver, ComparePage.class);
    }

    public int amountOfCompareItems() {
        return comparePage.getCompareItemsList().size();
    }
}
