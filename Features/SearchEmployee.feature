Feature: Search Employee

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

  #@SearchEmployeeTest
  @RegressionTest
  Scenario Outline: Searching an employee
    Given user is on Search Employee page
    And user enter first name as "<FirstName>"
    And user enter last name as "<LasttName>"
	  And user enter gin as "<GIN>"
  # And user enter Applicant ID as "<ApplicantID>"
    And user click on search button
    And search result gets displayed
  # And user select radio button from search result
  # When user click on view exam button
  # Then user should navigate to Medical Exam Information page

Examples: 
| FirstName  | ApplicantID  |
| Automation | 5531         |
