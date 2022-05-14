Feature: account info change test on tutorialsninja

  Background:
    Given the homepage is open
    And contact us link is clicked

  Scenario:
    Given the your name field is set to "asd asd"
    And the e-mail address field is set to "asdasdasd@asdasdasd.com"
    And the enquiry text is set to "dsadsadsadsadsadsa"
    When the submit button is clicked
    Then the continue button is shown



