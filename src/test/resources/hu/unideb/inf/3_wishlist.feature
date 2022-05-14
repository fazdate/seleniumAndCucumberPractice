Feature: wishlist on tutorialsninja

  Background:
    Given the homepage is open

  Scenario:
    Given the search field is filled with "iphone"
    And the search button is clicked
    And the iphone is clicked
    When the add to wishlist button is clicked
    Then the wish list success text is shown
    And the wishlist link is clicked
    And the iphone is in the wishlist