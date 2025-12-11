package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    private static final int DEFAULT_TIMEOUT = 10;

    // Waits for the page to fully load
    public static void waitForPageLoad(WebDriver driver) {
        waitForDOMLoad(driver);
        waitForJQueryLoad(driver);
        waitForLoaderToDisappear(driver);
    }

    // Waits until the element is clickable
    public static void waitForElementToBeClickable(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
            .until(ExpectedConditions.elementToBeClickable(element));
    }

    // Waits until the element is visible
    public static void waitForElementVisible(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
            .until(ExpectedConditions.visibilityOf(element));
    }

    // Simple sleep utility (use only when necessary)
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Waits for jQuery AJAX calls to complete
    private static void waitForJQueryLoad(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT)).until(
                webDriver -> (Boolean) js.executeScript("return window.jQuery != undefined && jQuery.active === 0")
            );
        } catch (Exception ignored) {}
    }

    // Waits for the DOM to be in 'complete' state
    private static void waitForDOMLoad(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT)).until(
                webDriver -> js.executeScript("return document.readyState").equals("complete")
            );
        } catch (Exception ignored) {}
    }

    // Waits for loading indicators (e.g., GIFs) to disappear
    public static void waitForLoaderToDisappear(WebDriver driver) {
        for (int i = 0; i < DEFAULT_TIMEOUT; i++) {
            List<WebElement> loaders = driver.findElements(By.xpath("//img[contains(@src,'gif')]"));
            if (loaders.isEmpty()) break;
            sleep(1);
        }
    }
}
