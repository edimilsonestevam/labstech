package pt.po.edimilsonestevam.stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pt.po.edimilsonestevam.page.EnterInsurantData;
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

	@When("^I confirm register action$")
	public void i_confirm_register_action() throws Throwable {

		new Core(browser).takeScreenShot("Enter Vehicle Data");
		new Core(browser).clickInsurantDataNextButton();
		
	}
	
	@Then("^the system will show \"([^\"]*)\" Enter Insurant Data tab$")
	public void the_system_will_show_Enter_Insurant_Data_tab(String tabName) throws Throwable {

		new Core(browser).verifyInsurantDataTab(tabName);
		new Configuration().browserClose(browser);
		
	}
	
	@Given("^I want to register my insurance in the Enter Insurant Data \"([^\"]*)\"$")
	public void i_want_to_register_my_insurance_in_the_Enter_Insurant_Data(String url) throws Throwable {
		
		browser = new Configuration().browserOpen("firefox", url, "no");
		
	}
	
	@When("^I fill all fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_fill_all_fields(String firstName, String lastName, String dateBirth, String gender, String streetAddress, String country, String zipCode, String city, String occupation, String hobbies, String website) throws Throwable {

		new EnterInsurantData(browser).clickEnterInsurantDataTab();
		new EnterInsurantData(browser).fillEnterInsurantData(firstName, lastName, dateBirth, gender, streetAddress, country, zipCode, city, occupation, hobbies, website);
		
	}
	
	@When("^I confirm insurance action$")
	public void i_confirm_insurance_action() throws Throwable {
		
		new Core(browser).takeScreenShot("Enter Insurant Data");
		new Core(browser).clickProductDataNextButton();
		
	}
	
	@Then("^the system will show \"([^\"]*)\" Enter Product Data tab$")
	public void the_system_will_show_Enter_Product_Data_tab(String tabName) throws Throwable {

		new Core(browser).verifyProductDataTab(tabName);
		new Configuration().browserClose(browser);
		
	}
	
}	