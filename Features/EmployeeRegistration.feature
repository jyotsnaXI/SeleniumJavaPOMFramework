Feature: User can register employee in the system

 Background:
 	  Given user launch chrome browser
 	  And user enter url from config

  @RegisterUser
  Scenario Outline: User successfully able to register thier account
    Given user navigate to login page
    And user click on Employee or Pre employee link
    And user navigated to Employee Registration page
    And user enter Application id or GIN in text field as '<GIN>'
    And user enter date of birth in textfield as '<DOB>'
    And user enter ISOS id in textfield as '<ISOSID>'
    And user click on get details button for register employee
    And user navigated to user registration page
    And user enter username in textfield as '<username>'
    And user enter password in textfield as '<password>'
    And user enter confirm password in textfield as '<confirmPwd>'
    And user select security question one from drop down field as '<firstQuestion>'
    And user enter securiy answer one in textfield as '<firstAnswer>'
    And user select security question two from drop down field as '<secondQuestion>'
    And user enter securiy answer two in textfield as '<secondAnswer>'
    When user click on register button for register employee
    Then user should see a success message for register employee
    
    Examples: 
      | GIN      | DOB             | ISOSID     | username        | password  | confirmPwd | firstQuestion       | firstAnswer | secondQuestion       | secondAnswer |
      | 9630     | 01-March-1980   | ASt0271052 | SLBEmployee     | Admin@1234| Admin@1234 |Father’s middle name?|   test      | Mother’s maiden name?|   test       |
     #| 435235235| 01-January-1991 | AAn0145567 | AutomationArkema| Admin@1234| Admin@1234 |Father’s middle name?|   test      | Mother’s maiden name?|   test       |
     #| 3252352  | 01-January-1991 | ASA0145569 | AutomationSBM   | Admin@1234| Admin@1234 |Father’s middle name?|   test      | Mother’s maiden name?|   test       |