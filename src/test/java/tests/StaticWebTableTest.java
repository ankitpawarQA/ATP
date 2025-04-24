package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.StaticWebTable;

public class StaticWebTableTest extends BaseTest{
	@Test
	public void staticWebtableMethod() {
		StaticWebTable staticWebTableObj=PageFactory.initElements(driver,StaticWebTable.class );
		
		boolean StaticWebTableDisp= staticWebTableObj.staticWebtale.isDisplayed();
		softAssertMethod(StaticWebTableDisp);
		
		int rowsCount = staticWebTableObj.numberOfRow.size();
		System.out.println("total number of rows:"+rowsCount);
		
		int colounCount = staticWebTableObj.numberOfColumn.size();
		System.out.println("total number of coolmn:"+colounCount);
		
		
		
		
		
		
		
		
		
	}

}

// how may rows in table 
// how many column in table 
//  retrive the specific row and table
//