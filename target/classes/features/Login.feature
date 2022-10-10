
Feature: Login functionality

  Background: Land to Home page
    Given Go to login page

  @smoke
    Scenario: Positive: Login with valid credentials as admin
      Given Enter "gulbarazhanybai" in username or Email input field
      And   Enter "gulbarazhanybai" in password input field
      When  user click on login button
      Then  user should successfully logged in







