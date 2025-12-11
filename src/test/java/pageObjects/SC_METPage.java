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

public class SC_METPage extends TestBase {

	public WebDriver driver;

	public SC_METPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "(//a[contains(text(),'Company')])[1]")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[normalize-space()='MET']")
	WebElement METMenu;
	
	//Search MET
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement searchBtn;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAddMET;
	
	//Add MET
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpCompany;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlGlobalMET")
	WebElement drpGlobalMET;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtISOSMETName")
	WebElement txtISOSMETName;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtCriteriaName")
	WebElement txtCriteriaName;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtCriteriaFreq")
	WebElement txtCriteriaFreq;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvInputCriteria_ctl02_txtValue")
	WebElement txtAge;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvInputCriteria_ctl03_ddlValue")
	WebElement drpGender;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvInputCriteria_ctl06_ddlValue")
	WebElement drpGeoMarket;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//span[@id='ctl00_MedtrackContentPlaceHolder_companyMETmessages_SuccessM']")
	WebElement successMessage;
	
	@FindBy(xpath = "//*[@id=\"FailureMsg\"]")
	WebElement failureMessage;
	
	//Modify MET
	@FindBy(xpath = "//a[@id='ctl00_MedtrackContentPlaceHolder_gdvSearchMET_ctl02_lnkEdit']")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCriteriaList_ctl02_lnkEdit")
	WebElement subBtnEdit;
	

	//ADD MET
	public void clickSubMenuMET() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(METMenu).click().perform();
	}
	
	public void pageTitleMET() {
		//WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}
	
	public void addMETbtn() {
		btnAddMET.click();
	}
	
	public void selectCompany(String company) {
		Select selectCompany = new Select(drpCompany);
		selectCompany.selectByVisibleText(company);
	}
	
	public void selectGlobalMET(String MET) {
		Select selectMET = new Select(drpGlobalMET);
		selectMET.selectByVisibleText(MET);
	}	
	
	public void enterMET(String string) {
		txtISOSMETName.sendKeys(string);
	}
	
	public void addMET() {
		btnAdd.click();
	}
	
	public void enterCriteriaName(String CriteriaName) {
		txtCriteriaName.sendKeys(CriteriaName);
	}
	
	public void enterFrequencyInYear(String Frequency) {
		txtCriteriaFreq.sendKeys(Frequency);
	}
	
	public void enterAge(String age) {
		txtAge.sendKeys(age);
	}
	
	public void selectGender(String Gender) {
		Select selectGender = new Select(drpGender);
		selectGender.selectByVisibleText(Gender);
	}
	
	public void selectGeoMarket() {
		Select selectGMarket = new Select(drpGeoMarket);
		selectGMarket.selectByIndex(1);
	}
	
	public void clickSubmitBtn() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, btnSubmit);
		btnSubmit.click();
	}
	
	public void successMsg() throws InterruptedException {
		System.out.println(successMessage.getText());
	    // //span[@id='ctl00_MedtrackContentPlaceHolder_companyMETmessages_FailureM']
		// //span[@id='ctl00_MedtrackContentPlaceHolder_companyMETmessages_SuccessM']
		
	}
	
	//SC_SearchMET
	public void searchBtn() {
		searchBtn.click();
	}
	
	public void searchResult() {
		
		boolean tableExists = JavaScriptUtils.isTablePresent(driver, By.id("ctl00_MedtrackContentPlaceHolder_SearchHeader"));
		
		if (tableExists)
		{
            System.out.println("true");
        } 
		else
		{
            System.out.println("false");
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
	
	//SC_ModifyMET
	public void clickEditBtn() {
		btnEdit.click();
	}
	
	public void clickSubEditBtn() {
		subBtnEdit.click();
	}
	
	public void modifyCriteriaName(String CriteriaName) {
		txtCriteriaName.sendKeys(CriteriaName);
	}
	
	public void modifyFrequencyInYear(String Frequency) {
		txtCriteriaFreq.sendKeys(Frequency);
	}
	
	public void modifyAge(String age) {
		txtAge.sendKeys(age);
	}
	
	public void modifyGender(String Gender) {
		Select selectGender = new Select(drpGender);
		selectGender.selectByVisibleText(Gender);
	}
	
	public void modifyGeoMarket() {
		Select selectGMarket = new Select(drpGeoMarket);
		selectGMarket.selectByIndex(1);
	}

}