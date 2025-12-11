package pageObjects;

import java.util.List;
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

public class SC_CompanyPage extends TestBase {

	public WebDriver driver;

	public SC_CompanyPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//tr[@id='ctl00_mnuMedtrackn69']/td/table/tbody/tr/td/a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5']")
	WebElement companySubMenu; 

	@FindBy(xpath = "//*[@id=\"ctl00_mnuMedtrackn74\"]/td/table/tbody/tr/td/a")
	WebElement companyMainMenu;

	@FindBy(xpath = "//strong[contains(text(),'Company Master')]")
	WebElement searchCompTitlePage;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement addCompBtn;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtCompanyName")
	WebElement txtCompanyName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlOwnerCompany")
	WebElement drpOwnCompany;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtAddress1")
	WebElement postalAddress;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtTown")
	WebElement city;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCountry")
	WebElement drpCountry;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtPostalcode")
	WebElement postalCode;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtPhoneNumber")
	WebElement phone;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_cmdSubmit")
	WebElement submit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement searchBtn;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/span[1]/div[1]")
	WebElement successMsg;

	// Modify Company
	@FindBy(xpath = "//a[@id='ctl00_MedtrackContentPlaceHolder_gdvCompanyInfo_ctl02_lbnModify']")
	WebElement editCompanyBtn;

	public void clickSubMenuCompy() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		WaitUtils.sleep(2);
		action.moveToElement(companyMainMenu).click().perform();
	}

	public void companyTitlePage() {
		System.out.println(searchCompTitlePage.getText());
	}

	public void addCompanyBtn() {
		addCompBtn.click();
	}

	public void enterCompany(String company) {
		txtCompanyName.clear();
		txtCompanyName.sendKeys(company);
	}

	public void selectOwnCompany(String company) {
		Select selectOwnCompany = new Select(drpOwnCompany);
		selectOwnCompany.selectByVisibleText(company);
	}

	public void enterPostalAddress(String string) {
		postalAddress.clear();
		postalAddress.sendKeys(string);
	}

	public void enterCity(String string) throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, city);
		city.clear();
		city.sendKeys(string);
	}

	public void selectCountry(String country) {
		Select selectdrpCountry = new Select(drpCountry);
		selectdrpCountry.selectByVisibleText(country);

	}

	public void enterPostalCode(String string) {
		postalCode.clear();
		postalCode.sendKeys(string);
	}

	public void enterPhone(String string) {
		phone.clear();
		phone.sendKeys(string);
	}

	public void clickSubmit() {
		submit.click();
	}

	public void successMessage() {
		System.out.println(successMsg.getText());
	}

	public void searchTable(String record) {
		WebElement mytable = driver
				.findElement(By.xpath("//table[@id='ctl00_MedtrackContentPlaceHolder_gdvCompanyInfo']"));
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		int rows_count = rows_table.size();
		for (int row = 0; row < rows_count; row++) {
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			int columns_count = Columns_row.size();
			System.out.println("Number of cells In Row " + row + " are " + columns_count);
			for (int column = 0; column < columns_count; column++) {
				String celtext = Columns_row.get(column).getText();

				if (celtext.equalsIgnoreCase(record)) {
					System.out.println("Record present in the table:" + celtext);
					clickEditComp(record);
				}
			}
		}
	}

	public void clickEditComp(String record) {
		driver.findElement(By.xpath("//a[@id='ctl00_MedtrackContentPlaceHolder_gdvCompanyInfo_ctl02_lbnModify']"))
				.click();
	}
	
	public void clickSearchBtn() {
		searchBtn.click();
	}

	public void searchResult() {
		System.out.println("Success with search result");
	}

}
