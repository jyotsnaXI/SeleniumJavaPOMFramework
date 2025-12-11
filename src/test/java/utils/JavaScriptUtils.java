package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptUtils {

	WebDriver driver;

	public JavaScriptUtils(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void moveToElement(WebDriver driver, WebElement element) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void scrollDown(WebDriver driver) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,385)", "");
	}

	public static void scrollUp(WebDriver driver, WebElement element) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println("Scrol Up to the element **");
	}

	public static void javaScript_Click(WebDriver driver, WebElement element) {
		// WaitUtils.waitForPageLoad(driver);
		// WaitUtils.waitForLoaderToDisappear(driver);
		// WaitUtils.waitForElementLoad(driver, element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		WaitUtils.sleep(1);
		executor.executeScript("arguments[0].click();", element);
	}

	public WebElement get_dashboard_link_element(String linkText) {
		String xpath_text = "//*[text()='" + linkText.trim() + "']";
		WaitUtils.waitForElementVisible(driver, driver.findElement(By.xpath(xpath_text)));
		return driver.findElement(By.xpath(xpath_text));
		
	}

	public void click_dashboard_menu_link(String linkText) {
		JavaScriptUtils.javaScript_Click(driver, get_dashboard_link_element(linkText));
		// WaitUtils.waitForElementLoad(driver, get_dashboard_link_element(linkText));
		// get_dashboard_link_element(linkText);

	}
	
	public static boolean isTablePresent(WebDriver driver, By locator) {
        try {
            WebElement table = driver.findElement(locator);
            return table.isDisplayed(); // Returns true if the table is visible
        } catch (Exception e) {
            return false; // Return false if the table is not found
        }
    }

}
