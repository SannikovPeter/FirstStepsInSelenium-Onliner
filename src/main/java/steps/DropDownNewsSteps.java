package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObject.DropDownNewsPage;

public class DropDownNewsSteps extends BaseSteps {

    private static final int NUMBER_OF_NEWS = 1;
    private static final By ACTUAL_TITLE_OF_NEWS = By.cssSelector(".news-header__title");

    public enum Categories {
        PEOPLE("https://people.onliner.by/"),
        AUTO("https://auto.onliner.by/"),
        TECHNOLOGY("https://tech.onliner.by/"),
        REALT("https://realt.onliner.by/"),
        CAR_MARKET("https://ab.onliner.by/"),
        BIKE_MARKET("https://mb.onliner.by/"),
        HOUSE_SALES("https://r.onliner.by/pk/"),
        HOUSE_RENT("https://r.onliner.by/ak/");
        private String title;

        Categories(String title) {
            this.title = title;
        }
    }

    private DropDownNewsPage dropDownNewsPage;

    DropDownNewsSteps(DropDownNewsPage dropDownNewsPage, WebDriver driver) {
        super(driver);
        this.dropDownNewsPage = dropDownNewsPage;
    }

    public void clickOnCarMarketTitle(Categories categories) {
        dropDownNewsPage.activateDropDownPage(DropDownNewsPage.IndexesOfArrows.CAR_MOTO);
        dropDownNewsPage.marketTitle(categories).click();
        Assert.assertEquals(driver.getCurrentUrl(), categories.title);
    }

    public void clickOnTitle(Categories categories) {
        dropDownNewsPage.activateDropDownPage(DropDownNewsPage.IndexesOfArrows.NEWS);
        dropDownNewsPage.newsTitle(categories).click();
        Assert.assertEquals(driver.getCurrentUrl(), categories.title);
    }

    public void clickOnNewsButton(Categories categories) {
        dropDownNewsPage.activateDropDownPage(DropDownNewsPage.IndexesOfArrows.NEWS);
        dropDownNewsPage.sectionButton(categories).click();
        Assert.assertEquals(driver.getCurrentUrl(), categories.title);
    }

    public void clickOnNewsNumberOne(Categories categories) {
        dropDownNewsPage.activateDropDownPage(DropDownNewsPage.IndexesOfArrows.NEWS);
        String expectedLinkText;
        do {
            expectedLinkText = dropDownNewsPage.selectNewsNumber(categories, NUMBER_OF_NEWS).getText();
        } while (expectedLinkText.isEmpty());
        dropDownNewsPage.selectNewsNumber(categories, NUMBER_OF_NEWS).click();
        String actualNewsTitle = driver.findElement(ACTUAL_TITLE_OF_NEWS).getText();
        Assert.assertEquals(actualNewsTitle, expectedLinkText);
    }
}
