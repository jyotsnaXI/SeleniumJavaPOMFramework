Feature: System Configuration -> Medical Data -> Business Area Master

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddBusinessAreaMaster
 Scenario Outline: Successfully add business area master
   Given user is on Search Employee page
   And User clicks on business area master under submenu company
   And user navigated to Business Area Master page
   And user click on add button for business area
   And user select company name for business area from dropdown as "Air Liquide"
   And user enter business area in text field as "TestOne"
   When user click on submit button for add business area
   Then user should see success message for add business area
   
#@SC_SreachBusinessAreaMaster
@SC_SreachBusinessAreaMaster
 Scenario Outline: Successfully search business area master
   Given user is on Search Employee page
   And User clicks on business area master under submenu company
   And user navigated to Business Area Master page
   And user select company name for business area from dropdown as "Air Liquide" for search
   And user enter business area as "TestOne" for search
   When user click on search button for business area
   Then user can see business record in search result table with edit button
   
@SC_ModifyBusinessAreaMaster
 Scenario Outline: Successfully edit business area master
   Given user is on Search Employee page
   And User clicks on business area master under submenu company
   And user navigated to Business Area Master page
   And user select company name for business area from dropdown as "Air Liquide" for search
   And user enter business area as "TestOne" for search
   And user click on search button for business area
   And user can see business record in search result table with edit button
   And user click on edit button for edit business area
   And user modify business area in text field as "TestTwo"   
   When user click on submit button for modify business area
   Then user should see modify success business area message