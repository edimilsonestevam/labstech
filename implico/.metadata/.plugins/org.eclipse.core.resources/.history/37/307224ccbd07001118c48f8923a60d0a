package page;

import java.time.Duration;

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

	public void clickCart() {

		System.out.println("• Clicking Cart...");

		String xpathCartIcon = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]";

		browser.findElement(By.xpath(xpathCartIcon)).click();

	}

	public void checkTotalProductsAddedCart(String quantityProducts) {

		System.out.println("• Verifying Total Product Cart...");

		String xpathProductFirstAdded = "//span[contains(text(),'1')]";
		String xpathProductSecondAdded = "//span[contains(text(),'2')]";
		String xpathProductThirdAdded = "//span[contains(text(),'3')]";
		String xpathProductFourthAdded = "//span[contains(text(),'4')]";
		String xpathProductFifthAdded = "//span[contains(text(),'5')]";
		String xpathProductSixthAdded = "//span[contains(text(),'6')]";

		String productFirst = "1";
		String productSecond = "2";
		String productThird = "3";
		String productFourth = "4";
		String productFifth = "5";
		String poductSixth = "6";

		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(3));

		if (productFirst.equalsIgnoreCase(quantityProducts)) {

			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductFirstAdded)));
			String actualProductFirstAdded = element.findElement(By.xpath(xpathProductFirstAdded)).getText();
			Assert.assertEquals("1 Product Added", quantityProducts, actualProductFirstAdded);

		} else if (productSecond.equalsIgnoreCase(quantityProducts)) {

			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductSecondAdded)));
			String actualProductSecondAdded = element.findElement(By.xpath(xpathProductSecondAdded)).getText();
			Assert.assertEquals("2 Products Added", quantityProducts, actualProductSecondAdded);

		} else if (productThird.equalsIgnoreCase(quantityProducts)) {

			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductThirdAdded)));
			String actualProductThirdAdded = element.findElement(By.xpath(xpathProductThirdAdded)).getText();
			Assert.assertEquals("3 Products Added", quantityProducts, actualProductThirdAdded);

		} else if (productFourth.equalsIgnoreCase(quantityProducts)) {

			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductFourthAdded)));
			String actualProductFourthAdded = element.findElement(By.xpath(xpathProductFourthAdded)).getText();
			Assert.assertEquals("4 Products Added", quantityProducts, actualProductFourthAdded);

		} else if (productFifth.equalsIgnoreCase(quantityProducts)) {

			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductFifthAdded)));
			String actualProductFifthAdded = element.findElement(By.xpath(xpathProductFifthAdded)).getText();
			Assert.assertEquals("5 Products Added", quantityProducts, actualProductFifthAdded);

		} else if (poductSixth.equalsIgnoreCase(quantityProducts)) {

			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathProductSixthAdded)));
			String actualProductSixthAdded = element.findElement(By.xpath(xpathProductSixthAdded)).getText();
			Assert.assertEquals("6 Products Added", quantityProducts, actualProductSixthAdded);

		} else {

			System.out.println("You should inform: 1, 2, 3, 4, 5 or 6!");

		}

	}

	public void clickContinueShopping() {

		System.out.println("• Clicking Continue Shopping...");

		String idContinueShoppingButton = "continue-shopping";

		browser.findElement(By.id(idContinueShoppingButton)).click();

	}

	public void clickCheckout() {

		System.out.println("• Clicking Checkout...");

		String idCheckoutButton = "checkout";

		browser.findElement(By.id(idCheckoutButton)).click();

	}
}
