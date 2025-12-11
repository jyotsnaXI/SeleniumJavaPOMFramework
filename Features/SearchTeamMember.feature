Feature: Search Team Member

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

#@SearchTeamMember
@RegressionTest
Scenario Outline: Search Team Member in the system
Given user is on Search Employee page
And User clicks on dashboard menu Search Team Member
And user navigate to Search Team Member page
#And user select user role as "<UserRole>"
#And user select account status as "<AccountStatus>"
#And user enter Last Name as "<LastName>"
And user enter First Name as "<firstName>"
When user click on search button
Then user can see search result in a table

Examples:
|UserRole  |AccountStatus | LastName  | firstName  |
|Recruiter |Mr            | Regression| test       |
