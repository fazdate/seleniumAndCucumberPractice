Feature: product return test on tutorialsninja

  Background:
    Given the homepage is open
    And Returns link is clicked

  Scenario:
    Given the first name is set to "asd"
    And the last name is set to "asd"
    And the e-mail address field is set to "asdasdasd@asdasdasd.com"
    And the telephone field is set to "asd"
    And the order id field is set to "1"
    And the order date field is set to "2000.01.01"
    And the product name is set to "iphone"
    And the product code is set to "product 11"
    And the quantity is set to "10"
    And the reason for return is set to Order error
    And the product is opened to Yes
    When the submit button is clicked
    Then the continue button is shown



