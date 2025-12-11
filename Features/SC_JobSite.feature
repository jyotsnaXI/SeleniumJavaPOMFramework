Feature: System Configuration -> Company -> Job Site

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddJobSite
 Scenario Outline: Successfully add Job Site master
   Given user is on Search Employee page
   And User clicks on Job Site under submenu company
   And user navigated to Job Site Master page
   And user click on add button for Job Site
   And user select company name for Job Site from dropdown as "BioMerieux"
   And user enter Job Site Name in text field as "TestOne"
   When user click on submit button for add Job Site
   Then user should see success message for add Job Site
   
#@SC_SreachJobSite
@RegressionTest
 Scenario Outline: Successfully search Job Site master
   Given user is on Search Employee page
   And User clicks on Job Site under submenu company
   And user navigated to Job Site Master page
   And user select company name for Job Site from dropdown as "BioMerieux" for search
   And user enter Job Site Name as "Test" for search
   When user click on search button for Job Site
   Then user can see Job Site record in search result table with edit button
   
@SC_ModifyJobSite
 Scenario Outline: Successfully edit Job Site master
   Given user is on Search Employee page
   And User clicks on Job Site under submenu company
   And user navigated to Job Site Master page
   And user select company name for Job Site from dropdown as "BioMerieux" for search
   And user enter Job Site Name as "TestOne" for search
   And user click on search button for Job Site
   And user can see Job Site record in search result table with edit button
   And user click on edit button for edit Job Site
   And user modify Job Site name in text field as "TestTwo"   
   When user click on submit button for modify Job Site
   Then user should see modify success business Job Site