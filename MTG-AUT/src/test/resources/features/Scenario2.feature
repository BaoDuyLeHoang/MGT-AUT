Feature: Scenario 2: Create custom service request

  @scenario2
  Scenario Outline: 2.1 Customer create service request
    Given user enter the URL "https://mtg-two.vercel.app/login"
    When user login with customer
    And user clicks Relative Grave
    And user clicks the button create new special request
    And user selects martyr name "<martyrName>"
    And user selects type of request "<type>"
    And user selects date complete "<date>"
    And user inputs note of request "<note>"
    Then user clicks button to send special request
    Examples:
      | martyrName  | type                                     | date       | note                                     |
      | An          | Yêu cầu dịch vụ theo yêu cầu khách hàng  | 02-01-2025 | Ngày đấy là đám giỗ nên làm sớm giúp tôi |


  @scenario2
  Scenario: 2.2 Manager accept service request
    Given user enter the URL "https://mtg-two.vercel.app/login"
    When user login with manager
    And  manager clicks button request
    And  manager clicks first request at request list
    And  manager choice material
    Then manager clicks confirm button


  @scenario2
  Scenario: 2.3 Customer accept quote request
    Given user enter the URL "https://mtg-two.vercel.app/login"
    When user login with customer
    And user checks notification
    Then user clicks confirm service button

