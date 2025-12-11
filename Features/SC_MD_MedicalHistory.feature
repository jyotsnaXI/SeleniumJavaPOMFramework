Feature: System Configuration -> Medical Data -> Medical History

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_MD_AddMedicalHistory
 Scenario Outline: Successfully add Medical History master
   Given user is on Search Employee page
   And User clicks on Medical History under submenu Medical data
   And user navigated to medical history master page
   And user click on add button for Medical History
   And user enter Medical History Item Name in text field as "abcd"
   And user select Medical History Item Type from dropdown field as "Numeric"
   And user select Medical History Item Group from dropdown field as "Allergies"
   And user select language from dropdown field as "French"
   And user enter description in text field as "abcc"
   And user click on add button to add language
   When user click on submit button for add Medical History
   Then user should see success message for add Medical History
   
#@SC_MD_SreachMedicalHistory
@RegressionTest
 Scenario Outline: Successfully search Medical History master
   Given user is on Search Employee page
   And User clicks on Medical History under submenu Medical data
   And user navigated to medical history master page
   And user enter Medical History Item Name in text field as "abcd" for search
   When user click on search button for Medical History
   Then user can see Medical History record in search result table with edit button
   
@SC_MD_ModifyMedicalHistory
 Scenario Outline: Successfully edit Medical History master
   Given user is on Search Employee page
   And User clicks on Medical History under submenu Medical data
   And user navigated to medical history master page
   And user enter Medical History Item Name in text field as "Test" for search
   And user click on search button for Medical History
   And user can see Medical History record in search result table with edit button
   And user click on edit button for Medical History
   And user navigated to medical history master page
   And user modify Medical History Item Name in text field as "abcd"
   When user click on submit button for modify Medical History
   Then user should see modify success business Medical History