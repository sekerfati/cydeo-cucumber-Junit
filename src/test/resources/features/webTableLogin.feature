Feature: User should be able to log in using correct credentials



  Scenario: Positive login scenario
    Given  user is on the page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains orders



  Scenario: Positive login scenario
    Given  user is on the page of web table app
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

  @wip

  Scenario: User should be able to see all 12 months in
  months
  dropdown
    Given  user is on the page of web table app
    When User enters below credentials
      | username | Test |
      | password | Tester |
    Then user should see url contains orders