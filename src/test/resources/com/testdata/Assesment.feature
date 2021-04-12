Feature: Search for book

  @qabook

    Scenario: Search for QA Book
    Given User on main page
    When User searches for "qa testing for beginners" book and click to the first one
    And User assets the price and add to cart
    And User goes to cart and assets the price
    Then User asserts the prices