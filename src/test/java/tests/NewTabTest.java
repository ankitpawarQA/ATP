package tests;


import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.NewTab;
@Test(priority = 13)
public class NewTabTest extends BaseTest {

	public void newTab() throws InterruptedException {

		NewTab newTabTestObj = PageFactory.initElements(driver, NewTab.class);

		boolean newTabBtnDisp = newTabTestObj.newTabBtn.isDisplayed();
		softAssertMethod(newTabBtnDisp);

		boolean popUpWindowBtnDisp = newTabTestObj.newTabBtn.isDisplayed();
		softAssertMethod(popUpWindowBtnDisp);
		String parentWindowHandle = driver.getWindowHandle();
		newTabTestObj.popUpWindowBtn.click();
		String childWinH = null;

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String ref : allWindowHandles) {
			System.out.println(ref);
			if (!ref.equals(parentWindowHandle)) {
				childWinH = driver.getWindowHandle();
			}
		}
//		driver.switchTo().window(parentWindowHandle);
//		String parentWinTitle = driver.getTitle();
//		System.out.println(parentWinTitle);
//		Thread.sleep(2000);

		// driver.switchTo().window(childWinH);
		System.out.println("child window url: " + driver.getCurrentUrl());

		int linkCount = driver.findElements(By.tagName("a")).size();
		System.out.println("Number of links in new popup/tab: " + linkCount);

	}

	@Test(priority = 4)
	public void popWinMethod() {

		NewTab popWinBtnTestObj = PageFactory.initElements(driver, NewTab.class);

		String parentWH = driver.getWindowHandle();
		String childWH = null;
		popWinBtnTestObj.popUpWindowBtn.click();

		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String ref : allWindowHandles) {
			if (!ref.equals(parentWH)) {
				childWH = driver.getWindowHandle();
			}
		}
		System.out.println(childWH);
		// driver.switchTo().window(childWH);
		// driver.findElement(By.xpath("/html/body/div[1]/main/section[2]/div/div/div[1]/div/div[2]/div/a")).click();
		// System.out.println(driver.getCurrentUrl());

	}

// button displayed or not
// click on new tab btn and get window handles of both parent and new tab opened
// click on popup window and get window handle of new popup window
// find count of links present in new pop up window
// close all the windows

}
