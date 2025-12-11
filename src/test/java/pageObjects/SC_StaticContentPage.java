package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_StaticContentPage extends TestBase {

	public WebDriver driver;

	public SC_StaticContentPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "(//a[contains(text(),'Company')])[1]")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[@href='../Company/CompanyStaticContent.aspx']")
	WebElement staticContentMenu;

	// ADD Fitness Conclusion
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompanyName")
	WebElement drpOwnerCompany;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyStaticContent_ctl03_txtFooterMenuName")
	WebElement txtMenuName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyStaticContent_ctl03_txtFooterContentLocation")
	WebElement txtPathLocation;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyStaticContent_ctl03_btnSave")
	WebElement btnSubmit;

	@FindBy(xpath = "//div[@class='SuccessBg']")
	WebElement successMsg;

	@FindBy(xpath = "//div[@class='SearchRecord']")
	WebElement searchResults;

	// Modify Fitness Conclusion
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyStaticContent_ctl02_btnEdit")
	WebElement btnEdit;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyStaticContent_ctl02_txtEditMenuName")
	WebElement txtEditMenuName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyStaticContent_ctl02_txtEditContentLocation")
	WebElement txtEditPathLocation;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyStaticContent_ctl02_btnUpdate")
	WebElement btnUpdate;

	public void clickSubMenuStaticContent() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(staticContentMenu).click().perform();
	}

	public void staticContentTitleName() {
		// WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}

	public void selectOwnerCompany(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompany);
		selectOwnCompany.selectByVisibleText(company);
	}

	public void clickSearchBtn() {
		btnSearch.click();
	}

	public void clickAddBtn() {
		btnAdd.click();
	}

	public void enterMenuName(String role) {
		txtMenuName.sendKeys(role);
	}

	public void enterPathLocation(String role) {
		txtPathLocation.sendKeys(role);
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

	public void staticContentSuccessMsg() {
		// System.out.println(driver.findElement(By.cssSelector("SuccessBg,
		// ErrorBg")).getText();

		String SuccessMsg = "has been successfully created in the system.";
		String FailureMsg = "The static content menu already exists for the company.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		} else {
			System.out.println("The fitness conclusion Fit has been successfully modified in the system");
		}
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

	public void modiMenuName(String role) {
		txtEditMenuName.clear();
		txtEditMenuName.sendKeys(role);
	}

	public void modifyPathLocation(String role) {
		txtEditPathLocation.clear();
		txtEditPathLocation.sendKeys(role);
	}

	public void updateBtn() {
		btnUpdate.click();
	}

	public void modifySuccessMsg() {
		// System.out.println(driver.findElement(By.xpath("")).getText());

		String SuccessMsg = "has been successfully modified in the system.";
		String FailureMsg = "The static content menu already exists for the company..";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		} else {
			try {
				System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
				Alert alt = driver.switchTo().alert();
				alt.accept();
			} catch (NoAlertPresentException noe) {
			}

		}

	}

}
