package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import core.BaseTest;
import page.CheckoutPage;

public class CheckoutPageDefinitions extends BaseTest {
    private WebDriver driver;
    private CheckoutPage checkoutPage;

    public CheckoutPageDefinitions() {
        this.driver = getDriver();
        this.checkoutPage = new CheckoutPage(driver);
    }

    @When("user selects the payment method at index {int}")
    public void userSelectsThePaymentMethod(int index) {
        checkoutPage.getPaymentMethod(index);
    }

    @When("user selects {string} Payment button")
    public void userSelectsThePaymentMethodWithName(String input) {
        checkoutPage.getTextPaymentMethod(input);
    }

    @When("user enters the date {string}")
    public void userEntersTheDate(String date) {
        checkoutPage.sendDateValue(date);
    }

    @When("user clicks the Checkout button")
    public void userClicksTheCheckoutButton() {
        checkoutPage.clickCheckoutButton();
    }

    @Then("user should see the confirmation message")
    public void userShouldSeeTheConfirmationMessage() {
        
    }
} 