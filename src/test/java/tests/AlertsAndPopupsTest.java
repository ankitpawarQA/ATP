package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;

public class AlertsAndPopupsTest extends BaseTest {

	@Test(priority = 3)
	public void alertandPopUp() {

		AlertsAndPopupsTest alertPopUpObj = PageFactory.initElements(driver, AlertsAndPopupsTest.class);

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