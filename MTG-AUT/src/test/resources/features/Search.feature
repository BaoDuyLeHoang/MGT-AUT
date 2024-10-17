Feature: Search Grave
  As a user
  I want to search for graves
  So that I can find information about deceased individuals

  Background:
    Given User enter the URL "http://localhost:3000/tim-kiem-mo"

  @search
  Scenario Outline: Search for a grave with various criteria
    When User enters "<name>" in the name field
    And User enters "<birthYear>" in the birth year field
    And User enters "<deathYear>" in the death year field
    And User enters "<homeTown>" in the hometown field
    And User clicks the search button
    Then User should see search results for "<name>"

    Examples:
      | name                 | birthYear | deathYear | homeTown    |
      | Nguyễn Văn Tự Cường  | 2002      | 2024      | Quảng Trị   |
      | Đỗ Thành Bộ          | 2002      | 2024      | Lâm Đồng    |
      | Nguyễn Thanh Bình    | 2002      | 2024      | Hậu Giang   |

  Scenario: Search with only name
    When User enters "Nguyễn Văn A" in the name field
    And User clicks the search button
    Then User should see search results for "Nguyễn Văn A"

  Scenario: Search with name and birth year
    When User enters "Nguyễn Văn A" in the name field
    And User enters "2002" in the birth year field
    And User clicks the search button
    Then User should see search results for "Nguyễn Văn A"

  Scenario: Clear search fields
    When User enters "Test Name" in the name field
    And User enters "1900" in the birth year field
    And User clears all search fields
    Then All search fields should be empty
