package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class ColorsSelection extends BaseTest {

	WebDriver driver;

	@FindBy(xpath = "//select[@id='colors']")
	public List<WebElement> colorsTable;

	@FindBy(xpath = "//select[@id='colors']")
	public WebElement colorsTableLoc;
}
