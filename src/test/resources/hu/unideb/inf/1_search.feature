Feature: tutorialsNinja search test

  Background:
    Given the homepage is open

  Scenario:
    Given the search bar is filled with "iphone"
    And the search button is clicked
    And the first product is clicked
    And the quantity is set to "10"
    And the add to cart button is clicked
    When the cart is clicked
    Then the Total should be "$1,247.00"
