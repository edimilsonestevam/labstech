package pt.po.edimilsonestevam.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {

	protected WebDriver browser;
	
	public Base(WebDriver browser) {
		
		this.browser = browser;
		
	}
	
	public void clickPreviewButton() {
		
		System.out.println("• Clicking Preview Button...");
		
		String idPreviewButton = "preventervehicledata";
		browser.findElement(By.id(idPreviewButton)).click();
		
	}
	
	public void clickNextButton() {
		
		System.out.println("• Clicking Next Button...");
		
		String idNextButton = "nextenterinsurantdata";
		browser.findElement(By.id(idNextButton)).click();
		
	}
	
	public void clickOpenButton() {
		
		System.out.println("• Clicking Open Button...");
		
		String idOpenButton = "open";
		browser.findElement(By.id(idOpenButton)).click();
		
	}
	
}
