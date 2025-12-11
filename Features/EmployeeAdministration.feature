Feature: Employee Administration Page

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page
   # And user enter "Test" in first name
   # And user enter "Three" in last name
   
  @ChangeStatusOfExamTest
  	Scenario Outline: Change status of Exam for an employee
  	Given user is on Search Employee page
    And user enter Applicant ID as "<ApplicantID>"
    And user enter first name as "<firstName>"
    And user click on search button
    And search result gets displayed
    And user click on Last Name link
    And user navigate to employee detail page
    And user click on Administration tab
    And user navigate to Administration page
		When user select operation as "<Operation>"
		Then user should select exam date
		And user should see see current exam status
		And user should select Change to exam status as "<ChangeToExamStatus>"
		And user should click on submit button for change status of exam
		And user should navigate to new window and enter username, password and click on submit button for validate credential
		And user should see success message for exam change status
		
Examples: 
|ApplicantID|firstName |Operation            |ChangeToExamStatus|
|5875       |Automation|Change status of Exam|In Progress       |
		
	@CreateDummyExamTest
  	Scenario Outline: Create dummy exam for an employee
  	Given user is on Search Employee page
    And user enter Applicant ID as "<ApplicantID>"
    And user enter first name as "<firstName>"
    And user click on search button
    And search result gets displayed
    And user click on Last Name link
    And user navigate to employee detail page
    And user click on Administration tab
    And user navigate to Administration page
		When user select operation as "<Operation>"
		Then user should select MET from dropdown
		And user should select date of exam 
		And user should enter comments
		And user should click on submit button for create dummy exam
		And user should navigate to new window and enter username, password and click on submit button for validate credential
		And user should see success message for dummy exam
		
Examples: 
|ApplicantID|firstName |Operation        |
|6091       |Automation|Create Dummy Exam|
		
	@DeleteExamTest
  	Scenario Outline: Delete exam for an employee
  	Given user is on Search Employee page
    And user enter Applicant ID as "<ApplicantID>"
    And user enter first name as "<firstName>"
    And user click on search button
    And search result gets displayed
    And  user click on Last Name link
    And user navigate to employee detail page
    And user click on Administration tab
    And user navigate to Administration page
		When user select operation as "Delete an exam"
		Then user should select exam date from dropdown to delete exam
		And user should tick checkbox for confirmation for delete exam 
		And user should click on submit button for delete exam
		And user should navigate to new window and enter username, password and click on submit button for validate credential
		And user should see success message for delete exam
		
Examples: 
|ApplicantID|firstName |
|6091       |Automation|
#|6091      |Automation|
		
	@DeleteRecommendationLetterTest
  	Scenario Outline: Delete Recommendation Letter for an employee
    Given user is on Search Employee page
    And user enter Applicant ID as "<ApplicantID>"
    And user enter first name as "<firstName>"
    And user click on search button
    And search result gets displayed
    And  user click on Last Name link
    And user navigate to employee detail page
    And user click on Administration tab
    And user navigate to Administration page
		When user select operation as "Delete recommendation letter"
		Then user should select exam date from dropdown to delete recommendation letter
		And user should tick checkbox for Confirm recommendation letter deletion
		And user should click on submit button for delete recomm letter
		And user should navigate to new window and enter username, password and click on submit button for validate credential
		And user should see success message for delete recommendation letter
		
Examples: 
|ApplicantID|firstName |
|6091       |Automation|
		
		@DeleteRemindersTest
  	Scenario Outline: Delete Reminders for an employee
    Given user is on Search Employee page
    And user enter Applicant ID as "<ApplicantID>"
    And user enter first name as "<firstName>"
    And user click on search button
    And search result gets displayed
    And  user click on Last Name link
    And user navigate to employee detail page
    And user click on Administration tab
    And user navigate to Administration page
		When user select operation as "Delete reminders"
		Then user should select radio button for existing exams
		And user should select exam date from dropdown to delete reminders
		And user should select reminder type from dropdown
		And user should click on checkbox to delete reminder
		And user should click on submit button for delete reminders
		And user should navigate to new window and enter username, password and click on submit button for validate credential
		And user should see success message for delete reminder
		
Examples: 
|ApplicantID|firstName |
|6091       |Automation|

 @DeleteEmployee
  	Scenario Outline: Delete an employee from system
    Given user is on Search Employee page
    And user enter Applicant ID as "<ApplicantID>"
    And user enter first name as "<firstName>"
    And user click on search button
    And search result gets displayed
    And  user click on Last Name link
    And user navigate to employee detail page
    And user click on Administration tab
    And user navigate to Administration page
		When user select operation as "Delete Employee"
		Then user should tick checkbox for Confirm employee deletion
		And user should click on submit button for delete employee
		And user should navigate to new window and enter username, password and click on submit button for validate credential
		And user should see success message for delete employee
		
Examples: 
|ApplicantID|firstName |
|9133       |Automation|  