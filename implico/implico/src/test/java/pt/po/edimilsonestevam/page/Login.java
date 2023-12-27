package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Login extends Base {

	public Login(WebDriver browser) {
		super(browser);

	}

	public static String idLoginButton = "login-button";
	
	
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
		else if(username.equalsIgnoreCase(txtStandardUser)){
			
			browser.findElement(By.id(idUsername)).sendKeys(username);

		}
		else if(username.equalsIgnoreCase(txtLockedOutUser)) {
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else if(username.equalsIgnoreCase(txtProblemUser)) {
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else if(username.equalsIgnoreCase(txtPerformanceGlitchUser)) {
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else if(username.equalsIgnoreCase(txtErrorUser)) {
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else if(username.equalsIgnoreCase(txtVisualUser)) {
			
			browser.findElement(By.id(idUsername)).sendKeys(username);
			
		}
		else {
			System.out.println("You did not inform your correct Username!");
		}
		
		
		if (password.isEmpty()) {
			
			System.out.println("You should inform your Password!");
			
		}
		else if(password.equalsIgnoreCase(txtLoginPassword)){
			
			browser.findElement(By.id(idLoginPassword)).sendKeys(password);

		}
		else {
			System.out.println("You did not inform your correct Password!");
		}
	}
	
	public void confirmLogin () {
		
		System.out.println("• Confirming Login...");
		
		browser.findElement(By.id(idLoginButton)).click();
		
	}
	
}
