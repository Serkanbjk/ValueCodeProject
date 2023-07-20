@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: Verify login with valid email and password
    Given the user logged in with valid credential
    Then the user navigates the Todo App





