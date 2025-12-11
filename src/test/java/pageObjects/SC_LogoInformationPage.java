package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;

public class SC_LogoInformationPage extends TestBase {

	public WebDriver driver;

	public SC_LogoInformationPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//tr[@id='ctl00_mnuMedtrackn69']/td/table/tbody/tr/td/a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5']")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[contains(text(),'Logo Information')]")
	WebElement logoInformation;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement logoInfdrpOwnCompany;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnGetDetails")
	WebElement btnGetDetails;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnBrowseCompanyLogo")
	WebElement btnBrowseCompanyLogo;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmitLogo;
	
	
	public void clickSubMenuLogoInfo() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(logoInformation).click().perform();
	}
	
	public void logoInfoTitlePage() {
		System.out.println("User is on page "+driver.findElement(By.xpath("//strong[contains(text(),'Logo Information')]")).getText());
	}
	
	public void selectOwnerComp(String company) {
		Select dropOwnCompany = new Select(logoInfdrpOwnCompany);
		dropOwnCompany.selectByVisibleText(company);
	}
	
	public void getDetailsBtn() {
		btnGetDetails.click();
	}
	
	public void chooseFileBtn() {
		btnBrowseCompanyLogo.sendKeys("C:\\Users\\Jyotsna.Gupta\\Downloads\\Logo-AirLiquide.png");
	}
	
	public void clickSubmit() {
		btnSubmitLogo.click();
	}
	
	public void successMessage() {
		System.out.println(driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/span[1]/div[1]")).getText());
	}

}
