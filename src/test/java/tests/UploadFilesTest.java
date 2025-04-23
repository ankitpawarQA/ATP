package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UploadFiles;

public class UploadFilesTest extends BaseTest {
	@Test(priority = 17)
	public void uploadFilesMethod() throws InterruptedException {
		UploadFiles uploadFilesObj = PageFactory.initElements(driver, UploadFiles.class);

		boolean chooseSingleFileDisp = uploadFilesObj.chooseSingleFile.isDisplayed();
		softAssertMethod(chooseSingleFileDisp);
		boolean singleUploadDisp = uploadFilesObj.uploadSingleFile.isDisplayed();
		softAssertMethod(singleUploadDisp);
		boolean chooseMultipleFileDisp = uploadFilesObj.chooseMultipleFiles.isDisplayed();
		softAssertMethod(chooseMultipleFileDisp);
		boolean uploadadMultipleFileDisp = uploadFilesObj.uploadMultipleFile.isDisplayed();
		softAssertMethod(uploadadMultipleFileDisp);

		String filePath = "\"C:\\\\Users\\\\akshu\\\\OneDrive\\\\Desktop\"";

		uploadFilesObj.chooseSingleFile.sendKeys("C:\\Users\\akshu\\OneDrive\\Desktop");
		Thread.sleep(4000);
		uploadFilesObj.uploadSingleFile.click();

		uploadFilesObj.chooseMultipleFiles.sendKeys(
				"\"C:\\\\Users\\\\akshu\\\\OneDrive\\\\Desktop\" ;" + " C:\\Users\\akshu\\OneDrive\\Desktop\\Virtusa");
		Thread.sleep(4000);
		uploadFilesObj.uploadMultipleFile.click();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();",uploadFilesObj.chooseSingleFile); basically  use for click action 

	}
}
