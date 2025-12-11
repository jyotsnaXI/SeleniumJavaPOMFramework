package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;

public class SC_NotificationPage extends TestBase {

	public WebDriver driver;

	public SC_NotificationPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "(//a[contains(text(),'Company')])[1]")
	WebElement companySubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	WebElement dashboardSubSubMenu;

	@FindBy(xpath = "//*[@id=\"ctl00_mnuMedtrackn92\"]/td/table/tbody/tr/td/a")
	WebElement notificationMenu;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpOwnerCompany;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnGetDetails")
	WebElement btnGetDetails;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_chkListNotifications_0")
	WebElement checkBox1;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmit;
	
	
	public void clickSubMenuNotification() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(dashboardSubSubMenu).perform();
		action.moveToElement(notificationMenu).click().perform();
	}
	
	public void pageTitleName() {
		//WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}
	
	public void selectDrpCompany(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompany);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void clickGetDetailsBtn() {
		btnGetDetails.click();
	}
	
	public void selectCheckBox() {
		checkBox1.click();
	}
	
	public void clickSubmitBtn() {
		btnSubmit.click();
	}
	
	public void successMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		
	}

}
