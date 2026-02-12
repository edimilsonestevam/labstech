package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Cart;
import page.Inventory;
import page.Login;
import page.Menu;
import setup.Configuration;

public class TestSteps {

	protected static WebDriver browser;

	@Given("^I am Sauce Demo page \"([^\"]*)\"$")
	public void i_am_Sauce_Demo_page(String url) throws Throwable {

		browser = new Configuration().browserOpen("chrome", "yes", url, "no");

	}

	@When("^I inform username \"([^\"]*)\" in the Username field, password \"([^\"]*)\" in the Password field$")
	public void i_inform_username_in_the_Username_field_password_in_the_Password_field(String username, String password)
			throws Throwable {

		new Login(browser).doLogin(username, password);

	}

	@When("^I confirm action$")
	public void i_confirm_action() throws Throwable {

		new Login(browser).confirmLogin();

	}

	@Then("^Sauce Demo will show products list \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void sauce_Demo_will_show_products_list(String productFirst, String productSecond, String productThird,
			String productFourth, String productFifth, String poductSixth) throws Throwable {

		new Inventory(browser).verifyProductList(productFirst, productSecond, productThird, productFourth, productFifth,
				poductSixth);
		new Menu(browser).clickLogout();
		new Configuration().browserClose(browser);

	}

	@Given("^I am Inventory page \"([^\"]*)\"$")
	public void i_am_Inventory_page(String url) throws Throwable {

		browser = new Configuration().browserOpen("chrome", "yes", url, "no");
		new Login(browser).doLogin("standard_user", "secret_sauce");
		new Login(browser).confirmLogin();
		new Inventory(browser).verifyCurrentPage(url);

	}

	@When("^I add two products \"([^\"]*)\", \"([^\"]*)\" in the cart$")
	public void i_add_two_products_in_the_cart(String productFirst, String productSecond) throws Throwable {

		new Inventory(browser).addProductCart(1);
		new Inventory(browser).addProductCart(2);

	}

	@Then("^Sauce Demo will show the quantity of products \"([^\"]*)\" in the cart$")
	public void sauce_Demo_will_show_the_quantity_of_products_in_the_cart(String quantityCurrentProduct)
			throws Throwable {

		new Cart(browser).checkTotalProductsAddedCart(quantityCurrentProduct);
		new Cart(browser).clickCart();
		new Inventory(browser).removeProductCart(2);
		new Cart(browser).checkTotalProductsAddedCart("1");
		new Menu(browser).clickLogout();
		new Configuration().browserClose(browser);

	}

}
