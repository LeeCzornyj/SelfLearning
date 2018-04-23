package com.qa.test.webdriverLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class setup {

	public WebDriver driver;
	private String chromeDriverLocation = "C:\\Users\\lee\\Documents\\workspace\\testing.matt\\src\\test\\resources\\testing\\chromedriver.exe";
	private String FirefoxDriverLocation = "C:\\Users\\lee\\Documents\\workspace\\testing.matt\\src\\test\\resources\\testing\\geckodriver.exe";
	
	
	public void chromeWebDriver(String URL) {
		
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		//options.addArguments("--start-maximised");
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
