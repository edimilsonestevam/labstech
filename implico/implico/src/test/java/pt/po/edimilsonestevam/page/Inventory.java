package pt.po.edimilsonestevam.page;

import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Inventory extends Base {

	public Inventory(WebDriver browser) {
		super(browser);
	
	}

	public void addProductCart () {
		
		System.out.println("• Adding Product Cart...");
		
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
