Feature: Login to Leaftaps

@Smoke
Scenario Outline: Postive flow
#Given Open the Browser
#And Launch the URL
#When Enter the username as <Username> and password as <password>
When Enter the username as <Username>
And Enter the password as <password>
And Click on Login
Then Homepage should be displayed

Examples:
|Username|Password|
|'DemoSalesManager'|'crmsfa'|


@Sanity or @Regression
Scenario: Negative flow
#Given Open the Browser
#And Launch the URL
When Enter the username as DemoSalesManager
And Enter the password as abcd
And Click on Login
But Error message should be displayed