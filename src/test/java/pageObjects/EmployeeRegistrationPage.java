package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;
import utils.WaitUtils;

public class EmployeeRegistrationPage extends TestBase {
	
	WebDriver driver;

	public EmployeeRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(), 'Employee or')]")
	WebElement empOrPreemployeeLink;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtEmployeeID")
	WebElement GINnumber;
	
	@FindBy(xpath = "//img[contains(@src,'Images/cal.gif')]")
	WebElement DOB;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtMedtrackID")
	WebElement ISOSID;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnGetDetails")
	WebElement btnGetDetails;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtUserName")
	WebElement txtUserName;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtPassword")
	WebElement txtPassword;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtConfirmPassword")
	WebElement txtConfirmPassword;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlSecurityQuestion1")
	WebElement ddlSecurityQuestion1;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtSecurityAnswer1")
	WebElement txtSecurityAnswer1;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlSecurityQuestion2")
	WebElement ddlSecurityQuestion2;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtSecurityAnswer2")
	WebElement txtSecurityAnswer2;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnRegister")
	WebElement btnRegister;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnReset")
	WebElement btnReset;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnCancel")
	WebElement btnCancel;
	
	public void clickEmpOrPreEmpLink() {
		empOrPreemployeeLink.click();
	}
	
	public void enterAppIDOrGIN(String AppIDOrGIN) {
		GINnumber.sendKeys(AppIDOrGIN);
	}
	
	public void enterDOB(String dob) {
		
		String[] dobParts = dob.split("-");
		String day = dobParts[0];
		String month = dobParts[1];
		String year = dobParts[2];
		
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
		
		WebElement calendarIcon = driver.findElement(By.xpath("//img[@alt='image']"));
		calendarIcon.click();
                
     // Assuming there are dropdowns for month and year
        WebElement monthDropdown = driver.findElement(By.name("MonthSelector"));
        WebElement yearDropdown = driver.findElement(By.name("YearSelector"));
        
        WebElement calendar = driver.findElement(By.xpath("//span[@id='calBorder']"));
        
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText(month);

        WaitUtils.sleep(2);
        yearDropdown = driver.findElement(By.name("YearSelector"));
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByVisibleText(year);
        
        // Example: Assuming the calendar allows selecting the date directly
        WebElement dateElement = calendar.findElement(By.xpath("//td[text()="+ day +"]"));
        WaitUtils.sleep(2);
        System.out.println("dateElement: " + dateElement);
        dateElement.click();

		
		//DOB.sendKeys(dob);
	}
	
	public void enterISOSID(String isosid) {
		ISOSID.sendKeys(isosid);
	}
	
	public void clickGetDetailsBtn() {
		btnGetDetails.click();
	}
	
	public void enterUsername(String username) {
		txtUserName.clear();
		txtUserName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void enterCnfPassword(String cnfPassword) {
		txtConfirmPassword.clear();
		txtConfirmPassword.sendKeys(cnfPassword);
	}
	
	public void selectSecQueOne(String secQueOne) {
		Select drpSecQuesOne = new Select(ddlSecurityQuestion1);
		drpSecQuesOne.selectByVisibleText(secQueOne);
	}
	
	public void enterSecAnsOne(String secAnsOne) {
		txtSecurityAnswer1.sendKeys(secAnsOne);
	}
	
	public void selectSecQueTwo(String secQueTwo) {
		Select drpSecQuesTwo = new Select(ddlSecurityQuestion2);
		drpSecQuesTwo.selectByVisibleText(secQueTwo);
	}
	
	public void enterSecAnsTwo(String secAnsTwo) {
		txtSecurityAnswer2.sendKeys(secAnsTwo);
	}
	
	public void clickRegisterBtn() {
		btnRegister.click();
	}

}
