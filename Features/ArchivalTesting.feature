Feature: Search Employee

  Background: 
    Given user launch chrome browser
   # And user click on advance button
   # And user click on procees to link
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page
    
@ArchiveTesting
	Scenario: Reading archival employee details from excel files
    Given user navigate to Search Employee page
	  And user enter firstname, lastname and gin from excel
   # And user click on search button
   # Then user can see search record
   
   @RepeatGINForEmployee
	Scenario: Reading archival employee details from excel files
    Given user is on Search Employee page
	  And user enter firstname, lastname and gin from excel
    And user click on search button for archival testing
    Then user can see search record for archival testing
    And user click on Gin number column header for sorting
    
    @RepeatGINForTeamMember
	Scenario: Reading archival employee details from excel files
	  Given user is on Search Employee page
	  And User clicks on dashboard menu Search Team Member
    And user navigate to Search Team Members page
	  And user enter firstname, lastname and username from excel
    And user click on search button for archival testing
    Then user can see search record for archival testing
    And user click on Gin number column header for sorting
    