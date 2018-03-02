Feature: Login to Autotrader

Scenario: The webpage exist
Given I have a browser open
And I enter the AutoTrader URL
Then I should be taken to the AutoTrader webpage

Scenario: You can navigate through the menu at the top
Given I am on the Autotrader webpage
When I click on bikes
Then I should be able to search for a specific bike

Scenario: You can evaluate your vehicle
Given I have details of a vehicle
And I am on the Autotrader webpage
When I select evaluate a vehicle
And fill in the required details
Then I should be asked to register

Scenario: Find a local dealer
Given I am on the Autotrader webpage
When I click on find a local dealer
And enter my postcode
And select see all dealers
Then I will see all the dealers near my postcode

Scenario: When you click on about us you get taken to the about us webpage
Given I am on the Autotrader webpage
When I click on about us
Then I will be taken to the about us webpage