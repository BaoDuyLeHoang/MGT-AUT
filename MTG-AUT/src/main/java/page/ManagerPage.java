package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.NoSuchElementException;

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

    @FindBy(how = How.XPATH, using = "//div[@class='blog-manager-table-container']")
    WebElement blogList;

    public void clickBlogList(int index, String action) {
        try {
            List<WebElement> buttons = blogList.findElements(By.xpath(".//tr[" + index + "]//button"));

            for (WebElement button : buttons) {
                if (button.getText().equals(action)) {
                    this.isElementVisibility(button);
                    button.click();
                    return;
                }
            }

        } catch (NoSuchElementException e) {
            System.out.println("No element found at the specified index.");
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Index out of bounds for blogList");
        }
    }



}
