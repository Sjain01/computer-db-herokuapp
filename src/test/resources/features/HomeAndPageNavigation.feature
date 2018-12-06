Feature: Navigating through modules of heroku database application
  As a User , I want to verify and search computer details

  Background: User navigates to heroku application
    Given I navigate to computer database herokuapp website

    Scenario: Verify User Interface Elements on Home Page
      Given I validate title header and URL
      Then I verify that Add Computer button is enabled
      And I verify that Filter By name button is enabled

    Scenario: Verify Page Navigation
      Given I verify that Previous button is disabled
      And I verify that Next button is enabled
      Then I scroll to next Page by clicking on Next button
      And I verify that Previous button is enabled
      Then I scroll to the end of the list by clicking Next button
      And I verify if Next button becomes disabled









