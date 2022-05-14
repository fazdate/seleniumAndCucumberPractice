Feature: add new address test on tutorialsninja

  Background:
    Given the address book page is opened

  Scenario:
    Given the address book button is clicked
    And the new address button is clicked
    And the first name field is set to "asd"
    And the last name field is set to "asd"
    And the address field is set to "Asd Street 1."
    And the city field is set to "asd"
    And the post code field is set to "1111"
    And the country field is set to "Hungary"
    And the the region is set to the value "0"
    And the default address radio is set to yes
    When the address continue button is clicked
    Then the address success text is shown