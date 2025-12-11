Feature: Generate Reminders and Documents

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@RemindersAndDocuments_Generate
  Scenario Outline: Successfully able to generate Reminders and Documents
    Given user is on Search Employee page
		And User clicks on submenu Generate link under menu Reminders and Documents
		And user navigated to Generate Reminders and Documents page
		And user select company from dropdown as "BDT"
		
@RemindersAndDocuments_Download
  Scenario Outline: Successfully able to download Reminders and Documents
    Given user is on Search Employee page
		And User clicks on submenu Download link under menu Reminders and Documents
		And user navigated to Document Generation Queue page
		And user click on download button for Document Generation Queue
		And user click on error log button