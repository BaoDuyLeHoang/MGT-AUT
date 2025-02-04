Feature: Main Flow of the Application

  Background:
    Given user enter the URL "https://mtg-two.vercel.app/login"

  @admin
  Scenario: Admin checking
    When user login with admin
    And  admin check dashboard
    And  admin check livestream
    And admin check manager list
    And admin check service list
    Then admin check material list


