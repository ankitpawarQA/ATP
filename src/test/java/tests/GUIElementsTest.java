package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import junit.framework.Assert;
import pages.GUIElements;

public class GUIElementsTest extends BaseTest {

	@Test
	public void validateGUIElements() {

		GUIElements GUIElementsObj = PageFactory.initElements(driver, GUIElements.class);

		boolean nameInputFieldDisplayed = GUIElementsObj.nameInputField.isDisplayed();
		Assert.assertEquals(nameInputFieldDisplayed, true);
		System.out.println("hello akshu");

	}

}
