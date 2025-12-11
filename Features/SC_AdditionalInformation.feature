Feature: System Configuration -> Company -> Additional Information Master

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddAdditionalInformation
 Scenario Outline: Successfully add additional information master
   Given user is on Search Employee page
   And User clicks on additional information under submenu company
   And user navigated to additional information master page
   And user click on add button for additional information
   And user select company name from dropdown as "Air Liquide" for Additional Fields
   And user enter Additional Field Name in text field as "TestOne"
   And user enter Column Name In HR Import in text field as "HROne"
   And user select Additional Field Type from dropdown as "Text"
   When user click on submit button for add additional information
   Then user should see success message for add additional information
   
#@SC_SreachAdditionalInformation
@RegressionTest
 Scenario Outline: Successfully search business area master
   Given user is on Search Employee page
   And User clicks on additional information under submenu company
   And user navigated to additional information master page
   And user select company name from dropdown as "Air Liquide" for Additional Fields
   And user enter field name as "TestOne" for search
   When user click on search button for additional information
   Then user can see additional information record in search result table with edit button
   
@SC_ModifyAdditionalInformation
 Scenario Outline: Successfully edit business area master
   Given user is on Search Employee page
   And User clicks on additional information under submenu company
   And user navigated to additional information master page
   And user select company name from dropdown as "Air Liquide" for Additional Fields
   And user enter additional information name as "TestOne" for search
   And user click on search button for additional information
   And user can see additional information search result table with edit button
   And user click on edit button for edit additional information
   And user modify Additional Field Name in text field as "TestTwo"
   And user modify Column Name In HR Import in text field as "HRTwo"  
   When user click on submit button for modify additional information
   Then user should see success message for modify additional information