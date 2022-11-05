Feature: Searching the  Categories and SubCategories

Background:
Given User on web page as "http://automationpractice.com/index.php"
When User Click on Log_in Link
And User enter valid Credentials

Scenario: 
When Srearch for main as Categories Women and SubCategories as T-shirts
Then Verify page Title "T-shirts - My Store"

Scenario: 
When Srearch for main as Categories Women and SubCategories as Evening Dresses
Then Verify page Title "Evening Dresses - My Store"

Scenario: 
When Srearch for main as Categories Dresses and SubCategories as Summer Dresses
Then Verify page Title "Summer Dresses - My Store"

Scenario: 
When Srearch for main as Categories T-shirts and 
Then Verify page Title "T-shirts - My Store"

