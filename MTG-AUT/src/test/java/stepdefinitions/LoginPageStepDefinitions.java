package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import core.BaseTest;
import page.LoginPage;

public class LoginPageStepDefinitions extends BaseTest {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginPageStepDefinitions() {
        this.driver = getDriver(); // Assuming you have a method to get the WebDriver instance
        this.loginPage = new LoginPage(driver);
    }


    @When("User enters username {string}")
    public void userEntersUsername(String username) {
        loginPage.sendText(username); // Call the method to enter the username
    }

    @And("User enters password {string}")
    public void userEntersPassword(String password) {
        loginPage.sendPassword(password); // Call the method to enter the password
    }

    @And("User clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.clickLoginButton(); // Call the method to click the login button
    }

    @Then("User should see an error message")
    public void userShouldSeeAnErrorMessage() {

    }

    @When("User clicks on forgot password link")
    public void userClicksOnForgotPasswordLink() {
        loginPage.clickForgotPassword();
    }
}
