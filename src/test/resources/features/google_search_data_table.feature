Feature: Passing multiple parameters to the same step

  @nsh
  Scenario: Searching multiple items
    Given user is on Google search page
    Then user searches the following item
      | loop academy |
      | java         |
      | selenium     |
      | cucumber bdd |
      | sql          |
      | Andrew       |
      | Anna         |

    # option + command + L
    # ctrl + alt + L