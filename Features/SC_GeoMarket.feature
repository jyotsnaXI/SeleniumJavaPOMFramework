Feature: System Configuration -> Company -> Geo Market

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddGeoMarket
 Scenario Outline: Successfully add geo market master
   Given user is on Search Employee page
   And User clicks on Geo Market under submenu company
   And user navigated to Geo Market Master page
   And user click on add button for geo market
   And user select company name for geo market from dropdown as "BioMerieux"
   And user enter geo market name in text field as "TestOne"
   When user click on submit button for add geo market
   Then user should see success message for add geo market
   
#@SC_SreachGeoMarket
@RegressionTest
 Scenario Outline: Successfully search geo market master
   Given user is on Search Employee page
   And User clicks on Geo Market under submenu company
   And user navigated to Geo Market Master page
   And user select company name for geo market from dropdown as "BioMerieuxe" for search
   And user enter geo market name as "Test" for search
   When user click on search button for geo market
   Then user can see geo market record in search result table with edit button
   
@SC_ModifyGeoMarket
 Scenario Outline: Successfully edit geo market master
   Given user is on Search Employee page
   And User clicks on Geo Market under submenu company
   And user navigated to Geo Market Master page
   And user select company name for geo market from dropdown as "BioMerieux" for search
   And user enter geo market name as "TestOne" for search
   And user click on search button for geo market
   And user can see geo market record in search result table with edit button
   And user click on edit button for edit geo market
   And user modify geo market name in text field as "TestTwo"   
   When user click on submit button for modify geo market
   Then user should see modify success business geo market