package pageObject.SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.SearchPage.resultField.*;

import java.util.List;

import static pageObject.SearchPage.SearchPage.SearchCategory.*;

public class SearchPage {

    private static final By searchPageLocator = By.id("search-page");
    private static final By searchInputLocator = By.cssSelector(".search__input");
    private static final By closeButtonLocator = By.cssSelector(".search__close");
    private static final By searchTabLocator = By.cssSelector(".search__tabs-item");
    private static final By searchResultFieldLocator = By.cssSelector(".search__results");

    public enum SearchCategory {IN_CATALOG, IN_NEWS, AT_FLEA_MARKET, ON_THE_FORUM}
    private List<WebElement> searchTab;
    private WebElement searchPage;

    public SearchPage(WebDriver driver) {
        searchPage = driver.findElement(searchPageLocator);
        searchTab = searchPage.findElements(searchTabLocator);
    }

    public WebElement getSearchInputField() {
        return searchPage.findElement(searchInputLocator);
    }

    public WebElement getCloseButton() {
        return searchPage.findElement(closeButtonLocator);
    }

    public WebElement getSearchCategoryButton(SearchCategory searchCategory) {
        return searchTab.get(searchCategory.ordinal());
    }

    public CatalogResultField getCatalogResultField() {
        getSearchCategoryButton(IN_CATALOG).click();
        return new CatalogResultField(searchPage.findElement(searchResultFieldLocator));
    }
    public NewsResultField getNewsResultField(){
        getSearchCategoryButton(IN_NEWS).click();
        return new NewsResultField(searchPage.findElement(searchResultFieldLocator),searchPage);
    }

    public FleaMarketResultField getFleaMarketResultField() {
        getSearchCategoryButton(AT_FLEA_MARKET).click();
        return new FleaMarketResultField(searchPage.findElement(searchResultFieldLocator));
    }

    public ForumResultField getForumResultField() {
        getSearchCategoryButton(ON_THE_FORUM).click();
        return new ForumResultField(searchPage.findElement(searchResultFieldLocator));
    }

}
