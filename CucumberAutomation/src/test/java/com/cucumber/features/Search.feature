Feature: Search and place order for vegetables

@SeleniumTest
Scenario: Search for items and validate results
Given User is on Greenkart page
When User searched for Cucumber vegetable
Then Cucumber results are displayed

@SeleniumTest
Scenario Outline: Search many items and validate results
Given User is on Greenkart page
When User searched for <Vegetable> vegetable
Then <Vegetable> results are displayed

Examples:
|Vegetable |
|Brinjal  |
|Cucumber |