package pt.po.edimilsonestevam.stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pt.po.edimilsonestevam.page.Login;
import pt.po.edimilsonestevam.setup.Configuration;

public class TestSteps {

	protected static WebDriver browser;
	
	@Given("^I am Sauce Demo page \"([^\"]*)\"$")
	public void i_am_Sauce_Demo_page(String url) throws Throwable {

		browser = new Configuration().browserOpen("firefox", url);
	
	}

	@When("^I inform username \"([^\"]*)\" in the Username field, password \"([^\"]*)\" in the Password field$")
	public void i_inform_username_in_the_Username_field_password_in_the_Password_field(String username, String password) throws Throwable {

		new Login(browser).doLogin(username, password);
		
	}

	@When("^I confirm action$")
	public void i_confirm_action() throws Throwable {

		new Login(browser).confirmLogin();
		
	}

	@Then("^Sauce Demo will show products list \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void sauce_Demo_will_show_products_list(String productFirst, String productSecond, String productThird, String productFourth, String productFifth, String poductSixth) throws Throwable {

	}

}
