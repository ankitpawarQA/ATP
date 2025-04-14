package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class DynamicButton extends BaseTest{
	
	public  WebDriver driver;
	
	@FindBy(xpath = "//button[@name='start']")
	public WebElement dynamicButtonStart;
	
	
	

}
