package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Home extends Base {

	public Home(WebDriver browser) {
		super(browser);

	}

	public void chooseCategory(String category) {
		
		System.out.println("• Choosing Category...");
		
		String womenCategory = "Women";
		String menCategory = "Men";
		String kidsCategory = "Kids";
		String beautyCategory = "Beauty";
		String homeCategory = "Home";
		String harveyNicholsCategory = "Harvey Nichols";
		
		if (category.equalsIgnoreCase(womenCategory)) {
			browser.findElement(By.linkText(womenCategory)).click();
		}
		else if (category.equalsIgnoreCase(menCategory)) {
			browser.findElement(By.linkText(menCategory)).click();
		}
		else if (category.equalsIgnoreCase(kidsCategory)) {
			browser.findElement(By.linkText(kidsCategory)).click();
		}
		else if (category.equalsIgnoreCase(beautyCategory)) {
			browser.findElement(By.linkText(beautyCategory)).click();
		}
		else if (category.equalsIgnoreCase(homeCategory)) {
			browser.findElement(By.linkText(homeCategory)).click();
		}
		else if (category.equalsIgnoreCase(harveyNicholsCategory)) {
			browser.findElement(By.linkText(harveyNicholsCategory)).click();
		}
		else {
			System.out.println("You should inform: Women, Men, Kids, Beauty, Home or Harvey Nichols");
		}
		
	}
}