Feature: Staff Work Management
  Background:
    Given user enter the URL "https://mtg-two.vercel.app/login"

  @staffs
  Scenario Outline: Staff manages notifications and tasks
    When user login with staff
    And staff clicks notification button
    And staff clicks first notification in the list
    And staff clicks detail button
    And staff clicks work button
    And staff clicks first work in the list
    And staff clicks accept button
    And staff clicks add work button for "<day>"
    And staff selects task "<task>" and confirms "<yesno>"
    Then the success message "Tạo lịch thường thành công!" should be displayed
    Examples:
      | day    | task                | yesno |
      |Thứ Năm | Lau dọn nghĩa trang | Có    |




