package StepDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps {

	int firstNumber;
	int secondNumber;
	int total;
	
	@Given("^I have the number (\\d+)$")
	public void i_have_the_number(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
		firstNumber = arg1;	
	}

	@When("^I \"([^\"]*)\" (\\d+) to my number$")
	public void i_to_my_number(String arg1, int arg2) {
	    // Write code here that turns the phrase above into concrete actions
		secondNumber = arg2;
		if(arg1.equals("add")) {
			total = secondNumber + firstNumber;
		} else if(arg1.equals("subtract")){
			total = firstNumber - secondNumber;
		}	
	}

	@Then("^My outcome should be (\\d+)$")
	public void my_outcome_should_be(int arg1){
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(40,total);
	}

	@Then("^My outcome will be (\\d+)$")
	public void my_outcome_will_be(int arg1){
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(10,total);
	}
}
