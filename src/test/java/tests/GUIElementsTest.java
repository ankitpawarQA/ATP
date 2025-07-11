package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;

import pages.GUIElements;

public class GUIElementsTest extends BaseTest {

	@Test(priority = 1)
	public void validateGUIElements() {

		GUIElements GUIElementsObj = PageFactory.initElements(driver, GUIElements.class);

		implicitWaitMethod(7);

		boolean nameInputFieldDisplayed = GUIElementsObj.nameInputField.isDisplayed();
		softAssertMethod(nameInputFieldDisplayed);

		boolean nameInputFieldEnabled = GUIElementsObj.nameInputField.isEnabled();
		softAssertMethod(nameInputFieldEnabled);

		boolean emailEnterFieldDisplayed = GUIElementsObj.emailEnterField.isDisplayed();
		softAssertMethod(emailEnterFieldDisplayed);

		boolean emailEnterFieldEnabled = GUIElementsObj.emailEnterField.isEnabled();
		softAssertMethod(emailEnterFieldEnabled);

		boolean phoneEnterFieldDisplayed = GUIElementsObj.phoneEnterField.isDisplayed();
		softAssertMethod(phoneEnterFieldDisplayed);

		boolean phoneEnterFieldEnabled = GUIElementsObj.phoneEnterField.isEnabled();
		softAssertMethod(phoneEnterFieldEnabled);

		boolean addressEnterFieldDisplayed = GUIElementsObj.phoneEnterField.isDisplayed();
		softAssertMethod(addressEnterFieldDisplayed);

		boolean addressEnterFieldEnabled = GUIElementsObj.phoneEnterField.isDisplayed();
		softAssertMethod(addressEnterFieldEnabled);

		GUIElementsObj.nameInputField.sendKeys("Akshu");

		GUIElementsObj.emailEnterField.sendKeys("akshukalia26@gmail.com");

		GUIElementsObj.phoneEnterField.sendKeys("780725645");

		GUIElementsObj.addressEnterField.sendKeys("Pune");
		System.out.println("new code added");

	}

}
