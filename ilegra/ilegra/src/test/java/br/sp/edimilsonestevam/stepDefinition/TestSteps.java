package br.sp.edimilsonestevam.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import br.sp.edimilsonestevam.page.NewsArticle;
import br.sp.edimilsonestevam.setup.Configuration;
import org.openqa.selenium.WebDriver;


public class TestSteps {

	protected static WebDriver browser;

	@Given("I am Agi Blog {string}")
	public void i_am_agi_blog(String url) {

		browser = new Configuration().browserOpen("firefox", url, "no");

	}

	@When("I choose a news {string}")
	public void i_choose_a_news(String article) {

		new NewsArticle(browser).readNewsArticle("1");

	}

	@Then("website will show a news with {string}, {string}, {string}")
	public void website_will_show_a_news_with(String article, String author, String date) {

		new NewsArticle(browser).verifyCurrentPage("blog.agibank.com.br/golpe-da-cnh/");
		new NewsArticle(browser).verifyNewsArticle(article, author, date);

	}

	@Then("three pieces of news at the end of article {string}, {string}, {string}")
	public void three_pieces_of_news_at_the_end_of_article(String firstArticle, String secondArticle, String thirdArticle) {

		new NewsArticle(browser).verifyNewsArticleFooter(firstArticle, secondArticle, thirdArticle);
		new Configuration().browserClose(browser);

	}

}
