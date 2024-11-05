Feature: User Login

  Background:
    Given user enter the URL "http://localhost:3000/login"

  @login
  Scenario: Successful login with valid credentials
    When user login with customer
