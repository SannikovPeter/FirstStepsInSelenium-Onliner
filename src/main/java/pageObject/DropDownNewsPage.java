package pageObject;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import steps.DropDownNewsSteps.Categories;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownNewsPage extends BasePage {
    public enum IndexesOfArrows {NEWS,CAR_MOTO,HOUSES}
    private static final short TIME = 10;
    private static final By newsLinks = By.cssSelector(".b-main-navigation__dropdown-news-link");
    private WebDriver driver;
    @FindAll(@FindBy(css = ".b-main-navigation__dropdown-column_25"))
    private List<WebElement> newsSection;
    @FindAll(@FindBy(css = ".b-main-navigation__item_arrow"))
    private List<WebElement> arrowButtons;
    private By titleLink = By.cssSelector(".b-main-navigation__dropdown-title-link");
    private By sectionButton = By.cssSelector(".b-main-navigation__dropdown-button");

    public DropDownNewsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void activateDropDownPage(IndexesOfArrows indexesOfArrows) {
        Actions action = new Actions(driver);
        WebElement arrow = arrowButtons.get(indexesOfArrows.ordinal());
        action.moveToElement(arrow).build().perform();
        driver.manage().timeouts().implicitlyWait(TIME, TimeUnit.SECONDS);
    }
    public WebElement marketTitle(Categories categories){
        List<WebElement> titlesLinks = driver.findElements(titleLink);
        return titlesLinks.get(categories.ordinal());
    }
    public WebElement newsTitle(Categories categories) {
        return newsSection.get(categories.ordinal()).findElement(titleLink);
    }

    public WebElement selectNewsNumber(Categories categories, Integer numberOfNews) {
        List<WebElement> newsSectionLinks = newsSection.get(categories.ordinal()).findElements(newsLinks);
        return newsSectionLinks.get(numberOfNews - 1);
    }

    public WebElement sectionButton(Categories categories) {
        return newsSection.get(categories.ordinal()).findElement(sectionButton);
    }

}
