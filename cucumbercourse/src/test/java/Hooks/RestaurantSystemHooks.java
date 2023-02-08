package Hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class RestaurantSystemHooks {

	@Before("@SmokeTest ")
	public void BeforeDisplayMessage(Scenario scenario) {
		System.out.println("Before " + scenario.getName());
	}

	@After("@SmokeTest")
	public void AfterDisplayMessage(Scenario scenario) {
		System.out.println("After " + scenario.getName());
	}

}
