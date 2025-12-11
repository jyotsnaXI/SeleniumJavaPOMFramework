Feature: Search Covid-19 Vaccination status for employee

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

#@VaccinationStatus_SearchEmployee
@RegressionTest
  Scenario Outline: Successfully search Covid-19 Vaccination status for employee
    Given user is on Search Employee page
		And User clicks on Search COVID-19 Vaccination link under menu COVID-19 Vaccination
		And user navigate to Search vaccination status page
	# And user enter Last Name in text field as "<LastName>"
		And user enter First Name in text field as "<FirstName>"
		When user click on Search button for Covid-19 Vaccination status
		Then user should see search result for Covid-19 Vaccination status
		
		Examples:
		| LastName     | FirstName  |
		| ErametDupFive| 	Automation|
		
@VaccinationStatus_Export
  Scenario Outline: Successfully export Covid-19 Vaccination status for employee
    Given user is on Search Employee page
		And User clicks on Search COVID-19 Vaccination link under menu COVID-19 Vaccination
		And user navigate to Search vaccination status page
		And user enter Last Name in text field as "<LastName>"
		And user enter First Name in text field as "<FirstName>"
		And user click on Search button for Covid-19 Vaccination status
		And user can see search result with export button
		When user click on export button for Covid-19 Vaccination status
		Then user should see file exported in local machine
		
		Examples:
		| LastName | FirstName |
		| Smith    | John      |
		