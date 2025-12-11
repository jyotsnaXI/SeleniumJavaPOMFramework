Feature: Exam Page

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page
   # And user enter "test" in first name
   # And user enter "sixtnn" in last name

  @ViewExamTest
 Scenario Outline: Viewing exam for an employee
    Given user enter Applicant ID as "<ApplicantID>"
    And user enter first name as "<firstName>"
    And user click on search button
    And search result gets displayed
    And user select radio button from search result
    And user click on View Exam button
    And user navigate to Medical Exam Information page
    And user click again on Physicians Report tab
    And user modify all dropdown and checkbox fields in Physician Report tab
   # And user modify all checkbox in Physician Report tab
    And user click save physician report button
    And user click again on Lab Analysis tab
    And user modify all dropdown and checkbox in Lab Analysis tab
    And user click save Lab Analysis button
    And user click again on Fitness Conclusion tab
    And user edit Fitness Status as "Fit"
    And user edit Physician’s Comments for Employee as "Person is fit"
    And user click again on Submit button
    And user edit Type of Case as "Save"
   # And user edit Fitness Status checkbox as Fit
   # And user edit Comments for Employee as "Comments from Intl. SOS."
    When user click on Final Submit button
    Then user should see again success message 
    
Examples:
|ApplicantID|firstName |
|6749          |Automation|
#|431         |Automation|
#|7848        |Automation|
#|3404        |Automation|
#|9127       |Automation|
#|3350       |AutomationOne|
#|4815       |Automation|
#|1671       |Automation|
#|812        |Automation|
#|7847       |Automation|
#|2959       |Automation|
#|5473       |AutomationOne|
#|2405       |Automation|
#|839        |Automation|
#|91         |Automation|
  

	