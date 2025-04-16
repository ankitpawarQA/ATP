package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class Days extends BaseTest {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='sunday']")
	public WebElement sunDayCheckBox;

	@FindBy(xpath = "//input[@id='monday']")
	public WebElement monDayCheckBox;

	@FindBy(xpath = "//input[@id='tuesday']")
	public WebElement tuesDayCheckBox;

	@FindBy(xpath = "//input[@id='wednesday']")
	public WebElement wednesDayCheckBox;

	@FindBy(xpath = "//input[@id='thursday']")
	public WebElement thursDayCheckBox;

	@FindBy(xpath = "//input[@id='friday']")
	public WebElement friDayCheckBox;

	@FindBy(xpath = "//input[@id='saturday']")
	public WebElement satDayCheckBox;

}
