package pageObject.BasePage.header.NavigationBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Column {
    private static final By newsLinkLocator = By.cssSelector("b-main-navigation__dropdown-news-link");
    private static final By advertSignLocator = By.cssSelector("b-main-navigation__dropdown-advert-sign");
    private static final By advertValueLocator = By.cssSelector("b-main-navigation__dropdown-advert-value");

    private WebElement column;

    public Column(WebElement column) {
        this.column = column;
    }

    public WebElement getNewsLink(Integer indexOfNews) {
        return column.findElements(newsLinkLocator).get(indexOfNews);
    }

    public WebElement getAdvertSign(Integer indexOfAdvert) {
        return column.findElements(advertSignLocator).get(indexOfAdvert);
    }

    public WebElement getAdvertValue(Integer indexOfValue) {
        return column.findElements(advertValueLocator).get(indexOfValue);
    }
}
