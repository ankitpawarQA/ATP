package tests;

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
		
		
		if (alertPopUpObj.simpleAlertsBtn.isDisplayed()) {
	        System.out.println("Simple Alert Button is displayed");
	    }

	    if (alertPopUpObj.confirmationAlertsBtn.isDisplayed()) {
	        System.out.println("Confirmation Alert Button is displayed");
	    }

	    if (alertPopUpObj.promptAlertsBtn.isDisplayed()) {
	        System.out.println("Prompt Alert Button is displayed");
	        
	        System.out.println("Simple Alert Button Text: " + alertPopUpObj.simpleAlertsBtn.getText());
	        System.out.println("Confirmation Alert Button Text: " + alertPopUpObj.confirmationAlertsBtn.getText());
	        System.out.println("Prompt Alert Button Text: " + alertPopUpObj.promptAlertsBtn.getText());
	       
	        alertPopUpObj.simpleAlertsBtn.click();
	        driver.switchTo().alert().accept();
	        System.out.println("Simple alert accepted");
	        
	        alertPopUpObj.confirmationAlertsBtn.click();
	        driver.switchTo().alert().accept();
	        System.out.println("Confirmation alert: OK clicked");
	        
	        alertPopUpObj.confirmationAlertsBtn.click();
	        driver.switchTo().alert().dismiss();
	        System.out.println("Confirmation alert: Cancel clicked");
		
	        alertPopUpObj.promptAlertsBtn.click();
	        driver.switchTo().alert().sendKeys("Hello Prompt");
	        driver.switchTo().alert().accept();
	        System.out.println("Prompt alert: Text entered and OK clicked");
	        
	        alertPopUpObj.promptAlertsBtn.click();
	        driver.switchTo().alert().dismiss();
	        System.out.println("Prompt alert: Cancel clicked");

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
}