package tests;

import core.BaseTest;
import page.*;

public class Test extends BaseTest {

    String url = "http://localhost:3000/login";
    @org.testng.annotations.Test
    public void TestAuto(){
        BaseTest.getDriver().navigate().to(url);
        ServicePage servicePage = new ServicePage(getDriver());
        CommonComponents commonComponents = new CommonComponents(getDriver());
        ServiceDetailPage serviceDetailPage = new ServiceDetailPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        CheckoutPage checkoutPage = new CheckoutPage(getDriver());


        loginPage.sendText("0201030293");
        loginPage.sendPassword("00635259");
        loginPage.clickLoginButton();

        commonComponents.clickUserIcon();
        commonComponents.clickGioHang();

        cartPage.clickSelectAllCheckbox();
        cartPage.clickPaymentButton();

        checkoutPage.getPaymentMethod(1);
        checkoutPage.clickCheckoutButton();

    }
}
