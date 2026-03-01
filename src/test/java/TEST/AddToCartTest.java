package TEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BASE.BaseTest;
import PAGES.AddToCart;

public class AddToCartTest extends BaseTest
{
//    WebDriver driver;   // ✅ Declare globally

    @Test
    public void AddToCart()
    {


        AddToCart cart1 = new AddToCart(driver);

        cart1.add();

    }
}