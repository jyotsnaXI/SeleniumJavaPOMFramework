#Author: jyotsna.gupta@xebia.com

Feature: User can reset or unlock credentials

 Background:
 	  Given user launch chrome browser
 	  And user enter url from config

  @ForgotPassword_UnlockAccount
  Scenario Outline: User successfully able to reset_unlock account
    Given user navigate to login page
    And user click on Forgot Password_Unlock Account link
    And user navigated to Forgot Password_Unlock Account page
    And user enter user name in text field as '<username>'
    And user click on go button
    And user enter first securiy answer in textfield as '<firstAnswer>'
    And user enter second securiy answer in textfield as '<secondAnswer>'
    When user click on submit button for unlock account
    Then user should see a message for reset_unlock account

    Examples: 
      | username  | firstAnswer | secondAnswer  |
      | ClntRevBP |     test    | test          |
      
   @DoNotRememberUserID
  Scenario Outline: User successfully able to reset_unlock account
    Given user navigate to login page
    And user click on Forgot Password_Unlock Account link
    And user navigated to Forgot Password_Unlock Account page
    And user click on I do not remember my user id link
    And user enter email id in textfield '<mailID>'
    When user click on submit button for unlock account
    Then user should see a message for do not remember userID
    
     Examples: 
      | mailID                           | 
      |jyotsna.gupta@internationalsos.com|
      
