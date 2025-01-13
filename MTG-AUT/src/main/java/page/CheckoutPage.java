package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "paymentMethod")
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
            input = "balance";
        }
        for (WebElement payment : paymentMethodList) {
            String methodText = payment.getAttribute("value");
            if (methodText.contains(input)) {
                scrollToTopPage();
                clickElement(payment);
            }
        }
    }

    public void sendDateValue(String date) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dateInput));
        dateInput.clear();
        dateInput.sendKeys(date);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickCheckoutButton() {
        clickElement(checkoutBtn);
    }
}
