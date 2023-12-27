package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	
	public void removeProductCart () {
		
		System.out.println("• Removing Product Cart...");
		
	}
	
	public void totalProductCart () {
		
		System.out.println("• Verifying Total Product Cart...");
		
	}
	
	public void verifyProductList () {
		
		System.out.println("• Verifying Product List...");
		
	}
	
}
