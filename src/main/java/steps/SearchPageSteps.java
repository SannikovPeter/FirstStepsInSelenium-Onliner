package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.BasePage.SearchPage.SearchPage;

public class SearchPageSteps {

    private SearchPage searchPage;

    public SearchPageSteps(WebDriver driver) {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    public void switchToSearchPage(String searchText) {
        searchPage.getSearchInputField().clear();
        searchPage.getSearchInputField().sendKeys(searchText);
    }

    public void openSearchResult(int indexOfItem) {
        searchPage.getCatalogResultField().getSearchResult(indexOfItem).click();
    }

    public void addToCompareList(int indexOfItem) {
        searchPage.getCatalogResultField().getCompareBox(indexOfItem).click();
    }

}
