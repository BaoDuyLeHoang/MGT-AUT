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

    String url = "https://sandbox.vnpayment.vn/tryitnow/Home/CreateOrder";
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

        Payments payments  = new Payments(getDriver());

        payments.clickTaoDonHang();
        payments.clickTheNoiDia();
        payments.clickNCB();
        payments.paymentWithData("data/PaymentWithData.xlsx");




        /*checkoutPage.getTextPaymentMethod("Thanh toán tiền mặt");
        checkoutPage.sendDateValue("12-30-2024"); //  (mm/dd/yyyy)
        checkoutPage.clickCheckoutButton();*/
    }
    @AfterMethod
    public void takeSreenShot(ITestResult result) throws InterruptedException {

    }
}
