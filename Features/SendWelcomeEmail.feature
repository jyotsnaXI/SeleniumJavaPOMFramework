Feature: Send E-mail to the users

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SendWelcomeEmail
  Scenario Outline: Successfully able to send Welcome Email Address
    Given user is on Search Employee page
		And User clicks on dashboard menu "Send Welcome Email" link
		And user navigated to Send Welcome E-mail Address page
		And user select company from drop-down as "BP International Limited" for Welcome Email
		And user check the checkbox for Include all employees for Welcome Email
		When user click on send email button for Welcome Email
		Then user should see email success message for Welcome Email
		
@GetDetailsWelcomeEmail
  Scenario Outline: Successfully able to send Welcome E-mail Address
    Given user is on Search Employee page
		And User clicks on dashboard menu "Send Welcome Email" link
		And user navigated to Send Welcome Email Address page
		And user select company from drop-down as "BP International Limited" for Welcome Email
		And user check the checkbox for Include all employees for Welcome Email
		And user click on get details button for Welcome Email
		And user can see Total number of employees label with view details link for Welcome Email
		When user click on view details link for Welcome Email
		Then user navigated to new window
		And user should see employee details table with records for Welcome Email for Welcome Email
		And user click on close button for Welcome Email
		
@SendMarketingEmail
  Scenario Outline: Successfully able to send Welcome Email Address
    Given user is on Search Employee page
		And User clicks on dashboard menu "Send Welcome Email" link
		And user navigated to Send Welcome E-mail Address page
		And user select company from drop-down as "Schlumberger" for Marketing Email
		And user check the checkbox for Include all companies for Marketing Email
		When user click on send email button for Marketing Email
		Then user should see email success message for Marketing Email
		
@GetDetailsMarketingEmail
  Scenario Outline: Successfully able to send Welcome E-mail Address
    Given user is on Search Employee page
		And User clicks on dashboard menu "Send Welcome Email" link
		And user navigated to Send Welcome Email Address page
		And user select company from drop-down as "Schlumberger" for Marketing Email
		And user check the checkbox for Include all companies for Marketing Email
		And user click on get details button for Marketing Email
		And user can see Total number of employees label with view details link for Marketing Email
		When user click on view details link for Marketing Email
		Then user navigated to new window
		And user should see employee details table with records for Marketing Email
		And user click on close button for Marketing Email
		
		