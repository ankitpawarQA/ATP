package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ColorsSelection;

public class ColoursSelectionTest extends BaseTest {

	@Test(priority = 8)
	public void ColoursSelectionMethod() {

		ColorsSelection colorsSelectionobj = PageFactory.initElements(driver, ColorsSelection.class);

		scrollToElementMethod(colorsSelectionobj.colorsTableLoc);
		for (WebElement ref : colorsSelectionobj.colorsTable) {
			System.out.println(ref.getText());
			Select s = new Select(ref);
			s.selectByValue("red");
		}
	}

}
