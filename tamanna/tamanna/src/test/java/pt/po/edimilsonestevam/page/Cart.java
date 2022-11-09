package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import pt.po.edimilsonestevam.setup.Base;

public class Cart extends Base {

	public Cart(WebDriver browser) {
		super(browser);

	}

	public void removeItemsCart() {

		System.out.println("• Removing Items Cart...");

		String removeButton = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]/*[1]";

		WebElement removeItems = null;

		WebDriverWait wait = new WebDriverWait(browser, 10);

		removeItems = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(removeButton)));
		removeItems.click();

	}

	public void checkItemsPrice() {

		System.out.println("• Checking Items Price...");

		String price = "total-value";
		String currentPriceValue = browser.findElement(By.id(price)).getText();
		String expectedPriceValue = "KWD 0.000";

		Assert.assertEquals("Checking Items Price", expectedPriceValue, currentPriceValue);

	}

	public void checkItemsTotal(String expectedItemsTotal) {

		System.out.println("• Checking Items Total...");

		String itemsTotal = "//h3[contains(text(),'" + expectedItemsTotal + " items')]";
		String currentItemsTotal = browser.findElement(By.xpath(itemsTotal)).getText();

		Assert.assertEquals("Checking Items Total", expectedItemsTotal, currentItemsTotal);

	}

	public void checkTotalPrice(String expectedTotalPrice) {

		System.out.println("• Checking Total Price...");

		String totalPricePath = "//p[contains(text(),'" + expectedTotalPrice + "')]";

		WebElement totalPrice = null;
		WebDriverWait wait = new WebDriverWait(browser, 10);

		totalPrice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(totalPricePath)));
		String currentTotalPrice = totalPrice.getText();

		Assert.assertEquals("Checking Total Price", expectedTotalPrice, currentTotalPrice);

	}

	public void goBackHome(String expectedUrl) {

		System.out.println("• Going Home...");

		String homePage = "Home";

		browser.findElement(By.linkText(homePage)).click();

		try {

			Thread.sleep(5);
			String currentUrl = browser.getCurrentUrl();

			Assert.assertEquals("Checking Current URL", expectedUrl, currentUrl);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

}