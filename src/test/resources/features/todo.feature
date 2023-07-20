Feature: Users should be able to login
  @todo


  Scenario: Verify login with valid email and password
    Given the user logged in with valid credential
    And the user click My Tasks
    And the user enter message in the input box
    And the user click plus button
    Then the user should see that is added
