Feature: System Configuration -> Medical Data -> Health Check Item

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddHealthCheckItem
 Scenario Outline: Successfully add HealthCheckItem master
   Given user is on Search Employee page
   And User clicks on HealthCheckItem under submenu medical data
   And user navigated to HealthCheckItem Master page
   And user click on add button for HealthCheckItem
   And user enter Health Check Item Name in text field as "abc"
   And user select Health Check Item Group from dropdown field as "Physician Report"
   And user select Health Check Item Sub group from dropdown field as "Drug Testing"
   And user select Health Check Item Type from dropdown field as "Numeric"
   And user enter International Unit in text field as "12"
   And user enter Unit of Measurement in text field as "2"
   And user enter Conversion Factor in text field as "2"
   And user enter Secondary Name in text field as "test"
   And user click on add button to add international unit
   And user select Language from dropdown field as "French"
   And user enter Description in text field as "abcd"
   And user click on add button to add Other Language Description
   When user click on submit button for add HealthCheckItem
   Then user should see success message for add HealthCheckItem
   
#@RegressionTest
@SC_SreachHealthCheckItem
 Scenario Outline: Successfully search HealthCheckItem master
   Given user is on Search Employee page
   And User clicks on HealthCheckItem under submenu medical data
   And user navigated to HealthCheckItem Master page
   And user enter Health Check Item Name in text field as "Test" for search
   When user click on search button for HealthCheckItem
   Then user can see HealthCheckItem record in search result table with edit button
   
@SC_ModifyHealthCheckItem
 Scenario Outline: Successfully edit HealthCheckItem master
    Given user is on Search Employee page
   And User clicks on HealthCheckItem under submenu medical data
   And user navigated to HealthCheckItem Master page
   And user enter Health Check Item Name in text field as "Test" for search
   And user click on search button for HealthCheckItem
   And user can see HealthCheckItem record in search result table with edit button
   And user click on edit button for HealthCheckItem
   And user navigated to HealthCheckItem Master page
   And user modify Health Check Item Sub group from dropdown field as "Medical Examination"
   When user click on submit button for modify HealthCheckItem
   Then user should see modify success business HealthCheckItem