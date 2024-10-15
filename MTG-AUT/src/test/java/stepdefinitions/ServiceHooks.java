package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks {
	@Before
	public void initializeTest(){
		System.out.println("Khởi tạo driver...");
		BaseTest.beforeMethod();
	}
	
	@After
	public void afterHookFunction() {
		System.out.println("Tắt driver...");
		BaseTest.afterSuite();
	}
}
