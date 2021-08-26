Feature: Application Login

	Background: Browser set up
		Given Validate browser
		When Browser is triggered
		Then Check if browser is started

	@RegressionTesting
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with username "Jim" and password "1234"
    Then Home Page is populated
    And Cards displayed are "true"
    
  @SmokeTesting 
	Scenario: Home page default login
   	Given User is on landing page
    When User login into application with username "John" and password "4321"
    Then Home Page is populated
    And Cards displayed are "false"
    
  @SmokeTesting
  Scenario: Home page default login
   	Given User is on landing page
    When User sign up with following details
    | Jenny | abcd | jenny@test.com | Mexico | 64555 |
    Then Home Page is populated
    And Cards displayed are "false"
    
  @RegressionTesting  
  Scenario Outline: Home page default login
    Given User is on landing page
    When User login into application with username <Username> and password <Password> parameterizing
    Then Home Page is populated
    And Cards displayed are "true"
    
    Examples:
    |Username|Password|
    |user01  |pwd123  |
    |user02  |pwd456  |
    |user03  |pwd321  |
