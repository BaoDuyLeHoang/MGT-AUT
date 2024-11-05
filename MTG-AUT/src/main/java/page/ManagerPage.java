package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ManagerPage extends BasePage {
    public ManagerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "search-input")
    private WebElement searchFeedback;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Từ ngày']")
    private WebElement startDateFeedback;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Đến ngày']")
    private WebElement endDateFeedback;

    @FindBy(how = How.CLASS_NAME, using = "detail-button")
    private WebElement detailFeedbackBtn;


}
