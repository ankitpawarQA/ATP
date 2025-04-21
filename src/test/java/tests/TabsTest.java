package tests;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Tabs;

public class TabsTest extends BaseTest {

	@Test(priority = 12)
	public void tabTestMethod() {
		Tabs tabsObject = PageFactory.initElements(driver, Tabs.class);
		implicitWaitMethod(5);

		boolean tabsInputFieldDisp = tabsObject.tabsInputField.isDisplayed();
		softAssertMethod(tabsInputFieldDisp);

		tabsObject.tabsInputField.sendKeys("hello");
		String parentWH = driver.getWindowHandle();// a
		String childWH = null;
		tabsObject.searchButton.click();

		for (WebElement ref : tabsObject.searchResults) {
			System.out.println(ref.getText());
			if (ref.getText().contains("musical")) {
				ref.click();
			}
		}
		Set<String> allWH = driver.getWindowHandles(); // a,b,c
		for (String ref1 : allWH) {
			if (!ref1.equals(parentWH)) {
				childWH = ref1;
			}
		}
		driver.switchTo().window(childWH);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("total count of link present on the new tab: " + allLinks.size());
		String newTabTitle = driver.getCurrentUrl();
		System.out.println(newTabTitle);
	}
}
