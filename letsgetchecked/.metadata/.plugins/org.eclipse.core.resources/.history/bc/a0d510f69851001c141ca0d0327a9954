package pt.po.edimilsonestevam.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pt.po.edimilsonestevam.setup.Base;

public class Search extends Base {

	public Search(WebDriver browser) {
		super(browser);
		
	}

	public WebElement element = null;
	
	public void verifyActualPage(String expectedUrl) {
		
		System.out.println("• Verifying Actual Page...");
		
		String actualUrl = (String) browser.getCurrentUrl();
		Assert.assertEquals("Verify if you are in Google Maps", expectedUrl, actualUrl.substring(8));

	}
	
	public void searchCity(String cityName) {
		
		System.out.println("• Typing City...");
		
		String fieldSearchType = "//input[@id='searchboxinput']";
		
		WebDriverWait wait = new WebDriverWait(browser, 5);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(fieldSearchType)));		
		element.findElement(By.xpath(fieldSearchType)).sendKeys(cityName);
		element.findElement(By.xpath(fieldSearchType)).sendKeys(Keys.ENTER);
	
	}
	
	public void verifyCityName(String cityWanted) {
		
		System.out.println("• Verifying City Name ...");
		
		String titleNameCity = "//body/div[@id='app-container']/div[@id='content-container']/div[@id='pane']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h1[1]/span[1]";
				
		WebDriverWait wait = new WebDriverWait(browser, 5);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(titleNameCity)));
		String actualCity = element.findElement(By.xpath(titleNameCity)).getText();
		Assert.assertEquals("Verify if it is correct", cityWanted, actualCity);
		
	}
}
