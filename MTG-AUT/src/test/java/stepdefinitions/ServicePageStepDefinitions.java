package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import core.BaseTest;
import page.ServicePage;

public class ServicePageStepDefinitions extends BaseTest {
    private WebDriver driver;
    private ServicePage servicePage;

    public ServicePageStepDefinitions() {
        this.driver = getDriver();
        this.servicePage = new ServicePage(driver);
    }

    @When("user selects the service at index {int}")
    public void userSelectsTheServiceAtIndex(int index) {
        servicePage.getService(index);
    }

    @Then("user selects the service by category at index {int}")
    public void userSelectsTheServiceByCategoryAtIndex(int index) {
        servicePage.getDichVuTheoTheLoai(index);
    }

    @When("user selects the service by name {string}")
    public void userSelectsTheServiceByName(String name) {
        servicePage.getServiceByName(name);
    }
}