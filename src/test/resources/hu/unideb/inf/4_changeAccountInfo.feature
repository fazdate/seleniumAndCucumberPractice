Feature: account info change test on tutorialsninja

  Background:
    Given the my account page is opened

  Scenario:
    Given the edit account information link is clicked
    Given the first name field is changed to "asd"
    Given the last name field is changed to "asd"
    Given the telephone field is changed to "111"
    When the continue button is clicked
    Then the success text is shown
