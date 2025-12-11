Feature: Create Exam Page

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page
   # And user enter "Test" in first name
   # And user enter "Three" in last name

  @CreateExamTest
  Scenario Outline: Creating exam for an employee
    Given user enter Applicant ID as "<ApplicantID>"
    And user enter first name as "<firstName>"
    And user click on search button
    And search result gets displayed
    And user click on Last Name link
    And user navigate to employee detail page
    And user click on Create Exam button
    And user navigate to Create New Exam page
    And user click on radio button for I do authorize
    And user select Reason For Medical as "Pre Employment"
    And user enter Date of Exam as "01-Apr-2021"
    And user select Medical Center as "CIVEM"
    And user click on Submit button for create exam
    And user navigated to Medical Exam Information	page
    And user click on Physician Report tab
 		And user select all dropdown and checkboxes fields in Physician Report tab
   # And user check all checkbox in Physician Report tab
    And user click on save physician report button
    And user click on Lab Analysis tab
    And user select all dropdown and checkbox in Lab Analysis tab
    #And user check all checkbox in Lab Analysis tab
    And user click on save Lab Analysis button
    And user click on Fitness Conclusion tab
    And user select Fitness Status as "Fit"
    And user enter Physicians Comments for Employee as "Person is fit"
    And user saving physician comments
    And user select case as "Save"
   # And user select Fitness Status as Fit
   # And user enter comments "Comments from Intl. SOS"
    When user click on submit for exam creation
    Then user should see exam creation success message
    
Examples:
|ApplicantID|firstName  |
|7167       |Automation|
#|2373       |Automationn|
#|613        |Automationn|
#|1739       |Automationn|
#|3023       |Automationn|
#|1107       |Automationn|
#|1408       |Automationn|
#|1144       |Automationn|
#|8457       |Automationn|
#|5486       |Automationn|
#|3688       |Automationn|
#|4648       |Automationn|
#|4047       |Automationn|

  
   
    