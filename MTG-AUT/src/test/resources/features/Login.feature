Feature: Login
  As a user
  I want to log in to the application
  So that I can access my account

  Background: 
    Given User enter the URL "http://localhost:3000/login"

  @login
  Scenario: Verify user successfully logs in
    And User click on Service
    And User enter password "123"
    Then User click on login button
