package utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;
	//private static final String DRIVER_DIR = "src/test/resources/drivers";


	public WebDriver createDriver() {
		String browserName = ConfigPropertyReader.getConfig("BROWSER");
		switch (browserName) {
		case "firefox":
			return new FirefoxDriver();

		case "chrome":
			//set_OS_systemProperty();
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless"); // Enables headless mode
	        //options.addArguments("--disable-gpu"); // Disables GPU hardware acceleration
	        //options.addArguments("--window-size=1920,1080"); // Sets the window size
			this.driver = new ChromeDriver(options);
			profile_driver();
			return driver;

		default:
			throw new RuntimeException("Unsupported webdriver: " + browserName);
		}
	}
	
	public static String username() {
		String username = ConfigPropertyReader.getConfig("USERNAME");
		return username;
	}
	
	public static String password() {
		String password = ConfigPropertyReader.getConfig("PASSWORD");
		return password;
	}

	@SuppressWarnings("deprecation")
	private void profile_driver() {
		String medFitURL = ConfigPropertyReader.getConfig("URL");
		driver.manage().window().maximize();
       // driver.manage().window().setSize(new Dimension(1000, 1000)); // Adjust the height as needed
		driver.get(medFitURL);
		System.out.println("Med Fit URL Entered");

		driver.manage().timeouts().setScriptTimeout(
				Integer.parseInt(ConfigPropertyReader.getConfig("IMPLICIT_WAIT_TIMEOUTS")), TimeUnit.SECONDS);
	}
	
	public static void takeScreenshot(WebDriver driver, String screenshotName, boolean isFailed) {

    	try {
            String screenshotDir;
            if (isFailed) {
                screenshotDir = System.getProperty("user.dir") + File.separator + "FailedScreenshots";
            } else {
                screenshotDir = System.getProperty("user.dir") + File.separator + "PassedScreenshots";
            }

            // Ensure the directory exists, create it if it does not
            File directory = new File(screenshotDir);
            String tname = "screenshot_" + screenshotName + "_" + System.currentTimeMillis();

            if (!directory.exists()) {
                directory.mkdirs();  // Create directory if it doesn't exist
            }

            File targetFile = new File(screenshotDir + File.separator + tname + ".png");
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, targetFile);

            // Print the path where the screenshot is saved
            System.out.println("Screenshot saved to: " + targetFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error while saving the screenshot: " + e.getMessage());
        }
    }
	
	/*
	 * public static void captureScreen(WebDriver driver, String tname) throws
	 * IOException { TakesScreenshot ts = (TakesScreenshot) driver; File source =
	 * ts.getScreenshotAs(OutputType.FILE); File target = new
	 * File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	 * FileUtils.copyDirectory(source, target);
	 * System.out.println("Screenshot taken!"); }
	 */
}