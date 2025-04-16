package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;

public class DoubleClickTest extends BaseTest{
	
	@Test(priority = 3)
	public void doubleClickMethod() {
		
		DoubleClickTest doubleClickobj= PageFactory.initElements(driver, DoubleClickTest.class);
		
		
	}

}
