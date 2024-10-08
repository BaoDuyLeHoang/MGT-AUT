Feature: Product

  Background: 
    Background: 
    Given User enter the URL "https://practice.automationtesting.in"

  @product_detail
  Scenario Outline: Verify price and description displays as expected
    Given User click on Menu
    And User click on Shop Menu
    When User select product with name "<product>"
    Then User should see price displays "<price>"
    And User should see description displays "<description>"

    Examples: 
      | product       | price  | description                                                                                                                         |
      | Selenium Ruby | ₹500.00 | The Selenium WebDriver Recipes book is a quick problem-solving guide to automated testing web applications with Selenium WebDriver. |
