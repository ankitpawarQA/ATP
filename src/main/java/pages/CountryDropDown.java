package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class CountryDropDown extends BaseTest {

	public WebDriver driver;

	@FindBy(xpath = " //select[@id='country']")
	public List<WebElement> countryDropDown;

}
