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


    @Given("user enter the URL {string}")
    public void user_enter_the_url(String url) {
        BaseTest.getDriver().navigate().to(url);
    }

    @When("user clicks on Home Page")
    public void userClicksOnHomePage() {
        commonComponents.clickTrangChu(); 
    }

    @When("user clicks on Introduce")
    public void userClicksOnIntroduce() {
        commonComponents.clickGioiThieu(); 
    }

    @When("user clicks on Service")
    public void userClicksOnService() {
        commonComponents.clickDichVu(); 
    }

    @When("user clicks on Search Grave")
    public void userClicksOnSearchGrave() {
        commonComponents.clickTimKiemMo(); 
    }

    @When("user clicks on Contact")
    public void userClicksOnContact() {
        commonComponents.clickLienHe(); 
    }

    @When("user clicks on User Icon")
    public void userClicksOnUserIcon() {
        commonComponents.clickUserIcon(); 
    }

    @When("user clicks on Specail Request")
    public void userClicksOnSpecialRequest() {
        commonComponents.clickYeuCauKhachHang();
    }

    @When("user clicks on Cart")
    public void userClicksOnCart() throws InterruptedException{
        Thread.sleep(1000);
        commonComponents.clickGioHang();
        Thread.sleep(500);
    }


    @And("user clicks Relative Grave")
    public void userClicksOnRelativeGrave() {
        commonComponents.clickUserIcon();
        commonComponents.clickMoNguoiThan();
    }

    @And("user clicks wallet")
    public void userClicksOnWallet() {
        commonComponents.clickUserIcon();
        commonComponents.clickViCuaToi();
    }
    @And("staff clicks grave report")
    public void staffClicksGraveReport() {
        commonComponents.clickBaoCaoMoStaff();

    }
    @And("user checks notification")
    public void userChecksNotification() throws InterruptedException {
        commonComponents.clickThongBaoCustomer();
        commonComponents.clickThongBaoDauTienCustomer();
    }

    @Then("the success message {string} should be displayed")
    public void theSuccessMessageShouldBeDisplayed(String expectedMessage) {
        commonComponents.verifySuccessMessage(expectedMessage);
    }

}