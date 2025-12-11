Feature: Provide feature for unlock user

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@UnlockUser
  Scenario Outline: Successfully unlock an user
    Given user is on Search Employee page
		And User clicks on unlock user link under menu Maintenance
		And user navigate to Application Maintenance page
		And user enter user in text field as "ClntRevAirLiqud"
		When user click on unlock button for unlock user
		Then user should see success message for unlock user