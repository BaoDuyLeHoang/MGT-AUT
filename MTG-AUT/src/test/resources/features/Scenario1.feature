Feature: Add service to grave to order service

  @scenario
  Scenario Outline: 1.1 Customer request “add service to relative’s grave”
    Given user enter the URL "https://mtg-two.vercel.app/login"
    When user login with customer
    And user clicks Relative Grave
    And user clicks the button create new special request
    And user selects martyr name "<martyrName>"
    And user selects type of request "<type>"
    And user selects service of request "<service>"
    And user inputs note of request "<note>"
    Then user clicks button to send special request

    Examples:
      | martyrName  | type                                               | service       | note                                     |
      | An          | Yêu cầu thêm dịch vụ có sẵn của nghĩa trang cho mộ | Thay hoa cúc  | Ngày đấy là đám giỗ nên làm sớm giúp tôi |


  @scenario
  Scenario: 1.2 Manager accept request “add service to relative’s grave”
    Given user enter the URL "https://mtg-two.vercel.app/login"
    When user login with manager
    And  manager clicks button request
    And  manager clicks first request at request list
    Then  manager clicks confirm button


  @scenario1
  Scenario: 1.3.1 User deposits money into wallet

    Given user enter the URL "https://mtg-two.vercel.app/login"
    When user login with customer
    And user clicks wallet
    And user inputs number of money into wallet "500000"
    And user clicks VNPay button
    And user clicks deposit button
    Then user pays the order "VNPay"


  @scenario1
  Scenario Outline: 1.3.2 Order process

    Given user enter the URL "https://mtg-two.vercel.app/login"
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


  @scenario1
  Scenario Outline: 1.4 Staff receive task & Create task schedule
    Given user enter the URL "https://mtg-two.vercel.app/login"
    When user login with staff
    And staff clicks notification button
    And staff clicks first notification in the list
    And staff clicks detail button
    And staff clicks work button
    And staff clicks first work in the list
    And staff clicks add work button for "<day>"
    And staff selects task "<task>" and confirms "<yesno>"
    Then the success message "Tạo lịch thường thành công!" should be displayed
    Examples:
      | day    | task                | yesno |
      |Thứ Năm | Lau dọn nghĩa trang | Có    |