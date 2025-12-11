Feature: To create Team Member

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@CreateTeamMember
Scenario Outline: Creating New Team Member in the system
Given user is on Search Employee page
And User clicks on dashboard menu Create Team Member
And user navigate to Create Team Member page
And user select User Role as "<UserRole>"
And user select Title as "<Title>"
And user enter Last Name as "<LastName>"
And user enter First Name as "<FirstName>"
And user enter Date of Birth as "<DateOfBirth>"
And user select Gender as "<Gender>"
And user enter Primary E-Mail Address as "<PrimaryEMail>"
And user enter Secondary E-Mail Address as "<SecondaryEMail>"
And user select User Name as "<Username>"
And user select AD Account as "<ADaccount>"
When user select Owner Company as "<OwnerCompany>"
Then user should see Assignment Country box
And user should select checkbox to select country for "<UserRole>"
And user should click on Submit button
And user should see success message for team member

Examples:
|UserRole  |Title |FirstName |LastName |DateOfBirth |Gender |PrimaryEMail                       |SecondaryEMail          |Username         |ADaccount|OwnerCompany|
#|Recruiter |Mr    |Automation|DemoTwo  |01-Mar-1980 |Male   |jyotsna.gupta@internationalsos.com |jyotsna.gupta@xebia.com |AutoRecMainby    |No       |MAINBY SA   |
|Recruiter |Mr    |Recruiter|SLB  |01-Mar-1980 |Male   |jyotsna.gupta@internationalsos.com |jyotsna.gupta@xebia.com |AutoRecSLB       |No       |Schlumberger|
	
@ModifyTeamMember
Scenario Outline: Creating New Team Member in the system
Given user is on Search Employee page
And User clicks on dashboard menu Search Team Member
And user navigate to Search Team Member page
And user enter First Name as "Automation"
And user enter Last Name as "Demo"
And user click on search button
And user can see search result in a table
And user click on first name link
And user navigate to Team Member Details page
And user click on edit information link
And user select Title as "<Title>"
And user enter Last Name as "<LastName>"
And user enter First Name as "<FirstName>"
And user enter Date of Birth as "<DateOfBirth>"
And user select Gender as "<Gender>"
And user enter Primary E-Mail Address as "<PrimaryEMail>"
And user enter Secondary E-Mail Address as "<SecondaryEMail>"
And user select AD Account as "<ADaccount>"
And user select Subsidiary Company checkbox
When user click on Submit button for modify details
Then user should see success message for team member

Examples:
|Title |FirstName |LastName |DateOfBirth |Gender |PrimaryEMail                       |SecondaryEMail          |ADaccount|
|Mr    |Automation|DemoOne  |01-Mar-1980 |Female |jyotsna.gupta@internationalsos.com |jyotsna.gupta@xebia.com |No       |


@DisableAccount
Scenario Outline: Creating New Team Member in the system
Given user is on Search Employee page
And User clicks on dashboard menu "Search Team Members" link
And user navigate to Search Team Member page
And user enter First Name as "Abbbb"
And user click on search button
And user can see search result in a table
And user click on first name link
And user navigate to Team Member Details page
When user click on disable account button
Then user should see a message

@UnlockUser_TemMember
Scenario Outline: Creating New Team Member in the system
Given user is on Search Employee page
And User clicks on dashboard menu "Search Team Members" link
And user navigate to Search Team Member page
And user enter First Name as "Abbbb"
And user click on search button
And user can see search result in a table
And user click on first name link
And user navigate to Team Member Details page
When user click on unlock user button
Then user should see a message

@UnlockResetPassword
Scenario Outline: Creating New Team Member in the system
Given user is on Search Employee page
And User clicks on dashboard menu "Search Team Members" link
And user navigate to Search Team Member page
And user enter First Name as "Abbbb"
And user click on search button
And user can see search result in a table
And user click on first name link
And user navigate to Team Member Details page
When user click on UnlockResetPassword button
Then user should see a message

