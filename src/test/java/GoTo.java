import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoTo{
    private WebDriver driver;
    private List<WebElement> middleRowLinks;

//    middleRowLinks = driver.findElements(By.cssSelector(".project-navigation__sign"));

    public GoTo(WebDriver driver) {
        this.driver = driver;
    }

    boolean atPage(){
        return driver.getTitle().equals("Onliner");
    }

    void goToProjectNavigation(int number){ middleRowLinks.get(number - 1); }

    private int projectNavigationSize(){ return middleRowLinks.size(); }

    List<WebElement> bMainNavigationDropdownTitle = driver.findElements(By.cssSelector(".b-main-navigation__dropdown-title"));
//    bMainNavigationDropdownTitle
//    b-main-navigation__dropdown-news-link
//    b-main-navigation__dropdown-advert-sign
//    b-main-navigation__dropdown-advert-item
//    b-main-navigation__dropdown-button
//    b-teasers-2__teaser
}
