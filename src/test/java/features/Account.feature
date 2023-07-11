
Feature: Appplication Login
@MobileTest
Scenario: Home page default Login
Given user is on landing on page 
When user login to appliacation with "jin" and password "1234" 
Then home page is populated
And cards are displayed is "true"
