package stepDefnitions;

import cucumber.api.java.en.When;
import linkdinlearning.cucumbercourse.RestarantMenuItem;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MenuMangementSteps {

	RestarantMenuItem newItem;

	@Given("I have menu item with name {string} and price is {int}")
	public void i_have_menu_item_with_name_and_price_is(String string, Integer price) {
		newItem = new RestarantMenuItem(string, "", price);
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
	}

	@Then("Menu Item with name {string} should be added")
	public void menu_Item_with_name_should_be_added(String string) {

	}

}
