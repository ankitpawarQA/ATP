package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;

public class NewTabTest extends BaseTest {

	@Test(priority = 4)
	public void newTab() {

		NewTabTest newTabTestObj = PageFactory.initElements(driver, NewTabTest.class);

		// button displayed or not
		// click on new tab btn and get window handles of both parent and new tab opened
		// click on popup window and get window handle of new popup window
		// find count of links present in new pop up window
		//close all the windows
		
	}

}
