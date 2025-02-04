package tests;

import core.BaseTest;
import listeners.ReportListener;
import logs.Log;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import page.*;

@Listeners(ReportListener.class)
public class Test extends BaseTest {

    String url = "https://mtg-two.vercel.app/login";
    @org.testng.annotations.Test
    public void TestAuto() throws InterruptedException {
        BaseTest.getDriver().navigate().to(url);
        ServicePage servicePage = new ServicePage(getDriver());
        CommonComponents commonComponents = new CommonComponents(getDriver());
        ServiceDetailPage serviceDetailPage = new ServiceDetailPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        RelativeGrave relativeGrave = new RelativeGrave(getDriver());
        GraveDetail graveDetail = new GraveDetail(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());
        ManagerPage managerPage = new ManagerPage(getDriver());
        AdminPage adminPage = new AdminPage(getDriver());
        StaffPage staffPage = new StaffPage(getDriver());

        Payments payments  = new Payments(getDriver());
        loginPage.loginWithData("data/LoginWithManager.xlsx");
        managerPage.clickBtnTuNgay();
        managerPage.clickRequestList(1);
        managerPage.clickBtnChonVatLieu();

        //staffPage.clickBtnThongBao();
        //staffPage.clickThongBaoList(1);
        //staffPage.clickXemChiTietBtn();
/*        commonComponents.clickCongViec();
        staffPage.clickCongViecList(1);
        commonComponents.clickLichLamViecStaff();
        staffPage.clickBtnTuanSau();
        staffPage.clickThemCongViec("Thứ Hai");
        staffPage.selectTask("Thay hoa cúc", "Có");*/
    }
    @AfterMethod
    public void takeSreenShot(ITestResult result) throws InterruptedException {

    }
}
