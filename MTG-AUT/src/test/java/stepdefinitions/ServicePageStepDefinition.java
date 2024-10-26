package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.ServicePage;
import core.BaseTest;

import static org.junit.Assert.assertTrue;

public class ServicePageStepDefinition extends BaseTest {
    private WebDriver driver;
    private ServicePage servicePage;

    public ServicePageStepDefinition() {
        this.driver = getDriver(); // Assuming you have a method to get the WebDriver instance
        this.servicePage = new ServicePage(driver);
    }

    @When("User clicks on the service titled {string}")
    public void userClicksOnTheServiceTitled(String serviceTitle) {

    }

    
}
