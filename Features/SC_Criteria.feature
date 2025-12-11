Feature: System Configuration -> Company -> Criteria

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddCompanyCriteria
 Scenario Outline: Successfully add a criteria
   Given user is on Search Employee page
   And User clicks on Criteria under submenu company
   And user navigated to company criteria master page
   And user select owner company from dropdown as "BioMerieux" for company criteria
   And user click on get deatils button
   And user select checkbox for "Job Site" in criteria field
  # And user select checkbox for optional criteria
   When user click on submit button for company criteria
   Then user can see company criteria success message
   
