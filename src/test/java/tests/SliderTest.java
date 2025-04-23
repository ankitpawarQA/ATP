package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Slider;

public class SliderTest extends BaseTest {

	@Test(priority = 18)
	public void sliderTestMethod() {

		Slider sliderTestObj = PageFactory.initElements(driver, Slider.class);

		boolean sliderDisp = sliderTestObj.priceRange.isDisplayed();
		softAssertMethod(sliderDisp);

		Actions act = new Actions(driver);

		act.dragAndDropBy(sliderTestObj.minSliderRange, 100, 250);
		System.out.println("location of min slider:" + sliderTestObj.minSliderRange.getLocation());
		
		act.dragAndDropBy(sliderTestObj.maxsliderRange , 250, 300);
		System.out.println("location of min slider:" + sliderTestObj.maxsliderRange.getLocation());


	}

}
