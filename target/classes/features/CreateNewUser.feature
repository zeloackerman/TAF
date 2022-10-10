Feature: Create new user functionality

  Background: Land to Home page
    Given Go to login page
    Given Enter "gulbarazhanybai" in username or Email input field
    And   Enter "gulbarazhanybai" in password input field
    When  user click on login button
    Then  user should successfully logged in



    Scenario: Positive create new user
      Given user should click Add user button in admin Home page
      And   verify following field names are displayed
        | First name | Last name | Email address | Username | Password | Bio | User type | Time zone | Language |
      And   enter following data to create new user
        | firstName | lastName | emailAddress   | userName    | password           |
        | Elon      | Mask     | musk@tesla.com | elon        | VerifyH@rdP@$$312! |
        | Leo       | Messi    | messi@psg.com  | messi       | VerifyH@rdP@$$312! |




