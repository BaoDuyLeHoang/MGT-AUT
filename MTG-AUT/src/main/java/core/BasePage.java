package core;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

	protected WebDriver driver;
	private WebDriverWait wait;
	private WebDriverWait waitWithSpecificTimeout;


	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT));
		waitWithSpecificTimeout = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT));
		PageFactory.initElements(driver, this);
	}

	public boolean isElementVisibility(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (TimeoutException ex) {
			return false;
		}
	}

	public boolean isElementVisibility(WebElement element, int timeout) {
		// chờ với thời gian truyền vào (giay)
		waitWithSpecificTimeout = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			waitWithSpecificTimeout.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (TimeoutException ex) {
			return false;
		}
	}


	public void navigateToPage(String subURL) {
		driver.navigate().to(Constants.BASEURL + "/" + subURL);
	}

	public void navigateToPage() {
		driver.navigate().to(Constants.BASEURL);
	}

	public void enterText(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}

	public void clickElement(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public String getText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}
}
