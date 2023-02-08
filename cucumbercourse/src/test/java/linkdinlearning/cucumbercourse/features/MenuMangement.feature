Feature: Menu Mangement 


@SmokeTest 
Scenario: Add a menu item 

	Given I have menu item with name "Cucumber Sandwich" and price is 20 
	When I add that menu item 
	Then Menu Item with name "Cucumber Sandwich" should be added 
	
@RegressionTest 
Scenario: Add second menu item 

	Given I have menu item with name "Cucumber Salad" and price is 20 
	When I add that menu item 
	Then Menu Item with name "Cucumber Salad" should be added 
	
	
@RegressionTest @NightTest 
Scenario: Add third menu item 

	Given I have menu item with name "Chicken Salad" and price is 20 
	When I add that menu item 
	Then Menu Item with name "Chicken Salad" should be added 