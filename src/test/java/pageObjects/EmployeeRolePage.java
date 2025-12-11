package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.JavaScriptUtils;
import utils.TestBase;
import utils.WaitUtils;

public class EmployeeRolePage extends TestBase {
	
	public WebDriver driver;

	public EmployeeRolePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(), 'Create New Exam')]")
	WebElement createNewExamLink;
	
	@FindBy(xpath = "//a[contains(text(), 'Medical Exam Info')]")
	WebElement clickMedicalExamInfoLink;
	
	@FindBy(xpath = "//div[@class='dashboardBg']/h1")
	WebElement dashboard;
	
	@FindBy(id = "calDateOfExam_txtDate")
	WebElement txtDate;
	
	@FindBy(id = "ddlReasonForTest")
	WebElement drpMedReason;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnPrintQuestionnaire")
	WebElement btnPrintQuestionnaire;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_divMedicalHistory")
	WebElement medicalHistoryTab;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBloodGroup_ctl02_ddlBGrpHistoryItemValue")
	WebElement drpBloodType;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmitTop")
	WebElement submitForMedicalHistory;
	
	@FindBy(xpath = "//div[@class='TabContainer']/div[3]")
	WebElement vaccinationTab;
	
	@FindBy(xpath = "//div[@class='MainHeading']/strong")
	WebElement vaccinationHistoryTitle;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlVaccineType")
	WebElement drpVaccinationName;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlVaccineBrand")
	WebElement drpVaccinationBrandName;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnBrowse")
	WebElement chooseFileBtn;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_rdoVulnerabilityYes")
	WebElement radioCOVID19IllnessYes;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_rdoVulnerabilityNo")
	WebElement radioCOVID19IllnessNo;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_rdoNotKnown")
	WebElement radioAdministeredUnknown;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAddVaccine")
	WebElement btnAddVaccine;
	
	@FindBy(xpath = "//div[@class='HeadingLeft']/strong")
	WebElement pageTitle;
	
	@FindBy(xpath = "//div[@class='MainHeading']/table/tbody/tr/td/strong")
	WebElement examPageTitle;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_lvEmployee_ddlReasonForTest")
	WebElement drpReasonForMedical;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_lvEmployee_ddlMedicalCenter")
	WebElement drpMedicalCenter;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_lvEmployee_calDateOfExam_txtDate")
	WebElement ApproximateExamDate;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_radDisclosure1Option1")
	WebElement doAuthorize ;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_radDisclosure1Option2")
	WebElement doNotAuthorize;
	
	@FindBy(id = "BtnSave")
	WebElement saveMedicalExamDetails;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement submitButton;
	
	@FindBy(xpath = "//div[@class='MedicalContentText']")
	WebElement examCreationSuccMsg;
	
	@FindBy(xpath = "//div[@class='MedicalContentText']")
	WebElement examSuccessMsg;
	
	@FindBy(xpath = "//a[text()= 'General Information']")
	WebElement generalInformationMenu;
	
	@FindBy(xpath = "//a[text()= 'About MedFit']")
	WebElement aboutMedFitSubMenu;
	
	@FindBy(xpath = "//a[text()= 'Accredited Medical Centers']")
	WebElement accreditedMedicalCentersSubMenu;
	
	@FindBy(xpath = "//*[@id=\"static-content-page\"]/p[1]/a/u")
	WebElement listLink;
	
	@FindBy(xpath = "//a[text()= 'Confidentiality']")
	WebElement confidentialitySubMenu;
	
	@FindBy(xpath = "//a[text()= 'FAQs']")
	WebElement fAQsSubMenu;
	
	@FindBy(xpath = "//a[text()= 'Contact Us']")
	WebElement contactUsSubMenu;
	
	@FindBy(xpath = "//a[text()= 'Site Map']")
	WebElement siteMapSubMenu;
	
	public void dashboardTitle() {
		System.out.println("User is on " + dashboard.getText());
	}
	
	public void clickMedicalExamInfoLink() {
		clickMedicalExamInfoLink.click();
	}
	
	public void createExamForEmp() {
		createNewExamLink.click();
	}
	
	public void pageTitle() {
		System.out.println("User is on " + pageTitle.getText());
	}
	
	public void examPageTitle() {
		System.out.println("User is on " + examPageTitle.getText());
	}	
	
	public void reasonForMedicalExam(String reason) {
		Select selectReasonForMedical = new Select(drpReasonForMedical);
		selectReasonForMedical.selectByVisibleText(reason);
	}
	
	public void medicalCenter(String medCenter) {
		Select selectMedicalCenter = new Select(drpMedicalCenter);
		selectMedicalCenter.selectByVisibleText(medCenter);
	}
	
	public void examDate(String date) {
		ApproximateExamDate.sendKeys(date);
	}
	
	public void disclosureOption() {
		doAuthorize.click();
	}
	
	public void clickSubmit() {
		submitButton.click();
	}
	
	public void examCreationSuccessMsg() {
		System.out.println(examCreationSuccMsg.getText());
	}
	
	public void dateOfExam(String date) {
		driver.switchTo().frame(0);
		txtDate.clear();
		txtDate.sendKeys(date);
		driver.switchTo().defaultContent();
	}
	
	public void medicalExamReason(String medReason) {
		driver.switchTo().frame(0);
		Select selectMedicalReason = new Select(drpMedReason);
		selectMedicalReason.selectByIndex(1);
		driver.switchTo().defaultContent();
	}
	
	public void saveMedicalExam() {
		driver.switchTo().frame(0);
		saveMedicalExamDetails.click();
		driver.switchTo().defaultContent();
	}
	
	public void successMsgForSavingMedicalExam() {
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//span[@id='MedicalExamMessages_SuccessM']/div")).getText());
		//System.out.println(driver.findElement(By.xpath("//span[@id='MedicalExamMessages_SuccessM']/div")));
		driver.switchTo().defaultContent();
	}
	
	public void printQuestionnaire() {
		btnPrintQuestionnaire.click();
		WaitUtils.sleep(8);
	}
	
	public void medicalHistoryTab() {
		medicalHistoryTab.click();
	}
	
	public void bloodType(String type) {
		Select selectBloodType = new Select(drpBloodType);
		selectBloodType.selectByVisibleText(type);
	}
	
	public void submitForMedicalHistory() {
		submitForMedicalHistory.click();
	}
	
	public void successMsgForMedicalHistory() {
		//System.out.println(driver.findElement(By.xpath("//span[@class='SuccessMsg']/div")).getText());
		String SuccessMsg = "The medical history changes were saved successfully.";
		String FailureMsg = "There are no changes to save in the Medical History.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}
	}
	
	public void vaccinationsTab() {
		vaccinationTab.click();
	}
	
	public void vaccinationHistoryTitle() {
		System.out.println("User is on " + vaccinationHistoryTitle.getText());
	}
	
	public void vaccinationName(String vaccination) {
		Select selectVaccination = new Select(drpVaccinationName);
		selectVaccination.selectByVisibleText(vaccination);
	}
	
	public void vaccinationBrandName(String vaccinationBrand) {
		Select selectVaccinationBrand = new Select(drpVaccinationBrandName);
		selectVaccinationBrand.selectByVisibleText(vaccinationBrand);
	}
	
	public void chooseFileBtn() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, chooseFileBtn);
		chooseFileBtn.sendKeys("C:\\Users\\Jyotsna.Gupta\\Downloads\\Logo-Smiley.png");
		System.out.println("File has been uploaded!!!");
	}
	
	public void selectAdministeredUnknown() {
		radioAdministeredUnknown.click();
	}
	
	public void radioForCovidIllness() {
		radioCOVID19IllnessNo.click();
	}
	
	public void addVaccinationBtn() {
		btnAddVaccine.click();
	}
	
	public void vaccinationAddSuccessMsg() {
		String SuccessMsg = "You have successfully added";
		String FailureMsg = "There are no";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.contains(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}
	}
	
	public void clickAboutMedFitSubMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(generalInformationMenu).perform();
		action.moveToElement(aboutMedFitSubMenu).click().perform();
	}
	
	public void aboutMedFitTitlePage() {
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'All About MedFit')]")).getText());
		driver.switchTo().defaultContent();
	}
	
	public void clickAccreditedMedicalCenterSubMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(generalInformationMenu).perform();
		action.moveToElement(accreditedMedicalCentersSubMenu).click().perform();
	}
	
	public void accreditedMedicalCenterTitlePage() {
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'INTERNATIONAL SOS ACCREDITED MEDICAL CENTRES')]")).getText());
		driver.switchTo().defaultContent();
	}
	
	public void clickList() {
		driver.switchTo().frame(0);
		listLink.click();
		WaitUtils.sleep(4);
		driver.switchTo().defaultContent();
	}
	
	public void clickConfidentialitySubMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(generalInformationMenu).perform();
		action.moveToElement(confidentialitySubMenu).click().perform();
	}
	
	public void confidentialityTitlePage() {
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Confidentiality')]")).getText());
		driver.switchTo().defaultContent();
	}
	
	public void clickFAQsSubMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(generalInformationMenu).perform();
		action.moveToElement(fAQsSubMenu).click().perform();
	}
	
	public void fAQsTitlePage() {
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'MedFit FAQs')]")).getText());
		driver.switchTo().defaultContent();
	}
	
	public void clickContactUsSubMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(generalInformationMenu).perform();
		action.moveToElement(contactUsSubMenu).click().perform();
	}
	
	public void contactUsTitlePage() {
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Contact-Us')]")).getText());
		driver.switchTo().defaultContent();
	}
	
	public void clickSiteMapSubMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(generalInformationMenu).perform();
		action.moveToElement(siteMapSubMenu).click().perform();
	}
	
	public void siteMapTitlePage() {
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Site Map')]")).getText());
		driver.switchTo().defaultContent();
	}
	
}
