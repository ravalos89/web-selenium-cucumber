Feature: Application Login

@SmokeTesting
  Scenario: Accounts
    Given User is on landing page
    When User login into application with username "Jim" and password "1234"
    Then Home Page is populated
    And Cards displayed are "true"