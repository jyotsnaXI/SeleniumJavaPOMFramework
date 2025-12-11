package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;
import utils.WaitUtils;

public class SC_EncryptionUtilityPage extends TestBase {

		public WebDriver driver;

		public SC_EncryptionUtilityPage(WebDriver driver) {
			this.driver = driver;
			// WaitUtils.waitForPageLoad(driver);
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
		WebElement sysConfiguratio;

		@FindBy(xpath = "//a[contains(text(),'Encryption Utility')]")
		WebElement EncryptionUtility;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_tbxEncyptedString")
		WebElement txtDecyptedString;

		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnDecrypt")
		WebElement btnDecrypt;
		
		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_tbxDecyptedString")
		WebElement txtNormalString;
		
		@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnEncrypt")
		WebElement btnEncrypt;
		
		@FindBy(xpath = "//span[@id='ctl00_MedtrackContentPlaceHolder_lblDecryptedString']")
		WebElement normalStringResult;
		
		@FindBy(xpath = "//span[@id='ctl00_MedtrackContentPlaceHolder_lblEncryptedString']")
		WebElement encryptedStringResult;
		
		public void clickMenuEncryptionUtility() {
			Actions action = new Actions(driver);
			action.moveToElement(sysConfiguratio).perform();
			action.moveToElement(EncryptionUtility).click().perform();
		}

		public void pageTitleName() {
			// WaitUtils.waitForPageLoad(driver);
			System.out.println(driver.getTitle());
		}

		public void enterDecryptedStr(String decryptstring) {
			txtDecyptedString.sendKeys(decryptstring);
		}
		
		public void clickDecryptBtn() {
			btnDecrypt.click();
		}
		
		public void normalStringResult() {	
			WaitUtils.sleep(2);
			System.out.println("String are: "+ normalStringResult.getText());
		}
		
		public void enterNormalStr(String NormalString) {
			txtNormalString.sendKeys(NormalString);
		}
		
		public void clickEncryptBtn() {
			btnEncrypt.click();
		}
		
		public void encryptedStringResult() {	
			System.out.println("Encripted string are: "+ encryptedStringResult.getText());
		}


}