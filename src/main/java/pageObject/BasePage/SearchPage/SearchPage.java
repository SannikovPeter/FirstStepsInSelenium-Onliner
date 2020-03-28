package pageObject.BasePage.SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage.SearchPage.resultField.CatalogResultField;
import pageObject.BasePage.SearchPage.resultField.FleaMarketResultField;
import pageObject.BasePage.SearchPage.resultField.ForumResultField;
import pageObject.BasePage.SearchPage.resultField.NewsResultField;

import java.util.List;

import static pageObject.BasePage.SearchPage.SearchPage.SearchCategory.*;

public class SearchPage {

    private static final By searchInputFieldLocator = By.cssSelector(".search__input");
    private static final By closeButtonLocator = By.cssSelector(".search__close");
    private static final By searchTabLocator = By.cssSelector(".search__tabs-item");
    private static final By searchResultFieldLocator = By.cssSelector(".search__results");

    public enum SearchCategory {IN_CATALOG, IN_NEWS, AT_FLEA_MARKET, ON_THE_FORUM}

    private List<WebElement> searchTab;
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        searchTab = driver.findElements(searchTabLocator);
    }

    public WebElement getSearchInputField() {
        return driver.findElement(searchInputFieldLocator);
    }

    public WebElement getCloseButton() {
        return driver.findElement(closeButtonLocator);
    }

    private WebElement getSearchCategoryButton(SearchCategory searchCategory) {
        return searchTab.get(searchCategory.ordinal());
    }

    public CatalogResultField getCatalogResultField() {
        getSearchCategoryButton(IN_CATALOG).click();
        return new CatalogResultField(driver.findElement(searchResultFieldLocator));
    }

    public NewsResultField getNewsResultField() {
        getSearchCategoryButton(IN_NEWS).click();
        return new NewsResultField(driver.findElement(searchResultFieldLocator), driver);
    }

    public FleaMarketResultField getFleaMarketResultField() {
        getSearchCategoryButton(AT_FLEA_MARKET).click();
        return new FleaMarketResultField(driver.findElement(searchResultFieldLocator));
    }

    public ForumResultField getForumResultField() {
        getSearchCategoryButton(ON_THE_FORUM).click();
        return new ForumResultField(driver.findElement(searchResultFieldLocator));
    }

}
