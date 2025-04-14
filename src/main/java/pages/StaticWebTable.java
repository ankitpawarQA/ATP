package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class StaticWebTable extends BaseTest {
	
	public WebDriver driver;
	
	@FindBy(xpath= " //div[@id='HTML1']")
	public WebElement staticWebtale;
	
	@FindBy(xpath= " //div[@id='HTML12']")
	public WebElement dynamicWebtale;
	
	
	

}
