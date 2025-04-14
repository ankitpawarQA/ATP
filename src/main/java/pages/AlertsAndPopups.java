package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class AlertsAndPopups extends BaseTest {
	
public WebDriver driver;
	
	@FindBy(xpath = " //button[@id='alertBtn']")
	public WebElement simpleAlerts;
	
	@FindBy(xpath = " //button[@id='confirmBtn']")
	public WebElement confirmationAlerts;
	
	@FindBy(xpath = " //button[@id='promptBtn']")
	public WebElement promptAlerts;
	

	@FindBy(xpath = " //button[text()='New Tab']")
	public WebElement newTab;
	
	
	

}
