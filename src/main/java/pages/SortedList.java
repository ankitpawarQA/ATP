package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class SortedList extends BaseTest{
	
	public WebDriver driver;
	
	@FindBy(xpath=" //select[@id='animals']")
	public WebElement animalName;
	

}
