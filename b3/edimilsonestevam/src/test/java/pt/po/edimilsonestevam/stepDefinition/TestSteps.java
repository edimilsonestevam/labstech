package pt.po.edimilsonestevam.stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pt.po.edimilsonestevam.page.EnterVehicleData;
import pt.po.edimilsonestevam.setup.Base;
import pt.po.edimilsonestevam.setup.Configuration;

public class TestSteps {

	protected static WebDriver browser;
	
	@Given("^I want to register my car in the Enter Vehicle Data \"([^\"]*)\"$")
	public void i_want_to_register_my_car_in_the_Enter_Vehicle_Data(String url) throws Throwable {
		
		browser = new Configuration().browserOpen("firefox", url, "yes");
		
	}
	
	@When("^I fill all fields \"([^\"]*)\", (\\d+), (\\d+), (\\d+), (\\d+), \"([^\"]*)\", \"([^\"]*)\", (\\d+)$")
	public void i_fill_all_fields(String carName, int enginePerformance, int dateManufacture, int listPrice, int seatsNumber, String fuelType, String licensePlateNumber, int annualMileage) throws Throwable {

		new EnterVehicleData(browser).fillEnterVehicleDataRegister(carName, enginePerformance, dateManufacture, listPrice, seatsNumber, fuelType, licensePlateNumber, annualMileage);
		
	}

	@When("^I confirm action$")
	public void i_confirm_action() throws Throwable {

		new Base(browser).clickNextButton();
		
	}

	@Then("^the system will show the success message \"([^\"]*)\"$")
	public void the_system_will_show_the_success_message(String arg1) throws Throwable {

	}	
}	