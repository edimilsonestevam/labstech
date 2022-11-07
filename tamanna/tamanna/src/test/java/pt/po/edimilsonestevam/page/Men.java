package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pt.po.edimilsonestevam.setup.Base;

public class Men extends Base {

	public Men(WebDriver browser) {
		super(browser);

	}
	
	public void chooseSubcategory(String subcategory) {
		
		System.out.println("• Choosing Subcategory...");
		
		String newArrivalsSubcategory = "New Arrivals";
		String clothingSubcategory = "Clothing";
		String shoesSubcategory = "Shoes";
		String accessoriesSubcategory = "Accessories";
		String careSubcategory = "Care";
		String brandsSubcategory = "Brands";
		String saleSubcategory = "Sale";
	
		WebElement subMenu = null;
		WebDriverWait wait = new WebDriverWait(browser, 5);
		
		if (subcategory.equalsIgnoreCase(newArrivalsSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(newArrivalsSubcategory)));
			subMenu.click();
		}
		else if (subcategory.equalsIgnoreCase(clothingSubcategory)) {	
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(clothingSubcategory)));
			subMenu.click();
		}
		else if (subcategory.equalsIgnoreCase(shoesSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(shoesSubcategory)));
			subMenu.click();
		}
		else if (subcategory.equalsIgnoreCase(accessoriesSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(accessoriesSubcategory)));
			subMenu.click();
		}
		else if (subcategory.equalsIgnoreCase(careSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(careSubcategory)));
			subMenu.click();
		}
		else if (subcategory.equalsIgnoreCase(brandsSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(brandsSubcategory)));
			subMenu.click();
		}
		else if (subcategory.equalsIgnoreCase(saleSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(saleSubcategory)));
			subMenu.click();
		}
		else {
			System.out.println("You should inform: New Arrivals, Clothing, Shoes, Accessories, Care, Brands or Sale");
		}
		
	}
}