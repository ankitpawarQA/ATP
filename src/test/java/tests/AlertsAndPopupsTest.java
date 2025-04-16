package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;

public class AlertsAndPopupsTest extends BaseTest {
	
	@Test(priority = 4)
	public void alertandPopUp() {

		AlertsAndPopupsTest alertPopUpObj = PageFactory.initElements(driver, AlertsAndPopupsTest.class);

	}

}