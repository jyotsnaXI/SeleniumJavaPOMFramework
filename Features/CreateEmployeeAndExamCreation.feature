Feature: To create new employee and Exam Creation

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

#@CreateNewEmployeeAndExamCreation
@SanityTest
		Scenario Outline: Creating New Employee Record in the system
		Given user is on Search Employee page
		And User clicks on dashboard menu Create New Employee
		And user navigate to Create New Employee Record page
		And user select Employee Status as "<EmployeeStatus>"
		And user select Title as "<Title>"
		And user enter First Name as "<FirstName>"	
		And user enter Last Name as "<LastName>"
		And user select Gender as "<Gender>"
		And user select Marital Status as "<MaritalStatus>"
		And user enter Date of Birth as "<DateOfBirth>"
		And user select Company as "<Company>"
		And user enter Primary E-Mail Address as "<PrimaryEMail>"
		And user enter Secondary E-Mail Address as "<SecondaryEMail>"
		#And user enter Complete Postal Address as ""
		#And user enter Postal Code as ""
		#And user enter Phone (Phone number needs to be added with the country code) as ""
		#And user enter City as ""
		#And user enter Fax as ""
		#And user select Country as ""
		#And user select Assign Country as ""
		And user select Employee Category as "<EmpCategory>"
		#And user select Geo Market as ""
		#And user select Area as ""
		#And user select Business Area as ""
		#And user select Job Site as ""
		#And user select Job Title as ""
		#And user enter Notes as ""
		# If employee is Pre-employee: 
		#And user enter Recruiter Last Name as "Mark"
		#And user enter Recruiter E-mail Address as "jyotsna.gupta@internationalsos.com"
		#And user click on add button to add recruiter details
		When user click on Submit button
		Then user should see success message
    And user click on link You can create a medical exam
    And user navigate to Create New Exam page
    And user click on radio button for I do authorize
   And user select Reason For Medical as "Pre Employment"
    And user enter Date of Exam as "01-Apr-2021"
    And user select Medical Center as "CIVEM"
    And user click on Submit button for create exam
    And user navigated to Medical Exam Information	page
    And user click on Physician Report tab
 		And user select all dropdown and checkboxes fields in Physician Report tab
   # And user check all checkbox in Physician Report tab
    And user click on save physician report button
    And user click on Lab Analysis tab
    And user select all dropdown and checkbox in Lab Analysis tab
    #And user check all checkbox in Lab Analysis tab
    And user click on save Lab Analysis button
    And user click on Fitness Conclusion tab
    And user select Fitness Status as "Fit"
    And user enter Physicians Comments for Employee as "Person is fit"
    And user saving physician comments
    And user select case as "Save"
   # And user select Fitness Status as Fit
   # And user enter comments "Comments from Intl. SOS"
    When user click on submit for exam creation
    Then user should see exam creation success message
    
Examples:
| EmployeeStatus  | Title | FirstName | LastName  | Gender | MaritalStatus | DateOfBirth  | Company                     | PrimaryEMail                       | SecondaryEMail          | EmpCategory | 
#| Active         | Mr    | Regression| CGG       | Female | Single        | 01-Mar-1980 | CGG International S.A.      | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate (EXPAT)   |
#| Active         | Mr    | Automation| BioMerieux| Female | Single        | 01-Mar-1980 | BioMerieux                  | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr    | Automation| ARKEMA    | Female | Single        | 01-Mar-1980 | ARKEMA                      | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr    | Automation| NOVARTIS  | Female | Single        | 01-Mar-1980 | NOVARTIS                    | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr    | Automation| SLB       | Female | Single        | 01-Mar-1980 | Schlumberger                | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr    | Automation| BP        | Male   | Single        | 01-Mar-1980 | bp International Limited    | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | HCC         |
#| Active         | Mr    | Automation| SBM       | Female | Single        | 01-Mar-1980 | SBM                         | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Offshore   |
#| Active         | Mr    | Automation| MI        | Female | Single        | 01-Mar-1980 | Michelin                    | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr    | Automation| RHT       | Female | Single        | 01-Mar-1980 | Richemont                   | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Intl. Mobile|
#| Active         | Mr    | Automation| MY        | Male   | Single        | 01-Mar-1980 | MAINBY SA                   | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | HCC         |
#| Active         | Mr    | Automation| KN        | Female | Single        | 01-Mar-1980 | Kinross                     | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr    | Automation| FNX       | Male   | Single        | 01-Mar-1980 | Frontex                     | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | A1          |
| Active         | Mr    | Automation| Eramet        | Male   | Single        | 01-Mar-1980 | Eramet                      | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | HC Mobile   |
#| Active         | Mr    | Automation| BPUSA     | Female | Single        | 01-Mar-1980 | bp USA                      | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
 | Active         | Mr    | Automation| MY        | Male   | Single        | 01-Mar-1981 | MY COMPANY                 | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate  |    