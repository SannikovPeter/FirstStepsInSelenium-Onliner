package pageObject.BasePage.SearchPage.resultField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForumResultField {

    private static final By resultWidgetLocator = By.cssSelector(".search__widget-item");
    private static final By resultForumLocator = By.cssSelector(".result__item_forum");
    private static final By searchAllButtonLocator = By.cssSelector(".search__all-button");

    private WebElement searchResults;

    public ForumResultField(WebElement searchResults) {
        this.searchResults = searchResults;
    }

    public List<WebElement> getResultWidgets() {
        return searchResults.findElements(resultWidgetLocator);
    }

    public List<WebElement> getResultForum() {
        return searchResults.findElements(resultForumLocator);
    }

    public WebElement getSearchAllButton() {
        return searchResults.findElement(searchAllButtonLocator);
    }
}
