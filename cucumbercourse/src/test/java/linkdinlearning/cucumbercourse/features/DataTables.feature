Feature: Data Tables 

@ListofStrings 
Scenario: Bill Amount Generation 
	Given I placed an order for the following items 
		|Cucumber Sandwich|2|20|
	When I generate the bill 
	Then a bill for $40 should be generated 
	
	
@ListofListOfStrings 
Scenario: Diffrent Bill Amount Generation 
	Given I placed an order for the following items 
		|Cucumber Sandwich|2|20|
		|Cucumber Sald|1|15|
	When I generate the bill 
	Then a bill for $40 should be generated 
	
	
@ListofMaps
Scenario: Diffrent Bill Amount Generation 
	Given I placed an order for the following items 
		|Item Name|Unit|Quantity|
		|Cucumber Sandwich|2|20|
		|Cucumber Sald|1|15|
	When I generate the bill 
	Then a bill for $40 should be generated 