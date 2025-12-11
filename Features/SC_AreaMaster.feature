Feature: System Configuration -> Company -> Area

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddAreaMaster
 Scenario Outline: Successfully add an area master
   Given user is on Search Employee page
   And User clicks on area master under submenu company
   And user navigated to area master page
   And user click on add button for area
   And user select company name from dropdown as "Air Liquide"
   And user enter area in text field as "TestOne"
   When user click on submit button for add area
   Then user should see success message for add area
   
#@SC_SreachAreaMaster
@RegressionTest
 Scenario Outline: Successfully search area master
   Given user is on Search Employee page
   And User clicks on area master under submenu company
   And user navigated to area master page
   And user select company name from dropdown as "Air Liquide" for search
   And user enter area as "TestOne" for search
   When user click on search button for area
   Then user can see record in search result table with edit button
   
@SC_ModifyAreaMaster
 Scenario Outline: Successfully edit area master
   Given user is on Search Employee page
   And User clicks on area master under submenu company
   And user navigated to area master page
   And user select company name from dropdown as "Air Liquide" for search
   And user enter area as "TestOne" for search
   And user click on search button for area
   And user can see record in search result table with edit button
   And user click on edit button
   And user modify area in text field as "TestTwo"   
   When user click on submit button for modify area
   Then user should see modify success message