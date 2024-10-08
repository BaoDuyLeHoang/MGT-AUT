package stepdefinitions;


import core.BaseTest;
import io.cucumber.java.en.When;
import page.ShopPage;

public class ShopStepDefinitions extends BaseTest {
	private ShopPage shopPage;

	public ShopStepDefinitions() {
		shopPage = new ShopPage(getDriver());
	}
	
	@When("User select product with name {string}")
	public void user_select(String producName) {
	   shopPage.tapProductByName(producName);
	}
	
	

}
