Feature: User Login

  Background:
    Given User enter the URL "http://localhost:3000/login"

  @login
  Scenario Outline: Successful login with valid credentials
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks the login button
    Then User should see an error message

  Examples:
    | username           | password    | 
    | 0201030293         | 00635259    |
    | 8386836831         | string      |
    | 0121010101         | string      |
    | 0101010101         | string      |
