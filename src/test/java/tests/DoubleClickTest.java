package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DoubleClick;

public class DoubleClickTest extends BaseTest {

	@Test(priority = 5)

	public void doubleClickMethod() throws InterruptedException {

		DoubleClick doubleClickobj = PageFactory.initElements(driver, DoubleClick.class);

		boolean filed1Disp = doubleClickobj.field1Click.isDisplayed();
		softAssertMethod(filed1Disp);
		String field1text = doubleClickobj.field1Click.getAttribute("value");
		System.out.println("text in field 1" + field1text);
		
		Thread.sleep(2000);
		
		boolean filed2Disp = doubleClickobj.field2Click.isDisplayed();
		softAssertMethod(filed2Disp);
		String field2text = doubleClickobj.field2Click.getAttribute("value");
		System.out.println("text in field 2" + field2text);
		Assert.assertTrue(field2text.isEmpty());
		
		Thread.sleep(2000);
		
		boolean copyTextButtonDisp = doubleClickobj.copyTextButton.isDisplayed();
		softAssertMethod(copyTextButtonDisp);
		boolean copyTextButtonEnabled = doubleClickobj.copyTextButton.isEnabled();
		softAssertMethod(copyTextButtonEnabled);
		
		doubleClickobj.copyTextButton.click();
		
		String copyTxtfield2=doubleClickobj.field2Click.getAttribute("Value");
		System.out.println("text from field2 "+copyTxtfield2);
		
		
		
		
		
		

		// find text of field 1
		// find text of field 2--> assert that it should be empty at first
		// copy text button is displayed
		// copy text button is enabled
		// click on copy text button and now fetch the text from field 2

		// mnous hover create new class and find all the elements of mouse hover button

	}

}
