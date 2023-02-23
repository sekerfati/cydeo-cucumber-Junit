Feature: User should be able to log in using correct credentials
  Scenario: Positive login scenario
    Given  user is on the page of web table app
    When user enters "username"
    And user enters "password"
    And user clicks to login button
    Then user should see url contains orders