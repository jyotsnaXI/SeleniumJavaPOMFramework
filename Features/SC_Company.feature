Feature: System Configuration -> Company -> Company

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddCompany
 Scenario Outline: Successfully add a company
   Given user is on Search Employee page
   And User clicks on company under submenu company
   And user navigated to search company page
   And user click on add button
   And user navigated to company master page
   And user enter company name as "TestTwo"
   And user select company from owner company dropdown as "BioMerieux"
   And user enter complete postal address 1 as "Testing"
   And user enter city as "xyz"
   And user select country as "Egypt"
   And user enter postal code as "0000"
   And user enter phone as "0000000000"
   When user click on submit button
   Then user can see success message
   
  #@SC_SearchCompany
   @RegressionTest
  Scenario Outline: Successfully add a company
   Given user is on Search Employee page
   And User clicks on company under submenu company
   And user navigated to search company page
   And user enter company name as "Test"
   And user select company from owner company dropdown as "BioMerieux"
   When user click on search button for company
   Then user can see search result for company
   
@SC_EditCompany
 Scenario Outline: Successfully add a company
   Given user is on Search Employee page
   And User clicks on company under submenu company
   And user navigated to search company page
   And user enter company name as "TestTwo"
   And user select company from owner company dropdown as "BioMerieux"
   And user click on search button
   #And user see search result table with record "TestOne"
   And user click on edit button for company as "TestOne"
   And user navigated to company master page
   And user edit company name as "TestOne"
   #And user select access rights as "online"
   And user edit complete postal address 1 as "Testing1"
   And user edit city as "xyz"
   And user modify country as "Egypt"
   And user edit postal code as "0000"
   And user edit phone as "0000000000"
   When user click on submit button
   Then user can see modification success message

   
   