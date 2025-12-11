Feature: User do multiple operation with error log

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@Download_ErrorLog
  Scenario Outline: Successfully download error logs
    Given user is on Search Employee page
		And User clicks on submenu error logs link under menu Maintenance
		And user navigate to error log page
		And user select log dropdown as "Email Service Logs"
		And user select log file from textarea as "Medtrack-EmailSuccess.log"
		When user click on download button for log
		Then user should see downloaded log in local machine
		
@Delete_ErrorLog
  Scenario Outline: Successfully delete error logs
    Given user is on Search Employee page
		And User clicks on submenu error logs link under menu Maintenance
		And user navigate to error log page
		And user select log dropdown as "Email Service Logs"
		And user select log file from textarea as "Medtrack-EmailSuccess.log"
		When user click on delete button for log
		Then user should see deleted message for log
		
@Reload_ErrorLog
  Scenario Outline: Successfully reload error logs
    Given user is on Search Employee page
		And User clicks on submenu error logs link under menu Maintenance
		And user navigate to error log page
		And user select log dropdown as "Email Service Logs"
		When user click on reload button for log
		Then user should see reloaded log
		
@Configuration_ErrorLog
  Scenario Outline: Successfully configure error logs
    Given user is on Search Employee page
		And User clicks on submenu error logs link under menu Maintenance
		And user navigate to error log page
		When user click on configuation button for log
		Then user should navigated configuration page