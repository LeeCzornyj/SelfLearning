Feature: Login to facebook

Given I have valid login credentials
And I am on the facebook homepage
And no one else is loged in
When I login using my credentials
Then I am able to access facebook