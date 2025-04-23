package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ScrollingDropDown;
import pages.Slider;

public class ScrollingDropDownTest extends BaseTest{
	@Test(priority = 19)
	public void scrollingDropDownMethod() {
		
		ScrollingDropDown scrollingDropDownObj=PageFactory.initElements(driver, ScrollingDropDown.class);
		
		boolean scrollingDropdownFiledDisp =scrollingDropDownObj.scrollingDropdownFiled.isDisplayed();
		softAssertMethod(scrollingDropdownFiledDisp);
		
		
		
	}

}
