package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class ColorsSelection extends BaseTest {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//select[@id='colors']")
	public WebElement colors ;
	
	

}
