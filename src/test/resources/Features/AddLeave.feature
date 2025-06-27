Feature: Add Leave feature
  I want to test all aspected of adding Leave 

	Background:
		Given User is opening browser and launching app for leaves
		And User gets logged in into application
		And User redirects to add leaves page
  
  Scenario: Add Leave with valid details
   	When User enters valid Leave type name
   	And User click on save button
   	Then User validate the new created leave 