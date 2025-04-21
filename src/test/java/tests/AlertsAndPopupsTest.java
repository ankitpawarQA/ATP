package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AlertsAndPopups;

public class AlertsAndPopupsTest extends BaseTest {

	@Test(priority = 3)

	public void alertandPopUp() throws InterruptedException {

		implicitWaitMethod(7);
		AlertsAndPopups alertPopUpObj = PageFactory.initElements(driver, AlertsAndPopups.class);

		boolean simpleAlertsBtnDisp = alertPopUpObj.simpleAlertsBtn.isDisplayed();
		softAssertMethod(simpleAlertsBtnDisp);

		boolean confirmationAlertsBtnDisp = alertPopUpObj.confirmationAlertsBtn.isDisplayed();
		softAssertMethod(confirmationAlertsBtnDisp);

		boolean promptAlertsBtnDisp = alertPopUpObj.promptAlertsBtn.isDisplayed();
		softAssertMethod(promptAlertsBtnDisp);

		// get text of all the buttons
		String simpleAlertsBtnText = alertPopUpObj.simpleAlertsBtn.getText();
		String confirmationAlertsBtnText = alertPopUpObj.confirmationAlertsBtn.getText();
		String promptAlertsBtnText = alertPopUpObj.promptAlertsBtn.getText();
		System.out.println(simpleAlertsBtnText);
		System.out.println(confirmationAlertsBtnText);
		System.out.println(promptAlertsBtnText);

		alertPopUpObj.simpleAlertsBtn.click();
		Alert simpleAlert = driver.switchTo().alert();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(4));
		w.until(ExpectedConditions.alertIsPresent());
		System.out.println("alert message for simple alert button:" + simpleAlert.getText());
		simpleAlert.accept();

		alertPopUpObj.confirmationAlertsBtn.click();
		Alert confirmationAlert = driver.switchTo().alert();
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(4));
		w1.until(ExpectedConditions.alertIsPresent());
		System.out.println("alert message for confirmation alert button:" + confirmationAlert.getText());
		confirmationAlert.accept();
		alertPopUpObj.confirmationAlertsBtn.click();
		confirmationAlert.dismiss();

		alertPopUpObj.promptAlertsBtn.click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(4));
		w2.until(ExpectedConditions.alertIsPresent());
		System.out.println("alert message for prompt alert button:" + promptAlert.getText());
		promptAlert.sendKeys("akshuankit");
		Thread.sleep(2000);
		promptAlert.accept();
		alertPopUpObj.promptAlertsBtn.click();
		promptAlert.sendKeys("akshuankit");
		promptAlert.dismiss();

	}

}
