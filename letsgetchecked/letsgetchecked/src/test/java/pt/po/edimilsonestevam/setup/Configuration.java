package pt.po.edimilsonestevam.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuration {

	protected WebDriver browser = null;

	public WebDriver getDriver() {
		
		return browser;
		
	}

	public void setDriver (WebDriver browser) {
		
		this.browser = browser;
		
	}

	public WebDriver browserOpen(String browserName, String url) {

		System.out.println("-----------------------------------Testing Started-----------------------------------");
		
		String chromeProperty = "webdriver.chrome.driver";
		String chromePropertyPath = "C:\\Drivers\\chromedriver.exe";
		String firefoxProperty = "webdriver.gecko.driver";
		String firefoxPropertyPath = "C:\\Drivers\\geckodriver.exe";
		String https = "https://";

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(chromeProperty, chromePropertyPath);
			WebDriver browser = new ChromeDriver();
			browser.manage().window().maximize();
			browser.get(https + url);
			return browser;
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(firefoxProperty, firefoxPropertyPath);
			WebDriver browser = new FirefoxDriver();
			browser.manage().window().maximize();
			browser.get(https + url);
			return browser;
		} else {
			System.out.println("Still to implement this browser, " + browserName);
		}
		return null;
	}
	
	public void browserClose(WebDriver browser) {
		
		System.out.println("-----------------------------------Testing Finished----------------------------------");
		
		this.browser = browser;
		browser.close();
	}
	
}
