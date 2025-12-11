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

public class SC_MenuItemPage extends TestBase {

	public WebDriver driver;

	public SC_MenuItemPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "(//a[contains(text(),'Company')])[1]")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[normalize-space()='Mobile']")
	WebElement mobileSubSubMenu;

	@FindBy(xpath = "//a[normalize-space()='Menu Item']")
	WebElement menuItem;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyMenuItemContent_ctl03_ddlFooterCompanyName")
	WebElement drpOwnerCompanyNew;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyMenuItemContent_ctl03_ddlFooterDefaultName")
	WebElement drpDefaultMenuNameNew;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyMenuItemContent_ctl03_btnSave")
	WebElement btnSubmitNew;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpOwnerCompanySrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlDefaultMenuName")
	WebElement drpDefaultMenuNameSrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyMenuItemContent_ctl02_btnEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyMenuItemContent_ctl02_btnDelete")
	WebElement btnDelete;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyMenuItemContent_ctl02_txtEditAlternateMenuName")
	WebElement txtEditAlternateMenuNameEdit;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyMenuItemContent_ctl02_btnUpdate")
	WebElement btnUpdate;

	public void clickSubMenuItem() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(mobileSubSubMenu).perform();
		action.moveToElement(menuItem).click().perform();
	}

	public void pageTitleName() {
		// WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}

	public void clickAddBtn() {
		btnAdd.click();
	}

	public void selectDrpCompanyNew(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanyNew);
		selectOwnCompany.selectByVisibleText(company);
	}

	public void selectDefaultMenuNew(String MenuItem) {
		Select selectOwnCompany = new Select(drpDefaultMenuNameNew);
		selectOwnCompany.selectByVisibleText(MenuItem);
	}

	public void clickSubmitBtn() {
		btnSubmitNew.click();
	}

	public void successMsg() {
		String SuccessMsg = "The menu has been successfully created in the system.";
		String FailureMsg = "The menu item cannot be added since it aldready exists in the system";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.equalsIgnoreCase(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.contains(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

	// Search
	public void selectDrpCompanySrch(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanySrch);
		selectOwnCompany.selectByVisibleText(company);
	}

	public void selectDefaultMenuSrch(String MenuItem) {
		Select selectOwnCompany = new Select(drpDefaultMenuNameSrch);
		selectOwnCompany.selectByVisibleText(MenuItem);
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
	
	//Delete
	public void clickDeleteBtn() {
		btnDelete.click();
		driver.switchTo().alert().accept();
	}
	
	public void deleteMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		//String DeleteMsg = "The menu has been successfully deleted from the system.";
	}

	// Modify
	public void clickEditBtn() {
		btnEdit.click();
	}
	
	public void enterAltMenuNameEdit(String MenuName) {
		txtEditAlternateMenuNameEdit.clear();
		txtEditAlternateMenuNameEdit.sendKeys(MenuName);
	}

	public void clickUpdateBtn() {
		btnUpdate.click();
	}

	public void modSuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());

	}

}
