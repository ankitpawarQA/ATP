package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class BlogsLink extends BaseTest{
	
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='widget-content']//a[contains(normalize-space(.), 'Blog')])[1]")
	public WebElement blogsLinks;
	

}
