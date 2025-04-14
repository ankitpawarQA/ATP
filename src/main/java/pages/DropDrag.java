package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class DropDrag extends BaseTest{
	
	WebDriver driver;
	
	@FindBy(xpath= " //h2[text()='Drag and Drop']")
	public WebElement dragDrop;

}
