package pt.po.edimilsonestevam.setup;

import org.openqa.selenium.WebDriver;

public class Base {

	protected WebDriver browser;
	
	public Base(WebDriver browser) {
		
		this.browser = browser;
		
	}
	
	public void previewButton() {
		
		System.out.println("• Clicking Preview Button...");
		
		String idPreviewButton = "preventervehicledata";
		
	}
	
	public void nextButton() {
		
		System.out.println("• Clicking Next Button...");
		
		String idNextButton = "nextenterinsurantdata";
		
	}
	
	public void openButton() {
		
		System.out.println("• Clicking Open Button...");
		
		String idOpenButton = "open";
		
	}
	
}
