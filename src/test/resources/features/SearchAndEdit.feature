Feature: Search and edit computer Name

  Background: User navigates to heroku application
    Given I navigate to computer database herokuapp website

     Scenario: Search non-existing Computer Name
     Given I create computer name having 8 characters
     Then I enter computer name in Filter by name textbox
     And I click on FilterByName button
     And I verify message displayed on Home Page

    Scenario: Search an existing computer name and edit the values of it
      Given I go to website with valid search results
      Then I retrieve the first element present in the list
      And I enter computer name in Filter by name textbox
      And I click on FilterByName button
      Then I click on element retrieved
      And I verify if the same computer name entered in filterbox has been displayed
      Then Edit computer text is displayed on the screen
      And I create computer name having 6 characters
      And I enter into computer name textbox on "Edit" computer Page
      Then I enter randomly generated valid date in Introduced date field
      And I enter randomly generated valid date in Discontinued date field
      And I select random Company
      And I click on "Save" this computer button
      Then I verify computer has been created statement is displayed