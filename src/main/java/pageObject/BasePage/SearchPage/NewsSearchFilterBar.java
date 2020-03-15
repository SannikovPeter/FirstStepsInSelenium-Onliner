package pageObject.BasePage.SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsSearchFilterBar {
    private static final By dropDownHandleLocator = By.cssSelector(".search__filter-dropdown-handle");
    private static final By dropDownMenuLocator = By.cssSelector(".dropdown-style_small");
    private static final By dropDownCheckBoxLocator = By.cssSelector(".dropdown-style__checkbox-text");
    private static final By onlyWithVideoCheckBoxLocator = By.cssSelector(".search__filter-checkbox");
    private WebElement searchFilterBarLocator;
    private List<WebElement> dropDownHandles;
    private WebElement dropDownMenu;

    public enum Filters {SECTION, PERIOD, TYPE}

    public NewsSearchFilterBar(WebElement searchFilterBarLocator) {
        this.searchFilterBarLocator = searchFilterBarLocator;
    }

    public List<WebElement> getDropDownHandles() {
        return dropDownHandles = searchFilterBarLocator.findElements(dropDownHandleLocator);
    }

    private WebElement getDropDownMenu(Filters filter) {
        getDropDownHandles().get(filter.ordinal()).click();
        return dropDownMenu = getDropDownHandles().get(filter.ordinal()).findElement(dropDownMenuLocator);
    }

    public List<WebElement> getDropDownCheckBoxes(Filters filter) {
        getDropDownHandles().get(filter.ordinal()).click();
        return getDropDownMenu(filter).findElements(dropDownCheckBoxLocator);
    }

    public WebElement getOnlyWithVideoCheckBox() {
        return searchFilterBarLocator.findElement(onlyWithVideoCheckBoxLocator);
    }

}
