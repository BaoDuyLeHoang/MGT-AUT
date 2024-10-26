package tests;

import core.BaseTest;
import page.LoginPage;
import page.SearchPage;
import page.ServiceDetailPage;
import page.ServicePage;

public class Test extends BaseTest {

    String url = "http://localhost:3000/dichvu";
    @org.testng.annotations.Test
    public void TestAuto(){
        ServicePage servicePage = new ServicePage(getDriver());
        ServiceDetailPage serviceDetailPage = new ServiceDetailPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        /*BaseTest.getDriver().navigate().to("http://localhost:3000/login");
        loginPage.sendText("0201030293");
        loginPage.sendPassword("00635259");
        loginPage.clickLoginButton();*/

        BaseTest.getDriver().navigate().to(url);
        servicePage.getService(0);

        serviceDetailPage.selectGraveOptionByIndex(1);
    }
}
