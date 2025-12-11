Feature: System Configuration -> Encryption Utility

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_EncryptStrToNormalStr
 Scenario Outline: Successfully decryption string
   Given user is on Search Employee page
   And User clicks on encryption utility under system configuration
   And user navigated to EncryptionDecryption Utility page
   And user enter Encrypted String in text field as "oEtoaxGK9ns=" for code
   When user click on Decryption button
   Then user should see String to be encrypted
   
  @SC_NormalStrToEncrypt
  Scenario Outline: Successfully encryption string
   Given user is on Search Employee page
   And User clicks on encryption utility under system configuration
   And user navigated to EncryptionDecryption Utility page
   And user enter normal string to be encrypted in text field as "test" for code
   When user click on encryption button
   Then user should see Encrypted String