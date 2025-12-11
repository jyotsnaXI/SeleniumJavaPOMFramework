Feature: Generate master report

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@GenerateMasterReport
  Scenario Outline: Successfully able to search reviewed exams
    Given user is on Search Employee page
		And User clicks on submenu Generate Master Report link under menu Reports
		And user navigated to Select Reports you wish to merge page
		