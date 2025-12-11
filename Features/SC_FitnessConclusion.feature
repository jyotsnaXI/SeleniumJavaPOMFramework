Feature: System Configuration -> Company -> Fitness Conclusion

  Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@SC_AddFitnessConclusion
 Scenario Outline: Successfully add Fitness Conclusion
   Given user is on Search Employee page
   And User clicks on Fitness Conclusion under submenu company
   And user navigated to Company Fitness Conclusion Master page
   And user click on add button for add fitness conclusion
   And user select owner company from dropdown as "Frontex" for fitness conclusion
   And user select user role from dropdown as "Partner" for fitness conclusion
   And user select Fitness Conclusion Name from dropdown as "fit" for fitness conclusion
   When user click on submit button for fitness conclusion
   Then user can see fitness conclusion success message
   
  #@SC_SearchFitnessConclusion
  @RegressionTest
 Scenario Outline: Successfully search Fitness Conclusion
   Given user is on Search Employee page
   And User clicks on Fitness Conclusion under submenu company
   And user navigated to Company Fitness Conclusion Master page
   And user select owner company from dropdown as "Air Liquide" for fitness conclusion search
   And user select user role from dropdown as "Partner" for fitness conclusion search
   When user click on search button for fitness conclusion
   Then user can see search records for fitness conclusion
   
  @SC_EditFitnessConclusion
 Scenario Outline: Successfully edit Fitness Conclusion
   Given user is on Search Employee page
   And User clicks on Fitness Conclusion under submenu company
   And user navigated to Company Fitness Conclusion Master page
   And user select owner company from dropdown as "Air Liquide" for fitness conclusion search
   And user select user role from dropdown as "Partner" for fitness conclusion search
   And user click on search button for fitness conclusion
   And user can see search result with edit button
   And user click on edit button for fitness conclusion
   And user modify user role from dropdown as "Partner" 
   And user modify Fitness Conclusion Name from dropdown as "Unfit"    
   When user click on submit button for modify fitness conclusion
   Then user can see modify success message fitness conclusion 
   
   
   
   
   
