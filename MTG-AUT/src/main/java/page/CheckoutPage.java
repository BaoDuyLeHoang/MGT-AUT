package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "input[type='radio']")
    private List<WebElement> paymentMethodList;

    @FindBy(how = How.CLASS_NAME, using = "form-control")
    private WebElement dateInput;

    @FindBy(how = How.CLASS_NAME, using = "checkout-button")
    private WebElement checkoutBtn;


    public void getPaymentMethod(int index) {
        if (index >= 0 && index < paymentMethodList.size()) {
            WebElement payment = paymentMethodList.get(index);
            this.isElementVisibility(payment);
            payment.click();
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds for paymentMethodList");
        }
    }

    public void getTextPaymentMethod(String input) {
        if(input.contains("Thanh toán tiền mặt")){
            input = "cash";
        }
        for (WebElement payment : paymentMethodList) {
            String methodText = payment.getAttribute("value");
            if (methodText.contains(input)) {
                payment.click();
            }
        }
    }

    public void sendDateValue(String date) {
        dateInput.clear();
        dateInput.sendKeys(date);
    }

    public void clickCheckoutButton() {
        clickElement(checkoutBtn);
    }
}
