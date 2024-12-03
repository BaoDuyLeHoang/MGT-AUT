Feature: Main Flow of the Application

  Background:
    Given user enter the URL "http://localhost:3000/login"

  @mainflow
  Scenario Outline: User booking service
    When user login with customer
    And user clicks on Cart
    And user clicks the Select All checkbox
    Then user clicks the Payment button

    When user selects "<payment>" Payment button
    And user enters the date "<date>"
    Then user clicks the Checkout button

    Examples:
      |name |payment|date      |
      |Giót |VNPay  |12-30-2024|

