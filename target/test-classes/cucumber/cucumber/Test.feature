#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Google Test Feature File
  I want to use this template for my feature file

  @Smoke
  Scenario: Launch
    Given I will Launch Website
    And I will Enter Text in SearchBox
    When I click on Search Button
    And Results are Displayed
    Then CloseBrowser
   

 @Regression
  Scenario Outline: Perform multiple search in google search
    Given I will Launch Website
    When I will Enter Text "<SearchString>" and "<value>"
    Then I click on Search Button
    Then CloseBrowser
    

    Examples: 
      | SearchString  | value   |
      | name1         | 1 |
      | name2         | 2 |
