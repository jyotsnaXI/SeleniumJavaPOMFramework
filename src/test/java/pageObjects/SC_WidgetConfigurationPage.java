package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.TestBase;
import utils.WaitUtils;

public class SC_WidgetConfigurationPage extends TestBase {

	public WebDriver driver;

	public SC_WidgetConfigurationPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='System Configuration']")
	WebElement sysConfiguratio;

	@FindBy(xpath = "(//a[contains(text(),'Company')])[1]")
	WebElement companySubMenu;
	
	@FindBy(xpath = "//a[normalize-space()='Dashboard']")
	WebElement dashboardSubSubMenu;

	@FindBy(xpath = "//a[contains(text(),'Widget Configuration')]")
	WebElement widgetConfigurationMenu;
	
	//Add Medical History
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompanyName")
	WebElement drpOwnCompany;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlWidgetType")
	WebElement drpWidgetType;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlWidgetCategory")
	WebElement drpWidgetCategory;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlHealthCheckItemName")
	WebElement drpHealthCheckItemName;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtSequenceNumber")
	WebElement txtSequenceNumber;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlGender")
	WebElement drpGender;
	
	@FindBy(xpath = "//button[@title='Select Relation']")
	WebElement drpUserPreference;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtMinValue")
	WebElement txtMinValue;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtMaxValue")
	WebElement txtMaxValue;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtPoints")
	WebElement txtPoints;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtSmiley")
	WebElement drpSmiley;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAddSmiley;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@class='SuccessBg']")
	WebElement successMsg;
	
	@FindBy(xpath = "//*[text() = 'Employee']")
	WebElement drpOption;
	
	public void clickWidgetConfigurationMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(dashboardSubSubMenu).perform();
		action.moveToElement(widgetConfigurationMenu).click().perform();
	}
	
	public void pageTitleWidgetConfiguration() {
		//WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}
	
	public void clickAddBtn() {
		btnAdd.click();
	}
	
	public void selectOwnCompany(String company) {
		Select selectCompany = new Select(drpOwnCompany);
		selectCompany.selectByVisibleText(company);
	}
	
	public void selectWidgetType(String WidgetType) {
		WaitUtils.sleep(2);
		Select selectWidget = new Select(drpWidgetType);
		selectWidget.selectByVisibleText(WidgetType);
	}
	
	public void selectWidgetCategory(String WidgetCate) {
		WaitUtils.sleep(2);
		Select WidgetCategory = new Select(drpWidgetCategory);
		WidgetCategory.selectByVisibleText(WidgetCate);
	}	
	
	public void selectHealthCheckItemName(String HealthCheck) {
		WaitUtils.sleep(2);
		Select HealthCheckItem = new Select(drpHealthCheckItemName);
		HealthCheckItem.selectByVisibleText(HealthCheck);
	}	
	
	public void enterSequence(String sequence) {
		WaitUtils.sleep(5);
		txtSequenceNumber.sendKeys(sequence);
	}
	
	public void selectGender(String gender) {
		WaitUtils.sleep(2);
		Select selectGender = new Select(drpGender);
		selectGender.selectByVisibleText(gender);
	}
	
	public void selectUserPreference (String UserPreference) {
		WaitUtils.sleep(2);
		drpUserPreference.click();
		driver.findElement(By.xpath("//ul[@class= 'multiselect-container dropdown-menu']/li[2]/a/label")).click();		
	}
	
	public void enterMinVal(String minValue) {
		txtMinValue.sendKeys(minValue);
	}
	
	public void enterMaxVal(String maxValue) {
		txtMaxValue.sendKeys(maxValue);
	}
	
	public void enterPoints(String point) {
		txtPoints.sendKeys(point);
	}
	
	public void selectSmiley() {
		drpSmiley.click();
		driver.findElement(By.id("ctl00_MedtrackContentPlaceHolder_rdbSmiley_0")).click();
	}
	
	public void clickAddSmileyBtn() {
		btnAddSmiley.click();
	}
	
	public void clickSubmitBtn(){
		WaitUtils.sleep(4);
		btnSubmit.click();
	}
	
	public void successMsg() {
		
		String SuccessMsg = "The widget configuration has been successfully added.";
		String FailureMsg = "is required and cannot be left blank.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();
		
		if(AlertsMsg.equalsIgnoreCase(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		}
		else if(AlertsMsg.contains(FailureMsg))
		{
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}
		
	}
	
}