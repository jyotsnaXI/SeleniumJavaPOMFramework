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

public class SC_LandingPage extends TestBase {

	public WebDriver driver;

	public SC_LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//tr[@id='ctl00_mnuMedtrackn69']/td/table/tbody/tr/td/a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5']")
	WebElement companySubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	WebElement dashboardSubSubMenu;

	@FindBy(xpath = "//a[contains(text(),'Landing Page')]")
	WebElement landingPageMenu;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpOwnerCompanySrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlProfile")
	WebElement drpProfileSrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvDashBoardConfiguration_ctl03_ddlFooterCompanyName")
	WebElement drpAddCompanyNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvDashBoardConfiguration_ctl03_ddlFooterProfileNameNew")
	WebElement drpAddProfileNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvDashBoardConfiguration_ctl03_lnksave")
	WebElement btnSubmitNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvDashBoardConfiguration_ctl02_lnkEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvDashBoardConfiguration_ctl02_lnkUpdate")
	WebElement btnSubmitUpdate;
	
	
	public void clickLandingPageMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(dashboardSubSubMenu).perform();
		action.moveToElement(landingPageMenu).click().perform();
	}
	
	public void pageTitle() {
		System.out.println(driver.getTitle());
	}
	
	//Add Landing Page
	public void clickAddBtn() {
		btnAdd.click();
	}
	
	public void selectDrpCompanyNew(String company) {
		Select selectOwnCompany = new Select(drpAddCompanyNew);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void selectProfile(String barea) {
		drpAddProfileNew.sendKeys(barea);
	}
	
	public void submitNew() {
		btnSubmitNew.click();
	}
	
	public void landingSuccessMsg() {
		
		String SuccessMsg = "The widget configuration has been successfully added.";
		String FailureMsg = "The landing page configuration already exists in the system";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();
		
		if(AlertsMsg.equalsIgnoreCase(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		}
		else if(AlertsMsg.contains(FailureMsg))
		{
			System.out.println("Failed!: "+ driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}
	}

	//Search And Modify Landing Page
	public void selectOwnerCompanySrch(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanySrch);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void selectProfileSrch(String barea) {
			drpProfileSrch.sendKeys(barea);
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
	
	public void modifySubmitBtn() {
		btnSubmitUpdate.click();
	}
	
	public void modifySuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}
	
}

