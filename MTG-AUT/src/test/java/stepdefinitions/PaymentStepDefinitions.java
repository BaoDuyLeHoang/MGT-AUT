package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.Payments;
import page.SearchPage;

import java.io.IOException;

public class PaymentStepDefinitions extends BaseTest {
    private Payments payments;
    private WebDriver driver;

    public PaymentStepDefinitions() {
        this.driver = getDriver();
        this.payments = new Payments(driver);
    }

    @Then("user pays the order {string}")
    public void userPayTheOrder(String payment) throws InterruptedException {
        if(payment.equals("VNPay")){
            payments.clickTheNoiDia();
            payments.clickNCB();
            payments.paymentWithData("data/PaymentWithData.xlsx");
        }
        Thread.sleep(5000);
    }

    @And("user inputs number of money into wallet {string}")
    public void userInputNumberOfMoney(String money) throws InterruptedException {
        payments.inputSoTienNap(money);
    }
    @And("user clicks VNPay button")
    public void userClicksVNPayButton() throws InterruptedException {
        payments.clickVNPayPayment();
    }

    @Then("user clicks deposit button")
    public void userClicksDepositButton() throws InterruptedException {
        payments.clickBtnNapTien();
    }




}
