package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class MouseHover extends BaseTest {

	public WebDriver driver;

	@FindBy(xpath = " //button[text()='Point Me']")
	public WebElement pointMeButton;

	@FindBy(xpath = "//a[normalize-space()='Mobiles']")
	public WebElement dropDownMoblies;

	@FindBy(xpath = "//a[text()='Laptops']")
	public WebElement dropDownLaptops;

	@FindBy(xpath = "//div[@class='dropdown-content']//a")
	public List<WebElement> allPointmeOptions;

}
