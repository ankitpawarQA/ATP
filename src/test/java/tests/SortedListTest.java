package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SortedList;

public class SortedListTest extends BaseTest {

	@Test(priority = 9)
	public void sortedListTestMethod() {

		SortedList sortedListObj = PageFactory.initElements(driver, SortedList.class);
		// akshu pls pura kr dena
	}
}
