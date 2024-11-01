package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import core.BaseTest;
import page.CommonComponents;

public class CommonComponentsStepDefinitions extends BaseTest {
    private WebDriver driver;
    private CommonComponents commonComponents;

    public CommonComponentsStepDefinitions() {
        this.driver = getDriver(); 
        this.commonComponents = new CommonComponents(driver);
    }


    @Given("User enter the URL {string}")
    public void user_enter_the_url(String url) {
        BaseTest.getDriver().navigate().to(url);
    }

    @When("User clicks on Home Page")
    public void userClicksOnHomePage() {
        commonComponents.clickTrangChu(); 
    }

    @When("User clicks on Introduce")
    public void userClicksOnIntroduce() {
        commonComponents.clickGioiThieu(); 
    }

    @When("User clicks on Service")
    public void userClicksOnService() {
        commonComponents.clickDichVu(); 
    }

    @When("User clicks on Search Grave")
    public void userClicksOnSearchGrave() {
        commonComponents.clickTimKiemMo(); 
    }

    @When("User clicks on Contact")
    public void userClicksOnContact() {
        commonComponents.clickLienHe(); 
    }

    @When("User clicks on User Icon")
    public void userClicksOnUserIcon() {
        commonComponents.clickUserIcon(); 
    }

    @And("User clicks on Cart")
    public void userClicksOnCart() throws InterruptedException{
        commonComponents.clickGioHang();
        Thread.sleep(500);
    }

    @Then("User clicks Relative Grave")
    public void userClicksOnRelativeGrave() {
        commonComponents.clickMoNguoiThan();
    }

    @Then("User should see the profile section")
    public void userShouldSeeTheProfileSection() {
        
    }
}