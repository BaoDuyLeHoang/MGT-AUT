package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.LoginPage;
import core.BaseTest;

public class LoginPageStepDefinition extends BaseTest {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginPageStepDefinition() {
        this.driver = getDriver(); // Assuming you have a method to get the WebDriver instance
        this.loginPage = new LoginPage(driver);
    }

    @Given("User click on Menu")
    public void userClickOnMenu() {
        
    }

    @Given("User click on My Account Menu")
    public void userClickOnMyAccountMenu() {
        // Implement the logic to click on My Account Menu
    }

    @Given("User enter username {string}")
    public void userEnterUsername(String username) {
        loginPage.sendText(username);
    }

    @Given("User enter password {string}")
    public void userEnterPassword(String password) {
        loginPage.sendPassword(password);
    }

    @When("User click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User should see text {string}")
    public void userShouldSeeText(String expectedMessage) {
        
    }
}
