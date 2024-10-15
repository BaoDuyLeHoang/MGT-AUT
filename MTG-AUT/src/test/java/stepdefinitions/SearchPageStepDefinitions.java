package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SearchPage;

public class SearchPageStepDefinitions {
    private WebDriver driver;
    private SearchPage searchPage;

    // Constructor to initialize WebDriver
    public SearchPageStepDefinitions() {
        // Initialize your WebDriver here
        // this.driver = YourWebDriverSetup.getDriver();
        this.searchPage = new SearchPage(driver);
    }

    @Given("User is on the search page")
    public void userIsOnTheSearchPage() {
        // Navigate to the search page
        // driver.get("https://your-search-page-url.com");
    }

    @When("User enters {string} in the name field")
    public void userEntersInTheNameField(String name) {
        searchPage.sendTextToName(name);
    }

    @When("User enters {string} in the birth year field")
    public void userEntersInTheBirthYearField(String birthYear) {
        searchPage.sendTextToBirthYear(birthYear);
    }
    @When("User enters {string} in the death year field")
    public void userEntersInTheDeathYearField(String deathYear) {
        searchPage.sendTextToDeathYear(deathYear);
    }

    @When("User enters {string} in the hometown field")
    public void userEntersInTheHometownField(String homeTown) {
        // Implement this method in SearchPage class
        // searchPage.sendTextToHomeTown(homeTown);
    }

    @When("User clicks the search button")
    public void userClicksTheSearchButton() {
        searchPage.tapButtonSearch();
    }

    @Then("User should see search results for {string}")
    public void userShouldSeeSearchResultsFor(String name) {
        // Implement verification of search results
        // This might involve checking for the presence of the name in the results
        // or verifying that the results page has loaded
    }

    @When("User clears all search fields")
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
