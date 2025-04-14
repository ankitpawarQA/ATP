package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class DoubleClick extends BaseTest {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='field1']")
	public WebElement field1Click;

	@FindBy(xpath = "//input[@id='field2']")
	public WebElement field2Click;
	
	@FindBy(xpath = "//button[text()='Copy Text']")
	public WebElement copyTextButton;
	

}