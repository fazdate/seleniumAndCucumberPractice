Feature: logout test on tutorialsninja

  Background:
    Given the my account page is opened

  Scenario:
    When the logout button is clicked
    Then account logout text is shown