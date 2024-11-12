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
    private RelativeGrave grave;

    public GravePageDefinitions() {
        this.driver = getDriver();
        this.graveDetail = new GraveDetail(driver);
        this.grave = new RelativeGrave(driver);
    }

    @And("user clicks the Book Service button")
    public void userClicksTheBookServiceButton() {
        graveDetail.clickBookService();
    }

    @Then("user clicks the Grave details button")
    public void userClicksGraveDetailsButton() {
        grave.clickChiTiet();
    }

    @Then("user should see {string} of grave ")
    public void userShouldSeeNameOfGraveSelected(String name) {
        Assert.assertTrue(graveDetail.checkNameGrave(name));
    }
} 