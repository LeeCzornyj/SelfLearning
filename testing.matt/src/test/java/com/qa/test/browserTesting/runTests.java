package com.qa.test.browserTesting;


import org.openqa.selenium.WebDriver;

import com.qa.test.TestingUtils.mouseControls;
import com.qa.test.TestingUtils.setup;

public class runTests {

	public static void main(String[] args) {
		//testingPartOne test = new testingPartOne();
		//test.randomTest();
		setup x = new setup();
		x.chromeWebDriver("http://www.demoqa.com/draggable/");
		
		mouseControls mouse = new mouseControls();
		WebDriver y = x.driver;
		mouse.moveMouseBy(200, 200, y);
	//	mouse.dragAndDrop(y);
		//mouse.registration(y);
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		x.driver.close();
		x.driver.quit();
	}
}
