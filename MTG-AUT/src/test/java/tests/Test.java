package tests;

import core.BaseTest;
import page.*;

public class Test extends BaseTest {

    String url = "http://localhost:3000/login";
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


        loginPage.sendText("0201030293");
        loginPage.sendPassword("00635259");
        loginPage.clickLoginButton();
        Thread.sleep(1000);


        commonComponents.clickUserIcon();
        commonComponents.clickMoNguoiThan();
        relativeGrave.clickChiTiet();
        Thread.sleep(1000);

        graveDetail.clickBookService();
        Thread.sleep(1000);

        //servicePage.getDichVuTheoTheLoai(0);


        commonComponents.clickUserIcon();
        commonComponents.clickGioHang();
        Thread.sleep(1000);


        cartPage.clickSelectAllCheckbox();
        cartPage.clickPaymentButton();
        Thread.sleep(1000);

        checkoutPage.getTextPaymentMethod("Thanh toán tiền mặt");
        checkoutPage.sendDateValue("12-30-2024"); //  (mm/dd/yyyy)
        checkoutPage.clickCheckoutButton();

    }
}
