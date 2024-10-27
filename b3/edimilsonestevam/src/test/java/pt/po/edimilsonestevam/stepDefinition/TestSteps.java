package pt.po.edimilsonestevam.stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pt.po.edimilsonestevam.page.EnterVehicleData;
import pt.po.edimilsonestevam.setup.Configuration;
import pt.po.edimilsonestevam.setup.Core;

public class TestSteps {

	protected static WebDriver browser;

	@Given("^I want to register my car in the Enter Vehicle Data \"([^\"]*)\"$")
	public void i_want_to_register_my_car_in_the_Enter_Vehicle_Data(String url) throws Throwable {
		
		browser = new Configuration().browserOpen("firefox", url, "yes");
		
	}

	@When("^I fill all fields \"([^\"]*)\", \"([^\"]*)\", (\\d+), (\\d+), (\\d+), (\\d+), \"([^\"]*)\", (\\d+), \"([^\"]*)\", (\\d+), (\\d+), (\\d+), \"([^\"]*)\", (\\d+)$")
	public void i_fill_all_fields(String arg1, String arg2, int arg3, int arg4, int arg5, int arg6, String arg7, int arg8, String arg9, int arg10, int arg11, int arg12, String arg13, int arg14) throws Throwable {

		new EnterVehicleData(browser)
	}
	
	@When("^I confirm action$")
	public void i_confirm_action() throws Throwable {
		
		new Core(browser).clickNextButton();
		
	}

	@Then("^the system will show the success message \"([^\"]*)\"$")
	public void the_system_will_show_the_success_message(String successMessage) throws Throwable {

		new Core(browser).verifyMessage(successMessage);
		new Configuration().browserClose(browser);
	
	}

}	