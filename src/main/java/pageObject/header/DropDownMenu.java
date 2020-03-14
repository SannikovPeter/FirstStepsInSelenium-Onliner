package pageObject.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DropDownMenu {

    public enum DropDownCategory {

        PEOPLE("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[2]/div/div/div/div/div[1]"),
        CAR_NEWS("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[2]/div/div/div/div/div[2]"),
        TECHNOLOGY("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[2]/div/div/div/div/div[3]"),
        REALTY("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[2]/div/div/div/div/div[4]"),
        CAR_MARKET("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[3]/div/div/div/div/div[1]"),
        BIKE_MARKET("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[3]/div/div/div/div/div[2]"),
        HOUSE_SALES("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[4]/div/div/div/div/div[1]"),
        HOUSE_RENT("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[4]/div/div/div/div/div[2]");

        private String title;

        public String getTitle() {
            return title;
        }

        DropDownCategory(String title) {
            this.title = title;
        }
    }

    private WebElement dropDownMenuSelector;

    public DropDownMenu(WebElement dropDownMenuSelector) {
        this.dropDownMenuSelector = dropDownMenuSelector;
    }

    public CategoryOfDropDown getCategory(DropDownCategory category) {
        return new CategoryOfDropDown(dropDownMenuSelector.findElement(By.xpath(category.getTitle())));
    }
}
