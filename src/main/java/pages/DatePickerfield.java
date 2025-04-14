package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class DatePickerfield extends BaseTest {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='datepicker'] ")
	public WebElement datePickerField1;

	@FindBy(xpath = "//input[@id='txtDate']")
	public WebElement datePickerField2;

	@FindBy(xpath = "//input[@id='start-date']")
	public WebElement startDateField;

	@FindBy(xpath = "//input[@id='end-date']")
	public WebElement endDateField;
	
	@FindBy(xpath = "//button[@class='submit-btn']")
	public WebElement submitButton;
	
	
	

}
