package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.CommonComponents;
import page.ManagerPage;

public class AdminPageStepDefinitions extends BaseTest {
    private WebDriver driver;
    private CommonComponents commonComponents;

    public AdminPageStepDefinitions() {
        this.driver = getDriver(); 
        this.commonComponents = new CommonComponents(driver);
    }

    @And("admin check dashboard")
    public void adminCheckDashboard() throws InterruptedException {
        commonComponents.clickThongKeAdmin();
        Thread.sleep(2000);
    }
    @And("admin check livestream")
    public void adminCheckLivestream() throws InterruptedException {
        commonComponents.clickLiveStreamAdmin();
        Thread.sleep(2000);
    }
    @And("admin check manager list")
    public void adminCheckManagerList() throws InterruptedException {
        commonComponents.clickQuanLyNhanSuAdmin();
        Thread.sleep(2000);
    }
    @And("admin check service list")
    public void adminCheckServiceList() throws InterruptedException {
        commonComponents.clickQuanLyDichVuAdmin();
        Thread.sleep(2000);
    }
    @And("admin check material list")
    public void adminCheckMaterialList() throws InterruptedException {
        commonComponents.clickQuanLyVatLieuAdmin();
        Thread.sleep(2000);
    }

} 