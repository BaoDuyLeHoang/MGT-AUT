Feature: Login
  As a user
  I want to log in to the application
  So that I can access my account

  Background: 
    Given User enter the URL "http://localhost:3000/login"

  @login
  Scenario: Verify user successfully logs in
    And User enter username "0201030293"
    And User enter password "00635259"
    Then User click on login button

