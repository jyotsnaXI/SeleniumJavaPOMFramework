Feature: System Configuration -> Company -> Static Content

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddStaticContent
 Scenario Outline: Successfully add Static Content
   Given user is on Search Employee page
   And User clicks on Static Content under submenu company
   And user navigated to Static Content Master page
   And user select owner company from dropdown as "Frontex" for Static Content
   And user click on search button for Static Content
   And user click on add button for Static Content
   And user enter Menu Name in text area as "TestingOne"
   And user enter URL location or path in text area as "ABC"
   When user click on submit button for Static Content
   Then user can see success message for Static Content 
   
  #@SC_SearchStaticContent
  @RegressionTest
 Scenario Outline: Successfully search Static Content
   Given user is on Search Employee page
   And User clicks on Static Content under submenu company
   And user navigated to Static Content Master page
   And user select owner company from dropdown as "Frontex" for Static Content
   When user click on search button for Static Content
   Then user can see search records for Static Content
   
  @SC_EditStaticContent
 Scenario Outline: Successfully edit Static Content
   Given user is on Search Employee page
   And User clicks on Static Content under submenu company
   And user navigated to Static Content Master page
   And user select owner company from dropdown as "Frontex" for Static Content
   And user click on search button for Static Content
   And user can see search result with edit button for Static Content
   And user click on edit button for Static Content
   And user modify Menu Name in text area as "TestingTwo"
   And user modify URL location or path in text area as "https://www.abcd.com/login.asp"
   When user click on submit button for modify Static Content
   Then user can see modify success message Static Content 
   