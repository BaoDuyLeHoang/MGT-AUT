Feature: Scenario 3: Create report request

  @scenario3
  Scenario Outline: 3.1 Customer create report request
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
      | martyrName  | type          | date       | note                                |
      | An          | tình trạng mộ | 02-01-2025 | Tôi muốn xem tình trạng mộ hiện tại |


  @scenario3
  Scenario: 3.2 Manager accept report request
    Given user enter the URL "https://mtg-two.vercel.app/login"
    When user login with manager
    And  manager clicks button request
    And  manager clicks first request at request list
    Then manager clicks confirm button

  @scenario3
  Scenario: 3.3 Staff receive report & upload video’s report
    Given user enter the URL "https://mtg-two.vercel.app/login"
    When user login with staff
    And staff clicks grave report
    And staff clicks first element in grave report

