Feature: login test on tutorialsninja

  Background:
    Given the homepage is open
    And my account is clicked
    And login is clicked

  Scenario: incorrect login
    Given the email field is filled with "a@a.com"
    Given the password field is filled with "a"
    When the Sign In button is clicked
    Then the error message is shown

  Scenario: correct login
    Given the email field is filled with "asdasdasd@asdasdasd.com"
    Given the password field is filled with "1234"
    When the Sign In button is clicked
    Then the user has logged in
