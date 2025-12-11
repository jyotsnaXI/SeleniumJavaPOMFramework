Feature: Change Password

 Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

  @ChangePassword
  Scenario Outline: User successfully able to change account password
    Given user is on Search Employee page
    And user click on change password link
    And user navigated to change password page
    And user enter existing password as '<ExistingPassword>'
    And user enter new password as '<NewPassword>'
    And user enter confirm password as '<ConfirmPassword>'
    And user select security question one for change password from drop down field as '<firstQuestion>'
    And user enter securiy answer one for change password in textfield as '<firstAnswer>'
    And user select security question two for change password from drop down field as '<secondQuestion>'
    And user enter securiy answer two for change password in textfield as '<secondAnswer>'
    When user click on submit button for change password
    Then user should see a success message for change password
    
    Examples: 
      | ExistingPassword | NewPassword | ConfirmPassword | firstQuestion       | firstAnswer    | secondQuestion       | secondAnswer |
      | Admin@12345      | Admin@1234  | Admin@1234      |Father’s middle name?|   test         | Mother’s maiden name?|   test       |