Feature: System Configuration -> Company -> Logo information

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_UploadLogo
 Scenario Outline: Successfully add a logo
   Given user is on Search Employee page
   And User clicks on logo information under submenu company
   And user navigated to logo information page
   And user select owner company from drop-down as "BioMerieux"
   And click on get details button
   And user click on choose file button for Web Company Logo image Location
   When user click on submit button for logo
   Then user can see logo upload success message