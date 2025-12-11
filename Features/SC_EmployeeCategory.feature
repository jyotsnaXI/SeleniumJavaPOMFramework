Feature: System Configuration -> Company -> Employee Category

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddEmployeeCategory
 Scenario Outline: Successfully add employee category master
   Given user is on Search Employee page
   And User clicks on employee category under submenu company
   And user navigated to employee category master page
   And user click on add button for employee category
   And user select owner company from dropdown as "BioMerieux"
   And user enter employee category name in text field as "TestOne"
   When user click on submit button for add employee category
   Then user should see success message for add employee category
   
#@SC_SreachEmployeeCategory
@RegressionTest
 Scenario Outline: Successfully search employee category master
   Given user is on Search Employee page
   And User clicks on employee category under submenu company
   And user navigated to employee category master page
   And user select owner company from dropdown as "BioMerieuxe" for search
   And user enter employee category name as "TestOne" for search
   When user click on search button for employee category
   Then user can see employee category record in search result table with edit button
   
@SC_ModifyEmployeeCategory
 Scenario Outline: Successfully edit employee category master
   Given user is on Search Employee page
   And User clicks on employee category under submenu company
   And user navigated to employee category master page
   And user select owner company name from dropdown as "BioMerieux" for search
   And user enter employee category name as "TestOne" for search
   And user click on search button for employee category
   And user can see employee category search result table with edit button
   And user click on edit button for edit employee category
   And user modify employee category name in text field as "TestTwo"   
   When user click on submit button for modify employee category
   Then user should see success message for modify employee category