package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;

public class SearchTeamMemberPage extends TestBase  {
	
	WebDriver driver;

	public SearchTeamMemberPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(), 'Search Team Member')]")
	WebElement clickSearchTeamMembersLink;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlUserRole")
	WebElement drpUserRole;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtEmpID")
	WebElement empGIN;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MedtrackContentPlaceHolder_SearchHeading\"]/table/tbody/tr/td/strong")
	WebElement searchResult;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MedtrackContentPlaceHolder_SearchUserMessage_InformationM\"]/div")
	WebElement noUsersAvailAlert;
	
	public void clickSearchTeamMembersLink() {
		clickSearchTeamMembersLink.click();
	}

	public void setUserRole(String userrole) {
		Select UserRole = new Select(drpUserRole);
		UserRole.selectByVisibleText(userrole);
	}
	
	public void setEmpGIN(String fname) {
		empGIN.clear();
		empGIN.sendKeys(fname);
	}
	
	public void setAlertForNoUser() {
		System.out.println("No Users Avail Alert Msg" + noUsersAvailAlert);
	}
	public void setSearchResult() {
		System.out.println("Search result displayed***" + searchResult);
	}
}
