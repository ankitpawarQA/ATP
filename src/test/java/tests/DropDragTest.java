package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropDrag;

public class DropDragTest extends BaseTest {
	@Test(priority = 15)
	public void dropDragTestMethod() {
		DropDrag dropDragobj = PageFactory.initElements(driver, DropDrag.class);

		Actions a = new Actions(driver);
		a.dragAndDrop(dropDragobj.dragDrop, dropDragobj.dropable).perform();

	}

}
