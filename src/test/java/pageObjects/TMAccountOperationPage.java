package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;
import utils.WaitUtils;

public class TMAccountOperationPage extends TestBase {
	
	WebDriver driver;

	public TMAccountOperationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ctl00_MedtrackContentPlaceHolder_gdvSearchUser\"]/tbody/tr[2]/td[3]/a")
	WebElement nameLink;
	
	@FindBy(xpath = "//a[@id='ctl00_MedtrackContentPlaceHolder_lnkEditUser']") 
	WebElement editInfoLink;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnModify")
	WebElement SubmitbtnModify;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnDissableAccount")
	WebElement btnDissableAccount;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnUnlockAccount")
	WebElement btnUnlockAccount;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnResetPassword")
	WebElement btnResetPassword;
	
	public void clickNameLink() {
		nameLink.click();
	}
	public void clickEditInfoLink() {
		WaitUtils.waitForElementVisible(driver, editInfoLink);
		editInfoLink.click();
	}
	public void clickSubmitbtnModify() {
		SubmitbtnModify.click();
	}
	public void clickDissableBtn() {
		btnDissableAccount.click();
	}
	public void clickUnlockBtn() {
		btnUnlockAccount.click();
	}
	public void clickResetPwdBtn() {
		btnResetPassword.click();
	}

}
