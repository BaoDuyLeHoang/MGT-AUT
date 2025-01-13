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

    @When("user clicks the Select All checkbox")
    public void userClicksTheSelectAllCheckbox() {
        cartPage.scrollToTopPage();
        cartPage.clickSelectAllCheckbox();
    }

    @When("user clicks the Payment button")
    public void userClicksThePaymentButton()throws InterruptedException{
        cartPage.clickPaymentButton();
        Thread.sleep(500);
    }

    @When("user selects the cart item at index {int}")
    public void userSelectsTheCartItemAtIndex(int index) {
        cartPage.getCartItems(index);
    }

    @Then("user should see the cart items")
    public void userShouldSeeTheCartItems() {
        
    }
    @Then("user should see the payment options")
    public void userShouldSeeThePaymentOptions() {
        
    }
} 