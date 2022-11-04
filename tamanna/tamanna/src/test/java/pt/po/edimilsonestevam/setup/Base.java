package pt.po.edimilsonestevam.setup;

import org.openqa.selenium.WebDriver;

public class Base {

	protected WebDriver browser;

	public Base(WebDriver browser) {

		this.browser = browser;

	}
	
}