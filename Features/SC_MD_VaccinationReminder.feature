Feature: System Configuration -> Medical Data -> Vaccination Reminder

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddVaccinationReminder
 Scenario Outline: Successfully add vaccination reminder master
   Given user is on Search Employee page
   And User clicks on vaccination reminder under submenu medical data
   And user navigated to vaccination reminder Master page
   And user click on add button for vaccination reminder
   And user select reminder type from dropdown field as "Reminder Type3"
   And user enter email frequency in text field as "5"
   When user click on submit button for add vaccination reminder
   Then user should see success message for vaccination reminder
   
#@SC_SreachVaccinationReminder
@RegressionTest
 Scenario Outline: Successfully search vaccination reminder master
   Given user is on Search Employee page
   And User clicks on vaccination reminder under submenu medical data
   And user navigated to vaccination reminder Master page
   And user select reminder type from dropdown field as "Reminder Type3" for search
   When user click on search button for vaccination reminder
   Then user can see vaccination reminder record in search result table with edit button
   
@SC_ModifyVaccinationReminder
 Scenario Outline: Successfully edit vaccination reminder master
   Given user is on Search Employee page
   And User clicks on vaccination reminder under submenu medical data
   And user navigated to vaccination reminder Master page
   And user select reminder type from dropdown field as "Reminder Type3" for search
   And user click on search button for vaccination reminder
   And user can see vaccination reminder record in search result table with edit button
   And user click on edit button for edit vaccination reminder
   And user modify email frequency in text field as "6"
   When user click on submit button for modify vaccination reminder
   Then user should see modify success message for vaccination reminder