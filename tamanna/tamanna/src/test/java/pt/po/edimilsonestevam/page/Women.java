package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Women extends Base {

	public Women(WebDriver browser) {
		super(browser);

	}

	public void chooseShoesCategory() {
		
		System.out.println("• Choosing Shoe Category...");
		
		String shoesCategory = "Shoes";
		
		browser.findElement(By.linkText(shoesCategory));
		
	}
	
	public void chooseShoes () {
		
		System.out.println("• Choosing Shoes...");
		
		String shoes = "//body/div[@id='__next']/div[1]/div[2]/main[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[1]/a[1]/div[1]/span[1]/img[1]";
		
		browser.findElement(By.xpath(shoes)).click();
	}
	
}