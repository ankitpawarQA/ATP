package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class UploadFiles extends BaseTest{
	
	public WebDriver driver;
	
	@FindBy(xpath=" //input[@id='singleFileInput']")
	public WebElement chooseSingleFile;
	
	@FindBy(xpath=" //button[text()='Upload Single File']")
	public WebElement uploadSingleFile;
	
	@FindBy(xpath=" //button[text()='Upload Single File']")
	public WebElement chooseSingleFiles;
	
	@FindBy(xpath=" //button[text()='Upload Multiple Files']")
	public WebElement uploadMultipleFile;
	
	

}
