package stepdefinitions;

import core.DataProviderUtils;
import core.ExcelUtils;
import core.TestListener;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import core.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.LoginPage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class LoginPageStepDefinitions extends BaseTest {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginPageStepDefinitions() {
        this.driver = getDriver();
        this.loginPage = new LoginPage(driver);
    }

    @When("user enters username {string}")
    public void userEntersUsername(String username) {
        loginPage.sendText(username);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        loginPage.sendPassword(password);
    }

    @And("user clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {
        loginPage.isNotificationDisplay();
    }

    @When("user clicks on forgot password link")
    public void userClicksOnForgotPasswordLink() {
        loginPage.clickForgotPassword();
    }


    @When("user login with customer")
    public void userLoginWithCustomer() throws IOException {
        loginPage.loginWithData("data/LoginWithCustomer1.xlsx");
    }
    @When("user login with staff")
    public void userLoginWithStaff() throws IOException {
        loginPage.loginWithData("data/LoginWithStaff.xlsx");
    }
    @When("user login with manager")
    public void userLoginWithManager() throws IOException {
        loginPage.loginWithData("data/LoginWithManager.xlsx");
    }
    @When("user login with admin")
    public void userLoginWithAdmin() throws IOException {
        loginPage.loginWithData("data/LoginWithAdmin.xlsx");
    }

    @Then("User should see the dashboard")
    public void userShouldSeeTheDashboard() {
    }

}
