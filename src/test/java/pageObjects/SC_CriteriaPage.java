package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;
import utils.WaitUtils;

public class SC_CriteriaPage extends TestBase {

	public WebDriver driver;

	public SC_CriteriaPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//tr[@id='ctl00_mnuMedtrackn69']/td/table/tbody/tr/td/a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5']")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[contains(text(),'Criteria')]")
	WebElement criteriaMenu;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpOwnerCompanySrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnGetDetails")
	WebElement btnGetDetails;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MedtrackContentPlaceHolder_CompanyMETCriteriaMessages_SuccessM\"]/div")
	WebElement successMessage;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmit;
	
	
	public void clickSubMenuCriteria() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(criteriaMenu).click().perform();
	}
	
	public void criteriaPageTitleName() {
		//WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}
	
	public void selectDrpCompanyNew(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanySrch);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	
	public void clickGetDetails() {
		btnGetDetails.click();
	}
	
	public void selectCheckbox(String criteria) {
		driver.findElement(By.id("ctl00_MedtrackContentPlaceHolder_gdvCompanyCriteria_ctl13_chkSelect")).click();
	}
	
	public void clickSubmitBtn() {
		btnSubmit.click();
		WaitUtils.waitForElementVisible(driver, successMessage);
	}
	
	public void successMsg() throws IOException {
		takeScreenshot(driver, "SC_CriteriaPage", false);
		//captureScreen(driver, "SC_CriteriaPage");
		//System.out.println(successMessage.getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"ctl00_MedtrackContentPlaceHolder_CompanyMETCriteriaMessages_SuccessM\"]/div")).getText());
	}
}

	