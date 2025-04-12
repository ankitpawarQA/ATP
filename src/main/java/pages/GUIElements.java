package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import base.BaseTest;

public class GUIElements extends BaseTest {

	private WebDriver driver;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement nameInputField;

}
