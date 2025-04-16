package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AlertsAndPopups;

public class AlertsAndPopupsTest extends BaseTest {

	@Test(priority = 3)

	public void alertandPopUp() {

		AlertsAndPopups alertPopUpObj = PageFactory.initElements(driver, AlertsAndPopups.class);
		boolean simpleAlertsBtnDisp = alertPopUpObj.simpleAlertsBtn.isDisplayed();
		
		Alert simplealert= driver.switchTo().alert();
		
		System.out.println(simplealert.getText());
		
		implicitWaitMethod(5);
		
		simplealert.accept();
		
		
	        
	       

		// find all buttons are displayed or not
		// get text of all the buttons
		// confirmation message for all the buttons
		// find text of Prompt alert button
		// button 1: press ok
		// button 2: press cancel
		// button 3: enter text and then click ok
		// prompt alert: show the text ok is clicked and when cancel is clicked

	}

}
