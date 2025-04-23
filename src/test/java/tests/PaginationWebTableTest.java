package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.PaginationWebtable;

public class PaginationWebTableTest extends BaseTest{
	@Test
	public void paginationWebtableMethod() {
		PaginationWebtable paginationWebtableObj=PageFactory.initElements(driver,PaginationWebtable.class );
		
	}

}
