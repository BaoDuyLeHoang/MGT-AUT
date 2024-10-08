package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Given;
import page.CommonComponents;
import page.HomePage;

public class CommonComponentsStepDefinitions extends BaseTest {
	private CommonComponents commonComponents;

	public CommonComponentsStepDefinitions() {
		commonComponents = new HomePage(getDriver());
	}

	@Given("User enter the URL {string}")
	public void user_enter_the_url(String url) {
	    BaseTest.getDriver().navigate().to(url);
	}

	@Given("User click on Menu")
	public void user_click_on_menu() {
		commonComponents.tapOnRightMenu();

	}

	@Given("User click on My Account Menu")
	public void user_click_on_my_account_menu() {
		commonComponents.tapOnMyAccountMenu();
	}
	
	@Given("User click on Shop Menu")
	public void user_click_on_shop_menu() {
		commonComponents.tapOnShopMenu();
	}

}
