package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.JavaScriptUtils;
import utils.TestBase;

public class SearchEmployeePage extends TestBase {

	WebDriver driver;

	public SearchEmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtFirstName")
	WebElement FirstName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtLastName")
	WebElement LastName;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpCompany;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtGinNumber")
	WebElement ginNumber;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement SearchButton;

	@FindBy(id = "searchHeading")
	WebElement SearchResults;

	@FindBy(name = "rdoSelect")
	WebElement radioButton;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnViewExam")
	WebElement ViewExamButton;

	public void setFirstName(String fname) {
		FirstName.clear();
		FirstName.sendKeys(fname);
	}

	public void setLastName(String fname) {
		LastName.clear();
		LastName.sendKeys(fname);
	}
	
	public void setCompany(String company) {
		Select dropCompany = new Select(drpCompany);
		dropCompany.selectByVisibleText(company);
	}

	public void setGIN(String GinNumber) {
		ginNumber.clear();
		ginNumber.sendKeys(GinNumber);
	}

	public void clickSearch() {
		SearchButton.click();
	}

	public void showSearchResults() throws InterruptedException {

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

	public void clickRadioButton() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, radioButton);
		System.out.println("** Scrolled down to element  **");
		radioButton.click();
	}

	public void clickViewExam() {
		ViewExamButton.click();
	}

}
