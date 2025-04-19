package br.sp.edimilsonestevam.setup;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Configuration {

	protected WebDriver browser = null;

	public WebDriver getDriver() {
		
		return browser;
		
	}

	public void setDriver (WebDriver browser) {
		
		this.browser = browser;
		
	}

    private String getDriverPath(String driverName) {

        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("win")) {
            return "C:\\Drivers\\" + driverName + ".exe";
        }
        else  {
            return  "/usr/local/bin/" + driverName;
        }

    }

	public WebDriver browserOpen(String browserName, String url, String responsiveYesNo, String headlessYesNo) {

		System.out.println("-----------------------------------Testing Started-----------------------------------");
		
		String chromeProperty = "webdriver.chrome.driver";
		String firefoxProperty = "webdriver.gecko.driver";
		String safariProperty = "webdriver.safari.driver";
		String https = "https://";


		if (browserName.equalsIgnoreCase("chrome")) {
			if(responsiveYesNo.equalsIgnoreCase("yes")) {
				System.setProperty(chromeProperty, getDriverPath("chromedriver"));
				WebDriver browser = new ChromeDriver();	
				Dimension size = new Dimension(360, 800);
				browser.manage().window().setSize(size);	
				browser.get(https + url);
				return browser;
			} else if (responsiveYesNo.equalsIgnoreCase("no") && (headlessYesNo.equalsIgnoreCase("no"))){
				System.setProperty(chromeProperty, getDriverPath("chromedriver"));
				WebDriver browser = new ChromeDriver();
				browser.manage().window().maximize();
				browser.get(https + url);
				return browser;
			  } else {
					System.setProperty(chromeProperty, getDriverPath("chromedriver"));
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--headless=new");

					this.browser = new ChromeDriver(options);
					this.browser.get(https + url);
					return this.browser;
				}
		} else if (browserName.equalsIgnoreCase("firefox")) {
			if(responsiveYesNo.equalsIgnoreCase("yes")) {
				System.setProperty(firefoxProperty, getDriverPath("geckodriver"));
				WebDriver browser = new FirefoxDriver();
				Dimension size = new Dimension(360, 800);
				browser.manage().window().setSize(size);
				browser.get(https + url);
				return browser;
			} else if (responsiveYesNo.equalsIgnoreCase("no") && (headlessYesNo.equalsIgnoreCase("no"))){
				System.setProperty(firefoxProperty, getDriverPath("geckodriver"));
				WebDriver browser = new FirefoxDriver();
				browser.manage().window().maximize();
				browser.get(https + url);
				return browser;
			  } else {
					System.setProperty(firefoxProperty, getDriverPath("geckodriver"));
					FirefoxOptions options = new FirefoxOptions();
					options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
					options.setAcceptInsecureCerts(true);
					WebDriver browser = new FirefoxDriver(options);
					return browser;
				}
		} else if (browserName.equalsIgnoreCase("safari")) {
			if(responsiveYesNo.equalsIgnoreCase("yes")) {
				System.setProperty(safariProperty, getDriverPath("safaridriver"));
				WebDriver browser = new SafariDriver();	
				Dimension size = new Dimension(360, 800);
				browser.manage().window().setSize(size);	
				browser.get(https + url);
				return browser;
			} else {
				System.setProperty(safariProperty, getDriverPath("safaridriver"));
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