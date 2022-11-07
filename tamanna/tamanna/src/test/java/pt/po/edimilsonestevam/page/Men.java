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
	
	public void chooseMenSubcategory(String menSubcategory) {
		
		System.out.println("• Choosing Men Subcategory...");
		
		String newArrivalsSubcategory = "New Arrivals";
		String clothingSubcategory = "Clothing";
		String shoesSubcategory = "Shoes";
		String accessoriesSubcategory = "Accessories";
		String careSubcategory = "Care";
		String brandsSubcategory = "Brands";
		String saleSubcategory = "Sale";
	
		WebElement subMenu = null;
		WebDriverWait wait = new WebDriverWait(browser, 5);
		
		if (menSubcategory.equalsIgnoreCase(newArrivalsSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(newArrivalsSubcategory)));
			subMenu.click();
		}
		else if (menSubcategory.equalsIgnoreCase(clothingSubcategory)) {	
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(clothingSubcategory)));
			subMenu.click();
		}
		else if (menSubcategory.equalsIgnoreCase(shoesSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(shoesSubcategory)));
			subMenu.click();
		}
		else if (menSubcategory.equalsIgnoreCase(accessoriesSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(accessoriesSubcategory)));
			subMenu.click();
		}
		else if (menSubcategory.equalsIgnoreCase(careSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(careSubcategory)));
			subMenu.click();
		}
		else if (menSubcategory.equalsIgnoreCase(brandsSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(brandsSubcategory)));
			subMenu.click();
		}
		else if (menSubcategory.equalsIgnoreCase(saleSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(saleSubcategory)));
			subMenu.click();
		}
		else {
			System.out.println("You should inform: New Arrivals, Clothing, Shoes, Accessories, Care, Brands or Sale");
		}
		
	}
}