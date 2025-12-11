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

public class SC_FitnessConclusionPage extends TestBase {

	public WebDriver driver;

	public SC_FitnessConclusionPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "(//a[contains(text(),'Company')])[1]")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[@href='../Company/FitnessConclusion.aspx']")
	WebElement fitnessConclusionMenu;

	// ADD Fitness Conclusion
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvFitnessConclusion_ctl03_ddlFooterCompanyName")
	WebElement drpOwnerCompany;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvFitnessConclusion_ctl03_ddlFooterUserRole")
	WebElement drpUserRole;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvFitnessConclusion_ctl03_ddlFooterFitnessConclusion")
	WebElement drpFitnessConclusion;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvFitnessConclusion_ctl03_btnSave")
	WebElement btnSubmit;

	// Search Fitness Conclusion
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompanyName")
	WebElement drpOwnerCompanySrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlUserRole")
	WebElement drpUserRoleSrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;

	// Modify Fitness Conclusion
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvFitnessConclusion_ctl02_btnEdit")
	WebElement btnEdit;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvFitnessConclusion_ctl02_ddlEditUserRole")
	WebElement drpEditUserRole;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvFitnessConclusion_ctl02_ddlEditFitnessConclusion")
	WebElement drpEditFitnessConclusion;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvFitnessConclusion_ctl02_btnUpdate")
	WebElement btnUpdate;

	public void clickSubMenuFitnessConclusion() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(fitnessConclusionMenu).click().perform();
	}

	public void fitnessConclusionTitleName() {
		// WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}

	public void clickAddBtn() {
		btnAdd.click();
	}

	public void selectOwnerCompany(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompany);
		selectOwnCompany.selectByVisibleText(company);
	}

	public void selectUserRole(String role) {
		drpUserRole.sendKeys(role);
	}

	public void selectFitnessConclusion(String role) {
		drpFitnessConclusion.sendKeys(role);
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

	public void fitnessConclusionSuccessMsg() {
		// System.out.println(driver.findElement(By.cssSelector("SuccessBg, ErrorBg")).getText();
		
		String SuccessMsg = "The fitness conclusion Fit has been successfully created in the system";
		String FailureMsg = "The fitness conclusion already exists for the role and the company.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();
		
		if(AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		}
		else if(AlertsMsg.equalsIgnoreCase(FailureMsg))
		{
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}
		else {
			System.out.println("The fitness conclusion Fit has been successfully modified in the system");
		}

	}

	// Search fitness Conclusion
	public void selectOwnerCompanySrch(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanySrch);
		selectOwnCompany.selectByVisibleText(company);
	}

	public void selectUserRoleSrch(String role) {
		drpUserRoleSrch.sendKeys(role);
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

	public void clickEditBtn() {
		btnEdit.click();
	}

	public void modifyUserRole(String role) {
		drpEditUserRole.sendKeys(role);
	}

	public void modifyFitnessConclusion(String role) {
		drpEditFitnessConclusion.sendKeys(role);
	}

	public void modifySubmitBtn() {
		btnUpdate.click();
	}

	public void modifySuccessMsg() {
	//	System.out.println(driver.findElement(By.xpath("")).getText());
		
		String SuccessMsg = "has been successfully modified in the system.";
		String FailureMsg = "The fitness conclusion already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();
		
		if(AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		}
		else if(AlertsMsg.equalsIgnoreCase(FailureMsg))
		{
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}
		else {
			System.out.println("Something went wrong!");
		}
		
		
	}

}
