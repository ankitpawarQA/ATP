package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class AlertsAndPopups extends BaseTest {

	public WebDriver driver;

	@FindBy(xpath = " //button[@id='alertBtn']")
	public WebElement simpleAlertsBtn;

	@FindBy(xpath = " //button[@id='confirmBtn']")
	public WebElement confirmationAlertsBtn;

	@FindBy(xpath = " //button[@id='promptBtn']")
	public WebElement promptAlertsBtn;

}
