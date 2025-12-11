package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

public class ForgotPasswordPage extends TestBase {
	
	WebDriver driver;

	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(), 'Forgot Password')]")
	WebElement forgotPwdUnlockActLink;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtUserID")
	WebElement txtUserID;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnGo")
	WebElement btnGo;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtAnswer1")
	WebElement securityAnswer1;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtAnswer2")
	WebElement securityAnswer2;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//a[contains(text(),'I do not')]")
	WebElement donotRemUserID;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtEmail")
	WebElement emailAddress;
	
	public void clickForgotPwdUnlockActLink() {
		forgotPwdUnlockActLink.click();
	}
	
	public void enterUsername(String username) {
		txtUserID.sendKeys(username);
	}
	
	public void clickBtnGo() {
		btnGo.click();
	}
	
	public void enterSecurityAnswer1(String secAns1) {
		securityAnswer1.sendKeys(secAns1);
	}
	
	public void entesecurityAnswer2(String secAns2) {
		securityAnswer2.sendKeys(secAns2);
	}
	
	public void clickBtnSubmit() {
		btnSubmit.click();
	}
	
	public void clickDonotRemUserID() {
		donotRemUserID.click();
	}
	
	public void enterMailAddress(String email) {
		emailAddress.sendKeys(email);
	}
	
	public void unlockAccSuccessMessage() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}
	
	public void donotRemUserIDMessage() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}
	
}
