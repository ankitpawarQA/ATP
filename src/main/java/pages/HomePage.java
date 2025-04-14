package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class HomePage extends BaseTest{
	
	WebDriver driver;
	
	@FindBy(xpath= "(//div[@class='widget-content']//a[contains(normalize-space(.), 'Home')])[1]")
	public WebElement homePageLink;

}
