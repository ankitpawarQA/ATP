package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropDrag;
import pages.DynamicButton;

public class DyanmicButtonTest extends BaseTest{
	@Test(priority = 16)
	public void dyanmicButtonTestMethod() {
		DynamicButton dynamicButtonObj=PageFactory.initElements(driver,DynamicButton.class );
		
		boolean DynamicButtonDisp = dynamicButtonObj.dynamicButtonStart.isDisplayed();
		
		
		
	}

}
