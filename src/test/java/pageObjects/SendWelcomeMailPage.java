package pageObjects;

import java.util.regex.Pattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.TestBase;

public class SendWelcomeMailPage extends TestBase {

	public WebDriver driver;

	public SendWelcomeMailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Send Welcome E-mail
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpWelcomeCompany;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_chkAllEmployees")
	WebElement chkBoxWelMail;
	@FindBy(xpath = "//a[@id='ctl00_MedtrackContentPlaceHolder_lnkDetails']")
	WebElement viewDetailsLinkWelMail;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnGetDetails")
	WebElement btnGetDetailsWelMail;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSendMail")
	WebElement btnSendMailWelMail;
	@FindBy(xpath = "//div[@class='SuccessBg']")
	WebElement successWelcomeMailMsg;
	@FindBy(xpath = "//*[@id=\"SendWelcomeEmail\"]/table/tbody/tr[4]/td[2]")
	WebElement totalEmployeesWelcome;
	@FindBy(id = "btnClose")
	WebElement btnCloseWelcomeNewWindow;

	// Send Marketing E-mail
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompanyMobile")
	WebElement drpMarketingCompany;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_chkAllMobileCompanies")
	WebElement chkBoxMarketing;
	@FindBy(xpath = "//a[@id='ctl00_MedtrackContentPlaceHolder_lnkDetailsMobile']")
	WebElement viewDetailsLinkMarketing;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnGetDetailsMobile")
	WebElement btnGetDetailsMarketing;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSendMarketingMail")
	WebElement btnSendMailMarketing;
	@FindBy(xpath = "//div[@class='SuccessBg']")
	WebElement successMarkettingMailMsg;
	@FindBy(xpath = "//*[@id=\"SendMarketingEmail\"]/table/tbody/tr[4]/td[2]")
	WebElement totalEmployeesMarketing;
	@FindBy(id = "btnClose")
	WebElement btnCloseMarkettingNewWindow;
	@FindBy(xpath = "//*[@id='ctl00_MedtrackContentPlaceHolder_SendWelcomeEmailMessages2_InformationM']/div")
	WebElement noMarketCompanyAlertMsg;

	// Send Welcome E-mail
	public void selectCompany(String company) {
		Select dropCompany = new Select(drpWelcomeCompany);
		dropCompany.selectByVisibleText(company);
	}

	public void clickWelcomeCheckbox() {
		chkBoxWelMail.click();
	}

	public void clickWelcomeGetDetailsBtn() {
		btnGetDetailsWelMail.click();
	}

	public void clickWelcomeSendMailBtn() {
		btnSendMailWelMail.click();
	}

	public void clickWelcomeViewDetailsLink() {
		btnGetDetailsWelMail.click();
	}

	public void totalWelcomeEmployee() {
		String empString = totalEmployeesWelcome.getText();
		String[] rowArray = empString.split(Pattern.quote("|"));
		System.out.println("Total number of employees for Welcome E-mail is: " + rowArray[0]);
	}

	public void successWelcomeMail() {
		System.out.println("Send Welcome E-mail Success message: " + successWelcomeMailMsg.getText());
	}

	public void closeWelcomeWindow() {
		driver.switchTo().frame(0); // Switching to new window
		btnCloseWelcomeNewWindow.click();
	}

	// Send Marketing E-mail
	public void selectMarketingCompany(String company) {
		Select dropCompany = new Select(drpMarketingCompany);
		dropCompany.selectByVisibleText(company);
	}

	public void clickMarketingCheckbox() {
		chkBoxMarketing.click();
	}

	public void clickMarketingGetDetailsBtn() throws InterruptedException {
		/*
		 * Thread.sleep(5000); List<WebElement> list =
		 * driver.findElements(By.xpath("//input[@value='Get Details']"));
		 * list.get(1).click(); Thread.sleep(3000); System.out.println("***********" +
		 * driver.findElement(By.xpath("//div[@class='InformationBg']")));
		 */
		btnGetDetailsMarketing.click();
	}

	public void clickMarketingSendMailBtn() {
		btnSendMailMarketing.click();
	}

	public void clickMarketingViewDetailsLink() throws InterruptedException {
		viewDetailsLinkMarketing.click();
	}
	public boolean isElementPresent(WebElement elements) {
	    return elements != null ; 
	}

	public void totalMarketingEmployee() {
		String empString = totalEmployeesMarketing.getText();
		String[] rowArray = empString.split(Pattern.quote("|"));
		System.out.println("Total number of employees for Marketing E-mail is: " + rowArray[0]);
	}

	public void successMarketingMail() {
		System.out.println("Send Marketing E-mail Success message: " + successMarkettingMailMsg.getText());
	}

	public void closeMarketingWindow() {
		btnCloseMarkettingNewWindow.click();
	}
}
