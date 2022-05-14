Feature: tutorialsNinja currency change test

  Background:
    Given the homepage is open
    And the macbook is clicked

  Scenario Outline:
    When the currency button is clicked
    And the currency is changed to '<currency>'
    Then the price of macbook is '<price>'
    Examples:
      | currency | price   |
      | EUR      | 472.33€ |
      | GBP      | £368.73 |
      | USD      | $602.00 |