Feature: System Configuration -> Company -> Job Title

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddJobTitle
 Scenario Outline: Successfully add job title master
   Given user is on Search Employee page
   And User clicks on Job Title under submenu company
   And user navigated to Job Title Master page
   And user click on add button for job title
   And user select company name for job title from dropdown as "BioMerieux"
   And user enter Job Title in text field as "TestOne"
   When user click on submit button for add job title
   Then user should see success message for add job title
   
#@SC_SreachJobTitle
@RegressionTest
 Scenario Outline: Successfully search job title master
   Given user is on Search Employee page
   And User clicks on Job Title under submenu company
   And user navigated to Job Title Master page
   And user select company name for job title from dropdown as "BioMerieuxe" for search
   And user enter Job Title as "Test" for search
   When user click on search button for job title
   Then user can see job title record in search result table with edit button
   
@SC_ModifyJobTitle
 Scenario Outline: Successfully edit job title master
   Given user is on Search Employee page
   And User clicks on Job Title under submenu company
   And user navigated to Job Title Master page
   And user select company name for job title from dropdown as "BioMerieux" for search
   And user enter Job Title as "TestOne" for search
   And user click on search button for job title
   And user can see job title record in search result table with edit button
   And user click on edit button for edit job title
   And user modify Job Title in text field as "TestTwo"   
   When user click on submit button for modify job title
   Then user should see modify success business job title