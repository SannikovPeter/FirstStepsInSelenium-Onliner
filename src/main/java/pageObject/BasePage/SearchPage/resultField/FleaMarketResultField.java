package pageObject.BasePage.SearchPage.resultField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FleaMarketResultField {

    private static final By resultWidgetLocator = By.cssSelector(".search__widget-item");
    private static final By resultFleaMarketLocator = By.cssSelector(".result__item_baraholka");
    private static final By searchAllButtonLocator = By.cssSelector(".search__all-button");

    private WebElement searchResults;

    public FleaMarketResultField(WebElement searchResults) {
        this.searchResults = searchResults;
    }

    public List<WebElement> getResultWidgets() {
        return searchResults.findElements(resultWidgetLocator);
    }

    public List<WebElement> getResultFleaMarket() {
        return searchResults.findElements(resultFleaMarketLocator);
    }

    public WebElement getSearchAllButton() {
        return searchResults.findElement(searchAllButtonLocator);
    }
}
