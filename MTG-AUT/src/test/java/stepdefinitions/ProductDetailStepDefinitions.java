package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import page.ProductInfoPage;

public class ProductDetailStepDefinitions extends BaseTest {
	private ProductInfoPage productInfoPage;

	public ProductDetailStepDefinitions() {
		productInfoPage = new ProductInfoPage(getDriver());
	}
	
	@Then("User should see price displays {string}")
	public void user_should_see_price_displays(String price) {
	    Assert.assertEquals(productInfoPage.getPrice(), price);
	}
	
	@Then("User should see description displays {string}")
	public void user_should_see_description_displays(String description) {
		Assert.assertEquals(productInfoPage.getDescription(), description);
	}

}
