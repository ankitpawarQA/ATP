package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;

public class DoubleClickTest extends BaseTest {

	@Test(priority = 3)

	public void doubleClickMethod() {

		DoubleClickTest doubleClickobj = PageFactory.initElements(driver, DoubleClickTest.class);

		// find text of field 1
		// find text of field 2--> assert that it should be empty at first
		// copy text button is displayed
		// copy text button is enabled
		// click on copy text button and now fetch the text from field 2

		// mnous hover create new class and find all the elements of mouse hover button

	}

}
