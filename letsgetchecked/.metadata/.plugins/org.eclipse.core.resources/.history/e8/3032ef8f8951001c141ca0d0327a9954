package pt.po.edimilsonestevam.stepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junitparams.JUnitParamsRunner;
import pt.po.edimilsonestevam.page.ConsentGoogle;
import pt.po.edimilsonestevam.page.Search;
import pt.po.edimilsonestevam.setup.Configuration;

@RunWith(JUnitParamsRunner.class)
public class TestSteps {

	protected static WebDriver browser;
	
	@Given("^i am Google Maps page \"([^\"]*)\"$")
	public void i_am_Google_Maps_page(String url) throws Throwable {

		browser = new Configuration().browserOpen("chrome", url);
		new ConsentGoogle(browser).consentGoogleConfirm();
		new Search(browser).verifyActualPage(url);
		
	}

	@When("^i type name city \"([^\"]*)\" in the search field$")
	public void i_type_name_city_in_the_search_field(String cityName) throws Throwable {

		new Search(browser).searchCity(cityName);
		
	}

	@Then("^Google Maps will show city wanted \"([^\"]*)\"$")
	public void google_Maps_will_show_city_wanted(String cityWanted) throws Throwable {
	    
		new Search(browser).verifyCityName(cityWanted);
		new Configuration().browserClose(browser);
		
	}

}
