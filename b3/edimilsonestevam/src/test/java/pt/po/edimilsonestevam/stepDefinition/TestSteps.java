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
		
		browser = new Configuration().browserOpen("firefox", url, "no");
		
	}

	@When("^I fill all fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", (\\d+), \"([^\"]*)\", (\\d+), \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_fill_all_fields(String carName, String model, String cylinderCapacity, String enginePerformance, String dateManufacture, int mumberSeats, String rightHandDrive, int numberSeatsMotor, String fuelType, String payload, String totalWeight, String listPrice, String annualMileage, String tabName) throws Throwable {

		new EnterVehicleData(browser).fillEnterVehicleDataRegister(carName, model, cylinderCapacity, enginePerformance, dateManufacture, mumberSeats, rightHandDrive, numberSeatsMotor, fuelType, payload, totalWeight, listPrice, annualMileage, tabName);
		
	}
	
	@When("^I confirm action$")
	public void i_confirm_action() throws Throwable {
		
		new Core(browser).clickNextButton();
		
	}

	@Then("^the system will show \"([^\"]*)\" tab$")
	public void the_system_will_show_tab(String tabName) throws Throwable {

		new Core(browser).verifyTab(tabName);
		new Configuration().browserClose(browser);
		
	}

}	