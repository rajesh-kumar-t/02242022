Feature: To check Gmail login functionality

Scenario: To check login function using valid e-mail and invalid password

Given User is in Gmail login page
When User enters valid email
And User clicks on Next button
And User enters invalid password
And User clicks on next button
Then User should received invalid credentials error message