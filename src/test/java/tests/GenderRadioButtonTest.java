package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Gender;

public class GenderRadioButtonTest extends BaseTest {

	@Test(priority = 2)
	public void validateGenderRadioButtonTest() {

		Gender genderObj = PageFactory.initElements(driver, Gender.class);
		implicitWaitMethod(10);

		boolean maleGenderRadioBtnDispalyed = genderObj.maleGenderRadioBtn.isDisplayed();
		softAssertMethod(maleGenderRadioBtnDispalyed);

		boolean femaleGenderRadioBtnDispalyed = genderObj.femaleGenderRadioBtn.isDisplayed();
		softAssertMethod(femaleGenderRadioBtnDispalyed);

		genderObj.maleGenderRadioBtn.click();
		boolean maleGenderRadioBtnIsSelected = genderObj.maleGenderRadioBtn.isSelected();
		softAssertMethod(maleGenderRadioBtnIsSelected);

		genderObj.femaleGenderRadioBtn.click();
		boolean femaleGenderRadioBtnIsSeelcted = genderObj.femaleGenderRadioBtn.isSelected();
		softAssertMethod(femaleGenderRadioBtnIsSeelcted);

	}
}
