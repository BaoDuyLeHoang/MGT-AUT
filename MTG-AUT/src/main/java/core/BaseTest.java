package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	private static WebDriver driver;

	@BeforeMethod
	public static void beforeMethod() {
		// Set up the WebDriver using Chrome
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();
	}

	@AfterMethod
	public static void afterSuite() {
		//Đóng driver sau khi test kết thúc
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
