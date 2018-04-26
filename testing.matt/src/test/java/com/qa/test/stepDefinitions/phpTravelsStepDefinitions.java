package com.qa.test.stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.qa.test.POM.phptravelsHomePage;
import com.qa.test.TestingUtils.setup;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class phpTravelsStepDefinitions {

	setup x = new setup();
	
	@Before
	public void setup() {
		x.chromeWebDriver("http://www.phptravels.net");
	}
	
	@Given("^I am on the phpTravels webpage$")
	public void i_am_on_the_phpTravels_webpage() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(x.driver.getCurrentUrl().equals("http://www.phptravels.net/"));

	}

	@When("^I enter a valid search$")
	public void i_search_for_for_nights_with_adults() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		phptravelsHomePage page = new PageFactory().initElements(x.driver, phptravelsHomePage.class);
		page.submitValidSearch();
		
	}

	@When("^I select a hotel out of the options$")
	public void i_select_a_hotel_out_of_the_options()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^enter my details for the hotel$")
	public void enter_my_details_for_the_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I will have booked a hotel$")
	public void i_will_have_booked_a_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		x.driver.close();
		x.driver.quit();
	}

}
