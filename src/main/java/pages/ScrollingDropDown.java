package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class ScrollingDropDown extends BaseTest{
	
	public WebDriver driver;
	 
	@FindBy(xpath=" //input[@id='comboBox']")
	public WebElement scrollingDropdown;
	

}
