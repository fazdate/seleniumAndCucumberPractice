Feature: product return test on tutorialsninja

  Background:
    Given the homepage is open

  Scenario:
    Given the gift certificates link is clicked
    And the recipients name field set to "asd"
    And the recipients email field set to "asd@asd.com"
    And the your name field set to "dsa"
    And your email field set to "dsa@dsa.com"
    And the gift certificate theme is set to birthday
    And the message is set to "Happy birthday dear asd!"
    And the amount is set to "15"
    And the agreement box is ticked
    When the homepage continue button is clicked
    Then the continue button is shown


