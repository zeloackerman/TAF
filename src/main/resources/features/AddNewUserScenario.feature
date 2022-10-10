Feature:
  @Smoke
  Scenario: Add new User
    Given user on web
    Then  user should see home page
    And   user clicked Add user button to create new user
    Then  user should see input field
    And   user create new user with mock data using faker
