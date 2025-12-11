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

public class SC_MedicalHistoryPage extends TestBase {

	public WebDriver driver;

	public SC_MedicalHistoryPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "(//a[contains(text(),'Company')])[1]")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[@href='../Company/CompanyMedicalHistory.aspx']")
	WebElement medicalHistoryMenu;
	
	//Add Medical History
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpCompany;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnGetDetails")
	WebElement btnGetDetails;
	
	@FindBy(xpath = "//div[contains(text(),'Medical History Health Check Item')]")
	WebElement medHistorySection;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyMedicalHistory_ctl08_chkSelect")
	WebElement checkbox;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyMedicalHistory_ctl08_txtSequence")
	WebElement txtSequence;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtMedicalHistoryNote")
	WebElement txtMedicalHistoryNote;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@class='SuccessBg']")
	WebElement successMsg;
	
	public void clickSubMenuMedicalHistory() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(medicalHistoryMenu).click().perform();
	}
	
	public void pageTitleMedicalHistory() {
		//WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}
	
	public void selectOwnCompany(String company) {
		Select selectCompany = new Select(drpCompany);
		selectCompany.selectByVisibleText(company);
	}
	
	public void clickGetDetails() {
		btnGetDetails.click();
	}
	
	public void medHistorySection() {
		System.out.println("Medical History Health Check Item Section found!");
	}
	
	public void enterMedicalHistory(String history) {
		txtMedicalHistoryNote.sendKeys(history);
	}	
	
	public void selectCheckbox(String string) {
		checkbox.click();
	}
	
	public void enterSequence(String MedicalHistoryName, String sequence) {
		txtSequence.sendKeys(sequence);
		/*
		 * List<WebElement> dr =
		 * driver.findElements(By.xpath("//table[@class='FormText']/tbody/tr")); int
		 * size = dr.size();
		 * 
		 * for (int i = 2; i <= size; i++) { String results =
		 * driver.findElement(By.xpath("//table[@class='FormText']/tbody/tr["+i+
		 * "]/td[2]")).getText();
		 * 
		 * if(MedicalHistoryName.equalsIgnoreCase(results)) {
		 * driver.findElement(By.xpath(
		 * "//table[@class='FormText']/tbody/tr[\"+i+\"]/td[3]")).sendKeys(sequence);
		 * 
		 * break; }
		 * 
		 * }
		 */
	}
	
	public void clickSubmitBtn() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, btnSubmit);
		btnSubmit.click();
	}
	
	public void successMsg() throws InterruptedException {
		System.out.println(successMsg.getText());
		
		String SuccessMsg = "Modification have been changed successfully";
		String FailureMsg = "The sequence number for Any Blood Disease is mandatory and cannot be blank.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();
		
		if(AlertsMsg.equalsIgnoreCase(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		}
		else if(AlertsMsg.contains(FailureMsg))
		{
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}
		
	}
	
}