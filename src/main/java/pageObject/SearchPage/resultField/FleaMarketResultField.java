package pageObject.SearchPage.resultField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FleaMarketResultField {
    private static final By resultWidgetLocator = By.cssSelector(".search__widget-item");
    private static final By resultBaraholkaLocator = By.cssSelector(".result__item_baraholka");
    private static final By searchAllButtonLocator = By.cssSelector(".search__all-button");
    private WebElement searchResults;
    private List<WebElement> resultWidgets;
    private List<WebElement> resultBaraholka;
    private WebElement searchAllButton;

    public FleaMarketResultField(WebElement searchResults) {
        this.searchResults = searchResults;
    }

    public List<WebElement> getResultWidgets() {
        return resultWidgets = searchResults.findElements(resultWidgetLocator);
    }

    public List<WebElement> getResultBaraholka() {
        return resultBaraholka = searchResults.findElements(resultBaraholkaLocator);
    }

    public WebElement getSearchAllButton() {
        return searchAllButton = searchResults.findElement(searchAllButtonLocator);
    }
}
