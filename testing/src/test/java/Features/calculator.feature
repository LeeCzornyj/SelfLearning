Feature: Add two numbers together
 
  Scenario: Add two numbers together
    Given I have the number 30
    When I "add" 10 to my number
    Then My outcome should be 40
    
	Scenario: Subtract two numbers
	Given I have the number 20
	When I "subtract" 10 to my number
	Then My outcome will be 10
	

