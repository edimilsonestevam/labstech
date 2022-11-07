package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import pt.po.edimilsonestevam.setup.Base;

public class Cart extends Base {

	public Cart(WebDriver browser) {
		super(browser);

	}

	public void removeItemsCart() {

		System.out.println("• Removing Items Cart...");

		String removeButton = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]/*[1]";

		browser.findElement(By.xpath(removeButton)).click();

	}

	public void checkItemsTotal(String expectedItemsTotal) {

		System.out.println("• Checking Items Total...");

		String itemsTotal = "//h3[contains(text(),'" + expectedItemsTotal + " items')]";
		String currentItemsTotal = browser.findElement(By.xpath(itemsTotal)).getText();

		Assert.assertEquals("Checking Items Total", expectedItemsTotal, currentItemsTotal);

	}

	public void checkItemsPrice() {

		System.out.println("• Checking Items Price...");

		String price = "total-value";
		String currentPriceValue = browser.findElement(By.id(price)).getText();
		String expectedPriceValue = "KWD 0.000";

		Assert.assertEquals("Checking Items Price", expectedPriceValue, currentPriceValue);

	}

}