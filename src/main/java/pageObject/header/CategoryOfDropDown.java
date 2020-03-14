package pageObject.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryOfDropDown {

    private static final By categoryTitleLocator = By.cssSelector(".b-main-navigation__dropdown-title-link");
    private static final By categoryButtonLocator = By.cssSelector(".b-main-navigation__dropdown-button");
    private static final By categoryColumnLocator = By.cssSelector("b-main-navigation__dropdown-column");

    private WebElement categoryTitle;
    private WebElement columnButton;

    private WebElement categoryLocator;
    private List<WebElement> columns;

    public CategoryOfDropDown(WebElement categoryLocator) {
        this.categoryLocator = categoryLocator;
    }

    public WebElement getCategoryTitle() {
        categoryTitle = categoryLocator.findElement(categoryTitleLocator);
        return categoryTitle;
    }

    public WebElement getColumnButton(){
        columnButton = categoryLocator.findElement(categoryButtonLocator);
        return columnButton;
    }

    public Column getColumn(Integer numberOfColumn){
        columns = categoryLocator.findElements(categoryColumnLocator);
        return new Column(columns.get(numberOfColumn));
    }
}
