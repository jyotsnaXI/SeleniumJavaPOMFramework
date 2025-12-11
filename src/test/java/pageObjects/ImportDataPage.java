package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

public class ImportDataPage extends TestBase {

	public WebDriver driver;

	public ImportDataPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

// Import Link	
	@FindBy(xpath = "//a[text()= 'Import Data']")
	WebElement ImportMenu;
	@FindBy(xpath = "//a[text()= 'Import']")
	WebElement ImportSubMenu;
	@FindBy(xpath = "//input[@id='ctl00_MedtrackContentPlaceHolder_btnBrowse']")
	WebElement ChooseFile;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnImport")
	WebElement btnImport;

	public void clickSubMenuImport() {
		Actions action = new Actions(driver);
		action.moveToElement(ImportMenu).perform();
		action.moveToElement(ImportSubMenu).click().perform();
	}

	public void clickBrowseBtn(){
		ChooseFile.click();
	}

	public void enterFilenameWithExt() {
		ChooseFile.sendKeys("C:\\Users\\Jyotsna.Gupta\\Downloads\\Logo-AirLiquide.png");
		//ChooseFileBtn.sendKeys("C:\\newhtml.html");
	}

	public void clickImportBtn() {
		btnImport.click();
	}

//Export Quest
	@FindBy(xpath = "//a[text()= 'Export Quest']")
	WebElement ExportQuestSubMenu;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnDownloadFile")
	WebElement btnDownloadFile;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnGenerateFile")
	WebElement btnGenerateFile;

	public void clickExportQuestSubMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(ImportMenu).perform();
		action.moveToElement(ExportQuestSubMenu).click().perform();
	}

	public void clickBtnDownloadFile() {
		btnDownloadFile.click();
	}

	public void clickBtnGenerateFile() {
		btnGenerateFile.click();
	}
}
