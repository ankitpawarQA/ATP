package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class Gender extends BaseTest {
	
public  WebDriver driver;
	
	@FindBy(xpath = "//input[@id='male']")
	public WebElement maleGenderRadioBtn;
	
	@FindBy(xpath = "//input[@id='female']")
	public WebElement femaleGenderRadioBtn;
	

}
