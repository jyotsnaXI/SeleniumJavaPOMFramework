Feature: System Configuration -> Company -> Dashboard --> Landing Page

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddLandingPageMaster
 Scenario Outline: Successfully add Landing Page master
   Given user is on Search Employee page
   And User clicks on Landing Page under dashboard under submenu company
   And user navigated to Landing Page Master
   And user click on add button for Landing Page
   And user select company name for Landing Page from dropdown as "BioMerieux"
   And user select profile from dropdown as "Employee"
   When user click on submit button for Landing Page
   Then user should see success message for Landing Page
   
#@SC_SreachLandingPageMaster
@RegressionTest
 Scenario Outline: Successfully search Landing Page master
   Given user is on Search Employee page
   And User clicks on Landing Page under dashboard under submenu company
   And user navigated to Landing Page Master
   And user select company name for Landing Page from dropdown as "BioMerieux" for search
   And user select profile from dropdown as "Employee" for search
   When user click on search button for Landing Page
   Then user can see search result table with edit button
   
@SC_ModifyLandingPageMaster
 Scenario Outline: Successfully edit Landing Page master
   Given user is on Search Employee page
   And User clicks on Landing Page under dashboard under submenu company
   And user navigated to Landing Page Master
   And user select company name for Landing Page from dropdown as "BioMerieuxe" for search
   And user select profile from dropdown as "Employee" for search
   And user click on search button for Landing Page
   And user can see search result table with edit button
   And user click on edit button for edit Landing Page
   When user click on submit button for modify Landing Page
   Then user should see modify success Landing Page message