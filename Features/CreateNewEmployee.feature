Feature: To create new employee

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@CreateNewEmployee
Scenario Outline: Creating New Employee Record in the system
Given user is on Search Employee page
And User clicks on dashboard menu Create New Employee
And user navigate to Create New Employee Record page
And user select Employee Status as "<EmployeeStatus>"
And user select Title as "<Title>"
And user enter First Name as "<FirstName>"	
And user enter Last Name as "<LastName>"
#And user enter Last Name
#And user enter First Name
And user select Gender as "<Gender>"
#And user select Nationality as "Azeri"
And user select Marital Status as "<MaritalStatus>"
And user enter Date of Birth as "<DateOfBirth>"
And user select Company as "<Company>"
# SBM International Personnel Services SA, Schlumberger, SBM 2021, Michelin, Kinross
#And user enter Application/GIN ID as "000114"
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

Examples:
| EmployeeStatus | Title| FirstName | LastName  | Gender | MaritalStatus | DateOfBirth | Company                     | PrimaryEMail                       | SecondaryEMail          | EmpCategory          | 
#| Active         | Mr   | Regression|Geoservices| Female | Single        | 01-Mar-1980 | Geoservices                 | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate (EXPAT)   |
#| Active         | Mr   | Regression| ONESTIM   | Female | Single        | 01-Mar-1980 | ONESTIM                     | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate (EXPAT)   |
#| Active         | Mr   | Archival  | OP        | Male   | Single        | 01-Mar-1980 | OS PERFORMANCE	            | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate (EXPAT)   |
#| Active         | Mr   | Regression| MISWACO   | Female | Single        | 01-Mar-1980 | MI SWACO                    | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate (EXPAT)   |
#| Active         | Mr   | Regression| CGG       | Female | Single        | 01-Mar-1980 | CGG International S.A.      | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate (EXPAT)   |
#| Active         | Mr   | AutomationOne| BioMerieux| Female | Single        | 01-Mar-1980 | BioMerieux                  | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile            |
#| Active         | Mr   | Automation| ARKEMA    | Female | Single        | 01-Mar-1980 | ARKEMA                      | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile            |
#| Active         | Mr   | Automation| NOVARTIS  | Female | Single        | 01-Mar-1980 | NOVARTIS                    | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr   | Automation| SLBOne       | Female | Single        | 01-Mar-1980 | Schlumberger                | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr   | Automation| BP        | Male   | Single        | 01-Mar-1980 | bp International Limited    | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | HCC         |
#| Active         | Mr   | Automation| SBMOne      | Female | Single        | 01-Mar-1980 | SBM                         | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Offshore    |
#| Active         | Mr   | Automation | MI        | Female | Single        | 01-Mar-1980 | Michelin                    | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr   | Automation| RHT       | Female | Single        | 01-Mar-1980 | Richemont                   | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Intl. Mobile|
#| Active         | Mr   | Automation| MY        | Male   | Single        | 01-Mar-1980 | MAINBY SA                   | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | HCC         |
#| Active         | Mr   | Automation| KinrossOne| Female | Single        | 01-Mar-1980 | Kinross                     | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr   | Automation| FNX       | Male   | Single        | 01-Mar-1980 | Frontex                     | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | A1          |
| Active         | Mr   | Automation| ETOne        | Male   | Single        | 01-Mar-1980 | Eramet                      | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | HC Mobile   |
#| Active         | Mr   | Automation| BPUSA     | Female | Single        | 01-Mar-1980 | bp USA                      | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | GeoMobile   |
#| Active         | Mr   | Automation| MyCompOne  | Male   | Single        | 01-Mar-1980 | MY COMPANY                  | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate  |
#| Active         | Mr   | Automation| ErametOne| Male   | Single        | 01-Mar-1980 | ERAMET Dup                  | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate  |
#| Pre-employee   | Mr   | Automation| ErametDupTwo  | Female | Single        | 01-Mar-1970 | ERAMET Dup                  | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate  |    
#| Active         | Mr   | Automation| ErametDupThree| Male   | Single        | 01-Mar-1960 | ERAMET Dup                  | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate  |    
#| Pre-employee   | Mr   | Automation| ErametDupFour | Male   | Single        | 01-Mar-1990 | ERAMET Dup                  | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate  |    
#| Active         | Mr   | Automation| ErametDupFive | Female | Single        | 01-Mar-1986 | ERAMET Dup                  | jyotsna.gupta@internationalsos.com | jyotsna.gupta@xebia.com | Expatriate  |