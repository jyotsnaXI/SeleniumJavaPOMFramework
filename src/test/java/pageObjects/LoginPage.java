package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.TestBase;

public class LoginPage extends TestBase {
	public WebDriver driver;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_UserName")
	WebElement username;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_Password")
	WebElement password;

	@FindBy(id = "captchaText")
	WebElement captchaCode;
	
	@FindBy(id = "captchaInput")
	WebElement captchaInput;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_bLogin")
	WebElement submit;

	@FindBy(id = "ctl00_loginView_btnLogout")
	WebElement logout;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String uname) {
		username.clear();
		username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void setCodeForVerification() {
		String str = captchaCode.getText();
		String[] strOne = str.split("\\+");

		String s1 = strOne[0].trim();
		String s2 = strOne[1];
		String[] s3 = s2.split("\\=");
		String s4 = s3[0].trim();

		int intOne = Integer.parseInt(s1);
		int intTwo = Integer.parseInt(s4);

		int sum = intOne + intTwo;

		captchaInput.sendKeys(String.valueOf(sum));
	}

	public void clickSubmit() {
		submit.click();
	}

	public void titlePage() throws IOException {

		if (driver.getTitle().equals("MedFit - Search Employee")) {
			Assert.assertTrue(true);
			System.out.println("Passed!");
		} else {
			takeScreenshot(driver, "Login Page", true);
			Assert.assertTrue(false);
			System.out.println("Failed!");
		}
	}

	public void clickLogout() {
		logout.click();
	}
}
