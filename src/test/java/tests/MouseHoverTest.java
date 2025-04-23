package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.MouseHover;

public class MouseHoverTest extends BaseTest {

	@Test(priority = 6)
	public void validateMouseHover() throws InterruptedException {

		MouseHover mouseHoverObj = PageFactory.initElements(driver, MouseHover.class);
		
		boolean pointMeButtonDsip=mouseHoverObj.pointMeButton.isDisplayed();
		softAssertMethod(pointMeButtonDsip);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mouseHoverObj.pointMeButton).perform();
		mouseHoverObj.dropDownLaptops.click();
		Thread.sleep(2000);
		
	
		
		
		

		
		
		
		
		
		
		
		
				
		
		

	}

}
