package com.qa.test.stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import com.qa.test.POM.bingHomePage;
import com.qa.test.TestingUtils.setup;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExamplesClass {

	setup x = new setup();
	String url;

	public void setup() {
		x.chromeWebDriver("www.bing.com");
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		bingHomePage page = PageFactory.initElements(x.driver, bingHomePage.class);
		page.sendKeysToSearch(arg1);
	}


	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search()  {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(!url.equals(x.driver.getCurrentUrl()));
	}

	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1)  {
		// Write code here that turns the phrase above into concrete actions
		x.driver.get(arg1);
		url = x.driver.getCurrentUrl();
	}


	public void tearDown() {
		x.driver.close();
		x.driver.quit();
	}
}
