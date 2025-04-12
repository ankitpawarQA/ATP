package tests;

import org.openqa.selenium.support.PageFactory;

import base.BaseTest;
import junit.framework.Assert;
import pages.GUIElements;

public class GUIElementsTest extends BaseTest {

	public void validateGUIElements() {

		GUIElements GUIElementsObj = PageFactory.initElements(driver, GUIElements.class);

		boolean nameInputFieldDisplayed = GUIElementsObj.nameInputField.isDisplayed();
		Assert.assertEquals(nameInputFieldDisplayed, true);

	}

}
