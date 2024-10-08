package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page.MyAccountPage;

public class MyAccountStepDefinitions extends BaseTest {
	private MyAccountPage myAccountPage;

	public MyAccountStepDefinitions() {
		myAccountPage = new MyAccountPage(getDriver());
	}

	@When("User enter {string} in username textbox")
	public void user_enter_in_username_textbox(String userName) {
		myAccountPage.sendTextToUsername(userName);
	}

	@When("User enter {string} in password textbox")
	public void user_enter_in_password_textbox(String password) {
		myAccountPage.sendTextToPassword(password);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		myAccountPage.tapOnLoginBtn();
	}

	@Then("User should see text {string}")
	public void user_should_see_text(String expectedMessage) {
		Assert.assertTrue(myAccountPage.getHelloMsgTxt().contains(expectedMessage),"Login failed");
	}

}
