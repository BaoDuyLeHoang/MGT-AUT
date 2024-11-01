package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import core.BaseTest;
import page.ServiceDetailPage;

public class ServiceDetailPageDefinitions extends BaseTest {
    private WebDriver driver;
    private ServiceDetailPage serviceDetailPage;

    public ServiceDetailPageDefinitions() {
        this.driver = getDriver(); 
        this.serviceDetailPage = new ServiceDetailPage(driver);
    }

    @When("User selects the grave option by value {string}")
    public void userSelectsTheGraveOptionByValue(String value) {
        serviceDetailPage.selectGraveOption(value); 
    }

    @When("User selects the grave option by text {string}")
    public void userSelectsTheGraveOptionByText(String text) {
        serviceDetailPage.selectGraveOptionByText(text); 
    }

    @When("User selects the grave option by index {int}")
    public void userSelectsTheGraveOptionByIndex(int index) {
        serviceDetailPage.selectGraveOptionByIndex(index); 
    }

    @When("User clicks the Add to Cart button")
    public void userClicksTheAddToCartButton() {
        serviceDetailPage.clickAddButton(); 
    }

} 