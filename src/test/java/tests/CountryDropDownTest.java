package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CountryDropDown;

public class CountryDropDownTest extends BaseTest {

	@Test(priority = 7)
	public void validateCountryDropDown() throws InterruptedException {

		CountryDropDown countryDropDownObj = PageFactory.initElements(driver, CountryDropDown.class);

		for (WebElement ref : countryDropDownObj.countryDropDown) {
			System.out.println(ref.getText());
		}
		Thread.sleep(4000);
		
		Select s = new Select(driver.findElement(By.id("country")));
		s.selectByValue("france");
	}

}
