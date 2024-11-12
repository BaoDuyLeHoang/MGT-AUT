Feature: Main Flow of the Application

  Background:
    Given user enter the URL "http://localhost:3000/"

  @mainflow
  Scenario Outline: User booking service
    When user clicks on Search Grave
    And user enters "<name>" in the name field
    And user clicks the search button
    And user click search result at index 0
    Then user should see "<name>" of grave

    When user clicks the Book Service button
    Then user selects the service by category at index 0

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

