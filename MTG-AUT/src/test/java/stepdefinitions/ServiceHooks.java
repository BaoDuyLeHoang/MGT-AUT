package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class ServiceHooks {
	@Before
	public void initializeTest() throws MalformedURLException {
		System.out.println("Khởi tạo driver...");
		BaseTest.setupDriver();
	}
	
	@After
	public void afterHookFunction() {
		System.out.println("Tắt driver...");
		BaseTest.tearDown();
	}
}