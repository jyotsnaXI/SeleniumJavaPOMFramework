Feature: System Configuration -> Company --> Dashboard -> Notifications

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddNotification
 Scenario Outline: Successfully add Notification
   Given user is on Search Employee page
   And User clicks on Notification under dashboard under submenu company
   And user navigated to Company Notification Master page
   And user select Owner Company from dropdown as "BioMerieux" for Notification
   And user click on Get Details button
   And user select checkbox
   When user click on submit button for Notification
   Then user can see success message for Notification