package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

public class ExcelOperationsPage extends TestBase {

	public WebDriver driver;

	public ExcelOperationsPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_UserName")
	WebElement username;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_Password")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"captchaText\"]")
	WebElement verificationCode;

	@FindBy(xpath = "//*[@id=\"captchaInput\"]")
	WebElement txtVerificationCode;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_bLogin")
	WebElement submit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement SearchButton;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvSearchResult")
	WebElement searchResultTable;
	
	@FindBy(xpath = "//a[@id='ctl00_MedtrackContentPlaceHolder_gdvSearchResult_ctl01_litEmployeeGIN']")
	WebElement ginColumnHeader;
	
	@FindBy(id = "ctl00_loginView_btnLogout")
	WebElement logout;

	public void setUserName(String uname) {
		username.clear();
		username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void setCodeForVerification() {
		String str = verificationCode.getText();
		String[] strOne = str.split("\\+");

		String s1 = strOne[0].trim();
		String s2 = strOne[1];
		String[] s3 = s2.split("\\=");
		String s4 = s3[0].trim();

		int intOne = Integer.parseInt(s1);
		int intTwo = Integer.parseInt(s4);

		int sum = intOne + intTwo;

		txtVerificationCode.sendKeys(String.valueOf(sum));
	}

	public void clickSubmit() {
		submit.click();
	}
	
	public void enterEmpDetails() {
		
	}
	
	public void clickSearch() {
		SearchButton.click();
	}
		
}
		
		
	
	

