package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pt.po.edimilsonestevam.setup.Base;

public class ConsentGoogle extends Base {

	public ConsentGoogle(WebDriver browser) {
		super(browser);
	
	}
	
	public void consentGoogleConfirm () {
		
		String btnAccept = "//span[contains(text(),'Aceito')]";
		
		WebElement element = null;

		WebDriverWait wait = new WebDriverWait(browser, 5);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(btnAccept)));
		element.click();
		
	}
}
