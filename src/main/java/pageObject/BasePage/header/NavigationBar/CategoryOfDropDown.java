package pageObject.BasePage.header.NavigationBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryOfDropDown {

    private static final By categoryTitleLocator = By.cssSelector(".b-main-navigation__dropdown-title-link");
    private static final By categoryButtonLocator = By.cssSelector(".b-main-navigation__dropdown-button");
    private static final By categoryColumnLocator = By.cssSelector("b-main-navigation__dropdown-column");

    private WebElement categoryLocator;
    private List<WebElement> columns;

    public CategoryOfDropDown(WebElement categoryLocator) {
        this.categoryLocator = categoryLocator;
    }

    public WebElement getCategoryTitle() {
        return categoryLocator.findElement(categoryTitleLocator);
    }

    public WebElement getColumnButton() {
        return categoryLocator.findElement(categoryButtonLocator);
    }

    public Column getColumn(Integer numberOfColumn) {
        columns = categoryLocator.findElements(categoryColumnLocator);
        return new Column(columns.get(numberOfColumn));
    }
}
