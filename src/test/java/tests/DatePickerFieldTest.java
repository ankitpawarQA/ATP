package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DatePickerfield;

public class DatePickerFieldTest extends BaseTest {

	@Test(priority = 11)
	public void datePickerFieldMethod() {
		implicitWaitMethod(5);
		DatePickerfield datePickerfieldObj = PageFactory.initElements(driver, DatePickerfield.class);
		scrollDownMethod(0, 1300);
		datePickerfieldObj.datePickerField1.click();
		for (WebElement ref : datePickerfieldObj.allDates) {
			System.out.println(ref.getText());
			if (ref.getText().equalsIgnoreCase("28")) {
				ref.click();
			}

		}
	}

}
