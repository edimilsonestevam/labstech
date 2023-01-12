package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import pt.po.edimilsonestevam.setup.Base;

public class Login extends Base{

	public Login(WebDriver browser) {
		super(browser);

	}
	
	public WebElement element = null;
	
	public void clickProfile () {
		
		System.out.println("• Clicking Profile...");
		
		String iconLoginXpath = "/html[1]/body[1]/div[1]/header[1]/div[1]";
		
		browser.findElement(By.xpath(iconLoginXpath)).click();
		
	}
	
	public void informUser (String user) {
		
		System.out.println("• Informing User...");
		
		String userFieldXpath = "//input[@id='username']";
		
		WebDriverWait wait = new WebDriverWait(browser, 5);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userFieldXpath)));
		element.findElement(By.xpath(userFieldXpath)).click();
		element.findElement(By.xpath(userFieldXpath)).sendKeys(user);
		
	}
	
	public void informPassword (String password) {
		
		System.out.println("• Informing Password...");
		
		String passwordFieldXpath = "//input[@id='password']";
		
		WebDriverWait wait = new WebDriverWait(browser, 5);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(passwordFieldXpath)));	
		element.findElement(By.xpath(passwordFieldXpath)).click();
		element.findElement(By.xpath(passwordFieldXpath)).sendKeys(password);
		
	}
	
	public void clickEnterButton () {
		
		System.out.println("• Clicking Enter...");
		
		String enterButtonXpath = "//button[contains(text(),'Continue')]";
		
		browser.findElement(By.xpath(enterButtonXpath)).click();
		
	}

	public void clickSignIn () {
		
		System.out.println("• Clicking Sign In...");
				
		String iconSignInXpath = "//span[contains(text(),'Sign In')]";
		
		browser.findElement(By.xpath(iconSignInXpath)).click();

	}

	public void verifyCurrentPage (String expectedHomepage) {
		
		System.out.println("• Verifying Current Page...");
		
		String currentPage = browser.getCurrentUrl();
		
		Assert.assertEquals("Checking Current Page", expectedHomepage, currentPage);
			
	}
}
