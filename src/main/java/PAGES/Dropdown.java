package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown {
	WebDriver driver;
	By drop = By.className("product_sort_container");
	By sel=  By.className("product_sort_container");
	public Dropdown(WebDriver driver) {
this.driver=driver;
	
}
public void clickdrop() {
	driver.findElement(drop).click();
	driver.findElement(sel).click();
}
}
