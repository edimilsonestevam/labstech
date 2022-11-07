package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pt.po.edimilsonestevam.setup.Base;

public class Women extends Base {

	public Women(WebDriver browser) {
		super(browser);

	}

	public void chooseWomenSubcategory(String womenSubcategory) {
		
		System.out.println("• Choosing Women Subcategory...");
		
		String newArrivalsSubcategory = "New Arrivals";
		String clothingSubcategory = "Clothing";
		String shoesSubcategory = "Shoes";
		String accessoriesSubcategory = "Accessories";
		String beautySubcategory = "Beauty";
		String brandsSubcategory = "Brands";
		String saleSubcategory = "Sale";
	
		WebElement subMenu = null;
		WebDriverWait wait = new WebDriverWait(browser, 5);
		
		if (womenSubcategory.equalsIgnoreCase(newArrivalsSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(newArrivalsSubcategory)));
			subMenu.click();
		}
		else if (womenSubcategory.equalsIgnoreCase(clothingSubcategory)) {	
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(clothingSubcategory)));
			subMenu.click();
		}
		else if (womenSubcategory.equalsIgnoreCase(shoesSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(shoesSubcategory)));
			subMenu.click();
		}
		else if (womenSubcategory.equalsIgnoreCase(accessoriesSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(accessoriesSubcategory)));
			subMenu.click();
		}
		else if (womenSubcategory.equalsIgnoreCase(beautySubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(beautySubcategory)));
			subMenu.click();
		}
		else if (womenSubcategory.equalsIgnoreCase(brandsSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(brandsSubcategory)));
			subMenu.click();
		}
		else if (womenSubcategory.equalsIgnoreCase(saleSubcategory)) {
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(saleSubcategory)));
			subMenu.click();
		}
		else {
			System.out.println("You should inform: New Arrivals, Clothing, Shoes, Accessories, Beauty, Brands or Sale");
		}
		
	}
	
}