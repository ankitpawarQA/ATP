package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class Tabs extends BaseTest {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='Wikipedia1_wikipedia-search-input']")
	public WebElement tabsInputField;

	@FindBy(css = ".wikipedia-search-button")
	public WebElement searchButton;

	@FindBy(xpath = "//div[@id='wikipedia-search-result-link']")
	public List<WebElement> searchResults;

}
