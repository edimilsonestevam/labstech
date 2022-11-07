package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pt.po.edimilsonestevam.setup.Base;

public class Home extends Base {

	public Home(WebDriver browser) {
		super(browser);

	}

	public void acceptNotifications(String notificationType) {

		System.out.println("• Accepting Notification...");

		String allowNotifications = "//button[@id='optInText']";
		String laterNotifications = "//button[contains(text(),'Later')]";

		String yesOption = "Yes";
		String noOption = "No";

		WebElement allowLaterNotifications = null;
		WebDriverWait wait = new WebDriverWait(browser, 34);

		if (notificationType.equalsIgnoreCase(yesOption)) {
			
			allowLaterNotifications = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(allowNotifications)));
			allowLaterNotifications.click();
			
		} else if (notificationType.equalsIgnoreCase(noOption)) {
			
			allowLaterNotifications = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(laterNotifications)));
			allowLaterNotifications.click();
			
		} else {
			
			System.out.println("You should inform: Yes or No");
			
		}

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
			
		} else if (category.equalsIgnoreCase(menCategory)) {
			
			browser.findElement(By.linkText(menCategory)).click();
			
		} else if (category.equalsIgnoreCase(kidsCategory)) {
			
			browser.findElement(By.linkText(kidsCategory)).click();
			
		} else if (category.equalsIgnoreCase(beautyCategory)) {
			
			browser.findElement(By.linkText(beautyCategory)).click();
			
		} else if (category.equalsIgnoreCase(homeCategory)) {
			
			browser.findElement(By.linkText(homeCategory)).click();
			
		} else if (category.equalsIgnoreCase(harveyNicholsCategory)) {
			
			browser.findElement(By.linkText(harveyNicholsCategory)).click();
			
		} else {
			
			System.out.println("You should inform: Women, Men, Kids, Beauty, Home or Harvey Nichols");
			
		}

	}

}