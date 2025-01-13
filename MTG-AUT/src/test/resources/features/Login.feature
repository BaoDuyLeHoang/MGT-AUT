Feature: Main Flow of the Application

  Background:
    Given user enter the URL  "https://mtg-two.vercel.app/login"

  @mainflow
  Scenario Outline: User booking service
    When user login with admin
    And  admin check dashboard
    And  admin check livestream
    And admin check manager list
    And admin check service list
    Then admin check material list

    Examples:
      |name |payment|date      |
      |Giót |VNPay  |12-30-2024|
