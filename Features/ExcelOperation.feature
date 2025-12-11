Feature: Reading Writing excel files


@ExcelOperations
  Scenario: Successfully Reading Writing excel files
    Given user launch chrome browser 
    And user enters url, username and password from excel file
    And user enter code for verification
    When user click on login button
    Then user navigate to Search Employee page
    
