Feature: tutorialsNinja cart test

  Background:
    Given the homepage is open
    And iphone is clicked

  Scenario Outline:
    Given the qty is set to '<quantity>'
    When the add to cart is clicked
    And the cart button is clicked
    Then the sub-total is '<subTotal>'
    And the vat is '<vat>'
    And the total is '<total>'
    And clear cart button is clicked
    Examples:
      | quantity | total           | subTotal        | vat            |
      | 1        | $123.20         | $101.00         | $20.20         |
      | 15       | $1,848.00       | $1,515.00       | $303.00        |
      | 600      | $73,920.00      | $60,600.00      | $12,120.00     |
      | 1000000  | $123,200,000.00 | $101,000,000.00 | $20,200,000.00 |