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

    @When("User selects the payment method at index {int}")
    public void userSelectsThePaymentMethod(int index) {
        checkoutPage.getPaymentMethod(index);
    }

    @When("User selects {string} Payment button")
    public void userSelectsThePaymentMethodWithName(String input) {
        checkoutPage.getTextPaymentMethod(input);
    }

    @When("User enters the date {string}")
    public void userEntersTheDate(String date) {
        checkoutPage.sendDateValue(date);
    }

    @When("User clicks the Checkout button")
    public void userClicksTheCheckoutButton() {
        checkoutPage.clickCheckoutButton();
    }

    @Then("User should see the confirmation message")
    public void userShouldSeeTheConfirmationMessage() {
        
    }
} 