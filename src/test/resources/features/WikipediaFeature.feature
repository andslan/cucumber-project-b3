Feature: Wikipedia Search Functionality Title Verification
  User Story: As a user, when I am on Wikipedia search page
  I should be able to search whatever I want and see the relevant information

  @wiki @smoke
  Scenario: Search Functionality result title verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the search box
    And user clicks wiki search button
    Then user should see "Steve Jobs" in the wiki title

  @wiki @smoke
  Scenario: Wikipedia Search Functionality Header Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the search box
    And user clicks wiki search button
    Then user should see "Steve Jobs" in the main header

  @wiki @smoke
  Scenario: Wikipedia Search Functionality Image Header Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the search box
    And user clicks wiki search button
    Then user should see "Steve Jobs" in the image header
