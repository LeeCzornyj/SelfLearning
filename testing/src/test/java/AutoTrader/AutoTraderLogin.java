	package AutoTrader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTraderLogin {	
	
	public static String chromeDriverLocation = "C:/Users/lee/Documents/workspace/testing/src/test/resources/testing/chromedriver.exe";
	public String autoTraderHomePage = "https://www.autotrader.co.uk/";
	public WebDriver driver;
	
	public void Driver() {
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		driver = new ChromeDriver();
		driver.get(autoTraderHomePage);
		
	}
	
	public void DriverNoPage() {
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		driver = new ChromeDriver();	
	}
}
