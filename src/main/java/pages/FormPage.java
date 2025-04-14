package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class FormPage extends BaseTest{
	
	public WebDriver driver ;
	  
	@FindBy(css =" div[id='footer-2-1']")
	public WebElement formpage ;
	
	@FindBy(css =" div[id='footer-2-1']")
	public WebElement form ;
	
	
	@FindBy(css =" input[id='input1']")
	public WebElement section1Field ;
	
	@FindBy(css =" button[id='btn1']")
	public WebElement submitButton1 ;
	

	@FindBy(css =" input[id='input2']")
	public WebElement section2Field ;
	
	@FindBy(css =" button[id='btn2']")
	public WebElement submitButton2 ;
	
	@FindBy(css =" input[id='input3']")
	public WebElement section3Field ;
	
	@FindBy(css =" button[id='btn3']")
	public WebElement submitButton3 ;
	
	@FindBy(xpath =" (//div[@class='widget-content']//a[contains(normalize-space(.), 'Home')])[2]")
	public WebElement homeLink ;
	
	@FindBy(xpath ="//a[text()='Hidden Elements & AJAX'] ")
	public WebElement hidenElementAjaxLink ;
	
	@FindBy(xpath ="//a[text()='Download Files'] ")
	public WebElement downLoadFileLink ;
	
	
	@FindBy(xpath="'//div[@id='HTML16']'")
	public WebElement shadowDomForm;
	
	@FindBy(xpath="//div[@class='widget-content']/a[contains(normalize-space(.), 'Blog')][1]")
	public WebElement BlogLink;
	
	
	
	
	
	
	
	

}
