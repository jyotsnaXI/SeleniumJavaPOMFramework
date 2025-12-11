Feature: System Configuration -> Exam -> Fitness Conclusion

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_Exam_AddFitnessConclusion
 Scenario Outline: Successfully add Fitness Conclusion
   Given user is on Search Employee page
   And User clicks on Fitness Conclusion under exam under submenu system configuration
   And user navigated to Fitness Conclusion Master page
   And user click on Add button for Fitness Conclusion
   And user navigated to Fitness Conclusion Master page
   And user enter Fitness Conclusion Name in text field as "TestOne"
   And user select checkbox for "Fit" for Fitness Conclusion
   When user click on submit button for Fitness Conclusion
   Then user should see success message for Fitness Conclusion
   
 #@SC_Exam_SearchFitnessConclusion
 @RegressionTest
 Scenario Outline: Successfully search Fitness Conclusion
   Given user is on Search Employee page
   And User clicks on Fitness Conclusion under exam under submenu system configuration
   And user navigated to Fitness Conclusion Master page
   And user enter Fitness Conclusion name in text field as "testt" for search Fitness Conclusion
   When user click on search button for Fitness Conclusion
   Then user can see search result with edit button for Fitness Conclusion
   
  @SC_Exam_ModifyFitnessConclusion
  Scenario Outline: Successfully modify Fitness Conclusion
   Given user is on Search Employee page
   And User clicks on Fitness Conclusion under exam under submenu system configuration
   And user navigated to Fitness Conclusion Master page
   And user enter Fitness Conclusion name in text field as "test" for search Fitness Conclusion
   And user click on search button for Fitness Conclusion
   And user can see search result with edit button for Fitness Conclusion
   And user click on edit button for Fitness Conclusion
   And user navigated to Fitness Conclusion Master page
   And user select checkbox for "Fit" for Fitness Conclusion
   When user click on submit button for update Fitness Conclusion
   Then user should see modify success message for Fitness Conclusion