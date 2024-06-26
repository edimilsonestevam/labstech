package pt.po.edimilsonestevam.setup;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Configuration {

	protected WebDriver browser = null;

	public WebDriver getDriver() {
		
		return browser;
		
	}

	public void setDriver (WebDriver browser) {
		
		this.browser = browser;
		
	}

	public WebDriver browserOpen(String browserName, String url, String responsiveYesNo) {

		System.out.println("-----------------------------------Testing Started-----------------------------------");
		
		String chromeProperty = "webdriver.chrome.driver";
		String chromePropertyPath = "C:\\Drivers\\chromedriver.exe";
		String firefoxProperty = "webdriver.gecko.driver";
		String firefoxPropertyPath = "C:\\Drivers\\geckodriver.exe";
		String safariProperty = "webdriver.safari.driver";
		String safariPropertyPath = "C:\\Drivers\\safaridriver.exe";
		String https = "https://";

		if (browserName.equalsIgnoreCase("chrome")) {
			if(responsiveYesNo.equalsIgnoreCase("yes")) {
				System.setProperty(chromeProperty, chromePropertyPath);
				WebDriver browser = new ChromeDriver();	
				Dimension size = new Dimension(360, 800);
				browser.manage().window().setSize(size);	
				browser.get(https + url);
				return browser;
			} else {
				System.setProperty(chromeProperty, chromePropertyPath);
				WebDriver browser = new ChromeDriver();
				browser.manage().window().maximize();
				browser.get(https + url);
				return browser;
			  }
		} else if (browserName.equalsIgnoreCase("firefox")) {
			if(responsiveYesNo.equalsIgnoreCase("yes")) {
				System.setProperty(firefoxProperty, firefoxPropertyPath);
				WebDriver browser = new FirefoxDriver();	
				Dimension size = new Dimension(360, 800);
				browser.manage().window().setSize(size);	
				browser.get(https + url);
				return browser;
			} else {
				System.setProperty(firefoxProperty, firefoxPropertyPath);
				WebDriver browser = new FirefoxDriver();
				browser.manage().window().maximize();
				browser.get(https + url);
				return browser;
			  }	
		} else if (browserName.equalsIgnoreCase("safari")) {
			if(responsiveYesNo.equalsIgnoreCase("yes")) {
				System.setProperty(safariProperty, safariPropertyPath);
				WebDriver browser = new SafariDriver();	
				Dimension size = new Dimension(360, 800);
				browser.manage().window().setSize(size);	
				browser.get(https + url);
				return browser;
			} else {
				System.setProperty(safariProperty, safariPropertyPath);
				WebDriver browser = new SafariDriver();
				browser.manage().window().maximize();
				browser.get(https + url);
				return browser;
			  }
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