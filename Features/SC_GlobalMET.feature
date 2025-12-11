Feature: System Configuration -> Exam -> Global MET

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddGlobalMET
 Scenario Outline: Successfully add Global MET
   Given user is on Search Employee page
   And User clicks on Global MET under exam under submenu system configuration
   And user navigated to Global MET Master page
   And user click on Add button for Global MET
   And user navigated to Global MET Master page
   And user enter Global MET Name in text field as "TestOne"
   And user select checkbox for "Eyes and pupils" for Global MET
   When user click on submit button for Global MET
   Then user should see success message for Global MET
   
 #@SC_SearchGlobalMET
 @RegressionTest
 Scenario Outline: Successfully search Global MET
   Given user is on Search Employee page
   And User clicks on Global MET under exam under submenu system configuration
   And user navigated to Global MET Master page
   And user enter Global MET name in text field as "Test" for search Global MET
   When user click on search button for Global MET
   Then user can see search result with edit button for Global MET
   
  @SC_ModifyGlobalMET
  Scenario Outline: Successfully modify Global MET
   Given user is on Search Employee page
   And User clicks on Global MET under exam under submenu system configuration
   And user navigated to Global MET Master page
   And user enter Global MET name in text field as "TestOne" for search Global MET
   And user click on search button for Global MET
   And user can see search result with edit button for Global MET
   And user click on edit button for Global MET
   And user navigated to Global MET Master page
   And user select checkbox for "Lungs and chest" for Global MET
   When user click on submit button for update Global MET
   Then user should see modify success message for Global MET