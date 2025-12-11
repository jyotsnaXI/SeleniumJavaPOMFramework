package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ActionUtils;
import utils.JavaScriptUtils;
import utils.TestBase;
import utils.WaitUtils;

public class CreateNewEmployeePage extends TestBase {
	
	private static final String RESET = "\033[0m"; // Reset to default
	private static final String BOLD = "\033[1m"; // Bold text

	public WebDriver driver;

	public CreateNewEmployeePage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "divMainHeading")
	WebElement pageTitle;
	
	@FindBy(xpath = "//a[contains(text(), 'Create New Employee')]")
	WebElement createNewEmpLink;
	

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
	
	/*
	 * public void setFileProperty() throws IOException { String file =
	 * System.getProperty("user.dir")+
	 * "\\src\\test\\resources\\dataFiles\\CreateEmployees.xlsx"; int rows =
	 * ExcelUtils.getRowCount(file, "Sheet1"); for(int i=1;i<=rows;i++) { String
	 * EmployeeStatus = ExcelUtils.getCellData(file, "Sheet1", i, 0); String Title =
	 * ExcelUtils.getCellData(file, "Sheet1", i, 1); String FirstName =
	 * ExcelUtils.getCellData(file, "Sheet1", i, 2); String LastName =
	 * ExcelUtils.getCellData(file, "Sheet1", i, 3); String Gender =
	 * ExcelUtils.getCellData(file, "Sheet1", i, 4); String MaritalStatus =
	 * ExcelUtils.getCellData(file, "Sheet1", i, 5); String DateOfBirth =
	 * ExcelUtils.getCellData(file, "Sheet1", i, 6); String Company =
	 * ExcelUtils.getCellData(file, "Sheet1", i, 7); String PrimaryEMail =
	 * ExcelUtils.getCellData(file, "Sheet1", i, 8); String SecondaryEMail =
	 * ExcelUtils.getCellData(file, "Sheet1", i, 9); String EmpCategory =
	 * ExcelUtils.getCellData(file, "Sheet1", i, 10); }
	 * 
	 * }
	 */
	
	public void clickNewEmployeeLink() {
		createNewEmpLink.click();
	}
	
	public void setEmpStatus(String status) throws InterruptedException {
		Select dropEmpStatus = new Select(drpEmployeeStatus);
		dropEmpStatus.selectByVisibleText(status);
		if (status.equalsIgnoreCase("Pre-employee")) {
			setRecLastName("mark");
			setRecMail("gpt.jyotsna@gmail.com");
			clickRecAddButton();
			//setApplicationID("9003139");
		} else if(status.equalsIgnoreCase("Active")) {
			int randomNumber = ActionUtils.generateRandomNumber();
			setGIN(randomNumber);
		}
	}

	public void setTitle(String title) {
		Select dropEmpTitle = new Select(drpTitle);
		dropEmpTitle.selectByVisibleText(title);
	}

	public void setLastName(String lastname) {
		// String lastname = ActionUtils.generateRandomString();
		lastName.clear();
		lastName.sendKeys(lastname);
	}

	public void setFirstName(String firstname) {
		firstName.clear();
		firstName.sendKeys(firstname);
	}

	public void setGender(String gender) {
		Select DropGender = new Select(drpGender);
		DropGender.selectByVisibleText(gender);
	}

	// public void setNationality() {}

	public void setMaritalStatus(String mStatus) {
		Select dropMaritalStat = new Select(drpMaritalSatatus);
		dropMaritalStat.selectByVisibleText(mStatus);
	}

	public void setDOB(String DOB) {
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
			//WaitUtils.sleep(5);
			WaitUtils.waitForPageLoad(driver);
			setGeoMarket("Highest");
			setAdditionalInfo();
		}
	}

	public void setGIN(int randomNumber) {
		txtGINNumber.clear();
		txtGINNumber.sendKeys(String.valueOf(randomNumber));
	}
	
	public void setApplicationID(String applicationID) {
		txtApplicantID.clear();
		txtApplicantID.sendKeys(applicationID);
	}

	public void setPriEMail(String pEmail) {
		primaryEMail.clear();
		primaryEMail.sendKeys(pEmail);
	}

	public void setSeconEMail(String sEcmail) {
		secondaryEMail.clear();
		secondaryEMail.sendKeys(sEcmail);
	}
	
	public void setEmpCategory(String eCategory) throws InterruptedException {
		//WaitUtils.sleep(3);
		WaitUtils.waitForPageLoad(driver);
		JavaScriptUtils.moveToElement(driver, empCategory);
		empCategory.sendKeys(eCategory);
	}
	
	public void setPostalCode() {
		txtPostalCode.clear();
		txtPostalCode.click();
	}
	
	public void setCity() {
		txtCity.clear();
		txtCity.click();
	}
	
	public void setRecLastName(String RecLastName) throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, recLastName);
		recLastName.sendKeys(RecLastName);
	}

	public void setRecMail(String recMail) {
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
		//WaitUtils.sleep(5);
		WaitUtils.waitForPageLoad(driver);
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
		//WaitUtils.sleep(3);
		WaitUtils.waitForPageLoad(driver);
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
		//WaitUtils.sleep(5);
		WaitUtils.waitForPageLoad(driver);
		JavaScriptUtils.moveToElement(driver, pageTitle);
		String SuccessMsg = "has been successfully created in the system";
		String FailureMsg = "This employee already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(BOLD+driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText()+RESET);
		}
	}

	public void clickCancel() {
		cancelButton.click();
	}

}
