package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.JavaScriptUtils;
import utils.WaitUtils;

public class ModifyEmployeePage {

		public WebDriver driver;

		public ModifyEmployeePage(WebDriver driver) {
			this.driver = driver;
			// WaitUtils.waitForPageLoad(driver);
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id = "divMainHeading")
		WebElement pageTitle;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlType")
		WebElement drpEmployeeStatus;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlTitle")
		WebElement drpTitle;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlSex")
		WebElement drpGender;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlMaritalStatus")
		WebElement drpMaritalSatatus;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
		WebElement drpCompany;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtLastName")
		WebElement lastName;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtFirstName")
		WebElement firstName;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_calDateOfBirth_txtDate")
		WebElement dateOfBirth;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtGINNumber")
		WebElement txtGINNumber;
		
		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtApplicantID")
		WebElement txtApplicantID;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtPrimaryEmail")
		WebElement primaryEMail;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtSecondaryEmail")
		WebElement secondaryEMail;
		
		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCategory")
		WebElement empCategory;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvUserDetails_ctl03_txtUserLastName")
		WebElement recLastName;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvUserDetails_ctl03_txtUserRecruiterEmail")
		WebElement recEMail;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvUserDetails_ctl03_btnAdd")
		WebElement recAddButton;

		@FindBy(xpath = "//body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")
		WebElement empCreationSuccMsg;

		@FindBy(xpath = "//*[@id=\"ctl00_MedtrackContentPlaceHolder_CreateUserMessages_SuccessM\"]/div")
		WebElement employeeCreatedSuccessMsg;

		// Mandatory fields for Michelin
		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCountry")
		WebElement drpCountry;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_calDateofdeployment_txtDate")
		WebElement txtDateOfDeployment;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlAssignmentCountry")
		WebElement drpAssignCountry;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlGeoMarket")
		WebElement drpGeoMarket;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlBusinessArea")
		WebElement drpBuisnessArea;
		
		@FindBy(id = "ddl34")
		WebElement drpSituation;
		
		@FindBy(id = "ddl38")
		WebElement drpEmployeeAccompanied;
		
		@FindBy(id = "ddl39")
		WebElement drpOGUKRequired;
		
		@FindBy(id = "ddl40")
		WebElement drpTBScreeningRequired;
		
		@FindBy(id = "ddl41")
		WebElement drpTrainingHubRequired;
		
		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtTown")
		WebElement txtCity;
		
		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtPostalCode")
		WebElement txtPostalCode;

		@FindBy(xpath = "//input[@id='ctl00_MedtrackContentPlaceHolder_btnSubmit']")
		WebElement SubmitButton;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnCancel")
		WebElement cancelButton;

		public void modifyEmpStatus(String status) throws InterruptedException {
	
			Select dropEmpStatus = new Select(drpEmployeeStatus);
			dropEmpStatus.selectByIndex(0);
			dropEmpStatus.selectByVisibleText(status);
			if (status.equalsIgnoreCase("Pre-employee")) {
				modRecLastName("mark");
				modRecMail("gpt.jyotsna@gmail.com");
				clickRecAddButton();
				//setApplicationID("9003139");
			} 
		}

		public void modifyTitle(String title) {
			Select dropEmpTitle = new Select(drpTitle);
			dropEmpTitle.selectByIndex(0);
			dropEmpTitle.selectByVisibleText(title);
		}

		public void modifyLastName(String lastname) {
			// String lastname = ActionUtils.generateRandomString();
			lastName.clear();
			lastName.sendKeys(lastname);
		}

		public void modifyFirstname(String firstname) {
			firstName.clear();
			firstName.sendKeys(firstname);
		}

		public void modifyDOB(String DOB) {
			dateOfBirth.clear();
			dateOfBirth.sendKeys(DOB);
		}

		public void setCompany(String company) throws InterruptedException {
			Select DropCompany = new Select(drpCompany);
			DropCompany.selectByVisibleText(company);

			if (company.equalsIgnoreCase("Michelin")) {
				setCountry("Benin");
				dateOfDeployment("19-Jul-2022");
				setAssignCountry("Angola");
				setGeoMarket("LSS");
				setBusinessArea("508 MICHELIN INDIA PRIVATE LTD");
			}
			if (company.equalsIgnoreCase("MAINBY SA")) {
				setPostalCode();
				setSituation("Normal");
			}
			if (company.equalsIgnoreCase("bp International Limited") || company.equalsIgnoreCase("bp USA") ) {
				setPostalCode();
				setCity();
				WaitUtils.sleep(5);
				setGeoMarket("Highest");
				setAdditionalInfo();
			}
		}

		public void modifyGender(String gender) {
			Select selectGender = new Select(drpGender);
			selectGender.selectByVisibleText(gender);
		}
		
		public void modifyPrimaryMail(String pEmail) {
			primaryEMail.clear();
			primaryEMail.sendKeys(pEmail);
		}

		public void modifySecondaryMail(String sEcmail) {
			secondaryEMail.clear();
			secondaryEMail.sendKeys(sEcmail);
		}
		
		public void modifyEmpCategory(String eCategory) throws InterruptedException {
			WaitUtils.sleep(3);
			JavaScriptUtils.moveToElement(driver, empCategory);
			Select selectEmpCategory = new Select(empCategory);
			selectEmpCategory.selectByVisibleText(eCategory);
		}
		
		public void setPostalCode() {
			txtPostalCode.clear();
			txtPostalCode.click();
		}
		
		public void setCity() {
			txtCity.clear();
			txtCity.click();
		}
		
		public void modRecLastName(String RecLastName) throws InterruptedException {
			JavaScriptUtils.moveToElement(driver, recLastName);
			recLastName.sendKeys(RecLastName);
		}

		public void modRecMail(String recMail) {
			recEMail.sendKeys(recMail);
		}

		public void clickRecAddButton() {
			recAddButton.click();
			WaitUtils.waitForLoaderToDisappear(driver);
		}

		/*
		 * public void setCompPostAddress() {} public void setPostalCode() {} public
		 * void setPhone() {} public void setCity() {} public void setFax() {} public
		 * void setCountry() {} public void setRelation() {} public void
		 * setEmpCategory() {} public void setArea() {} public void setJobSite() {}
		 * public void setJobTitle() {} public void setNotes() {}
		 */

		public void setCountry(String CountryMI) {
			Select countryMI = new Select(drpCountry);
			countryMI.selectByVisibleText(CountryMI);
		}

		public void dateOfDeployment(String date) {
			txtDateOfDeployment.sendKeys(date);
		}

		public void setAssignCountry(String AssignCountry) {
			Select assignCountry = new Select(drpAssignCountry);
			assignCountry.selectByVisibleText(AssignCountry);
		}

		public void setGeoMarket(String marketGEO) throws InterruptedException {
			JavaScriptUtils.moveToElement(driver, drpGeoMarket);
			WaitUtils.sleep(5);
			Select geoMarket = new Select(drpGeoMarket);
			geoMarket.selectByVisibleText(marketGEO);
		}
		
		

		public void setBusinessArea(String buisnessarea) {
			Select buisnessArea = new Select(drpBuisnessArea);
			buisnessArea.selectByVisibleText(buisnessarea);
		}
		
		public void setSituation(String situation) throws InterruptedException {
			WaitUtils.sleep(3);
			JavaScriptUtils.moveToElement(driver, drpGeoMarket);
			Select selectSituation = new Select(drpSituation);
			selectSituation.selectByVisibleText(situation);
		}

		public void setAdditionalInfo() throws InterruptedException {
			WaitUtils.sleep(3);
			JavaScriptUtils.moveToElement(driver, drpGeoMarket);
			Select selectNoseThroat = new Select(drpEmployeeAccompanied);
			selectNoseThroat.selectByVisibleText("No");

			Select selectTeethAndMouth = new Select(drpOGUKRequired);
			selectTeethAndMouth.selectByVisibleText("Yes");

			Select selectLungsAndChest = new Select(drpTBScreeningRequired);
			selectLungsAndChest.selectByVisibleText("Yes");

			Select selectCardiovascular = new Select(drpTrainingHubRequired);
			selectCardiovascular.selectByVisibleText("No");
			
		}

		public void clickSubmit() throws InterruptedException {
			WaitUtils.waitForPageLoad(driver);
			JavaScriptUtils.moveToElement(driver, SubmitButton);
			
			//WaitUtils.sleep(5);
			SubmitButton.click();
		}

		public void employeeCreatedSuccessMsg() throws InterruptedException {
			WaitUtils.sleep(5);
			JavaScriptUtils.moveToElement(driver, pageTitle);
			String SuccessMsg = "has been successfully created in the system";
			String FailureMsg = "This employee already exists in the system.";
			String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

			if (AlertsMsg.contains(SuccessMsg)) {
				System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
			} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
				System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
			}
		}

		public void clickCancel() {
			cancelButton.click();
		}

	}
