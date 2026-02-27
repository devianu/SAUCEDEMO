package BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;   // must be protected or public

    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void teardown()
    {
        if(driver != null)
        driver.quit();
    }
}