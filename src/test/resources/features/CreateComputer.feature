Feature: New Computer Creation

  Background: User navigates to heroku application
    Given I navigate to computer database herokuapp website
    And I click on Add a new computer button
    And I validate title header and URL on Create Computer Page

    Scenario: Verify User Interface Elements
      Given I verify the state of all UI Buttons on Create Computer Page

    Scenario: Add new computer by entering random characters in Computer Name field
      Given I create computer name having 0 characters
      And I enter into computer name textbox on "Create" computer Page
      Then I click on "Create" this computer button
      And I verify computer has been created statement is displayed in red color
      Then I create computer name having 10 characters
      And I enter into computer name textbox on "Create" computer Page
      And I click on "Create" this computer button
      Then I verify computer has been created statement is displayed

    Scenario Outline: Enter values into date field and click create this computer button
      Given I enter invalid <date> entries in Introduced date field
      And I click on "Create" this computer button
      Then I verify error message is displayed in red color for Introduced Date
      And I enter invalid <date> entries in Discontinued date field
      And I click on "Create" this computer button
      Then I verify error message is displayed in red color for DisIntroduced Date

      Examples:
      |date      |
      |22-22-2222|
      |10-24-1986|
      |24-10-1985|
      |1985/12/24|
      |10 Mar 1985|
      |03.04.1985 |
      |1982.03.04 |
      |Some date  |
      |1234       |
      |!@#)(!@&@!#)!@#_|

    Scenario: Fill up the complete form on Create Computer Page and create a new computer
      Given I create computer name having 6 characters
      And I enter into computer name textbox on "Create" computer Page
      Then I enter randomly generated valid date in Introduced date field
      And I enter randomly generated valid date in Discontinued date field
      And I select random Company
      And I click on "Create" this computer button
      Then I verify computer has been created statement is displayed






