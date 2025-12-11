Feature: System Configuration -> Code Description

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddCodeDescription
 Scenario Outline: Successfully add code master
   Given user is on Search Employee page
   And User clicks on code description under system configuration
   And user navigated to code master page
   And user click on add button for code
   And user select code type from dropdown field as "Country"
   And user enter description in text field as "test" for code
   And user enter abbreviation in text field as "test"
   When user click on submit button for add code
   Then user should see success message for add code
   
#@SC_SreachCodeDescription
@RegressionTest
 Scenario Outline: Successfully search code master
   Given user is on Search Employee page
   And User clicks on code description under system configuration
   And user navigated to code master page
   And user select code type from dropdown field as "Country" for search
   And user enter description in text field as "test" for search
   When user click on search button for code
   Then user can see code record in search result table with edit button
   
@SC_ModifyCodeDescription
 Scenario Outline: Successfully edit code master
   Given user is on Search Employee page
   And User clicks on code description under system configuration
   And user navigated to code master page
   And user select code type from dropdown field as "Country" for search
   And user enter description in text field as "test" for search
   And user click on search button for code
   And user can see code record in search result table with edit button
   And user click on edit button for edit code
   And user modify description in text field as "test" for code
   And user modify abbreviation in text field as "test"
   When user click on submit button for modify code
   Then user should see modify success message for code