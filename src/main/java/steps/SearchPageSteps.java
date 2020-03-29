package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.BasePage.SearchPage.SearchPage;
import pageObject.BasePage.SearchPage.SearchPage.SearchCategory;

public class SearchPageSteps {

    private SearchPage searchPage;

    public SearchPageSteps(WebDriver driver) {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    public void switchFrameToSearchPage(String searchText) {
        searchPage.getSearchInputField().clear();
        searchPage.getSearchInputField().sendKeys(searchText);
    }

    public void selectSearchCategory(SearchCategory searchCategory) {
        searchPage.getSearchCategoryButton(searchCategory).click();
    }

    public void openCatalogSearchResult(int indexOfItem) {
        searchPage.getCatalogResultField().getSearchResult(indexOfItem).click();
    }

    public void addToCompareList(int indexOfItem) {
        searchPage.getCatalogResultField().getCompareBox(indexOfItem).click();
    }

    public void openNewsSearchResult(int indexOfNews) {
        searchPage.getNewsResultField().getResultNews().get(indexOfNews).click();
    }


}
