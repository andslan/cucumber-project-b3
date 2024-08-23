Feature: Scenario outline practice

  @googleSearchOutline @B3G2-284 @B3G2-291
    # @smoke
  Scenario Outline: Google search for capital cities
    Given user is on Google search page
    When user searches for the "<country>"
    Then user should see the "<capital>" in the result

    Examples:
      | country     | capital    |
      | Azerbaijan  | Baku       |
      | Ukraine     | Kyiv       |
      | Afghanistan | Kabul      |
      | USA         | Washington, D.C. |
      | Turkiye     | Ankara     |
      | Uzbekistan  | Tashkent   |
