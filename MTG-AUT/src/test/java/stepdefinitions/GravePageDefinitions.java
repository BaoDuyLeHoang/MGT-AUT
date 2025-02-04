package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import core.BaseTest;
import page.GraveDetail;
import page.RelativeGrave;

public class GravePageDefinitions extends BaseTest {
    private WebDriver driver;
    private GraveDetail graveDetail;
    private RelativeGrave relativeGrave;

    public GravePageDefinitions() {
        this.driver = getDriver();
        this.graveDetail = new GraveDetail(driver);
        this.relativeGrave = new RelativeGrave(driver);
    }

    @And("user clicks the Book Service button")
    public void userClicksTheBookServiceButton() {
        graveDetail.clickBookService();
    }

    @Then("user clicks the Grave details button")
    public void userClicksGraveDetailsButton() {
        relativeGrave.clickChiTiet();
    }

    @Then("user should see {string} of grave")
    public void userShouldSeeNameOfGraveSelected(String name) {
        Assert.assertTrue(graveDetail.checkNameGrave(name));
    }
    @And("user clicks the button create new special request")
    public void userClickCreateNewSpecailRequest() {
        relativeGrave.clickTaoYeuCauMoi();
    }
    @And("user selects martyr name {string}")
    public void userSelectMartyrName(String name) {
        relativeGrave.clickMoNguoiThan(name);
    }
    @And("user selects type of request {string}")
    public void userSelectTypeRequest(String type) {
        relativeGrave.clickLoaiYeuCau(type);
    }
    @And("user selects service of request {string}")
    public void userSelectServiceRequest(String service) {
        relativeGrave.clickDichVu(service);
    }
    @And("user selects date complete {string}")
    public void userSelectDateComplete(String date) {
        relativeGrave.clickNgayHoanThanh(date);
    }
    @And("user inputs note of request {string}")
    public void userInputNoteFor(String note) {
        relativeGrave.inputNote(note);
    }
    @Then("user clicks button to send special request")
    public void userClicksSendSpecialRequest() throws InterruptedException {
        relativeGrave.clickGuiYeuCau();
    }
} 