Feature: Main Flow of the Application

  Background:
    Given User enter the URL "http://localhost:3000/login"

  @mainflow
  Scenario: User logs in and completes a service booking
    When User enters username "0201030293"
    And User enters password "00635259"
    Then User clicks the login button

    When User clicks on User Icon
    Then User clicks Relative Grave

    When User clicks the Grave details button
    And User clicks the Book Service button
    Then User selects the service by category at index 0

    When User clicks on User Icon
    And User clicks on Cart
    And User clicks the Select All checkbox
    Then User clicks the Payment button

    When User selects "VNPay" Payment button
    And User enters the date "12-30-2024"
    Then User clicks the Checkout button