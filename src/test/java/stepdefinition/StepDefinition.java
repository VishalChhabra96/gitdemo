package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^user is on banking landing page$")
	public void user_is_on_banking_landing_page() {
	    System.out.println("Given executed!");
	}

	@When("^user login into application with username and pwd$")
	public void user_login_into_application_with_username_and_pwd() {

	    System.out.println("When executed!");
	}

	@Then("^home page is populated$")
	public void home_page_is_populated() {

	    System.out.println("Then executed!");
	}

	@Then("^credit cards should be displayed$")
	public void credit_cards_should_be_displayed() {
	    System.out.println("Then executed!");
	}
}