package pageObject.BasePage.SearchPage.resultField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsResultField {

    private static final By resultNewsLocator = By.cssSelector(".search__result");

    private WebElement searchResults;

    public NewsResultField(WebElement searchResults) {
        this.searchResults = searchResults;
    }

    public List<WebElement> getResultNews() {
        return searchResults.findElements(resultNewsLocator);
    }

}
