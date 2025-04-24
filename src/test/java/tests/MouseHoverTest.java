package tests;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.MouseHover;

public class MouseHoverTest extends BaseTest {

	@Test(priority = 6)
	public void validateMouseHover() throws InterruptedException {

		MouseHover mouseHoverObj = PageFactory.initElements(driver, MouseHover.class);
		scrollToElementMethod(mouseHoverObj.pointMeButton);

		boolean pointMeButtonDsip = mouseHoverObj.pointMeButton.isDisplayed();
		softAssertMethod(pointMeButtonDsip);

		Actions a = new Actions(driver);
		a.moveToElement(mouseHoverObj.pointMeButton).build().perform();
		Thread.sleep(2000);
		for (WebElement ref : mouseHoverObj.allPointmeOptions) {
			System.out.println(ref.getText());
			if(ref.getText().contains("Mobiles")) {
				mouseHoverObj.dropDownMoblies.click();
			}
		}

		

	

		// find all the dropdown

	}

}
