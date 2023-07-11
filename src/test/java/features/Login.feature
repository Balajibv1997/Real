

Feature: Appplication Login

@MobileTest
Scenario: Home page default Login
Given user is on landing on page
When user login to appliacation with "jin" and password "1234" 
Then home page is populated
And cards are displayed is "true"

// first it will execute





@RegTest
Scenario: Home page default Login
Given user is on landing on page
When user login to appliacation with "jin" and password "1234" 
Then home page is populated
And cards are displayed is "true"

@SmokeTest
Scenario: Home page default Login
Given user is on landing on page
When user login to appliacation with "jhon" and password "5678"
Then home page is populated
And cards are displayed is "False"

@SmokeTest
Scenario: Home page default Login
Given user is on landing on page
When user login to appliacation with "jhon" and password "5678"
Then user signup with following details
| jiny | abcd | jiny@123 | Australia | 8971 |
And cards are displayed is "False"

@RegTest
Scenario Outline: Home page default Login
Given user is on landing on page
When user login to appliacation with <username> and password <password>
Then home page is populated
And cards are displayed is "true"


Examples:
| username  | password |
| user1     | pass1    |
| user2     | pass2    |
| user3     | pass3    |
| user4     | pass14   |



