package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.SearchPage;

import static core.BaseTest.getDriver;

public class SearchPageStepDefinitions extends BaseTest {
    private SearchPage searchPage;
    private WebDriver driver;

    public SearchPageStepDefinitions() {
        this.driver = getDriver();
        this.searchPage = new SearchPage(driver);
    }

    @And("user enters {string} in the name field")
    public void userEntersInTheNameField(String name) {
        searchPage.sendTextToName(name);
    }
    @And("user enters {string} in the birth year field")
    public void userEntersInTheBirthYearField(String birthYear) {
        searchPage.sendTextToBirthYear(birthYear);
    }
    @And("user enters {string} in the death year field")
    public void userEntersInTheDeathYearField(String deathYear) {
        searchPage.sendTextToDeathYear(deathYear);
    }

    @When("user enters {string} in the hometown field")
    public void userEntersInTheHometownField(String homeTown) {
        searchPage.sendTextToHomeTown(homeTown);
    }

    @And("user clicks the search button")
    public void userClicksTheSearchButton() throws InterruptedException {
        searchPage.tapButtonSearch();
        Thread.sleep(500);
    }

    @And("user click search result at index {int}")
    public void userClickSearchResultAtIndex(int index) throws InterruptedException{
        searchPage.clickSearchResultIndex(index);
        Thread.sleep(500);
    }

    @When("user clears all search fields")
    public void userClearsAllSearchFields() {
        // Implement method to clear all fields
        // This might involve calling clear() on each WebElement
    }
    @Then("All search fields should be empty")
    public void allSearchFieldsShouldBeEmpty() {
        // Implement verification that all fields are empty
        // This might involve checking the value attribute of each input field
    }
}
