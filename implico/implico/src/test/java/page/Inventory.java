package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import setup.Base;

public class Inventory extends Base {

	public Inventory(WebDriver browser) {
		super(browser);

	}

	public void addProductCart(int informProductNumber) {

		System.out.println("• Adding Product Cart...");

		String idAddProductFirst = "add-to-cart-sauce-labs-backpack";
		String idAddProductSecond = "add-to-cart-sauce-labs-bike-light";
		String idAddProductThird = "add-to-cart-sauce-labs-bolt-t-shirt";
		String idAddProductFourth = "add-to-cart-sauce-labs-fleece-jacket";
		String idAddProductFifth = "add-to-cart-sauce-labs-onesie";
		String idAddPoductSixth = "add-to-cart-test.allthethings()-t-shirt-(red)";

		switch (informProductNumber) {
			case 1:
				browser.findElement(By.id(idAddProductFirst)).click();
				break;

			case 2:
				browser.findElement(By.id(idAddProductSecond)).click();
				break;

			case 3:
				browser.findElement(By.id(idAddProductThird)).click();
				break;

			case 4:
				browser.findElement(By.id(idAddProductFourth)).click();
				break;

			case 5:
				browser.findElement(By.id(idAddProductFifth)).click();
				break;

			case 6:
				browser.findElement(By.id(idAddPoductSixth)).click();
				break;

			default:
				System.out.println("You should inform: 1, 2, 3, 4, 5 or 6!");
		}

	}

	public void removeProductCart(int informProductNumber) {

		System.out.println("• Removing Product Cart...");

		String idRemoveProductFirst = "remove-sauce-labs-backpack";
		String idRemoveProductSecond = "remove-sauce-labs-bike-light";
		String idRemoveProductThird = "remove-sauce-labs-bolt-t-shirt";
		String idRemoveProductFourth = "remove-sauce-labs-fleece-jacket";
		String idRemoveProductFifth = "remove-sauce-labs-onesie";
		String idRemovePoductSixth = "remove-test.allthethings()-t-shirt-(red)";

		switch (informProductNumber) {
			case 1:
				browser.findElement(By.id(idRemoveProductFirst)).click();
				break;

			case 2:
				browser.findElement(By.id(idRemoveProductSecond)).click();
				break;

			case 3:
				browser.findElement(By.id(idRemoveProductThird)).click();
				break;

			case 4:
				browser.findElement(By.id(idRemoveProductFourth)).click();
				break;

			case 5:
				browser.findElement(By.id(idRemoveProductFifth)).click();
				break;

			case 6:
				browser.findElement(By.id(idRemovePoductSixth)).click();
				break;

			default:
				System.out.println("You should inform: 1, 2, 3, 4, 5 or 6!");
		}

	}

	public void verifyProductList(String productFirst, String productSecond, String productThird, String productFourth,
			String productFifth, String poductSixth) {

		System.out.println("• Verifying Product List...");

		String xpathProductFirst = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]";
		String xpathProductSecond = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/div[1]";
		String xpathProductThird = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/div[1]";
		String xpathProductFourth = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/a[1]/div[1]";
		String xpathProductFifth = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/a[1]/div[1]";
		String xpathPoductSixth = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/a[1]/div[1]";

		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(6));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductFirst)));
		String actualProductFirst = element.findElement(By.xpath(xpathProductFirst)).getText();
		Assert.assertEquals("Verify if it is the same Product First", productFirst, actualProductFirst);

		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductSecond)));
		String actualProductSecond = element.findElement(By.xpath(xpathProductSecond)).getText();
		Assert.assertEquals("Verify if it is the same Product Second", productSecond, actualProductSecond);

		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductThird)));
		String actualProductThird = element.findElement(By.xpath(xpathProductThird)).getText();
		Assert.assertEquals("Verify if it is the same Product Third", productThird, actualProductThird);

		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductFourth)));
		String actualProductFourth = element.findElement(By.xpath(xpathProductFourth)).getText();
		Assert.assertEquals("Verify if it is the same Product Fourth", productFourth, actualProductFourth);

		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductFifth)));
		String actualProductFifth = element.findElement(By.xpath(xpathProductFifth)).getText();
		Assert.assertEquals("Verify if it is the same Product Fifth", productFifth, actualProductFifth);

		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathPoductSixth)));
		String actualProductSixth = element.findElement(By.xpath(xpathPoductSixth)).getText();
		Assert.assertEquals("Verify if it is the same Product Sixth", poductSixth, actualProductSixth);

	}

	public void verifyCurrentPage(String expectedUrl) {

		System.out.println("• Verifying Current Page...");

		String currentUrl = browser.getCurrentUrl();
		Assert.assertEquals("Checking Current URL", "https://" + expectedUrl, currentUrl);

	}
}
