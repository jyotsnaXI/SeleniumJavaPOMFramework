
Feature: User Login to MedTrack Application
  As a registered user
  I want to log in to the MedTrack application
  So that I can access the employee search functionality


@LoginTest
  Scenario: Successful login with valid credentials
    Given user launch chrome browser 
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    When user click on login button
    Then user navigate to Search Employee page
    
  #   Examples:
  #  |username  |
  #  |TempAdmin |
    
 