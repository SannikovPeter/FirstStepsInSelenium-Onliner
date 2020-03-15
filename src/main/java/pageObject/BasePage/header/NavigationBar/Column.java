package pageObject.BasePage.header.NavigationBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Column {
    private static final By newsLinkLocator = By.cssSelector("b-main-navigation__dropdown-news-link");
    private static final By advertSignLocator = By.cssSelector("b-main-navigation__dropdown-advert-sign");
    private static final By advertValueLocator = By.cssSelector("b-main-navigation__dropdown-advert-value");

    private WebElement column;
    private List<WebElement> newsLinks;
    private List<WebElement> advertSigns;
    private List<WebElement> advertValues;

    public Column(WebElement column) {
        this.column = column;
    }

    public WebElement getNewsLink(Integer indexOfNews) {
        newsLinks = column.findElements(newsLinkLocator);
        return newsLinks.get(indexOfNews);
    }

    public WebElement getAdvertSign(Integer indexOfAdvert) {
        advertSigns = column.findElements(advertSignLocator);
        return advertSigns.get(indexOfAdvert);
    }

    public WebElement getAdvertValue(Integer indexOfValue) {
        advertValues = column.findElements(advertValueLocator);
        return advertValues.get(indexOfValue);
    }
}
