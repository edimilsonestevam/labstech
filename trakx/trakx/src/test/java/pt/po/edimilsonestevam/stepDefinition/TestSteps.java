package pt.po.edimilsonestevam.stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pt.po.edimilsonestevam.page.Login;
import pt.po.edimilsonestevam.setup.Configuration;

public class TestSteps {

	public static WebDriver browser;
	
	@Given("^I want to access Trakx Homepage \"([^\"]*)\"$")
	public void i_want_to_access_Trakx_Homepage(String url) throws Throwable {

		browser = new Configuration().browserOpen("chrome", url);
		
	}
	
	@When("^I inform user \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_inform_user_and_password(String user, String password) throws Throwable {

		new Login(browser).clickProfile();
		new Login(browser).informUser(user);
		new Login(browser).informPassword(password);
		
	}

	@Then("^the system will show me the Trakx Homepage \"([^\"]*)\"$")
	public void the_system_will_show_me_the_Trakx_Homepage(String homepage) throws Throwable {

		new Login(browser).clickEnterButton();
		new Login(browser).verifyCurrentPage();
		
	}
}