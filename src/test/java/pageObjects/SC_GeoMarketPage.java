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

public class SC_GeoMarketPage extends TestBase {

	public WebDriver driver;

	public SC_GeoMarketPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//tr[@id='ctl00_mnuMedtrackn69']/td/table/tbody/tr/td/a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5']")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[contains(text(),'Geo Market')]")
	WebElement geoMarket;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompanyName")
	WebElement drpOwnerCompanySrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtGeoMarketName")
	WebElement txtGeoMarketSrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyGeoMarket_ctl03_ddlFooterCompanyName")
	WebElement drpAddCompanyNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyGeoMarket_ctl03_txtFooterGeoMarket")
	WebElement txtGeoMarketNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyGeoMarket_ctl03_btnSave")
	WebElement btnSubmitAdd;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyGeoMarket_ctl02_btnEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyGeoMarket_ctl02_chkEditActive")
	WebElement chkEditActive;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyGeoMarket_ctl02_txtEditGeoMarket")
	WebElement txtGeoMarketEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyGeoMarket_ctl02_btnUpdate")
	WebElement btnSubmitUpdate;
	
	
	public void clickSubMenuGeoMarket() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(geoMarket).click().perform();
	}
	
	public void geoMarketPageTitleName() {
		//WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Geo Market Master')]")).getText());
	}
	
	public void clickAddBtn() {
		btnAdd.click();
	}
	
	public void selectDrpCompanyNew(String company) {
		Select selectOwnCompany = new Select(drpAddCompanyNew);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void enterGeoMarketNew(String geo) {
		txtGeoMarketNew.sendKeys(geo);
	}
	
	public void submitNew() {
		btnSubmitAdd.click();
	}
	
	public void geoCreatedSuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

	//SearchAndModifyGeo
	public void selectOwnerCompanySrch(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanySrch);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void enterGeoMarketSrch(String geo) {
			txtGeoMarketSrch.sendKeys(geo);
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
	
	public void txtModifyGeo(String geo) {
		txtGeoMarketEdit.clear();
		txtGeoMarketEdit.sendKeys(geo);
	}
	
	public void modifySubmitBtn() {
		btnSubmitUpdate.click();
	}
	
	public void modifySuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

}
