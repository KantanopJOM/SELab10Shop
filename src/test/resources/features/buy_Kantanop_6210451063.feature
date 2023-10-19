Feature: Buy products
    As a customer
    I want to buy products

Background:
    Given the store is ready to service customers
    And a product "Bread" with price 20.50 and stock of 5 exists
    And a product "Jam" with price 80.00 and stock of 10 exists
    And a product "Cheese" with price 30.00 and stock of 8 exists

Scenario: Buy one product
    When I buy "Bread" with quantity 2
    Then total should be 41.00
    Then there are 3 "Bread" left

Scenario: Buy multiple products
    When I buy "Bread" with quantity 2
    Then there are 3 "Bread" left
    And I buy "Jam" with quantity 1
    Then there are 9 "Jam" left
    And I buy "Cheese" with quantity 2
    Then there are 6 "Cheese" left
    Then total should be 181.00