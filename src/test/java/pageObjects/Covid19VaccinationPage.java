package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.JavaScriptUtils;
import utils.TestBase;

public class Covid19VaccinationPage extends TestBase {

	public WebDriver driver;

	public Covid19VaccinationPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='COVID-19 Vaccination']")
	WebElement COVID19VaccinationMenu;
	@FindBy(xpath = "//a[contains(text(),'Search COVID-19 Vaccination')]")
	WebElement SearchCOVID19VaccinationSubMenu;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtLastName")
	WebElement txtLastName;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtFirstName")
	WebElement txtFirstName;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlStatus")
	WebElement drpStatus;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtGinNumber")
	WebElement txtGINNumber;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_calDateOfBirth_txtDate")
	WebElement txtDOB;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpCompany;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlVaccineType")
	WebElement drpVaccineName;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlVaccineBrand")
	WebElement drpVaccineBrand;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlAssignmentCountry")
	WebElement drpAssignmentCountry;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCategory")
	WebElement drpEmpCategory;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtTown")
	WebElement txtCity;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlArea")
	WebElement drpArea;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnExport")
	WebElement btnExport;

	public void clickSubMenuSearchCOVID19Vaccination() {
		Actions action = new Actions(driver);
		action.moveToElement(COVID19VaccinationMenu).perform();
		action.moveToElement(SearchCOVID19VaccinationSubMenu).click().perform();
	}

	public void pageTitleName() {
		System.out.println(driver.getTitle());
	}
	
//Search	
	public void enterLastName(String lastname) {
		txtLastName.sendKeys(lastname);
	}
	
	public void enterFirstName(String firstname) {
		txtFirstName.sendKeys(firstname);
	}
	
	public void clickSearchBtn() {
		btnSearch.click();
	}
	
	public void searchResult() {

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
	
	public void successMessage() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}
	
	//Export
	public void clickExportBtn() {
		btnExport.click();
	}

}
