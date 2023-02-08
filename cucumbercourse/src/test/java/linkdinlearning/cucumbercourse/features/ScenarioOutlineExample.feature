Feature: Final Bill Calculation 

@ScenarioOutlineExample
Scenario Outline: Customer Bill Amount Calculation 
	Given I have a number 
	And User enters intial bill amount as <BillAmount> 
	And Sales Tax Rate is <TaxRate> Percent 
	Then Final Bill amount calculate is <CalculatedBillAmount> 
	Examples: 
		|BillAmount|TaxRate|CalculatedBillAmount|
		|100|10|110|
		|200|9|218|
		|100|1.55|101.55|