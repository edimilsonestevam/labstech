package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Cart extends Base {

	public Cart(WebDriver browser) {
		super(browser);
	
	}

	public void clickCart () {
		
		System.out.println("• Clicking Cart...");
		
		String xpathCartIcon = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]";
		
		browser.findElement(By.xpath(xpathCartIcon)).click();
		
	}
	
	public void checkTotalProductsAddedCart () {
		
		System.out.println("• Verifying Total Product Cart...");
		
		
	}
	
	public void clickContinueShopping () {
		
		System.out.println("• Clicking Continue Shopping...");
		
		String idContinueShoppingButton = "continue-shopping";
		
		browser.findElement(By.id(idContinueShoppingButton)).click();
		
	}
	
	public void clickCheckout () {
		
		System.out.println("• Clicking Checkout...");
		
		String idCheckoutButton = "checkout";
		
		browser.findElement(By.id(idCheckoutButton)).click();
		
	}
}
