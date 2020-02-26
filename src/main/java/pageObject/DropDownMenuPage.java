package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownMenuPage extends BasePage {

    public enum DropDownMenu {NEWS_MENU,CAR_MARKET_MENU,HOUSE_MARKET_MENU;}

    private static final short TIME = 10;
    private static final By newsLinks = By.cssSelector(".b-main-navigation__dropdown-news-link");
    @FindAll(@FindBy(css = ".b-main-navigation__dropdown-column_25"))
    private List<WebElement> newsSection;
    @FindAll(@FindBy(css = ".b-main-navigation__item_arrow"))
    private List<WebElement> arrowButtons;
    @FindAll(@FindBy(css = ".b-main-navigation__dropdown-title-link"))
    private List<WebElement> titleLinks;

    private By sectionButton = By.cssSelector(".b-main-navigation__dropdown-button");

    public DropDownMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void activateDropDownMenu(DropDownMenu menu){
        WebElement arrow = arrowButtons.get(menu.ordinal());
        Actions action = new Actions(driver);
        action.moveToElement(arrow).build().perform();
        driver.manage().timeouts().implicitlyWait(TIME, TimeUnit.SECONDS);
    }

    public WebElement getTitle(Category category) {
        return titleLinks.get(category.ordinal());
    }

    public WebElement getNewsNumber(Category category, Integer numberOfNews) {
        List<WebElement> newsSectionLinks = newsSection.get(category.ordinal()).findElements(newsLinks);
        return newsSectionLinks.get(numberOfNews);
    }

    public WebElement getCategoriesButton(Category category) {
        return newsSection.get(category.ordinal()).findElement(sectionButton);
    }

    public String getLinksUrl(WebElement element){
        return element.getAttribute("href");
    }
}
