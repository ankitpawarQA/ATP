package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class Slider extends BaseTest{
	
	public WebDriver driver;
	
	@FindBy(xpath=" //div[@id='slider-range']")	
	public WebElement priceRange;
	
	@FindBy(xpath=" //*[@id=\"slider-range\"]/span[1]")
	public WebElement minSliderRange;
	
	@FindBy(xpath=" //*[@id=\"slider-range\"]/span[2]")
	public WebElement maxsliderRange;

}
