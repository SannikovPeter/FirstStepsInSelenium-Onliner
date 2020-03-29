package pageObject.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComparePage extends BasePage {

    private static final By topRowLocator = By.cssSelector(".product-table__row_top");
    private static final By itemLocator = By.cssSelector(".product-summary__figure");
    private WebDriver driver;

    public ComparePage(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }

    public List<WebElement> getCompareItemsList() {
        return driver.findElement(topRowLocator).findElements(itemLocator);
    }
}
