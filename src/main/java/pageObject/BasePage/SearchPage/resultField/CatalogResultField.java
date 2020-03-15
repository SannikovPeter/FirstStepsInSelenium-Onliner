package pageObject.BasePage.SearchPage.resultField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogResultField {
    private static final By resultCategoryLocator = By.cssSelector(".result__item_category");
    private static final By resultProductLocator = By.cssSelector(".result__item_product");
    private List<WebElement> resultCategoriesList;
    private List<WebElement> resultProductsList;
    private WebElement searchResults;

    public CatalogResultField(WebElement searchResults) {
        this.searchResults = searchResults;
    }


    public List<WebElement> getResultCategoriesList() {
        return resultCategoriesList = searchResults.findElements(resultCategoryLocator);
    }

    public List<WebElement> getResultProductsList() {
        return resultProductsList = searchResults.findElements(resultProductLocator);
    }

    public WebElement getResultCategory(Integer index) {
        getResultCategoriesList();
        return resultCategoriesList.get(index);
    }

    public WebElement getResultProduct(Integer index) {
        getResultProductsList();
        return resultProductsList.get(index);
    }


}
