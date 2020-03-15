package pageObject.BasePage.SearchPage.resultField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.BasePage.SearchPage.NewsSearchFilterBar;

import java.util.List;

public class NewsResultField {
    private static final By resultNewsLocator = By.cssSelector(".search__result ");
    private static final By searchFilterBarLocator = By.cssSelector(".search__filter-list");
    private WebElement searchResults;
    private WebElement searchPage;
    private List<WebElement> resultNews;

    public NewsResultField(WebElement searchResults, WebElement searchPage) {
        this.searchResults = searchResults;
        this.searchPage = searchPage;
    }

    public List<WebElement> getResultNews() {
        return resultNews = searchResults.findElements(resultNewsLocator);
    }

    public NewsSearchFilterBar getFilterBar() {
        return new NewsSearchFilterBar(searchPage.findElement(searchFilterBarLocator));
    }

}
