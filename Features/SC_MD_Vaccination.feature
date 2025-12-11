Feature: System Configuration -> Medical Data -> Vaccination

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddVaccination
 Scenario Outline: Successfully add vaccination master
   Given user is on Search Employee page
   And User clicks on vaccination under submenu medical data
   And user navigated to vaccination Master page
   And user click on add button for vaccination
   And user enter Vaccination Name in text field as "TestFour"
   And user enter Frequency in text field as "30"
   When user click on submit button for add vaccination
   Then user should see success message for add vaccination
   
#@SC_SreachVaccination
@RegressionTest
 Scenario Outline: Successfully search vaccination master
   Given user is on Search Employee page
   And User clicks on vaccination under submenu medical data
   And user navigated to vaccination Master page
   And user enter Vaccination Name in text field as "TestFour" for search
   When user click on search button for vaccination
   Then user can see vaccination record in search result table with edit button
   
@SC_ModifyVaccination
 Scenario Outline: Successfully edit vaccination master
   Given user is on Search Employee page
   And User clicks on vaccination under submenu medical data
   And user navigated to vaccination Master page
   And user enter Vaccination Name in text field as "TestFour" for search
   And user click on search button for vaccination
   And user can see vaccination record in search result table with edit button
   And user click on edit button for edit vaccination
   And user modify Vaccination Name in text field as "TestFive"
   And user modify Frequency in text field as "35"
   When user click on submit button for modify vaccination
   Then user should see modify success message for vaccination