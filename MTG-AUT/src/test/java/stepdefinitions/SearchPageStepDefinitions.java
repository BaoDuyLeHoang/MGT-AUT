package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SearchPage;

import static core.BaseTest.getDriver;

public class SearchPageStepDefinitions {
    private SearchPage searchPage;

    // Constructor to initialize WebDriver
    public SearchPageStepDefinitions() {
        this.searchPage = new SearchPage(getDriver());
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
        searchPage.sendTextToHomeTown(homeTown);
    }

    @When("User clicks the search button")
    public void userClicksTheSearchButton() {
        searchPage.tapButtonSearch();
    }

    @Then("User should see search results for {string}")
    public void userShouldSeeSearchResultsFor(String name) {

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
