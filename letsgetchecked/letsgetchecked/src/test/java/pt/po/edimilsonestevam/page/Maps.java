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
	
	public void zoomIn() {
		
		String clickZoomIn = "widget-zoom-in";
		
		for(int i = 0; i <= 2; i++) {
			element.findElement(By.id(clickZoomIn)).click();
		}
		
	}
	
	public void zoomOut( ) {
		
		String clickZoomOut = "widget-zoom-out";
		
		for(int i = 0; i <= 2; i++) {
			element.findElement(By.id(clickZoomOut)).click();
		}
		
	}
	
}
