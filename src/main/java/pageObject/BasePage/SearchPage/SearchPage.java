package pageObject.BasePage.SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage.SearchPage.resultField.CatalogResultField;
import pageObject.BasePage.SearchPage.resultField.FleaMarketResultField;
import pageObject.BasePage.SearchPage.resultField.ForumResultField;
import pageObject.BasePage.SearchPage.resultField.NewsResultField;

public class SearchPage {

    private static final By searchInputFieldLocator = By.cssSelector(".search__input");
    private static final By closeButtonLocator = By.cssSelector(".search__close");
    private static final By searchCategoryButtonLocator = By.cssSelector(".search__tabs-item");
    private static final By searchResultFieldLocator = By.cssSelector(".search__results");
    private static final By newsFilterBarLocator = By.cssSelector(".search__filter");

    public enum SearchCategory {CATALOG, NEWS, FLEA_MARKET, FORUM}

    private NewsSearchFilterBar newsSearchFilterBar;
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchInputField() {
        return driver.findElement(searchInputFieldLocator);
    }

    public WebElement getCloseButton() {
        return driver.findElement(closeButtonLocator);
    }

    public WebElement getSearchCategoryButton(SearchCategory searchCategory) {
        return driver.findElements(searchCategoryButtonLocator).get(searchCategory.ordinal());
    }

    public CatalogResultField getCatalogResultField() {
        return new CatalogResultField(driver.findElement(searchResultFieldLocator));
    }

    public NewsResultField getNewsResultField() {
        return new NewsResultField(driver.findElement(searchResultFieldLocator));
    }

    public FleaMarketResultField getFleaMarketResultField() {
        return new FleaMarketResultField(driver.findElement(searchResultFieldLocator));
    }

    public ForumResultField getForumResultField() {
        return new ForumResultField(driver.findElement(searchResultFieldLocator));
    }

    public NewsSearchFilterBar getNewsSearchFilterBar() {
        return new NewsSearchFilterBar(driver.findElement(newsFilterBarLocator));
    }
}
