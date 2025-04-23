package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Days;

public class DaysTest extends BaseTest {
	@Test(priority = 14)
	public void daysTestMethod() {

		Days DaysTestField = PageFactory.initElements(driver, Days.class);

		boolean sunCheckboxDisp = DaysTestField.sunDayCheckBox.isDisplayed();
		softAssertMethod(sunCheckboxDisp);
		DaysTestField.sunDayCheckBox.click();

	}

}
