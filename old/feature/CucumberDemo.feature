@smoke
Feature: Feature is one functionality



  Scenario: We give scenario name (Deposit within allowed range)
    # Given step used for precondition
    Given User is logged in to Demir account
    # When Action
    When User deposit $1000 to Atay
    #Then Validation
    Then Atay should have $1200 in balance


  Scenario:  Deposit above threshold limit
    Given User is logged in to Demir account a
    When  User deposit &50000 to Nuraziz
    Then  Nuraziz should not have 50000 in balance


  Scenario: Deposit negative value
    Given User is logged in to chase account
    And   User has 300 in the account
    When  User deposits -10 to John Doe
    Then  User should have 300
    And   John Doe Should not any deposits


  Scenario: Withdraw within the limit
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    And   User deposits $1000.00
    When  User withdraws $1000.00
    Then  User should have $0.0 in account


