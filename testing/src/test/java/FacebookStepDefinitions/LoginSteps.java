package FacebookStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginSteps {

	
	public String chromeDriverLocation = "";
	public String facebookLoginPage = "https://www.facebook.com";
	
	public void facebookLoginDriver() {
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		WebDriver driver = new ChromeDriver();
		driver.get(facebookLoginPage);
		
	}
	
	@Given("^I have valid login credentials$")
	public void I_have_valid_login_credentials(){
		
	}

	@When("^I login using my credentials$")
	public void I_login_using_my_credentials(){
		
	}

	@Then("^I am able to access facebook$")
	public void I_am_able_to_access_facebook(){
		

	}
}



