package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "cart-page-select-all")
    private WebElement selectAllCheckbox;

    @FindBy(how = How.CLASS_NAME, using = "cart-page-payment-btn")
    private WebElement paymentBtn;

    @FindBy(how = How.CLASS_NAME, using = "cart-page-item-checkbox")
    List<WebElement> itemList;

    public void clickSelectAllCheckbox(){

        if(!selectAllCheckbox.isSelected()){
            clickElement(selectAllCheckbox);
        }
    }
    public void clickPaymentButton(){
        clickElement(paymentBtn);
    }
    public void getCartItems(int index) {
        if (index >= 0 && index < itemList.size()) {
            WebElement service = itemList.get(index);
            this.isElementVisibility(service);
            service.click();
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds for itemList");
        }
    }



}
