Feature: Application LogIn Verification

Scenario: Verification of Login

Given Visiting the "https://www.fafsaweb.state.mn.us/Reports/Summary?year=2022" first
When Logging in with credentials of "Elif Burcu" and "12345"
Then Verify the login
And close all browsers