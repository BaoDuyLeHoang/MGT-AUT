package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class StaffPage extends BasePage {
    public StaffPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "blog-mgmt-create-button")
    private WebElement createBlogButton;

    @FindBy(how = How.XPATH, using = "//div[@class='blog-mgmt-filter']/select")
    private WebElement blogStatusSelector;

    @FindBy(how = How.CSS, using = "action-button.edit")
    private WebElement editButton;

    @FindBy(how = How.XPATH, using = "//button[text()='Tất cả']")
    private WebElement allTask;

    @FindBy(how = How.XPATH, using = "//button[text()='Đã hoàn thành']")
    private WebElement taskComplete;

    @FindBy(how = How.XPATH, using = "//button[text()='Chưa hoàn thành']")
    private WebElement taskImcomplete;


}
