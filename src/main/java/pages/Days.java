package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class Days extends BaseTest{
	
public  WebDriver driver;
	
	@FindBy(xpath = "//input[@id='sunday']")
	public WebElement sunDayChecBox ;
	
	@FindBy(xpath = "//input[@id='monday']")
	public WebElement monDayChecBox ;
	
	@FindBy(xpath = "//input[@id='tuesday']")
	public WebElement tuesDayChecBox ;
	
	@FindBy(xpath = "//input[@id='wednesday']")
	public WebElement wednesDayChecBox ;
	
	@FindBy(xpath = "//input[@id='thursday']")
	public WebElement thursDayChecBox ;
	

	@FindBy(xpath = "//input[@id='friday']")
	public WebElement friDayChecBox ;
	
	@FindBy(xpath = "//input[@id='saturday']")
	public WebElement satDayChecBox ;



}
