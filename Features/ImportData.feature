Feature: Import Data tab functionality

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@ImportData_import
  Scenario Outline: Successfully able to import file
    Given user is on Search Employee page
		And User clicks on submenu Import link under menu Import Data
		And user navigate to Import File page
		And user click on choose file button
		When user upload file name with extention
		Then user should see file attached
		And user should click on import button
		And user should see file in Import Queue table
		
@ImportData_ExportQuest_Download
  Scenario Outline: Successfully able to download or generate file
    Given user is on Search Employee page
		And User clicks on submenu Export Quest under menu Import Data
		And user navigate to Export Quest page
		When user click on download button
		Then user should see file downloaded popup message
		
@ImportData_ExportQuest_GenerateCnfFile
  Scenario Outline: Successfully able to download or generate file
    Given user is on Search Employee page
		And User clicks on submenu Export Quest under menu Import Data
		And user navigate to Export Quest page
		When user click on generate new confirmation file button
		Then user should see message for file generation
		