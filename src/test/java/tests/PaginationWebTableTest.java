package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.PaginationWebtable;

public class PaginationWebTableTest extends BaseTest{
	@Test
	public void paginationWebtableMethod() {
		PaginationWebtable paginationWebtableObj=PageFactory.initElements(driver,PaginationWebtable.class );
		
		boolean paginationWebtablDisp= paginationWebtableObj.paginationTable.isDisplayed();
		
		int paginationSize=paginationWebtableObj.numberOfPages.size();
		
		//capture all the element in one list 
		 List<String> name = new ArrayList<String>();
		 for(int i=1;i<=paginationSize;i++) {
			 driver.findElement(By.xpath("//ul[@id='pagination']/li[" + i + "]/a")).click();
			
			 List<WebElement> currentPageNames = paginationWebtableObj.numberOfPages;

	            for (WebElement nameElement : currentPageNames) {
	                name.add(nameElement.getText().trim());
	            }
	            for(String ref: name) {
	            	System.out.println(ref);
	        }
		 }
		
		
		
		
	}

}
