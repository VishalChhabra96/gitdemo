Feature: Application Login

Scenario: Home page default login
Given user is on banking landing page
When user login into application with username and pwd
Then home page is populated
And credit cards should be displayed

