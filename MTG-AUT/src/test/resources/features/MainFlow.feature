Feature: Search Grave
  As a user
  I want to search for graves
  So that I can find information about deceased individuals

  Background:
    Given User enter the URL "http://localhost:3000/login"

  @mainflow
  Scenario: Customer login
    And User enter username "0201030293"
    And User enter password "00635259"
    Then User click on login button

  Scenario: Search with only name
    When User enters "Nguyễn Văn A" in the name field
    And User clicks the search button
    Then User should see search results for "Nguyễn Văn A"