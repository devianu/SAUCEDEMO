package PAGES;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    WebDriver driver;

    By drop = By.className("product_sort_container");

    public Dropdown(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLowToHigh() {

        WebElement dropdown = driver.findElement(drop);

        Select select = new Select(dropdown);
        select.selectByVisibleText("Price (low to high)");
    }
}