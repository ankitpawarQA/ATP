package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SortedList;

public class SortedListTest extends BaseTest {

	@Test(priority = 9)
	public void sortedListTestMethod() {

		SortedList sortedListObj = PageFactory.initElements(driver, SortedList.class);
		
		scrollToElementMethod(sortedListObj.aniamlsTableLoc);
		for (WebElement ref : sortedListObj.animalsTable) {
			System.out.println(ref.getText());
			Select s = new Select(ref);
			s.selectByValue("dog");
		
		
	}
}
}