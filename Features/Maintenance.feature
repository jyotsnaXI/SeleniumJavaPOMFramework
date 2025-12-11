Feature: Provide maintenance feature to application

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@Message_maintenance
  Scenario Outline: Successfully perform operations for message
    Given user is on Search Employee page
		And User clicks on submenu maintenance link under menu Maintenance
		And user navigate to maintenance page
		And user select an operation dropdown as "Message"
		And user enter message in text area
		And user select start date from calender date
		And user select end date from calender date
		#When user click on submit button for message
		Then user should validate credential
		And user can see success message for message
		
@Page_maintenance
Scenario Outline: Successfully perform operations for page
    Given user is on Search Employee page
		And User clicks on submenu maintenance link under menu Maintenance
		And user navigate to maintenance page
		And user select an operation dropdown as "Page"
		And user select checkbox for Confirm Apply of Maintenance Page
		#When user click on submit button for page
		Then user should validate credential
		And user can see success message for page
		
@StartStopEmailServices_maintenance
Scenario Outline: Successfully perform operations for email services
    Given user is on Search Employee page
		And User clicks on submenu maintenance link under menu Maintenance
		And user navigate to maintenance page
		And user select an operation dropdown as "Start/Stop Email Service"
		#And user select radio button for Stop Email Service
		#When user click on submit button for stop service
		Then user should validate credential
		And user can see success message for stop service
		
@DeleteEmailQueue_DeleteErroredEmails
Scenario Outline: Successfully perform operations for mail
    Given user is on Search Employee page
		And User clicks on submenu maintenance link under menu Maintenance
		And user navigate to maintenance page
		And user select an operation dropdown as "Delete Email Queue"
		And user select radio button for Delete errored emails
		And user select checkbox for error description
		#When user click on submit button for delete errored mail
		Then user should validate credential
		And user can see success message for delete errored mail
		
@DeleteEmailQueue_DeleteEmailsToBeSent
Scenario Outline: Successfully perform operations for delete email queue
    Given user is on Search Employee page
		And User clicks on submenu maintenance link under menu Maintenance
		And user navigate to maintenance page
		And user select an operation dropdown as "Delete Email Queue"
		#And user select radio button for Delete emails to be sent
		And user select email type from dropdown as "LTA"
		And user select company from dropdown as "Abc" for delete mail to be sent
		#When user click on search button for delete mail to be sent
		Then user should validate credential
		And user can see search result for delete mail to be sent