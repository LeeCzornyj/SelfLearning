package com.qa.test.stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.Stack;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stackStepDefinitions {
	Stack st = new Stack();	
	
	@Given("^I have a empty stack$")
	public void i_have_a_empty_stack() {
	    // Write code here that turns the phrase above into concrete actions
			assertTrue(st.isEmpty());
	
	}

	@When("^I push an object to my stack$")
	public void i_push_an_object_to_my_stack(){
	    // Write code here that turns the phrase above into concrete actions
		st.push(1);
	
	}

	@Then("^my stack contains an object$")
	public void my_stack_contains_an_object()  {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(!st.isEmpty());
	}
	
}
