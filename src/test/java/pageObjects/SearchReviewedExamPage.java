package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.JavaScriptUtils;
import utils.TestBase;

public class SearchReviewedExamPage extends TestBase {

	WebDriver driver;

	public SearchReviewedExamPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlUserRole")
	WebElement userRole;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlUserID")
	WebElement userID;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_calFromDate_txtDate")
	WebElement fromDate;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_calToDate_txtDate")
	WebElement toDate;
	@FindBy(xpath = "//*[@class='SearchRecord']")
	WebElement searchResult;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnExport")
	WebElement btnExport;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MedtrackContentPlaceHolder_SearchReviewedExamsMessages_FailureM\"]/div")
	WebElement srchRsltFailureMsg;
	
	public void setuserRole(String Userrole) {
		Select dropuserRole = new Select(userRole);
		dropuserRole.selectByVisibleText(Userrole);
	}
	
	public void setuserID(String UserID) {
		Select dropuserID = new Select(userID);
		dropuserID.selectByVisibleText(UserID);
	}
	
	public void setFromDate(String FromDate) {
		fromDate.sendKeys(FromDate);
	}
	
	public void setToDate(String ToDate) {
		toDate.sendKeys(ToDate);
	}
	
	public void clickExportBtn() {
		btnExport.click();
	}
	
		public void searchResult() throws InterruptedException {
			
			boolean tableExists = JavaScriptUtils.isTablePresent(driver, By.id("ctl00_MedtrackContentPlaceHolder_SearchHeader"));
			
			if (tableExists)
			{
				System.out.println("Search result is true");
	        } 
			else
			{
	            System.out.println("Search result is false");
	            try
	            {
	                WebElement notification = driver.findElement(By.xpath("//div[@class='ErrorBg']"));
	                System.out.println("Notification message: " + notification.getText());
	            }
	            catch (Exception e)
	            {
	            	WebElement notification = driver.findElement(By.xpath("//div[@class='InformationBg']"));
	                System.out.println("Notification message: " + notification.getText());
	            }
	        }
		}
}
