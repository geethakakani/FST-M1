@activity4
Feature: Login Test

  Scenario: Testing Login without Examples
    Given user is on logon page
    When user enters "admin" and "password"
    Then read the page tittle and confirm message
    Then close the browser