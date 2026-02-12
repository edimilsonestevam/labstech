package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import setup.Base;

public class Login extends Base {

	public Login(WebDriver browser) {
		super(browser);

	}	
	
	public void doLogin (String username, String password) {
		
		System.out.println("• Doing Login...");
		
		String idUsername = "user-name";
		String idLoginPassword = "password";
		String txtStandardUser = "standard_user";
		String txtLockedOutUser = "locked_out_user";
		String txtProblemUser = "problem_user";
		String txtPerformanceGlitchUser = "performance_glitch_user";
		String txtErrorUser = "error_user";
		String txtVisualUser = "visual_user";
		String txtLoginPassword = "secret_sauce";
		
		
		if (username.isEmpty()) {
			
			System.out.println("You should inform your Username!");
			
		}
		else if(txtStandardUser.equalsIgnoreCase(username)){
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else if(txtLockedOutUser.equalsIgnoreCase(username)) {
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else if(txtProblemUser.equalsIgnoreCase(username)) {
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else if(txtPerformanceGlitchUser.equalsIgnoreCase(username)) {
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else if(txtErrorUser.equalsIgnoreCase(username)) {
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else if(txtVisualUser.equalsIgnoreCase(username)) {
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else {
			
			System.out.println("You did not inform your correct Username!");
			
		}
		
		
		if (txtLoginPassword.isEmpty()) {
			
			System.out.println("You should inform your Password!");
			
		}
		else if(txtLoginPassword.equalsIgnoreCase(password)){
			
			browser.findElement(By.id(idLoginPassword)).sendKeys(password);

		}
		else {
			
			System.out.println("You did not inform your correct Password!");
			
		}
	}
	
	public void confirmLogin () {
		
		System.out.println("• Confirming Login...");
		
		String idLoginButton = "login-button";
		
		browser.findElement(By.id(idLoginButton)).click();
		
	}
	
}
