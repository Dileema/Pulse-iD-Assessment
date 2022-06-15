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
Feature: Calculator
 
  @tag1
  Scenario: Add two positive numbers
    Given I have entered <input_1> into the calculator
    And I have entered <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1| input_2| button  |output|
      |  3     |     1  | add     |  4   |
      
      
  @tag2
  Scenario: Substract two numbers
    Given I have entered <input_1> into the calculator
    And I have entered <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1| input_2| button  |output|
      |  3     |     1  |substract|  2   |  
      
      
  @tag3
  Scenario: Devide two numbers
    Given I have entered <input_1> into the calculator
    And I have entered <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1| input_2| button  |output|
      |  3     |     1  | devide  |  3   |   
       
      
  @tag4
  Scenario: Multiply two numbers
    Given I have entered <input_1> into the calculator
    And I have entered <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1| input_2| button  |output|
      |  3     |     1  |multiply |  3   |  
      
      
  @tag5
  Scenario: Devide by zero
    Given I have entered <input_1> into the calculator
    And I have entered <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1| input_2| button  |output|
      |  3     |     0  |devide   |Error |  
      
      
  @tag6
  Scenario: Zero devide by zero
    Given I have entered <input_1> into the calculator
    And I have entered <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1| input_2| button  |output|
      |  0     |     0  | devide  | Error|  
      
      
  @tag7
  Scenario: Multiply by negative number
    Given I have entered <input_1> into the calculator
    And I have entered <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1| input_2| button  |output|
      |  -3    |     1  |multiply | -3   |  
      
      
  @tag8
  Scenario: Add to a negative number
    Given I have entered <input_1> into the calculator
    And I have entered <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1| input_2| button  |output|
      |  -3    |     1  | add     | 2    | 
      
      
  @tag9
  Scenario: Substract from greater number
    Given I have entered <input_1> into the calculator
    And I have entered <input_2> into the calculator
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1| input_2| button  |output|
      |  1     |     3  |substract| -2   |   
