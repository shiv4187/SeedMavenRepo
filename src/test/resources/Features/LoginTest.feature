#Author: testuser@yopmail.com

@smoke
Feature: Login Functionality
  I want to test login feature with different aspects
  
  Background:
		Given User is launching latest browser
    And User is launching app
  
  @smoke
  Scenario: Login with valid login credenatials
    When User is entering valid username and password
    And User click on login button
    Then I validate the successful login
    And I validate more details on homepage 
    
  @sanity  
  Scenario: Login with invalid login credenatials
    When User is entering invalid username and password
    And User click on login button
    Then I validate the unsuccessful login
    And I validate more details on login page itself
    
  @regression
  Scenario Outline: Login with different users
    When User is entering "<uname>" as username and "<pass>" as password
    And User click on login button
    Then I validate the successful login for different users
    And I validate more details on homepage from user perspective 

    Examples: 
      | uname     | pass      |
      | Admin 		| admin123  |
      | Admin 		| admin123  |
      | Admin 		| admin123  |


