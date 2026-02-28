package TEST;

import org.testng.annotations.Test;
import BASE.BaseTest;
import PAGES.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");
        System.out.println("Jenkins change detection test");
    }
}