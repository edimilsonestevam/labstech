package pt.po.edimilsonestevam.setup;

import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Core extends Base {

	public Core(WebDriver browser) {
		super(browser);
	
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
	
	public void verifyMessage(String successMessage) throws Exception {
		
		try {
           
            WebElement messageElement = browser.findElement(By.id("success-message"));
            String actualMessage = messageElement.getText();
            assertEquals("Verifying the Success Message", successMessage, actualMessage);
            
        } 
		catch (NoSuchElementException e) {
			
            throw new Exception("Success message element not found.", e);
            
        }
		
	}
	
}
