Feature: Registration test on tutorialsninja

  Background:
    Given the homepage is open

  Scenario:
    Given the my account is clicked
    And the register link is clicked
    And the first name is set to "dsaasd"
    And the last name is set to "dsaasd"
    And the e-mail address field is set to "dsaasddsaasd1@dsaasddsaasd.dsaasddsaasd"
    And the telephone field is set to "123456789"
    And the password field is filled with "dsaasddsaasd1"
    And the confirm password field is set to "dsaasddsaasd1"
    And the subscribe is set to yes
    And the privacy policy box is clicked
    When the homepage continue button is clicked
    Then the continue button is shown



