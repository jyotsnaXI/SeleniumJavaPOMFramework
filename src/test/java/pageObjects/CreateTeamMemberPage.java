package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.JavaScriptUtils;
import utils.WaitUtils;

public class CreateTeamMemberPage {
	public WebDriver driver;
	String OwnerComp;

	public CreateTeamMemberPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(), 'Create Team Member')]")
	WebElement clickNewTeamMemberLink;
	
	@FindBy(xpath = "//a[contains(text(), 'Search Team Member')]")
	WebElement clickSearchTeamMembersLink;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MedtrackContentPlaceHolder_panControls\"]/div[1]/strong")
	WebElement pageTitle;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlRoleList")
	WebElement drpUserRole;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlADAccount")
	WebElement drpADaccount;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtUserName")
	WebElement txtUserName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlOwnerCompany")
	WebElement drpOwnerCompany;

	@FindBy(id = "511")
	WebElement chkBoxArea;
	@FindBy(id = "13")
	WebElement chkBoxEmployeeCategory;
	@FindBy(id = "251")
	WebElement chkBoxAssignCountry;
	@FindBy(id = "2")
	WebElement chkBoxNationality;
	@FindBy(id = "603")
	WebElement chkBoxGeoMarket;
	@FindBy(id = "25")
	WebElement chkBoxJobSite;
	@FindBy(id = "238")
	WebElement chkBoxJobTitle;
	@FindBy(id = "157")
	WebElement chkBoxBusinessArea;

	// Categories
	@FindBy(id = "957")
	WebElement chkBoxAreaSBM;
	@FindBy(id = "57")
	WebElement chkBoxEmployeeCategorySBM;
	@FindBy(id = "5912")
	WebElement chkBoxBusinessAreaSBM;
	@FindBy(id = "6646")
	WebElement chkBoxJobTitleSBM;

	@FindBy(id = "945")
	WebElement chkBoxAreaBP;
	@FindBy(id = "144")
	WebElement chkBoxEmployeeCategoryBP;
	@FindBy(id = "1")
	WebElement chkBoxAssignCountryBP;
	@FindBy(id = "2417")
	WebElement chkBoxGeoMarketBP;
	@FindBy(id = "254")
	WebElement chkBoxEmployeeAccompanied;
	@FindBy(id = "256")
	WebElement chkBoxOGUKRequired;
	@FindBy(id = "258")
	WebElement chkBoxTBScreeningrequired;
	@FindBy(id = "260")
	WebElement chkBoxTrainingHubrequired;

	@FindBy(id = "835")
	WebElement chkBoxAreaAL;
	@FindBy(id = "135")
	WebElement chkBoxEmployeeCategoryAL;
	@FindBy(id = "2")
	WebElement chkBoxAssignCountryAL;
	@FindBy(id = "2234")
	WebElement chkBoxGeoMarketAL;
	@FindBy(id = "5991")
	WebElement chkBoxBusinessAreaAL;
	@FindBy(id = "963")
	WebElement chkBoxJobSiteAL;
	@FindBy(id = "7177")
	WebElement chkBoxJobTitleAL;

	@FindBy(id = "946")
	WebElement chkBoxAreaKN;
	@FindBy(id = "3")
	WebElement chkBoxAssignCountryKN;
	@FindBy(id = "261")
	WebElement chkBoxSubsidiaryCompanyKN;
	@FindBy(id = "6081")
	WebElement chkBoxBusinessAreaKN;
	@FindBy(id = "1077")
	WebElement chkBoxJobSiteKN;
	@FindBy(id = "7125")
	WebElement chkBoxJobTitleKN;

	@FindBy(id = "524")
	WebElement chkBoxAreaMH;
	@FindBy(id = "1699")
	WebElement chkBoxGeoMarketMH;
	@FindBy(id = "5855")
	WebElement chkBoxBusinessAreaMH;

	@FindBy(id = "263")
	WebElement chkBoxAssignCountryMY;
	@FindBy(id = "4224")
	WebElement chkBoxJobTitleMY;
	@FindBy(id = "590")
	WebElement chkBoxJobSiteMY;
	@FindBy(id = "242")
	WebElement chkSituationMY;
	
	@FindBy(id = "selectAllSubsidiaryCompanies")
	WebElement selectAllChkboxMY;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement submit;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_companyMand")
	WebElement backgroundClick;
	
	public void clickNewTeamMemberLink() {
		clickNewTeamMemberLink.click();
	}

	public void setUserRole(String userrole) {
		Select dropUserRole = new Select(drpUserRole);
		dropUserRole.selectByVisibleText(userrole);

		/*
		 * if(userrole == "ISOS Admin" || userrole == "ISOS User" || userrole ==
		 * "ISOS Reviewer" || userrole == "Partner") { clickSubmit(); }
		 */

	}

	public void setUserName(String username) {
		txtUserName.sendKeys(username);
	}
	
	public void setADaccount(String ADaccount) {
		Select dropADAccount = new Select(drpADaccount);
		dropADAccount.selectByVisibleText(ADaccount);
	}
	
	public void chkboxSubsidiaryCompany() {
		selectAllChkboxMY.click();
	}

	public void setOwnerCompany(String ownerCompany) {
		this.OwnerComp = ownerCompany;
		if (!drpOwnerCompany.isEnabled()) {
			clickSubmit();
		} else {

			Select selectOwnerCompany = new Select(drpOwnerCompany);
			selectOwnerCompany.selectByVisibleText(ownerCompany);
			backgroundClick.click();
			WaitUtils.sleep(5);
		}
	}

	public void selectCheckBoxForAssignCountry(String string) {
		if (string.equalsIgnoreCase("Chief Recruiter") || string.equalsIgnoreCase("Client Reviewer") && OwnerComp.equalsIgnoreCase("Schlumberger"))
		 {
			System.out.println("I'm inside the block *****");
			chkBoxArea.click();
			chkBoxEmployeeCategory.click();
			chkBoxAssignCountry.click();
			chkBoxNationality.click();
			chkBoxGeoMarket.click();
			chkBoxBusinessAreaSBM.click();
			chkBoxJobSite.click();
			chkBoxJobTitle.click();
		}
		if (string.equalsIgnoreCase("Chief Recruiter") && OwnerComp.equalsIgnoreCase("Frontex")) {
			chkBoxEmployeeCategory.click();
			chkBoxAssignCountry.click();
			chkBoxNationality.click();
		}
		if (string.equalsIgnoreCase("Chief Recruiter")
				&& OwnerComp.equalsIgnoreCase("SBM International Personnel Services SA")) {
			chkBoxAreaSBM.click();
			chkBoxEmployeeCategorySBM.click();
			chkBoxAssignCountry.click();
			chkBoxNationality.click();
			chkBoxBusinessArea.click();
			chkBoxJobTitleSBM.click();
		}
		if (string.equalsIgnoreCase("Chief Recruiter") && OwnerComp.equalsIgnoreCase("BP International Limited")) {
			System.out.println("I'm inside the block &&&&&");
			chkBoxAreaBP.click();
			chkBoxEmployeeCategoryBP.click();
			chkBoxAssignCountryBP.click();
			chkBoxNationality.click();
			chkBoxGeoMarketBP.click();
			chkBoxEmployeeAccompanied.click();
			chkBoxOGUKRequired.click();
			chkBoxTBScreeningrequired.click();
			chkBoxTrainingHubrequired.click();
		}
		if (string.equalsIgnoreCase("Chief Recruiter") && OwnerComp.equalsIgnoreCase("Michelin")) {
			chkBoxAreaMH.click();
			chkBoxAssignCountry.click();
			chkBoxNationality.click();
			chkBoxGeoMarketMH.click();
			chkBoxBusinessAreaMH.click();
		}
		if (string.equalsIgnoreCase("Chief Recruiter") && OwnerComp.equalsIgnoreCase("MAINBY SA")) {
			chkBoxAssignCountryMY.click();
			chkBoxNationality.click();
			chkBoxJobSiteMY.click();
			chkBoxJobTitleMY.click();
			chkSituationMY.click();
		}
		if (string.equalsIgnoreCase("Chief Recruiter") && OwnerComp.equalsIgnoreCase("Air Liquide")) {
			chkBoxAreaAL.click();
			chkBoxEmployeeCategoryAL.click();
			chkBoxAssignCountryAL.click();
			chkBoxNationality.click();
			chkBoxGeoMarketAL.click();
			chkBoxBusinessAreaAL.click();
			chkBoxJobSiteAL.click();
			chkBoxJobTitleAL.click();
		}
		if (string.equalsIgnoreCase("Chief Recruiter") && OwnerComp.equalsIgnoreCase("Kinross")) {
			chkBoxAreaKN.click();
			chkBoxAssignCountryKN.click();
			chkBoxNationality.click();
			chkBoxBusinessAreaKN.click();
			chkBoxJobSiteKN.click();
			chkBoxJobTitleKN.click();
		}
		if (string.equalsIgnoreCase("Recruiter") && OwnerComp.equalsIgnoreCase("Schlumberger")) {
			System.out.println("No assignment country");
		}
		if (string.equalsIgnoreCase("Recruiter") && OwnerComp.equalsIgnoreCase("Frontex")) {
			System.out.println("No assignment country");
		}
		if (string.equalsIgnoreCase("Recruiter")
				&& OwnerComp.equalsIgnoreCase("SBM International Personnel Services SA")) {
			System.out.println("No assignment country");
		}
		if (string.equalsIgnoreCase("Recruiter") && OwnerComp.equalsIgnoreCase("BP International Limited")) {
			System.out.println("No assignment country");
		}
		if (string.equalsIgnoreCase("Recruiter") && OwnerComp.equalsIgnoreCase("Michelin")) {
			System.out.println("No assignment country");
		}
		if (string.equalsIgnoreCase("Recruiter") && OwnerComp.equalsIgnoreCase("MAINBY SA")) {
			System.out.println("No assignment country");
		}
		if (string.equalsIgnoreCase("Recruiter") && OwnerComp.equalsIgnoreCase("Air Liquide")) {
			System.out.println("No assignment country");
		}
		if (string.equalsIgnoreCase("Recruiter") && OwnerComp.equalsIgnoreCase("Kinross")) {
			System.out.println("No assignment country");
		}

		/*
		 * if (string.equalsIgnoreCase("Client Reviewer")) { chkBoxArea.click();
		 * chkBoxEmployeeCategory.click(); chkBoxAssignCountry.click();
		 * chkBoxNationality.click(); chkBoxGeoMarket.click();
		 * chkBoxBusinessArea.click(); chkBoxJobSite.click(); chkBoxJobTitle.click(); }
		 * if (string.equalsIgnoreCase("Local Doctor")) { chkBoxAssignCountry.click(); }
		 */

	}
	
	public void TMCreatedSuccessMsg() throws InterruptedException {
		WaitUtils.sleep(5);
		JavaScriptUtils.moveToElement(driver, pageTitle);
		String SuccessMsg = "has been successfully created in the system";
		String FailureMsg = "already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.contains(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}
	}


	public void clickSubmit() {
		submit.click();
	}

}
