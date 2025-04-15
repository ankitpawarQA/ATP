package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import base.BaseTest;

public class GUIElements extends BaseTest {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement nameInputField;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailEnterField;
	
	@FindBy(xpath = "//input[@id='phone']")
	public WebElement phoneEnterField;
	
	@FindBy(xpath = "//textarea[@id='textarea']")
	public WebElement addressEnterField;


}
