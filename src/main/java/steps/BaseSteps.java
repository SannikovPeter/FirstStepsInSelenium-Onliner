package steps;
import org.openqa.selenium.WebDriver;
import pageObject.BasePage;

public class BaseSteps {
    public WebDriver driver;
    private BasePage basePage;


    public BaseSteps(WebDriver driver)
    {

        this.driver = driver;
    }

}
