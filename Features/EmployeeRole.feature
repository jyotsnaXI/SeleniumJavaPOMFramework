Feature: Employee login and doing multiple operation

 Background: 
 Given user launch chrome browser
 And user enter url from config
 And user enters email and password from config
 And user enter code for verification
 And user click on login button
 
 @CreateNewExamEmployeeRole
 Scenario Outline: User download Print Questionnaire document
 Given user is on Employee Dashboard page
 And User clicks on dashboard menu Create New Exam for employee
 And user navigated to Create New Exam page for employee
 And user select Reason For Medical for employee as "<ReasonForMedical>"
 And user select Medical Center for employee as "<MedicalCenter>"
 And user enter Date of Exam for employee as "<DateOfExam>"
 And user select radio button for Disclosure Option
 When user click on submit button for exam creation
 Then user should see success message for exam creation
 
 Examples: 
|ReasonForMedical |MedicalCenter |DateOfExam |
|Periodical       |AMBIMED       |10-Apr-2023|
#|Pre Employment  |CBSA Lyon     |10-Apr-2023|

 @MedicalExamInfoSave
 Scenario Outline: User save medical exam information page
 Given user is on Employee Dashboard page
 And User clicks on dashboard menu Medical Exam Info link
 And user navigated to Medical Exam Information page
 And user enter exam date for employee as "<ExamDate>"
 And user select Reason For Medical Exam Info as "<MedicalReason>"
 When user click on Save Medical Exam Details button
 Then user should see a success message for saving medical exam
 
Examples: 
|ExamDate |MedicalReason   |
|11-Apr-2023|Periodical    |
#|11-Apr-2023|Pre Employment|
 
 @DownloadPrintQuestionnaire
 Scenario: User download Print Questionnaire document
 Given user is on Employee Dashboard page
 And User clicks on dashboard menu Medical Exam Info link
 And user navigated to Medical Exam Information page
 When user click on Print Questionnaire button
 Then documents gets downloaded in the system
 
 @MedicalHistoryTab
 Scenario Outline: User see medical history information and submit details
 Given user is on Employee Dashboard page
 And User clicks on dashboard menu Medical Exam Info link
 And user navigated to Medical Exam Information page
 And user click on Medical History tab
 And user can see medical history details
 And user select Blood Type as "<BloodType>"
 When user click on Submit button for medical history
 Then user should see a success message for medical history
 
 Examples: 
|BloodType |
|B+        |
 
 @VaccinationTab
 Scenario Outline: User add or modify vaccination details
 Given user is on Employee Dashboard page
 And User clicks on dashboard menu Medical Exam Info link
 And user navigated to Medical Exam Information page
 And user click on Vaccinations tab
 And user can see vaccination history details
 And user select Vaccination Name as "<VaccinationName>"
 And user select Vaccination Brand Name as "<VaccinationBrand>"
 And user click on Choose File button to upload vaccine certificate
 And user select radio button for COVID19 illness
 And user select Date Administered radio button as Unknown
 When user click on Add Vaccination button
 Then user should see a success message for vaccinations
 
 Examples: 
|VaccinationName  |VaccinationBrand|
|COVID-19 2nd Shot|Covaxin         |

@CertificateOfFitness
Scenario Outline: User download Fitness Certificate document
Given user is on Employee Dashboard page
And User clicks on dashboard menu "Certificate of Fitness" link
And user navigated to Certificate of Fitness page

@DropBox_Upload
Scenario Outline: Drop Box - Successfully able to upload file
Given user is on Employee Dashboard page
And User clicks on submenu upload link under menu Drop Box
And user navigated to Drop Box – Upload a Medical Report page
And user click on choose file button to upload file
When user click on attach button to attach uploaded file
Then user should see message for upload file

@GeneralInformation_About_MedFit
Scenario Outline: General Information - About_MedFit
Given user is on Employee Dashboard page
When User clicks on submenu About MedFit link under General Information
Then user should navigated to All About MedFit page

@GeneralInformation_ACCREDITEDMEDICALCENTRES
Scenario Outline: General Information - Accredited Medical Centre
Given user is on Employee Dashboard page
When User clicks on submenu Accredited Medical Centers link under General Information
Then user should navigated to INTERNATIONAL SOS ACCREDITED MEDICAL CENTRES page
And user click on link list to see medical centres

@GeneralInformation_Confidentiality
Scenario Outline: General Information - Confidentiality
Given user is on Employee Dashboard page
When User clicks on submenu Confidentiality link under General Information
Then user should navigated to Confidentiality page

@GeneralInformation_MedFitFAQs
Scenario Outline: General Information - MedFit FAQs
Given user is on Employee Dashboard page
When User clicks on submenu FAQs link under General Information
Then user should navigated to MedFit FAQs page

@GeneralInformation_Contact_Us
Scenario Outline: General Information - Contact Us
Given user is on Employee Dashboard page
When User clicks on submenu Contact Us link under General Information
Then user should navigated to Contact Us page

@GeneralInformation_SiteMap
Scenario Outline: General Information - Site Map
Given user is on Employee Dashboard page
When User clicks on submenu Site Map link under General Information
Then user should navigated to Site Map page
