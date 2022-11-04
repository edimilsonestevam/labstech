package pt.po.edimilsonestevam.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {

	protected WebDriver browser;

	public Base(WebDriver browser) {

		this.browser = browser;

	}
	
	public void selectItemsQuantity (String itemsQuantity) {
		
		System.out.println("• Selecting Items Quantity...");
		
		String idItemsQuantity = "quantity-selector";
		String oneItemsQuantity = "//label[contains(text(),'1')]";
		String twoItemsQuantity = "//label[contains(text(),'2')]";
		String threeItemsQuantity = "//label[contains(text(),'3')]";
		String forItemsQuantity = "//label[contains(text(),'4')]";
		String fiveItemsQuantity = "//label[contains(text(),'5')]";
		String sixItemsQuantity = "//label[contains(text(),'6')]";
		String sevenItemsQuantity = "//label[contains(text(),'7')]";
		String eightItemsQuantity = "//label[contains(text(),'8')]";
		String nineItemsQuantity = "//label[contains(text(),'9')]";
		
		browser.findElement(By.id(idItemsQuantity)).click();
		
		if (itemsQuantity.contentEquals("1")) {
			browser.findElement(By.xpath(oneItemsQuantity)).click();
		}
		else if (itemsQuantity.contentEquals("2")) {
			browser.findElement(By.xpath(twoItemsQuantity)).click();
		}
		else if (itemsQuantity.contentEquals("3")) {
			browser.findElement(By.xpath(threeItemsQuantity)).click();
		}
		else if (itemsQuantity.contentEquals("4")) {
			browser.findElement(By.xpath(forItemsQuantity)).click();
		}
		else if (itemsQuantity.contentEquals("5")) {
			browser.findElement(By.xpath(fiveItemsQuantity)).click();
		}
		else if (itemsQuantity.contentEquals("6")) {
			browser.findElement(By.xpath(sixItemsQuantity)).click();
		}
		else if (itemsQuantity.contentEquals("7")) {
			browser.findElement(By.xpath(sevenItemsQuantity)).click();
		}
		else if (itemsQuantity.contentEquals("8")) {
			browser.findElement(By.xpath(eightItemsQuantity)).click();
		}
		else if (itemsQuantity.contentEquals("9")) {
			browser.findElement(By.xpath(nineItemsQuantity)).click();
		}
		else {
			System.out.println("You should inform: 1, 2, 3, 4, 5, 6, 7, 8 or 9");
		}
		
	}
	
	public void addItemsCart () {
		
		System.out.println("• Adding Items Cart...");
		
		String addButton = "//button[contains(text(),'Add to cart')]";
		
			browser.findElement(By.xpath(addButton)).click();
			
	}
}