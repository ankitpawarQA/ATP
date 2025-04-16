package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2);
		driver.close();
	}

	// for closing all browser
	public void closeAllBrowser() {
		driver.quit();
	}

	// hard wait
	public void hardWaitMethod(int secValue) throws InterruptedException {
		Thread.sleep(secValue);
	}

	// implicitWait method
	public void implicitWaitMethod(int imp) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(imp));
	}

	public void softAssertMethod(boolean ele1) {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ele1, true);
		sa.assertAll();
	}

}
