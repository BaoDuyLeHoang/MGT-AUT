package tests;

import core.BaseTest;
import core.DataProviderUtils;
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
        SearchPage searchPage = new SearchPage(getDriver());
        ManagerPage managerPage = new ManagerPage(getDriver());

        loginPage.loginWithData("data/LoginWithManager.xlsx");
        commonComponents.clickDashBoardBlog();
        managerPage.clickBlogList(1,"Duyệt");
        /*commonComponents.clickTimKiemMo();*/
        /*searchPage.sendTextToName("Giót");
        searchPage.tapButtonSearch();
        Thread.sleep(10000);*/
        /*searchPage.clickSearchResultIndex(0);
        graveDetail.checkNameGrave("Giót");
        graveDetail.clickBookService();*/



        /*checkoutPage.getTextPaymentMethod("Thanh toán tiền mặt");
        checkoutPage.sendDateValue("12-30-2024"); //  (mm/dd/yyyy)
        checkoutPage.clickCheckoutButton();*/

    }
}
