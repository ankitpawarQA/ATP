package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class PaginationWebtable extends BaseTest {

	public WebDriver driver;

	@FindBy(xpath = " //table[@id='productTable']")
	public WebElement paginationTable;
	
	

}
