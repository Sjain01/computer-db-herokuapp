Feature: Search and delete computer Name

  Background: User navigates to heroku application
    Given I navigate to computer database herokuapp website

  Scenario: Search an existing computer name and delete it
    Given I go to website with valid search results
    Then I retrieve the first element present in the list
    And I enter computer name in Filter by name textbox
    And I click on FilterByName button
    Then I click on element retrieved
    And I verify if the same computer name entered in filterbox has been displayed
    Then I click Delete this computer button
    And I verify computer has been deleted statement is displayed