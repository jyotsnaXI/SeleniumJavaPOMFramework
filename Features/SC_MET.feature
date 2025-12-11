Feature: System Configuration -> Company -> MET

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddMET
 Scenario Outline: Successfully add a MET
   Given user is on Search Employee page
   And User clicks on MET under submenu company
   And user navigated to Search MET page
   And user click on ADD button
   And user navigated to MET Master page
   And user select company dropdown as "BioMerieux"
   And user select Global MET dropdown as "A SBM"
   And user enter MET in text area as "METThree"
   And user click on add button for adding MET
   And user can see Add/Modify MET Criteria section
   And user enter Criteria Name in text area as "CriOne"
   And user enter Frequency in Years in text area as "2"
   And user enter age in text area as "55"
   And user select gender from dropdown as "Male"
   And user select Geo Market from dropdown
   When user click on submit button for MET
   Then user can see success message for add MET
   
   #@SC_SearchMET
   @RegressionTest
   Scenario Outline: Successfully search a MET
   Given user is on Search Employee page
   And User clicks on MET under submenu company
   And user navigated to Search MET page
   And user enter MET in text area as "Test"
   When user click on search button for MET
   Then user can see search result for MET
   
   @SC_ModifyMET
   Scenario Outline: Successfully modify a MET
   Given user is on Search Employee page
   And User clicks on MET under submenu company
   And user navigated to Search MET page
  And user enter MET in text area as "METThree"
   And user click on search button for MET
   And user can see search result for MET with edit button
   And user click on edit button for MET
   And user navigated to MET Master page
   And user click on edit button for modify MET
   And user modify Criteria Name in text area as "CriTeo"
   And user modify Frequency in Years in text area as "2"
   And user modify age in text area as "66"
   And user modify gender from dropdown as "Male"
   And user modify Geo Market from dropdown
   When user click on submit button for MET
   Then user can see success message for modify MET