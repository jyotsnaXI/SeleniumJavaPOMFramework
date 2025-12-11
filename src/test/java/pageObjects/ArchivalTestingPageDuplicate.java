package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DatabaseUtil;
import utils.TestBase;
import utils.WaitUtils;

public class ArchivalTestingPageDuplicate extends TestBase {

	WebDriver driver;
	DatabaseUtil dbUtil;


	public ArchivalTestingPageDuplicate(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtFirstName")
	WebElement FirstName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtLastName")
	WebElement LastName;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtGinNumber")
	WebElement ginNumber;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpCompany;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement SearchButton;
	
	@FindBy(xpath = "//a[@id='ctl00_MedtrackContentPlaceHolder_gdvSearchResult_ctl01_litEmployeeGIN']")
	WebElement ginColumnHeader;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtUserName")
	WebElement userName;
	
	@FindBy(xpath = "//a[@id='ctl00_MedtrackContentPlaceHolder_gdvSearchUser_ctl01_lnkUserRole']")
	WebElement userRoleHeader;
	
	@FindBy(id = "searchHeading")
	WebElement SearchResults;
	
	@FindBy(id = "details-button")
	WebElement advancedButton;
	
	@FindBy(xpath = "//a[@id=\"proceed-link\"]")
	WebElement proceedLink;
	
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
	
	public void setUsername(String username) {
		userName.clear();
		userName.sendKeys(username);
	}

	public void clickSearch() {
		SearchButton.click();
	}
	
	public void clickAdvanceBtn() {
		advancedButton.click();
	}
	
	public void clickProceedLink() {
		proceedLink.click();
	}
	
	public void showSearchCount() throws InterruptedException {

	//	Boolean tableExists = JavaScriptUtils.isTablePresent(driver, By.id("ctl00_MedtrackContentPlaceHolder_gdvSearchResult"));
		
		 WebElement table = null;
         try 
         {
             table = driver.findElement(By.id("ctl00_MedtrackContentPlaceHolder_gdvSearchResult"));
         } 
         catch(Exception e)
         {
             // If the table is not found within the wait time, we assume no results
        	 WebElement notification = driver.findElement(By.xpath("//div[@class='InformationBg']"));
             System.out.println("Notification message :  " + notification.getText() + ginNumber.getText());
             takeScreenshot(driver, "Table not found", true); 
             
            // WebElement notification = driver.findElement(By.xpath("//div[@class='ErrorBg']"));
            // System.out.println("Notification message: " + notification.getText());
         }

         // If table exists, check for rows
         if (table != null) {
             // Check if there are rows in the table (excluding the header row)
             java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
             
             if (rows.size() <= 1) 
             { 
                 System.out.println("There are no employees available for the search performed - " + ginNumber.getText());
                 takeScreenshot(driver, "No employee found", true); 
             } 
             else 
             {
                 System.out.println("Employees found: " + (rows.size() - 1)); // Exclude the header row
                 takeScreenshot(driver, "Employee found", false); 
             }
         } 
         else 
         {
             System.out.println("Table does not exist on the page.");
         }
     } 
	

	public void clickGinColumnHeader(String GIN) throws IOException {
	    WebElement table;
	    List<WebElement> rows;
	    boolean ginFound = false; // Set initial state to false
	    int maxRowsToCheck = 3; // Limit the number of rows to check
	    String ActualGIN = GIN.replace(".0", "");

	    // Locate the table element and handle the case where it's not found
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Increased wait time to 10 seconds
	        table = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_MedtrackContentPlaceHolder_gdvSearchResult")));
	    } catch (Exception e) {
	        System.out.println("Table not found.");
	        
	        handleNoResultsFound(ActualGIN);
	        return; // Exit the method as no results are found
	    }

	    // Continue only if table is found
	    if (table != null) {
	        rows = table.findElements(By.xpath(".//tbody/tr"));
	        System.out.println("Number of rows found: " + rows.size());

	        // If no rows are found (or only header row), output a message
	        if (rows.size() <= 1) {
	            System.out.println("No Employees found for GIN: " + ActualGIN);
	            return;
	        }

	        // Click the GIN column header to sort or trigger any action (if needed)
	        WebElement ginColumnHeader = driver.findElement(By.xpath("//a[@id='ctl00_MedtrackContentPlaceHolder_gdvSearchResult_ctl01_litEmployeeGIN']"));
	        ginColumnHeader.click();

	        // Try to find the GIN number within the limited rows
	        try {
	            // Re-locate the table and rows to handle stale element references
	            table = driver.findElement(By.id("ctl00_MedtrackContentPlaceHolder_gdvSearchResult"));
	            rows = table.findElements(By.xpath(".//tbody/tr"));

	            // Limit the number of rows to check to avoid unnecessary looping
	            ginFound = searchForGinInRows(rows, ActualGIN, maxRowsToCheck);

	            if (ginFound) {
	                System.out.println("Success: Exact GIN number found: " + ActualGIN);
	               // ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '60%';");
	              //  takeScreenshot(driver, ActualGIN); // Capture the screenshot after success
	               // takeScreenshot(driver, "success", false);
	            }

	        } catch (Exception e) {
	            System.out.println("Error locating or processing rows: " + e.getMessage());
	        }

	        // If GIN is not found after the first attempt
	        if (!ginFound) {
	            System.out.println("Failed: Exact GIN could not be found: " + ActualGIN);
	            takeScreenshot(driver, "Failed", true); // Capture the screenshot after failure
	        }

	        // Print the number of employees found (excluding the header row)
	        System.out.println("Employees found: " + (rows.size() - 1)); // Exclude header row
	    }
	}

	// Method to search for the exact GIN in the table rows
	public boolean searchForGinInRows(List<WebElement> rows, String gin, int maxRowsToCheck) {
	    // Check if rows are not empty
	    if (rows == null || rows.size() <= 1) {
	        System.out.println("Error: No rows found to search or only header row present.");
	        return false; // No rows to search (or only header row)
	    }

	    // Limit the search to the specified number of rows
	    int rowsToCheck = Math.min(rows.size(), maxRowsToCheck + 1); // Add 1 to account for header row

	    // Start from the second row to skip the first header row
	    for (int i = 1; i < rowsToCheck; i++) 
	    {  // Start from index 1 to skip the first row (header)
	        WebElement row = rows.get(i);

	        // Skip if the row is null
	        if (row == null) {
	            System.out.println("Skipping null row at index: " + i);
	            continue; // Skip null rows
	        }

	        // Attempt to find td elements in the row, handle potential errors gracefully
	        List<WebElement> columns = new ArrayList<>();
	        try {
	            columns = row.findElements(By.tagName("td"));
	        } catch (Exception e) {
	            // Log more information about the row's structure if error occurs
	            System.out.println("Error finding columns in row at index " + i);
	            if (row != null) {
	                // Adding a safe check to ensure that we're not calling getText() on null rows
	                try {
	                    System.out.println("Row content: " + row.getText());
	                } catch (Exception ex) {
	                    System.out.println("Error accessing row text at index " + i);
	                }
	            } 
	            continue; // Skip this row if there's an error accessing its columns
	        }

	        // If the row has no 'td' elements, it might be an invalid row (e.g., an empty row or header row)
	        if (columns.isEmpty()) {
	            System.out.println("Skipping row with no 'td' elements at index " + i + ": " + (row != null ? row.getText() : "N/A"));
	            continue; // Skip rows without 'td' elements
	        }

	        // Check the second column (index 1) in the row to find a match
	        
	      //  if (columns.size() > 3) { // Ensure there is a second column
	        	for(WebElement column: columns) {
	        		//if (columns.size() > 3) 
	             column = columns.get(3);
	            String cellText = column.getText().trim(); // Get the text from the cell and remove leading/trailing whitespace
	            System.out.println("Comparing cell text: '" + cellText + "' with GIN: '" + gin + "'"); // Debugging line

	            // Normalize both cellText and gin for comparison
	            String normalizedCellText = cellText.replaceAll("\\s+", "").toLowerCase(); // Remove extra spaces and convert to lowercase
	            String normalizedGin = gin.replaceAll("\\s+", "").toLowerCase(); // Remove extra spaces and convert to lowercase
	        
	            // Compare normalized values
	            if (normalizedCellText.equals(normalizedGin)) {
	                System.out.println("Found exact GIN: " + gin);
	                return true; // GIN found
	            }
	            break;
	        }
	        	break;
			/*
			 * } else { System.out.println("Row at index " + i +
			 * " does not have a second column."); }
			 */
	        
	    }

	    System.out.println("GIN not found in any row.");
	    return false; // GIN not found
	}




	/**
	 * Method to handle the case when no results are found in the table
	 */
	private void handleNoResultsFound(String gin) throws IOException {
	    WebElement notification = driver.findElement(By.xpath("//div[@class='InformationBg']"));
	    System.out.println("Notification message: " + notification.getText() + " - " + gin);
	    WaitUtils.sleep(2); // Optional wait before screenshot
	    takeScreenshot(driver, "Table not found", true);
	}
	
	public void clickUsernameColumnHeader(String username) throws IOException {
		 boolean userfound = false;
		 WebElement table = null;
        try 
        {
       	 table = driver.findElement(By.id("ctl00_MedtrackContentPlaceHolder_gdvSearchUser"));
        } 
        catch(Exception e)
        {
            // If the table is not found within the wait time, we assume no results
        	WebElement notification = driver.findElement(By.xpath("//div[@class='InformationBg']"));
            System.out.println("Notification message :  " + notification.getText());
            WaitUtils.sleep(2);
            takeScreenshot(driver, "Table not found", true);
            
           // WebElement notification = driver.findElement(By.xpath("//div[@class='ErrorBg']"));
           // System.out.println("Notification message: " + notification.getText());
        }
		
			if (table != null) {
           
			List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
           
           if (rows.size() <= 1) 
           { 
           	System.out.println("No Employees found: ");
           	takeScreenshot(driver, "Table not found", true);
           }
           else 
           {		
           		userRoleHeader.click();
           		//takeScreenshot(driver, username);
           		//System.out.println("Clicked on User Role Header");
           		
           	 if (userfound) 
           	 {
 	            System.out.println("Success: Exact GIN number found: " + username);
 	           takeScreenshot(driver, "Exact GIN found", false); // Capture the screenshot after success
 	         } 
 	        // Print the number of employees found (excluding the header row)
 	      //  System.out.println("Employees found: " + (rows.size() - 1)); // Exclude header row
           	}                               
           
       } 
		
	}

}


