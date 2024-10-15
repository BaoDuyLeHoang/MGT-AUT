Feature: Login
  Login features

  Background: 
    Given User enter the URL "https://practice.automationtesting.in"

  @login 
  Scenario Outline: Verify user successfully login to the web page
    Given User click on Menu
    And User click on My Account Menu
    
    And User click on login button
    Then User should see text "<expectedMessage>"

    Examples: 
      | username               | password       | expectedMessage    |
      | alibabon1111@gmail.com | P@ssword9989!A | Hello alibabon1111 |
