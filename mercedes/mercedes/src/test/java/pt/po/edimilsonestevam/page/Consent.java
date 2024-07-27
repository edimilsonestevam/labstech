package pt.po.edimilsonestevam.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import javax.security.auth.kerberos.KerberosKey;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pt.po.edimilsonestevam.setup.Base;

public class Consent extends Base {

	public Consent(WebDriver browser) {
		super(browser);
	
	}
	
	public void consentConfirm () throws AWTException {
		
		System.out.println("• Accepting the Agree to all...");
	
		//String buttonAccept = "//button[contains(text(),'Agree to all')]";
		
		//WebElement element = null;

		//WebDriverWait wait = new WebDriverWait(browser,5);
		
		
		//Robot i = new Robot();
		//i.mouseMove(1444, 856);
		//i.mousePress(1459);

		Robot bot = new Robot();
		bot.mouseMove(100, 100);  
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		//element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonAccept)));
		//element.click();

	}
}
