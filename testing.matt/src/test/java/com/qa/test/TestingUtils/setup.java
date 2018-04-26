package com.qa.test.TestingUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class setup {

	public WebDriver driver;
	private String chromeDriverLocation = "C:\\Users\\lee\\Documents\\workspace\\testing.matt\\src\\test\\resources\\Drivers\\chromedriver.exe";
	private String FirefoxDriverLocation = "C:\\Users\\lee\\Documents\\workspace\\testing.matt\\src\\test\\resources\\Drivers\\geckodriver.exe";
	
	String URL;
	
	public void chromeWebDriver(String URL) {
		
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	public void firefoxWebDriver(String URL) {
		System.setProperty("webdriver.gecko.driver", FirefoxDriverLocation);
		driver = new FirefoxDriver();
		driver.get(URL);
	}
	
}
