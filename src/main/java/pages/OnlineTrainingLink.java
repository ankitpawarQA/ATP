package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class OnlineTrainingLink extends BaseTest{
	
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='widget-content']//a[contains(normalize-space(.), 'Online Trainings')])[1]")
	public WebElement onlineTraningLink;

}
