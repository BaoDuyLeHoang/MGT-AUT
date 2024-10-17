package tests;

import core.BaseTest;
import page.SearchPage;

public class Test extends BaseTest {

    String url = "http://localhost:3000/tim-kiem-mo";
    @org.testng.annotations.Test
    public void TestAuto(){
        SearchPage search = new SearchPage(getDriver());
        BaseTest.getDriver().navigate().to(url);
        search.sendTextToName("123");
        search.sendTextToBirthYear("123");
        search.sendTextToDeathYear("123");

        search.tapButtonSearch();

    }
}
