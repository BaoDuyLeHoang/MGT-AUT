Feature: Main Flow of the Application

  Background:
    Given user enter the URL "https://mtg-two.vercel.app/login"


  @customerBookingFlows
  Scenario: User deposits money into wallet

    When user login with customer
    And user clicks wallet
    And user inputs number of money into wallet "500000"
    And user clicks VNPay button
    And user clicks deposit button
    Then user pays the order "VNPay"


  @customerBookingFlows
  Scenario Outline: User booking service

    When user login with customer
    And user clicks on Search Grave
    And user enters "<name>" in the name field
    And user clicks the search button
    And user click search result at index 0
    Then user should see "<name>" of grave

    When user clicks the Book Service button
    And user selects the service by category at index 0
    Then user selects the service by category at index 1

    When user clicks on Cart
    And user clicks the Select All checkbox
    And user clicks the Payment button

    When user selects "<payment>" Payment button
    And user enters the date "<date>"
    And user clicks the Checkout button
    Then user pays the order "<payment>"

    Examples:
      | name    | payment             | date       |
      | Hữu An  | Thanh toán tiền mặt | 25/01/2025 |


  @customerBookingFlow
  Scenario Outline: User booking new special request
    When user login with customer
    And user clicks Relative Grave
    And user clicks the button create new special request
    And user selects martyr name "<martyrName>"
    And user selects type of request "<type>"
    And user selects date complete "<date>"
    And user inputs note of request "<note>"
    Then user clicks button to send special request
    Examples:
      | martyrName     | type          | date       | note                                     |
      | Đinh Xuân Phúc | tình trạng mộ | 01-15-2025 | Ngày đấy là đám giỗ nên làm sớm giúp tôi |

