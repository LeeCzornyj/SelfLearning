package com.qa.test.browserTesting;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import com.qa.test.webdriverLaunch.setup;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testingPartOne {
	
	ExtentReports reports = new ExtentReports("C:\\Users\\lee\\Documents\\workspace\\testing.matt\\src\\test\\resources\\Reports\\myReport.html",true);
	
	public void randomTest() {
		
		//ExtentReports reports = new ExtentReports("C:\\Users\\lee\\Documents\\workspace\\testing.matt\\src\\test\\resources\\Reports\\myReport.html",true);
		ExtentTest test = reports.startTest("verify application login");
		setup x = new setup();
		x.chromeWebDriver("http://www.thedemosite.co.uk/index.php");
		test.log(LogStatus.PASS, "Browser loaded correctly");
		
		x.driver.findElement(By.cssSelector("a[href*='addauser']")).click();
		x.driver.findElement(By.name("username")).sendKeys("ramchandra");
		x.driver.findElement(By.name("password")).sendKeys("99803798");
		x.driver.findElement(By.name("FormsButton2")).click();
		test.log(LogStatus.PASS, "User entered into system");
		
		x.driver.findElement(By.cssSelector("a[href*='login']")).click();
		x.driver.findElement(By.name("username")).sendKeys("ramchandra");
		x.driver.findElement(By.name("password")).sendKeys("99803798");
		x.driver.findElement(By.name("FormsButton2")).click();
		
		assertTrue(x.driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText().equalsIgnoreCase("**successful login**"));
		test.log(LogStatus.PASS, "Login was successful	");
//		setup y = new setup();
//		y.firefoxWebDriver("https://www.qa.com/");	
		reports.endTest(test);
		reports.flush();
	}	

}
