Feature: Main Flow of the Application

  Background:
    Given user enter the URL "https://mtg-two.vercel.app/login"

  @manager
  Scenario: Manager check first special request
    When user login with manager
    And  manager clicks button request
    And  manager clicks first request at request list
    Then  manager clicks confirm button


