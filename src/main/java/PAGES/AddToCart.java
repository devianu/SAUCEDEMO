package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
	WebDriver driver;
	By addcart = By.id("add-to-cart-sauce-labs-backpack");
	By cart = By.className("shopping_cart_badge");
	

public AddToCart(WebDriver driver)
{
    this.driver = driver;
}
public void add()
{
	driver.findElement(addcart).click();
	driver.findElement(cart).click();

	
}}