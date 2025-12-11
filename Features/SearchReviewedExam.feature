Feature: Search Reviewed Exams

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page
    
 @SearchReviewedExamsByUserRole_Search
  Scenario Outline: Successfully able to search reviewed exams
    Given user is on Search Employee page
		And User clicks on dashboard menu "Search Reviewed Exams" link
		And user navigated to Search Reviewed Exams page
		And user select user role as "Local Doctor"
		And user select user id as "Liliana"
		And user select from date as "01-Mar-2022"
		And user select to date as "07-Jul-2022"
		When user click on search button
	  Then user can see search result for review exam

@SearchReviewedExamsByUserRole_Export
  Scenario Outline: Successfully able to search reviewed exams
    Given user is on Search Employee page
		And User clicks on dashboard menu "Search Reviewed Exams" link
		And user navigated to Search Reviewed Exams page
		And user select user role as "Local Doctor"
		And user select user id as "Liliana"
		And user select from date as "01-Mar-2022"
		And user select to date as "07-Jul-2022"
		When user click on search button
	  Then user can see search result for review exam
		And user click on export button
		
@SearchReviewedExamsByUserRole_ViewExam
  Scenario Outline: Successfully able to search reviewed exams
    Given user is on Search Employee page
		And User clicks on dashboard menu "Search Reviewed Exams" link
		And user navigated to Search Reviewed Exams page
		And user select user role as "ISOS Reviewer"
		And user select user id as "ISOSRviewer"
		And user select from date as "01-Mar-2022"
		And user select to date as "07-Jul-2022"
		And user click on search button
		And user can see search result for review exam
		And user select radio button from search result
		And user click on View Exam button
		And user navigate to Medical Exam Information page
    And user click again on Physicians Report tab
    And user edit Eyes and pupils as "Not Performed"
    And user edit Ear/nose/throat as "Not Performed"
    And user edit Teeth and mouth as "Not Performed"
    And user edit Lungs and chest as "Not Performed"
    And user edit Cardiovascular as "Not Performed"
    And user edit Abdo. Viscera as "Not Performed"
    And user edit Hernial orifices as "Not Performed"
    And user edit Anus and rectum as "Not Performed"
    And user edit Genito urinary as "Not Performed"
    And user edit Extremities as "Not Performed"
    And user edit Musculo skeletal as "Not Performed"
    And user edit Skin/varicose veins as "Not Performed"
    And user edit Neurological/mental fitness as "Not Performed"
    And user edit Breast as "Not Performed"
    And user edit Endocrinology as "Not Performed"
    And user edit Lymph nodes as "Not Performed"
    And user modify checkbox for Height
    And user modify checkbox for Weight
    And user modify checkbox for Blood Pressure SYS
    And user modify checkbox for Blood Pressure DIA
    And user modify checkbox for Pulse    
    And user edit Hearing Right as "Not Performed"
    And user edit Hearing Left as "Not Performed"
    And user edit Distant Vision Right as "Not Performed"
    And user edit Distant Vision Left as "Not Performed"
    And user edit Near Vision Right as "Not Performed"
    And user edit Near Vision Left as "Not Performed"
    And user edit Tested With Glasses as "Not Performed"
    And user edit Color Vision as "Not Performed"
    And user edit Audiogram as "Not Performed"
    And user click save physician report button
    And user click again on Lab Analysis tab
    And user edit ECG as "Not Performed" for Para Clinical Examination
    And user edit Chest X Ray as "Not Performed" for Para Clinical Examination
    And user check all checkbox for Blood Analysis
    And user edit Albumin as "Not Performed"
    And user edit Sugar as "Not Performed"
    And user edit Blood as "Not Performed"
    And user edit Parasites as "Not Performed"
    And user edit Blood as "Not Performed" for stool
    And user click save Lab Analysis button
    And user click again on Fitness Conclusion tab
    And user edit Fitness Status as "Fit but must be reassessed"
    And user edit Physician’s Comments for Employee as "Person is fit"
    When user click again on Submit button
    Then user should see again success message 