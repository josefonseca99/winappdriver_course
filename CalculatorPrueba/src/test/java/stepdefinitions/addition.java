package stepdefinitions;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import steps.ScientificSumSteps;

public class addition {

	private ScientificSumSteps steps;

	@Given("^I have a calculator$")
	public void i_have_a_calculator() throws Throwable {
		steps.openCalculator();
	}

	@When("^I set two numbers to sum$")
	public void i_set_two_numbers_to_sum() throws Throwable {
		steps.setNumbers();
	}

	@And("^I press the equal button$")
	public void i_press_the_equal_button() throws Throwable {
		steps.getResult();
	}

	@Then("^A sum must have been done$")
	public void a_sum_must_have_been_done() throws Throwable {
		
	}
	
}

