@tag
Feature: Sum two numbers

  @tag1
  Scenario: Numerical addition
    Given I have a calculator   
    When I set two numbers to sum
    And I press the equal button
    Then A sum must have been done

