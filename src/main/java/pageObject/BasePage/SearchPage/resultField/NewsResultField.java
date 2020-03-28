package pageObject.BasePage.SearchPage.resultField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.BasePage.SearchPage.NewsSearchFilterBar;

import java.util.List;

public class NewsResultField {
    private static final By resultNewsLocator = By.cssSelector(".search__result ");
    private static final By searchFilterBarLocator = By.cssSelector(".search__filter-list");
    private WebElement searchResults;
    private WebDriver driver;
    private List<WebElement> resultNews;

    public NewsResultField(WebElement searchResults, WebDriver driver) {
        this.searchResults = searchResults;
        this.driver = driver;
    }

    public List<WebElement> getResultNews() {
        return resultNews = searchResults.findElements(resultNewsLocator);
    }

    public NewsSearchFilterBar getFilterBar() {
        return new NewsSearchFilterBar(driver.findElement(searchFilterBarLocator));
    }

}
