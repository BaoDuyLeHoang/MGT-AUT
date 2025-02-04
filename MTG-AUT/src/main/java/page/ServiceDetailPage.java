package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.BasePage;

public class ServiceDetailPage extends BasePage {
    
    

    public ServiceDetailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this); // Initialize the PageFactory
    }

    @FindBy(how = How.CLASS_NAME, using = "grave-select")
    private WebElement graveSelect; // Locate the select element

    @FindBy(how = How.CLASS_NAME, using = "add-to-cart")
    private WebElement btnAdd; // Locate the select element

    @FindBy(how = How.CSS, using = ".MuiAlert-message.css-1pxa9xg-MuiAlert-message")
    private WebElement thongBao;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Xác nhận dịch vụ')]")
    private WebElement btnXacNhanDichVu;
    public void clickBtnXacNhanDichVuCustomer(){
        clickElement(btnXacNhanDichVu);
    }

    public void isThongBaoDisplayed(){
        this.isElementVisibility(thongBao,500);
    }

    // Method to select an option by value
    public void selectGraveOption(String value) {
        Select select = new Select(graveSelect); // Create a Select object
        select.selectByValue(value); // Select the option by value
    }

    // Optionally, you can add a method to select by visible text
    public void selectGraveOptionByText(String text) {
        Select select = new Select(graveSelect);
        select.selectByVisibleText(text); // Select the option by visible text
    }

    // Method to select an option by index
    public void selectGraveOptionByIndex(int index) {
        Select select = new Select(graveSelect);
        select.selectByIndex(index); // Select the option by index
    }

    public void clickAddButton(){
        clickElement(btnAdd);
    }

}
