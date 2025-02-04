package cucumberoptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import listeners.ReportListener;
import logs.Log;
import org.testng.annotations.*;

@Listeners(ReportListener.class)
@CucumberOptions(features = "src/test/resources/features", glue = "stepdefinitions", 
		plugin = { 
		"pretty",
		"html:target/cucumber-reports/cucumber-pretty.html", 
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" },
		tags = "@scenario3")

public class Scenario3TestRunner {
		private TestNGCucumberRunner testNGCucumberRunner;
		
		@BeforeClass(alwaysRun=true) 
		public void setUpClass() {
			Log.info(getClass());
			// Khởi tạo TestNGCucumberRunner với lớp kiểm thử hiện tại  
			testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		}
		
		// Phương thức này chạy các scenarios
		@Test(description = "Run Cucumber Features", dataProvider = "scenarios")  
	    public void feature(PickleWrapper pickleWrapper, FeatureWrapper cucumberFeature) {  
			// Chạy một kịch bản riêng lẻ bằng cách lấy pickle từ PickleWrapper
	        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());  
	    }
		
		// DataProvider cung cấp các scenarios cho phương thức kiểm thử  
		@DataProvider(name = "scenarios")  
		public Object[][] scenarios() {  
	        if (testNGCucumberRunner == null) {  
	            testNGCucumberRunner = new TestNGCucumberRunner(getClass());  
	        }  
	     // Cung cấp các scenarios sẽ được chạy trong các bài kiểm thử  
	        return testNGCucumberRunner.provideScenarios();  
	    }
		
		// Phương thức này được chạy sau khi tất cả các bài kiểm thử trong lớp này đã hoàn tất
		@AfterClass(alwaysRun=true)
		public void tearDownClass() {
			// Kết thúc runner và thực hiện bất kỳ dọn dẹp nào cần thiết  
			testNGCucumberRunner.finish();
		}
}

