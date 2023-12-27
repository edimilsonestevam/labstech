package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import pt.po.edimilsonestevam.setup.Base;

public class Inventory extends Base {

	public Inventory(WebDriver browser) {
		super(browser);
	
	}

	public void addProductCart (int informProductNumber) {
		
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
	
	public void removeProductCart (int informProductNumber) {
		
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
	
	public void totalProductCart () {
		
		System.out.println("• Verifying Total Product Cart...");
		
	}
	
	public void verifyProductList (String productFirst, String productSecond, String productThird, String productFourth, String productFifth, String poductSixth) {
		
		System.out.println("• Verifying Product List...");
		
		String cssSelectorProductFirst = "div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(1) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name";
		String cssSelectorProductSecond = "div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(2) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name";
		String cssSelectorProductThird = "div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(3) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name";
		String cssSelectorProductFourth = "div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(4) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name";
		String cssSelectorProductFifth = "div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(5) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name";
		String cssSelectorPoductSixth = "div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(6) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name";
		
		WebElement element = null;
		
		WebDriverWait wait = new WebDriverWait(browser, 3);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelectorProductFirst)));
		String actualProductFirst = element.findElement(By.cssSelector(cssSelectorProductFirst)).getText();
		Assert.assertEquals("Verify if it is the same Product First", productFirst, actualProductFirst);
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelectorProductSecond)));
		String actualProductSecond = element.findElement(By.cssSelector(cssSelectorProductSecond)).getText();
		Assert.assertEquals("Verify if it is the same Product Second", productSecond, actualProductSecond);
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelectorProductThird)));
		String actualProductThird = element.findElement(By.cssSelector(cssSelectorProductThird)).getText();
		Assert.assertEquals("Verify if it is the same Product Third", productThird, actualProductThird);
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelectorProductFourth)));
		String actualProductFourth = element.findElement(By.cssSelector(cssSelectorProductFourth)).getText();
		Assert.assertEquals("Verify if it is the same Product Fourth", productFourth, actualProductFourth);
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelectorProductFifth)));
		String actualProductFifth = element.findElement(By.cssSelector(cssSelectorProductFifth)).getText();
		Assert.assertEquals("Verify if it is the same Product Fifth", productFifth, actualProductFifth);
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelectorPoductSixth)));
		String actualProductSixth = element.findElement(By.cssSelector(cssSelectorPoductSixth)).getText();
		Assert.assertEquals("Verify if it is the same Product Sixth", poductSixth, actualProductSixth);
		
	}
	
}
