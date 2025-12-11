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

public class SC_MedicalCenterPage extends TestBase {

	public WebDriver driver;

	public SC_MedicalCenterPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//a[normalize-space()='Exam']")
	WebElement examSubMenu;

	@FindBy(xpath = "//*[@id=\"ctl00_mnuMedtrackn95\"]/td/table/tbody/tr/td/a")
	WebElement medicalCenterMenu;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtMedCenName")
	WebElement txtMedCenName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtDocLastName")
	WebElement txtDocLastName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtDocFName")
	WebElement txtDocFName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtAddress")
	WebElement txtAddress;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtTown")
	WebElement txtCity;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCountry")
	WebElement drpCountry;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtpostalCode")
	WebElement txtpostalCode;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtPhoneNumber")
	WebElement txtPhoneNumber;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtEmail")
	WebElement txtEmail;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmit;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtMedicalCenterName")
	WebElement txtMedCenterNameSrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvMedicalCenterInfo_ctl02_btnEdit")
	WebElement btnEdit;

	public void clickMenuMedicalCenter() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(examSubMenu).perform();
		WaitUtils.sleep(1);
		action.moveToElement(medicalCenterMenu).click().perform();
	}

	public void pageTitleName() {
		// WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}

	public void clickAddBtn() {
		btnAdd.click();
	}

	public void enterMedicalCenterName(String medicalCenter) {
		txtMedCenName.clear();
		txtMedCenName.sendKeys(medicalCenter);
	}

	public void enterContactLastName(String conLastName) {
		txtDocLastName.clear();
		txtDocLastName.sendKeys(conLastName);
	}

	public void enterContactFirstName(String conFirstName) {
		txtDocFName.clear();
		txtDocFName.sendKeys(conFirstName);
	}

	public void enterCompletePostalAddress(String postAddress) {
		txtAddress.clear();
		txtAddress.sendKeys(postAddress);
	}

	public void enterCity(String city) {
		txtCity.clear();
		txtCity.sendKeys(city);
	}

	public void selectCountry(String country) {
		Select selectCountry = new Select(drpCountry);
		selectCountry.selectByVisibleText(country);
	}

	public void enterPostalCode(String postalCode) {
		txtpostalCode.clear();
		txtpostalCode.sendKeys(postalCode);
	}

	public void enterPhone(String phone) {
		txtPhoneNumber.clear();
		txtPhoneNumber.sendKeys(phone);
	}

	public void enterEmail(String eMail) {
		txtEmail.clear();
		txtEmail.sendKeys(eMail);
	}

	public void clickSubmitBtn() {
		btnSubmit.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();

	}

	public void successMsg() {
		String SuccessMsg = "has been successfully created in the system.";
		String FailureMsg = "The medical center name already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

	// Search
	public void enterMedicalCenterSrch(String medicalCenter) {
		txtMedCenterNameSrch.clear();
		txtMedCenterNameSrch.sendKeys(medicalCenter);
	}

	public void clickSearchBtn() {
		btnSearch.click();
	}

	public void searchResultTable() {
		
		boolean tableExists = JavaScriptUtils.isTablePresent(driver, By.id("ctl00_MedtrackContentPlaceHolder_SearchHeader"));
		
		if (tableExists)
		{
			System.out.println("Search result is true");
        } 
		else
		{
            System.out.println("Search result is false");
            try
            {
                WebElement notification = driver.findElement(By.xpath("//div[@class='ErrorBg']"));
                System.out.println("Notification message: " + notification.getText());
            }
            catch (Exception e)
            {
            	WebElement notification = driver.findElement(By.xpath("//div[@class='InformationBg']"));
                System.out.println("Notification message: " + notification.getText());
            }
        }
	}

	// Modify
	public void clickEditBtn() {
		btnEdit.click();
	}
	
	public void clickUpdateBtn() {
		btnSubmit.click();
	}

	public void modSuccessMsg() {
		String SuccessMsg = "has been successfully created in the system.";
		String FailureMsg = "The medical center name already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

}
