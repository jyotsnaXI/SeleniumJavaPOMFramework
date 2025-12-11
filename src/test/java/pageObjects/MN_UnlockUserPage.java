package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class MN_UnlockUserPage extends TestBase {

	public WebDriver driver;

	public MN_UnlockUserPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_3' and contains(text(),'Maintenance')]")
	WebElement MaintenanceMenu;
	@FindBy(xpath = "//a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5' and contains(text(),'Unlock User')]")
	WebElement unlockUserSubMenu;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtBox1")
	WebElement txtUserField;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnUnlock;

	public void clickSubMenuUnlockUser() {
		Actions action = new Actions(driver);
		action.moveToElement(MaintenanceMenu).perform();
		action.moveToElement(unlockUserSubMenu).click().perform();
	}

	public void pageTitleName() {
		System.out.println(driver.getTitle());
	}
	
	public void enterUserName(String user) {
		txtUserField.sendKeys(user);
	}
	
	public void clickUnlockButton() {
		btnUnlock.click();
	}
	
	public void successMessage() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

}
