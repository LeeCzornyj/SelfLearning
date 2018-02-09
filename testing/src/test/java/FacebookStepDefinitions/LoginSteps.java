package FacebookStepDefinitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import AutoTrader.AutoTraderLogin;
import AutoTrader.VehicleDetails;

public class LoginSteps extends AutoTraderLogin {	
	
	@Given("^I have a browser open$")
	public void I_have_a_browser_open() {
		DriverNoPage();
		
	}
	
	@When("^I enter the AutoTrader URL$")
	public void I_enter_the_AutoTrader_URL(){
		driver.get(autoTraderHomePage);
	}

	@Then("^ I should be taken to the AutoTrader webpage$")
	public void  I_should_be_taken_to_the_AutoTrader_webpage(){
		assertTrue(driver.findElement(By.cssSelector("a[href*='/secure/signin?after-sigin-url=/']")).isDisplayed());

	}
	
	@Given("^I am on the Autotrader webpage$")
	public void I_am_on_the_Autotrader_webpage() {
		Driver();
		
	}
	
	@When("^I click on bikes$")
	public void I_select_bikes(){
		driver.findElement(By.cssSelector("a[href*='/bikes']")).click();
	}

	@Then("^I should be able to search for a specific bike$")
	public void  I_should_be_able_to_search_for_a_specific_bike(){
		assertTrue(driver.findElement(By.id("searchVehicles")).isDisplayed());
		driver.findElement(By.className("header-1 is-medium")).getAttribute("value");
	}
	
	@Given("^I have details of a vehicle$")
	public void  I_have_details_of_a_vehicle(){
		assertFalse(VehicleDetails.map.isEmpty());
	}

	@When("^I select evaluate a vehicle$")
	public void  I_select_evaluate_a_vehicle(){
		driver.findElement(By.cssSelector("a[href*='/car-valuation']")).click();
	}
	@Then("^fill in the required details$")
	public void  fill_in_the_required_details(){
		
		driver.findElement(By.id("")).sendKeys(VehicleDetails.map.get("CarReg"));
		driver.findElement(By.id("")).sendKeys(VehicleDetails.map.get("CarMileage"));
		driver.findElement(By.className("get-valuation-button track-submitVrmLookup tracking-motoring-products-link")).click();
		driver.findElement(By.cssSelector("a[href*=rc-anchor-center-item rc-anchor-checkbox-holder")).click();
		driver.findElement(By.className("button-green-large tracking-confirmVehicle tracking-standard-link")).click();
		
	}
	@Then("^I should be asked to register$")
	public void  I_should_be_asked_to_register(){
		assertTrue(driver.findElement(By.id("signInSubmit")).isDisplayed());
	}
}



