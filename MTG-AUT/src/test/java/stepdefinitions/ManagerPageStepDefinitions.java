package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.ManagerPage;
import page.ServiceDetailPage;

public class ManagerPageStepDefinitions extends BaseTest {
    private WebDriver driver;
    private ManagerPage managerPage;

    public ManagerPageStepDefinitions() {
        this.driver = getDriver(); 
        this.managerPage = new ManagerPage(driver);
    }

    @When("manager clicks button request")
    public void managerClicksButtonRequest() {
        managerPage.clickBtnTuNgay();
    }
    @When("manager clicks first request at request list")
    public void managerClicksFirstRequestAtRequestList() {
        managerPage.clickRequestList(1);
    }
    @When("manager clicks confirm button")
    public void userSelectsTheGraveOptionByValue() {
        managerPage.clickBtnXacNhan();
    }

} 