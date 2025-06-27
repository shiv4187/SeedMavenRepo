
Feature: Position test
  I want to use this template for my feature file
  
  
  Background:
		Given User is opening browser and launching app
		And User gets logged in
		And User redirects to Add employee page 
  
  Scenario: Add employee with valid details
   	When User enters valid employee details
   	And User click on submit button
   	Then User validate the new created employee 


