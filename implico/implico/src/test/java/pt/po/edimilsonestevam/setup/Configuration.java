package pt.po.edimilsonestevam.setup;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Configuration {

	protected WebDriver browser = null;

	public WebDriver getDriver() {

		return browser;

	}

	public void setDriver(WebDriver browser) {

		this.browser = browser;

	}

	public WebDriver browserOpen(String browserName, String headlessYesNo, String url, String responsiveYesNo) {

		System.out.println("-----------------------------------Testing Started-----------------------------------");

		String chromeProperty = "webdriver.chrome.driver";
		String chromePropertyPath = "/var/jenkins_home/drivers/chromedriver-linux64/chromedriver"; // "C:\\Drivers\\chromedrive.exe";
		String chromeBinaryPath = "/opt/chrome/chrome-headless-shell-linux64";

		String firefoxProperty = "webdriver.gecko.driver";
		String firefoxPropertyPath = "C:\\Drivers\\geckodriver.exe";

		String safariProperty = "webdriver.safari.driver";
		String safariPropertyPath = "C:\\Drivers\\safaridriver.exe";

		String https = "https://";

		ChromeOptions options = new ChromeOptions();

		if (browserName.equalsIgnoreCase("chrome")) {
			if (headlessYesNo.equalsIgnoreCase("yes")) {
				System.setProperty(chromeProperty, chromePropertyPath);

				options.setBinary(chromeBinaryPath);
				options.addArguments("--headless=new");
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--disable-gpu");
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--disable-software-rasterizer");
				options.addArguments("--disable-extensions");
				options.addArguments("--disable-background-networking");
				options.addArguments("--disable-breakpad");
				options.addArguments("--disable-client-side-phishing-detection");
				options.addArguments("--disable-default-apps");
				options.addArguments("--disable-hang-monitor");
				options.addArguments("--disable-popup-blocking");
				options.addArguments("--disable-prompt-on-repost");
				options.addArguments("--disable-sync");
				options.addArguments("--disable-translate");
				options.addArguments("--disable-background-timer-throttling");
				options.addArguments("--disable-infobars");
				options.addArguments("--disable-notifications");
				options.addArguments("--no-first-run");
				options.addArguments("--no-zygote");
				options.addArguments("--single-process");
				options.addArguments("--user-data-dir=/tmp/user-data");
				options.addArguments("--data-path=/tmp/data-path");
				options.addArguments("--homedir=/tmp");
				options.addArguments("--disk-cache-dir=/tmp/cache-dir");

				browser = new ChromeDriver(options);
				browser.get(https + url);
				return browser;
			} else {
				if (responsiveYesNo.equalsIgnoreCase("yes")) {
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
			}
		} else if (browserName.equalsIgnoreCase("firefox")) {
			if (responsiveYesNo.equalsIgnoreCase("yes")) {
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
			if (responsiveYesNo.equalsIgnoreCase("yes")) {
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
			System.out.println("Still to be implemented in this browser, " + browserName);
		}
		return null;
	}

	public void browserClose(WebDriver browser) {

		System.out.println("-----------------------------------Testing Finished----------------------------------");

		this.browser = browser;
		browser.close();
	}

}