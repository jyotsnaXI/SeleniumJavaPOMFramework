Feature: Drop Box functionality for download documents, sending mails and delete records

Background: 
    Given user launch chrome browser
    And user enter url from config
    And user enters email and password from config
    And user enter code for verification
    And user click on login button
    And user navigate to Search Employee page

@DropBox_DownloadDocument
  Scenario Outline: Successfully able to send mails
    Given user is on Search Employee page
		And User clicks on submenu download link under menu Drop Box
		And user navigated to Drop Box - Download Medical Reports page
		#And user select category from dropdown as "Managed By ISOS"
		And user select category from dropdown as "Managed By ISOS"
		And user can see search result table
		And user click on document attached link for "siva.palaparthi@internationalsos.com"
		And document get downloaded successfully
	#	When user click on send email button for "jyotsna.gupta@internationalsos.com"
	#	Then user should see success message for send mail
	#	And user should click on delete button for "siva.palaparthi@internationalsos.com"
	#	And user should see success message for delete record
		
@DropBox_UploadMedicalReport
  Scenario Outline: Successfully able to upload files
    Given user is on Search Employee page
		And User clicks on submenu upload link under menu Drop Box
		And user navigated to Drop Box – Upload a Medical Report page
		#And user select category from dropdown as "Managed By ISOS"
		And user select Owner company Name from dropdown as "Air Liquide"
		And user enter GIN Number as "1607901"
		And user click on get details button
		And user click on choose file button to upload file
		When user click on attach button to attach uploaded file
		Then user should see message for upload file
		
@DropBox_DeleteUploadedDoc
  Scenario Outline: Successfully able to upload files
    Given user is on Search Employee page
		And User clicks on submenu upload link under menu Drop Box
		And user navigated to Drop Box – Upload a Medical Report page
		#And user select category from dropdown as "Managed By ISOS"
		And user select Owner company Name from dropdown as "Air Liquide"
		And user enter GIN Number as "1607901"
		And user click on get details button
		And user can see attached document table
		When user click on delete button to delete file "1_colored.png"
		Then user should see message for delete file