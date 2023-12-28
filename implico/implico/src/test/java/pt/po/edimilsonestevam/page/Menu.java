package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Menu extends Base {

	public Menu(WebDriver browser) {
		super(browser);
		
	}

	public void clickLogout () {
		
		System.out.println("• Clicking Logout...");
		
		String idMenuIcon = "react-burger-menu-btn";
		String txtLogout = "logout_sidebar_link";
		
		browser.findElement(By.id(idMenuIcon)).click();
		browser.findElement(By.id(txtLogout)).click();
		
	}
}
