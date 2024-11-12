package cucumberoptions;

import core.Log;
import core.TestListener;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

@Listeners(TestListener.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepdefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/search-page-cucumber-pretty.html",
        "json:target/cucumber-reports/SearchPageTestReport.json",
        "rerun:target/cucumber-reports/search-page-rerun.txt"
    },
    tags = "@search"
)
public class SearchPageRunner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(description = "Run Cucumber Search Page Features", dataProvider = "scenarios")
    public void feature(PickleWrapper pickleWrapper, FeatureWrapper cucumberFeature) {
        //Ghi log trước khi chạy kịch bản
        Log.info("Feature: " +cucumberFeature);
        Log.info("Scenario" +pickleWrapper);
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider(name = "scenarios")
    public Object[][] scenarios() {
        if (testNGCucumberRunner == null) {
            testNGCucumberRunner = new TestNGCucumberRunner(getClass());
        }
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (testNGCucumberRunner != null) {
            testNGCucumberRunner.finish();
        }
    }
}
