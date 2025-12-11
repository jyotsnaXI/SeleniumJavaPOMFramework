Feature: System Configuration -> Company -> Add Medical History

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddMedicalHistory
 Scenario Outline: Successfully add Medical History
   Given user is on Search Employee page
   And User clicks on Medical History under submenu company
   And user navigated to Medical History Master page
   And user select owner company from dropdown as "Frontex" for Medical History
   And user click on get details button for Medical History
   And user can see Medical History Health Check Item section
   And user enter medical history in text area as "Testing one"
   And user select checkbox for "Any Blood Disease"
   And user enter sequence in text area for "Any Blood Disease" as "20"
   When user click on submit button for Medical History
   Then user can see success message for Medical History 