package tests;


import core.BaseTest;
import listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.SkipException;

@Listeners(TestListener.class)
public class ListenerTC extends BaseTest{

    WebDriver driver;


    @Test(priority = 1) //Success Test
    public void gotoPage() {
        BaseTest.getDriver().navigate().to("https://anhtester.com");
    }

    @Test(priority = 2) //Failed Test
    public void checkTitle() {
        String expectedTitle = "Anh Tester";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle, "Title of the website do not match");
    }

    @Test(priority = 3)  //Skip Test
    public void skipTest() {
        throw new SkipException("Skipping The Test Method ");
    }

}
