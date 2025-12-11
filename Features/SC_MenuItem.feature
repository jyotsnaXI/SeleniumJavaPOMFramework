Feature: System Configuration -> Company -> Menu Item

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddMenuItemMaster
 Scenario Outline: Successfully add Menu Item 
   Given user is on Search Employee page
   And User clicks on Menu Item under mobile under submenu company
   And user navigated to Menu Item Master
   And user click on add button for Menu Item
   And user select company name for Menu Item from dropdown as "BioMerieux"
   And user select default menu name from dropdown as "Dashboard"
   When user click on submit button for Menu Item
   Then user should see success message for Menu Item
   
#@SC_SreachMenuItemMaster
@RegressionTest
 Scenario Outline: Successfully search Menu Item
   Given user is on Search Employee page
   And User clicks on Menu Item under mobile under submenu company
   And user navigated to Menu Item Master
   And user select company name for Menu Item from dropdown as "BioMerieux" for search
   And user select default menu name from dropdown as "Dashboard" for search
   When user click on search button for Menu Item
   Then user can see search result table with edit button for menu item
   
@SC_ModifyMenuItemMaster
 Scenario Outline: Successfully edit Menu Item
   Given user is on Search Employee page
   And User clicks on Menu Item under mobile under submenu company
   And user navigated to Menu Item Master
   And user select company name for Menu Item from dropdown as "BioMerieux" for search
   And user select default menu name from dropdown as "Dashboard" for search
   And user click on search button for Menu Item
   And user can see search result table with edit button for menu item
   And user click on edit button for edit Menu Item
   And user modify alternate menu name as "TestOne" for Menu Item
   When user click on submit button for modify Menu Item
   Then user should see modify success Menu Item message
   
   @SC_DeleteItemMaster
 Scenario Outline: Successfully delete Menu Item
   Given user is on Search Employee page
   And User clicks on Menu Item under mobile under submenu company
   And user navigated to Menu Item Master
   And user select company name for Menu Item from dropdown as "BioMerieux" for search
   And user select default menu name from dropdown as "Dashboard" for search
   And user click on search button for Menu Item
   And user can see search result table with delete button for menu item
   When user click on delete button for delete Menu Item
   Then user should see delete success Menu Item message