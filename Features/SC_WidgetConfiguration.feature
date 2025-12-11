Feature: System Configuration -> Company --> Dashboard -> Widget Configuration

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddWidgetConfiguration
 Scenario Outline: Successfully add Widget Configuration
   Given user is on Search Employee page
   And User clicks on Widget Configuration under dashboard under submenu company
   And user navigated to Widget Configuration page
   And user click on add button for Widget Configuration
   And user select Owner Company from dropdown as "BioMerieux" for Widget Configuration
   And user select Widget Type from dropdown as "Health-Check item" for Widget Configuration
   And user select Widget Category from dropdown as "Standard" for Widget Configuration
   And user select Health Check Item Name from dropdown as "BMI" for Widget Configuration
   And user enter Sequence Number in text area as "25"
   And user select Gender from dropdown as "Male" for Widget Configuration
   And user select User Preference from dropdown as "Employee" for Widget Configuration
   And user enter Min Value in text area as "100"
   And user enter Max Value in text area as "150"
   And user enter Points in text area as "2"
   And user select Smiley from dropdown for Widget Configuration
   And user click on add button for smiley
   When user click on submit button for Widget Configuration
   Then user can see success message for Widget Configuration