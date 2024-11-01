package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import core.BaseTest;
import page.CartPage;

public class CartPageDefinitions extends BaseTest {
    private WebDriver driver;
    private CartPage cartPage;

    public CartPageDefinitions() {
        this.driver = getDriver();
        this.cartPage = new CartPage(driver);
    }

    @When("User clicks the Select All checkbox")
    public void userClicksTheSelectAllCheckbox() {
        cartPage.clickSelectAllCheckbox();
    }

    @When("User clicks the Payment button")
    public void userClicksThePaymentButton() {
        cartPage.clickPaymentButton();
    }

    @When("User selects the cart item at index {int}")
    public void userSelectsTheCartItemAtIndex(int index) {
        cartPage.getCartItems(index);
    }

    @Then("User should see the cart items")
    public void userShouldSeeTheCartItems() {
        
    }
    @Then("User should see the payment options")
    public void userShouldSeeThePaymentOptions() {
        
    }
} 