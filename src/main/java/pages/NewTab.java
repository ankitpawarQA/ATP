package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTab {

	public WebDriver driver;

	@FindBy(xpath = " //button[text()='New Tab']")
	public WebElement newTab;

	@FindBy(xpath = "//button[@id='PopUp'] ")
	public WebElement popUpWindow;

}
