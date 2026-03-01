package TEST;

import org.testng.annotations.Test;

import BASE.BaseTest;
import PAGES.Dropdown;

public class droptest extends BaseTest{
	@Test
	public void seldrop() {
		Dropdown drop1=new Dropdown(driver);
				drop1.clickdrop();
		
	}
	

}
