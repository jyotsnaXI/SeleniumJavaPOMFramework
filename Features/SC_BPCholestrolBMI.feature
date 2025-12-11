Feature: System Configuration -> Medical Data -> Blood Pressure/Cholestrol/BMI Master

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddBPCholestrolBMI
 Scenario Outline: Successfully add BPCholestrolBMI master
   Given user is on Search Employee page
   And User clicks on BPCholestrolBMI under submenu medical data
   And user navigated to BPCholestrolBMI Master page
   And user click on add button for BPCholestrolBMI
   And user select Master Type from dropdown as "Total cholesterol"
   And user enter Category Name in text field as "Testing"
   And user enter Minimum Value in text field as "10"
   And user enter Maximum Value in text field as "12"
   When user click on submit button for add BPCholestrolBMI
   Then user should see success message for add BPCholestrolBMI
   
#@SC_SreachBPCholestrolBMI
@RegressionTest
 Scenario Outline: Successfully search BPCholestrolBMI master
   Given user is on Search Employee page
   And User clicks on BPCholestrolBMI under submenu medical data
   And user navigated to BPCholestrolBMI Master page
   And user select Master Type from dropdown as "Total cholesterol" for search
   And user enter Category Name in text field as "Testing" for search
   When user click on search button for BPCholestrolBMI
   Then user can see BPCholestrolBMI record in search result table with edit button
   
@SC_ModifyBPCholestrolBMI
 Scenario Outline: Successfully edit BPCholestrolBMI master
   Given user is on Search Employee page
   And User clicks on BPCholestrolBMI under submenu medical data
   And user navigated to BPCholestrolBMI Master page
   And user select Master Type from dropdown as "Total cholesterol" for search
   And user enter Category Name in text field as "Testing" for search
   And user click on search button for BPCholestrolBMI
   And user can see BPCholestrolBMI record in search result table with edit button
   And user click on edit button for edit BPCholestrolBMI
   And user modify Category Name in text field as "Testing"
   And user modify Minimum Value in text field as "10"
   And user modify Maximum Value in text field as "12"
   When user click on submit button for modify BPCholestrolBMI
   Then user should see modify success business BPCholestrolBMI
   
 @SC_DeleteBPCholestrolBMI
 Scenario Outline: Successfully delete BPCholestrolBMI record
   Given user is on Search Employee page
   And User clicks on BPCholestrolBMI under submenu medical data
   And user navigated to BPCholestrolBMI Master page
   And user select Master Type from dropdown as "Total cholesterol" for search
   And user enter Category Name in text field as "Testing" for search
   And user click on search button for BPCholestrolBMI
   And user can see BPCholestrolBMI record in search result table with delete button
   When user click on delete button for BPCholestrolBMI
   Then user should see a success message for delete BPCholestrolBMI record