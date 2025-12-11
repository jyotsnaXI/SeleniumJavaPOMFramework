Feature: Different actions to be performed on employee

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page
    
 @EmployeeDetailsTest_ResendNotification
   Scenario Outline: Resend Notification for the employee record
   Given user is on Search Employee page
    And user enter Applicant ID as "<ApplicantID>"
    And user click on search button
    And search result gets displayed
    And user click on Last Name link
    And user navigate to employee detail page
    And user click on Resend Notification button
    And user can see notification message
    
Examples: 
| ApplicantID  |
| TM-TFn0143184|
    
  @EmployeeDetailsTest_SendLTA
   Scenario Outline: Send LTA for the employee record
    Given user is on Search Employee page
    And user enter Applicant ID as "<ApplicantID>"
    And user click on search button
    And search result gets displayed
    And user click on Last Name link
    And user navigate to employee detail page
    And user click on Send LTA button
    And user can see LTA message
    
Examples: 
| ApplicantID  |
| TM-TFn0143184|
    
  @ModifyEmployeeDetails
   Scenario Outline: Edit Information for the employee
    Given user is on Search Employee page
    And user enter Applicant ID as "<ApplicantID>"
    And user click on search button
    And search result gets displayed
    And user click on Last Name link
    And user navigate to employee detail page
    And user click on Edit Information link
    And user navigated to Modify Pre-Employee Record page
   	And user modify Employee Status as "<EmployeeStatus>"
		And user modify Title as "<Title>"
		And user modify First Name as "<FirstName>"	
		And user modify Last Name as "<LastName>"
		And user modify Gender as "<Gender>"
		And user modify Date of Birth as "<DateOfBirth>"
		And user modify Primary E-Mail Address as "<PrimaryEMail>"
		And user modify Secondary E-Mail Address as "<SecondaryEMail>"
		And user modify Employee Category as "<EmpCategory>"
	  When user click on submit button for modify record
    Then user should see message for edit employee record
    
Examples:
| ApplicantID|EmployeeStatus |Title | FirstName | LastName | Gender  | DateOfBirth | PrimaryEMail                       | SecondaryEMail          | EmpCategory | 
| 1909       |Active         |Mr    | Automation| Air Liq  | Male  | 01-Mar-1980 | jyotsna.gupta@internationalsos.com |                         | Expatriate  |

    
  @EmpDetailsTest_ClickBtn_ReadyToPrint_Status
   Scenario Outline: View Exam and generate documents for the employee
    Given user is on Search Employee page
    And user enter Applicant ID as "<ApplicantID>"
    And user click on search button
    And search result gets displayed
    And user click on Last Name link
    And user navigate to employee detail page
    And user click on View Exam button
    And user navigate to Medical Exam Information page
    When user can see record status as
   # Then user should click on Print Health Passport button
   # And user should click on Print Questionnaire button
   # And user should click on Print Medical Compliance Certificate button
   
Examples: 
| ApplicantID  |
| TM-TFn0143184|