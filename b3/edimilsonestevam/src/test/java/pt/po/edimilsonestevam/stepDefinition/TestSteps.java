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

	@When("^I fill all fields \"([^\"]*)\", \"([^\"]*)\", (\\d+), (\\d+), \"([^\"]*)\", (\\d+), \"([^\"]*)\", (\\d+), \"([^\"]*)\", (\\d+), (\\d+), (\\d+), \"([^\"]*)\", (\\d+)$")
	public void i_fill_all_fields(String carName, String model, int mumberSeats, int enginePerformance, String dateManufacture, int numberSeats, String rightHandDrive, int numberSeatsMotor, String fuelType, int payload, int totalWeight, int listPrice, String licensePlateNumber, int annualMileage) throws Throwable {

		new EnterVehicleData(browser).fillEnterVehicleDataRegister(carName, model, mumberSeats, enginePerformance, dateManufacture, numberSeats, rightHandDrive, numberSeatsMotor, fuelType, payload, totalWeight, listPrice, licensePlateNumber, annualMileage);
		
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