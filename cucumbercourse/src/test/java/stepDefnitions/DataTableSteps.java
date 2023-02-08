package stepDefnitions;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import java.util.Map;

public class DataTableSteps {

	@Given("I placed an order for the following items")
	public void i_placed_an_order_for_the_following_items(DataTable dataTable) {
//		List<List<String>> BillData = dataTable.asLists();
//		for (List<String> BillItems : BillData) {
//			for (String BillItem: BillItems) {
//				System.out.println(BillItem);
//			}
//		}
		List<Map<String, String>> BillData = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> BillItems : BillData) {
			for (Map.Entry<String, String> BillItem : BillItems.entrySet()) {
				System.out.println("Key " + BillItem.getKey());
				System.out.println("Value " + BillItem.getValue());
			}
		}
//		List<Map<String, String>> BillData = dataTable.asMaps(String.class, String.class);
//
//		for (Map<String, String> BillItems : BillData) {
//			for (Map.Entry<String, String> BillItem : BillItems.entrySet()) {
//				System.out.println("Key: " + BillItem.getKey());
//				System.out.println("Value: " + BillItem.getValue());
//			}
//		}
	}

	@When("I generate the bill")
	public void i_generate_the_bill() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("a bill for ${int} should be generated")
	public void a_bill_for_$_should_be_generated(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

}
