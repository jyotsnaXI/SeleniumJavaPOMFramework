Feature: System Configuration -> Exam -> Medical Center

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddMedicalCenter
 Scenario Outline: Successfully add Medical Center
   Given user is on Search Employee page
   And User clicks on Medical Center under exam under submenu system configuration
   And user navigated to Medical Center Master page
   And user click on Add button for Medical Center
   And user navigated to Medical Center Master page
   And user enter Medical Center Name in text field as "TestTwo"
   And user enter Contact Last Name in text field as "TestOne"
   And user enter Contact First Name in text field as "Test"
   And user enter Complete Postal Address in text field as "test"
   And user enter City in text field as "Abani"
   And user enter Country in text field as "Algeria"
   And user enter Postal Code in text field as "42011"
   And user enter Phone in text field as "+213"
   And user enter E-mail Address in text field as "jyotsna.gupta@internationalsos.com"
   When user click on submit button for Medical Center
   Then user should see success message for Medical Center
   
 #@SC_SearchMedicalCenter
 @RegressionTest
 Scenario Outline: Successfully search Medical Center
   Given user is on Search Employee page
   And User clicks on Medical Center under exam under submenu system configuration
   And user navigated to Medical Center Master page
   And user enter Medical Center name in text field as "Teste" for search Medical Center
   When user click on search button for Medical Center
   Then user can see search result with edit button for Medical Center
   
  @SC_ModifyMedicalCenter
  Scenario Outline: Successfully modify Medical Center
   Given user is on Search Employee page
   And User clicks on Medical Center under exam under submenu system configuration
   And user navigated to Medical Center Master page
   And user enter Medical Center name in text field as "Teste" for search Medical Center
   And user click on search button for Medical Center
   And user can see search result with edit button for Medical Center
   And user click on edit button for Medical Center
   And user navigated to Medical Center Master page
   And user modify Medical Center Name in text field as "TestTwo"
   And user modify Contact Last Name in text field as "TestOne"
   And user modify Contact First Name in text field as "Test"
   And user modify Complete Postal Address in text field as "test"
   And user modify City in text field as "Abani"
   And user modify Country in text field as "Algeria"
   And user modify Postal Code in text field as "42011"
   And user modify Phone in text field as "+213"
   And user modify E-mail Address in text field as "jyotsna.gupta@internationalsos.com"
   When user click on submit button for update Medical Center
   Then user should see modify success message for Medical Center