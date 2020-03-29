package pageObject.BasePage.SearchPage.resultField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogResultField {

    private static final By compareBoxLocator = By.cssSelector(".i-checkbox_yellow");
    private static final By resultCategoryLocator = By.cssSelector(".result__item_category");
    private static final By resultProductLocator = By.cssSelector(".result__item_product");

    private WebElement searchResults;

    public CatalogResultField(WebElement searchResults) {
        this.searchResults = searchResults;
    }

    public List<WebElement> getResultCategoriesList() {
        return searchResults.findElements(resultCategoryLocator);
    }

    public List<WebElement> getResultProductsList() {
        return searchResults.findElements(resultProductLocator);
    }

    public WebElement getSearchResult(int indexOfItem) {
        return getResultProductsList().get(indexOfItem);
    }

    public WebElement getCompareBox(int indexOfItem) {
        return getResultProductsList().get(indexOfItem).findElement(compareBoxLocator);
    }

}
