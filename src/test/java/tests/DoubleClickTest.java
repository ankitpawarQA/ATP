package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DoubleClick;

public class DoubleClickTest extends BaseTest {

	@Test(priority = 5)

	public void doubleClickMethod() throws InterruptedException {

		DoubleClick doubleClickobj = PageFactory.initElements(driver, DoubleClick.class);
		implicitWaitMethod(5);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", doubleClickobj.field2Click);

		boolean filed1Disp = doubleClickobj.field1Click.isDisplayed();
		softAssertMethod(filed1Disp);

		boolean filed2Disp = doubleClickobj.field2Click.isDisplayed();
		softAssertMethod(filed2Disp);

		boolean copyTextButtonDisp = doubleClickobj.copyTextButton.isDisplayed();
		softAssertMethod(copyTextButtonDisp);

		boolean copyTextButtonEnabled = doubleClickobj.copyTextButton.isEnabled();
		softAssertMethod(copyTextButtonEnabled);

		String field1text = doubleClickobj.field1Click.getAttribute("value");
		System.out.println("text in field 1 " + field1text);

		String field2text = doubleClickobj.field2Click.getAttribute("value");
		System.out.println("text in field 2 " + field2text);
		Assert.assertTrue(field2text.isEmpty());

		Actions ac = new Actions(driver);
		ac.doubleClick(doubleClickobj.copyTextButton).build().perform();

		String field2textAgain = doubleClickobj.field2Click.getAttribute("value");
		System.out.println("text in field 2 " + field2textAgain);
		Assert.assertTrue(field2textAgain.equalsIgnoreCase(field1text));

		String copyTxtfield2 = doubleClickobj.copyTextButton.getText();
		System.out.println("text from field2 " + copyTxtfield2);
	}

}
