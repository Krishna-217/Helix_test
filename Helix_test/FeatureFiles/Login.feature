Feature: Log-in feature
Scenario: Verify able to login with valid credentials
Given User on web page as "http://automationpractice.com/index.php"
When User Click on Log_in Link
And User enter valid Credentials
Then Verify user able to logged-in.