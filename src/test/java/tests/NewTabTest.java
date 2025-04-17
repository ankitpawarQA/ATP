package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.NewTab;

public class NewTabTest extends BaseTest {

	@Test(priority = 4)
	public void newTab() {

		NewTab newTabTestObj = PageFactory.initElements(driver, NewTab.class);

		boolean newTabBtnDisp = newTabTestObj.newTabBtn.isDisplayed();
		softAssertMethod(newTabBtnDisp);

		newTabTestObj.newTabBtn.click();

		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		// closeAllBrowser();

		// button displayed or not
		// click on new tab btn and get window handles of both parent and new tab opened
		// click on popup window and get window handle of new popup window
		// find count of links present in new pop up window
		// close all the windows

	}

}
