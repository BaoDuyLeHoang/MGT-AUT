Feature: Search Grave
  As a user
  I want to search for graves
  So that I can find information about deceased individuals

  Background:
    Given user enter the URL "http://localhost:3000/tim-kiem-mo"

  @search
  Scenario Outline: Search for a grave with various criteria
    When user enters "<name>" in the name field
    And user enters "<birthYear>" in the birth year field
    And user enters "<deathYear>" in the death year field
    And user enters "<homeTown>" in the hometown field
    Then user clicks the search button


    Examples:
      | name                 | birthYear | deathYear | homeTown    |
      | Nguyễn Văn Tự Cường  | 2002      | 2024      | Quảng Trị   |

  @search
  Scenario: Search with only name
    When user enters "Nguyễn Văn A" in the name field
    And user clicks the search button
    Then user should see search results for "Nguyễn Văn A"

  @search
  Scenario: Search with name and birth year
    When user enters "Nguyễn Văn A" in the name field
    And user enters "2002" in the birth year field
    And user clicks the search button
    Then user should see search results for "Nguyễn Văn A"

  Scenario: Clear search fields
    When user enters "Test Name" in the name field
    And user enters "1900" in the birth year field
    And user clears all search fields
    Then All search fields should be empty
