package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class MouseHover extends BaseTest{
	
	public WebDriver driver;
	
	@FindBy(xpath = " //button[text()='Point Me']")
	public WebElement pointMeButton;
	
	
	@FindBy(xpath = " //a[text()='Mobiles']")
	public WebElement dropDownMoblies;
	
	@FindBy(xpath = " //a[text()='Laptops']")
	public WebElement dropDownLaptops;
	
	
	

}
