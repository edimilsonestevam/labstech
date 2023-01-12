package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pt.po.edimilsonestevam.setup.Base;

public class Login extends Base{

	public Login(WebDriver browser) {
		super(browser);

	}
	
	public void clickProfile () {
		
		System.out.println("• Clicking Profile...");
		
		String iconLoginXpath = "/html[1]/body[1]/div[1]/header[1]/div[1]";
		
		browser.findElement(By.xpath(iconLoginXpath)).click();
		
	}
	
	public void informUser (String user) {
		
		System.out.println("• Informing User...");
		
		String userFieldId = "username";
		
		browser.findElement(By.id(userFieldId)).click();
		browser.findElement(By.id(userFieldId)).sendKeys(user);
		
	}
	
	public void informPassword (String password) {
		
		System.out.println("• Informing Password...");
		
		String passwordField = "password";
		
		browser.findElement(By.id(passwordField)).click();
		browser.findElement(By.id(passwordField)).sendKeys(password);
	}
	
	public void clickEnterButton () {
		
		System.out.println("• Clicking Enter...");
		
		String enterButtonXpath = "//button[contains(text(),'Continue')]";
		
		browser.findElement(By.xpath(enterButtonXpath)).click();
		
	}

	public void clickSignIn() {
		
		System.out.println("• Clicking Sign In...");
				
		String iconSignInXpath = "//span[contains(text(),'Sign In')]";
		
		browser.findElement(By.xpath(iconSignInXpath)).click();

	}

}
