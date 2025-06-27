Feature: Add employee feature
  I want to test all aspected of adding employee and valid and invalid way

	Background:
		Given User is opening browser and launching app
		And User gets logged in
		And User redirects to Add employee page 
  
  Scenario: Add employee with valid details
   	When User enters valid employee details
   	And User click on submit button
   	Then User validate the new created employee 
      
  Scenario: Add employee with invalid details
    When User enters invalid employee details
   	And User click on submit button
   	Then User validate the error on adding employee process

