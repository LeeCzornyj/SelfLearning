	package AutoTrader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoTraderLogin {	
	
	private String chromeDriverLocation = "C:\\Users\\lee\\Documents\\workspace\\testing\\src\\test\\resources\\testing\\chromedriver.exe";
	private String firefoxDriverLocation = "C:\\Users\\lee\\Documents\\workspace\\testing\\src\\test\\resources\\testing\\geckodriver.exe";
	public String qaHomePage = "https://www.qa.com/";
	public WebDriver driver;
	
	public void Driver() {
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		driver = new ChromeDriver();
		driver.get(qaHomePage);
		
	}
	
	public void DriverNoPage() {
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		driver = new ChromeDriver();	
	}
	
	public void fireFoxDriver() {
		System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);
		driver = new FirefoxDriver();
		driver.get(qaHomePage);
	}
	
	public void fireFoxNoPage() {
		System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);
		driver = new FirefoxDriver();
	}
}
