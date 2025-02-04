package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.CommonComponents;
import page.ManagerPage;
import page.StaffPage;

public class StaffPageStepDefinitions extends BaseTest {
    private WebDriver driver;
    private StaffPage staffPage;
    private CommonComponents commonComponents;

    public StaffPageStepDefinitions() {
        this.driver = getDriver(); 
        this.staffPage = new StaffPage(driver);
        this.commonComponents = new CommonComponents(driver);
    }
    @When("staff clicks notification button")
    public void staffClicksNotificationButton() {
        staffPage.clickBtnThongBao();
    }

    @When("staff clicks first notification in the list")
    public void staffClicksFirstNotificationInTheList() {
        staffPage.clickThongBaoList(1);
    }

    @When("staff clicks detail button")
    public void staffClicksDetailButton() {
        staffPage.clickXemChiTietBtn();
    }

    @When("staff clicks work button")
    public void staffClicksWorkButton() {
        commonComponents.clickCongViec();
    }

    @When("staff clicks first work in the list")
    public void staffClicksFirstWorkInTheList() throws InterruptedException {
        staffPage.clickCongViecList(1);
        Thread.sleep(1000);
        commonComponents.clickLichLamViecStaff();
    }

    @When("staff clicks accept button")
    public void staffClicksAcceptButton() {
        staffPage.clickChapNhanBtn();
    }

    @When("staff clicks add work button for {string}")
    public void staffClicksAddWorkButtonFor(String day) throws InterruptedException {
        staffPage.clickBtnTuanSau();
        Thread.sleep(1000);
        staffPage.clickThemCongViec(day);
    }

    @When("staff selects task {string} and confirms {string}")
    public void staffSelectsTaskAndConfirms(String taskName, String confirmation) {
        staffPage.selectTask(taskName, confirmation);
    }
    @When("staff clicks first element in grave report")
    public void staffClickFirstElementInBaoCaoMoList() throws InterruptedException {
        staffPage.clickFirstElementInBaoCaoMoList();
    }

} 