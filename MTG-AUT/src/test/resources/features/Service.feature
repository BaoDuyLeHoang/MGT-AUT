Feature: Service Selection
  As a user
  I want to view and select services
  So that I can access service details

  Background: 
    Given User enter the URL "http://localhost:3000/dichvu"

  @service
  Scenario: Verify user can select the "Thay hoa lan" service
    When User clicks on the service titled "Thay hoa lan"
    Then User should see the service details for "Thay hoa lan"
