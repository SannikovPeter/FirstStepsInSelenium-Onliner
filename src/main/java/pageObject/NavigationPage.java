package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NavigationPage extends BasePage {

    @FindAll(@FindBy(css = ".b-main-navigation__text"))
    private List<WebElement> navigationSelectors;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    public enum NavigationBar {
        CATALOG("Каталог Onliner"),
        NEWS("Onliner"),
        AUTOMOBILE("Купить авто в Беларуси - Автобарахолка Onliner"),
        HOUSES("Купить квартиру в Минске"),
        SERVICES("Заказы на услуги"),
        FLUE_MARKET("Барахолка onliner.by - Главная страница"),
        FORUM("Форум onliner.by - Главная страница");

        private String title;

        NavigationBar(String title) {
            this.title = title;
        }
        public String getTitle(){
            return title;
        }
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public WebElement getButton(NavigationBar button) {
        return navigationSelectors.get(button.ordinal());
    }

}
