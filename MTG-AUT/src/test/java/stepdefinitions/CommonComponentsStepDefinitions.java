package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Given;
import page.CommonComponents;

public class CommonComponentsStepDefinitions extends BaseTest {
	private CommonComponents commonComponents;

	public CommonComponentsStepDefinitions() {
		commonComponents = new CommonComponents(getDriver());
	}

	@Given("User enter the URL {string}")
	public void user_enter_the_url(String url) {
	    BaseTest.getDriver().navigate().to(url);
	}

	@Given("User click on Home Page")
	public void user_click_on_home_page() {
		commonComponents.clickHomePage();
	}

	@Given("User click on Introduce")
	public void user_click_on_introduce() {
		//commonComponents.tapOnMyAccountMenu();
	}

	@Given("User click on Service")
	public void user_click_on_service() {
		commonComponents.clickService();
	}

	@Given("User click on Contact")
	public void user_click_on_contact() {
		commonComponents.clickContact();
	}

	@Given("User click on User Icon")
	public void user_click_on_user_icon() {
		commonComponents.clickUserIcon();
	}

}
