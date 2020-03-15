import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//Первое задание

public class FirstQuest {
    private WebDriver driver;

    public FirstQuest(WebDriver driver) {
        this.driver = driver;
    }

    void test1() {
        driver.get("https://onliner.by/");

        findItem("Пылесос");
        addItemNumber(1);
        findItem("Пылесосы");
        addItemNumber(2);
        driver.get("https://cart.onliner.by/");
        List<WebElement> items = driver.findElements(By.cssSelector(".cart-form__offers-item_secondary"));
        System.out.println("Колличество покупок равно: " + items.size());
    }

    private void findItem(String item) {
        driver.findElement(By.cssSelector(".fast-search__input")).sendKeys(item);
        driver.switchTo().frame(driver.findElement(By.cssSelector(".modal-iframe")));
        WebElement searchBox = driver.findElement(By.cssSelector(".search__input"));
        searchBox.clear();
        searchBox.sendKeys(item);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    private void addItemNumber(int number) {
        List<WebElement> searchList = driver.findElements(By.cssSelector(".result__item_product"));
        List<WebElement> acceptableList = new ArrayList<WebElement>();
        for (WebElement item : searchList) {
            String price = item.findElement(By.cssSelector(".product__price")).getText();
            if (price.equals("Нет в наличии")) {
                continue;
            }
            if (!price.equals("Снят с продажи")) {
                acceptableList.add(item);
            }
        }
        acceptableList.get(number - 1).findElement(By.cssSelector(".product__title-link")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".button_big")).click();
        driver.findElement(By.cssSelector(".offers-list__button_basket")).click();
    }
}
