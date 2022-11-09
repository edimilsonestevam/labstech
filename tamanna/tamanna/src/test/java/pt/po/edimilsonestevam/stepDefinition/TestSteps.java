package pt.po.edimilsonestevam.stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pt.po.edimilsonestevam.page.Buy;
import pt.po.edimilsonestevam.page.Cart;
import pt.po.edimilsonestevam.page.Home;
import pt.po.edimilsonestevam.page.Men;
import pt.po.edimilsonestevam.page.Women;
import pt.po.edimilsonestevam.setup.Configuration;

public class TestSteps {

	public static WebDriver browser;
	
	@Given("^I have a visitor profile \"([^\"]*)\" on Tamanna's website \"([^\"]*)\"$")
	public void i_have_a_visitor_profile_on_Tamanna_s_website(String profile, String mainUrl) throws Throwable {
		
		browser = new Configuration().browserOpen("chrome", mainUrl);
		new Home(browser).acceptNotifications("No");
		
	}

	@When("^I choose a category \"([^\"]*)\" to choose a subcategory \"([^\"]*)\" to buy two products from different categories$")
	public void i_choose_a_category_to_choose_a_subcategory_to_buy_two_products_from_different_categories(String category, String subcategory) throws Throwable {

		new Home(browser).chooseCategory(category);
		new Men(browser).chooseMenSubcategory(subcategory);
		new Men(browser).chooseMenClothing("2");

	}
	
	@When("^I choose the sizes of the products \"([^\"]*)\" to make the purchase$")
	public void i_choose_the_sizes_of_the_products_to_make_the_purchase(String size) throws Throwable {

		new Buy(browser).selectClothingSize(size);
		new Buy(browser).addItemsCart();
		
		new Home(browser).chooseCategory("Women");
		new Women(browser).chooseWomenSubcategory("Shoes");
		new Women(browser).chooseWomenShoes("1");
		new Buy(browser).selectShoesSize("38");
		
		new Buy(browser).addItemsCart();
		new Buy(browser).goShoppingBag();
		
	}

	@When("^I check the product price \"([^\"]*)\" and quantity of products \"([^\"]*)\" in the purchase$")
	public void i_check_the_product_price_and_quantity_of_products_in_the_purchase(String productPrice, String quantityProducts) throws Throwable {

		new Cart(browser).checkTotalPrice(productPrice);
		new Cart(browser).checkItemsTotal(quantityProducts);

	}

	@When("^I remove both products from the cart$")
	public void i_remove_both_products_from_the_cart() throws Throwable {

		new Cart(browser).removeItemsCart();
		new Cart(browser).removeItemsCart();
		
	}

	@Then("^the system displays the zeroed total price \"([^\"]*)\"$")
	public void the_system_displays_the_zeroed_total_price(String totalPrice) throws Throwable {

		new Cart(browser).checkTotalPrice(totalPrice);
		
	}
	
	@Then("^I navigate to the Home of Tamanna's website \"([^\"]*)\"$")
	public void i_navigate_to_the_Home_of_Tamanna_s_website(String homeUrl) throws Throwable {

		new Cart(browser).goBackHome(homeUrl);
		new Configuration().browserClose(browser);
		
	}

}