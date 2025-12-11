package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;
import utils.WaitUtils;

public class ChangePasswordPage extends TestBase{
	
	public WebDriver driver;

	public ChangePasswordPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='ctl00_lvWelcomeNote_lnkChangePassword']")
	WebElement lnkChangePassword;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtExistingPassword")
	WebElement txtExistingPassword;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtNewPassword")
	WebElement txtNewPassword;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtConfirmNewPassword")
	WebElement txtConfirmNewPassword;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlSecurityQuestion1")
	WebElement ddlSecurityQuestionOne;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtAnswer1")
	WebElement txtSecurityAnswerOne;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlSecurityQuestion2")
	WebElement ddlSecurityQuestionTwo;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtAnswer2")
	WebElement txtSecurityAnswerTwo;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmit;

	public void clickChangePwdLink() {
		WaitUtils.sleep(2);
		lnkChangePassword.click();
	}
	
	public void enterExistingPassword(String exPassword) {
		txtExistingPassword.sendKeys(exPassword);
	}
	
	public void enterNewPassword(String newPassword) {
		txtNewPassword.sendKeys(newPassword);
	}
	
	public void enterConfirmPassword(String cnfPassword) {
		txtConfirmNewPassword.sendKeys(cnfPassword);
	}
	
	public void selectSecQueOne(String secQuestionOne) {
		Select securityQues1 = new Select(ddlSecurityQuestionOne);
		securityQues1.selectByVisibleText(secQuestionOne);
	}
	
	public void enterSecAnswerOne(String secAnsOne) {
		txtSecurityAnswerOne.clear();
		txtSecurityAnswerOne.sendKeys(secAnsOne);
	}
	
	public void selectSecQueTwo(String secQuestionTwo) {
		Select securityQues2 = new Select(ddlSecurityQuestionTwo);
		securityQues2.selectByVisibleText(secQuestionTwo);
	}
	
	public void enterSecAnswerTwo(String secAnsTwo) {
		txtSecurityAnswerTwo.clear();
		txtSecurityAnswerTwo.sendKeys(secAnsTwo);
	}
	
	public void clickSubmitBtn() {
		btnSubmit.click();
	}
	
	public void successMessage() {
		WebElement AlertMessage = driver.findElement(By.xpath("//div[@class='ErrorBg']"));
		System.out.println(AlertMessage.getText());
	}
}
