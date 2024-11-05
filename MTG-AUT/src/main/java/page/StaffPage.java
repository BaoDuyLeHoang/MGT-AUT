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

    @FindBy(how = How.XPATH, using = "//button[text()='Tất cả']")
    private WebElement allTask;

    @FindBy(how = How.XPATH, using = "//button[text()='Đã hoàn thành']")
    private WebElement taskComplete;

    @FindBy(how = How.XPATH, using = "//button[text()='Chưa hoàn thành']")
    private WebElement taskImcomplete;

    @FindBy(how = How.CSS, using = "input[type='text'][0]")
    private List<WebElement> dateList;

    public void sendDate(String startDate, String endDate){
        for(WebElement date : dateList){

        }
    }
}
