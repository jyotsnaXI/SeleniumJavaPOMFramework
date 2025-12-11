package utils;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ActionUtils extends TestBase {

	WebDriver driver;

	public ActionUtils(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static String generateRandomString() {
		String lastName = RandomStringUtils.randomAlphabetic(3);
		return lastName;
	}
	
	public static int generateRandomNumber() {
		Random random = new Random();   
		 // Generate random integers in range 0 to 9999
        int randomNumber = random.nextInt(10000);
        return randomNumber;
	}

}
