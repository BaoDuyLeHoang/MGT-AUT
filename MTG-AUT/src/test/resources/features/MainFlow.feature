Feature: Search Grave
  As a user
  I want to search for graves
  So that I can find information about deceased individuals

  Background:
    Given User enter the URL "http://localhost:3000/tim-kiem-mo"

  @mainflow
  Scenario Outline: Search for a grave
    And User enter username "0201030293"
    And User enter password "00635259"
    Then User click on login button