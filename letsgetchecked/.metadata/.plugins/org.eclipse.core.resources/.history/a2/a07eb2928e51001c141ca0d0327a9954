package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pt.po.edimilsonestevam.setup.Base;

public class Maps extends Base {

	public Maps(WebDriver browser) {
		super(browser);

	}

	public WebElement element = null;
	
	public void clickZoomIn() {
		
		System.out.println("• Clicking Zoom In...");
		
		String clickZoomIn = "//button[@id='widget-zoom-in']";
		
		for(int i = 0; i <= 2; i++) {
			element.findElement(By.xpath(clickZoomIn)).click();
		}
		
	}
	
	public void clickZoomOut( ) {
		
		System.out.println("• Clicking Zoom Out...");
		
		String clickZoomOut = "//button[@id='widget-zoom-out']";
		
		for(int i = 0; i <= 2; i++) {
			element.findElement(By.xpath(clickZoomOut)).click();
		}
		
	}
	
}
