package tests;

import java.util.Set;

import org.openqa.selenium.By;
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

		String parentWindow = driver.getWindowHandle();
	    System.out.println("Parent Window: " + parentWindow);

	    Set<String> allWindows = driver.getWindowHandles();
	    System.out.println("All Windows: " + allWindows);

	    for (String windowID1 : allWindows) {
	        if (!windowID1.equals(parentWindow)) {
	            driver.switchTo().window(windowID1);
	            System.out.println("Switched to new popup/tab: " + windowID1);

	            int linkCount = driver.findElements(By.tagName("a")).size();
	            System.out.println("Number of links in new popup/tab: " + linkCount);

	            driver.close();
	            driver.switchTo().window(parentWindow);
	        }
	    }

	   


		
		
		// closeAllBrowser();

		// button displayed or not
		// click on new tab btn and get window handles of both parent and new tab opened
		// click on popup window and get window handle of new popup window
		// find count of links present in new pop up window
		// close all the windows

	}

}
