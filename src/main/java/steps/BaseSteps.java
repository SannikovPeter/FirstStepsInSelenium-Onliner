package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseSteps {
    public static final int WAIT_TIME = 5;

    protected WebDriver driver;
    protected WebDriverWait wait;

    BaseSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
    }

    public void waitUntilItWillBeVisibly(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.out.println("Element: \"" + element + "\" is not visibly");
        }

    }
}

