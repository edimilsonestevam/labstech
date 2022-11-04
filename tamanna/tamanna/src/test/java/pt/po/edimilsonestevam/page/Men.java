package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Men extends Base {

	public Men(WebDriver browser) {
		super(browser);

	}

	public void chooseClothingCategory() {
		
		System.out.println("• Choosing Clothing Category...");
		
		String clothing = "//a[contains(text(),'Clothing')]";
		
		browser.findElement(By.xpath(clothing));
		
	}
	
	public void chooseClothing () {
		
		System.out.println("• Choosing Clothing...");
		
	}
}
