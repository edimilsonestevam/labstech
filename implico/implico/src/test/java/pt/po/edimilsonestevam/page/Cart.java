package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Cart extends Base {

	public Cart(WebDriver browser) {
		super(browser);
	
	}

	public void clickCart () {
		
		String xpathCartIcon = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]";
		
		browser.findElement(By.xpath(xpathCartIcon)).click();
		
	}
	
	public void checkProductsAddedCart () {
		
		
	}
	
	public void clickContinueShopping () {
		
		String idContinueShoppingButton = "continue-shopping";
		
		browser.findElement(By.id(idContinueShoppingButton)).click();
		
	}
	
	public void clickCheckout () {
		
		String idCheckoutButton = "checkout";
		
		browser.findElement(By.id(idCheckoutButton)).click();
		
	}
}
