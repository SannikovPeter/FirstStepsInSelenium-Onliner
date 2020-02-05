package pageObject;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }




}
