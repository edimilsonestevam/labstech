package pt.po.edimilsonestevam.stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	protected static WebDriver browser;
	
	@Given("^I want to register my car in the Enter Vehicle Data$")
	public void i_want_to_register_my_car_in_the_Enter_Vehicle_Data() throws Throwable {

	}

	@When("^I fill all fields \"([^\"]*)\", (\\d+), (\\d+), (\\d+), (\\d+), \"([^\"]*)\", \"([^\"]*)\", (\\d+)$")
	public void i_fill_all_fields(String arg1, int arg2, int arg3, int arg4, int arg5, String arg6, String arg7, int arg8) throws Throwable {

	}

	@When("^I confirm action$")
	public void i_confirm_action() throws Throwable {

	}

	@Then("^the system will show the success message \"([^\"]*)\"$")
	public void the_system_will_show_the_success_message(String arg1) throws Throwable {

	}	
}	