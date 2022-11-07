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
	
	public void chooseMenClothing(String imageNumber) {
		
		System.out.println("• Choosing Clothing...");
		
		String imageMenFirst = "1";
		String imageMenSecond = "2";
		String imageMenThird = "3";
		String imageMenFour = "4";
		String imageMenFifth = "5";
		String imageMenSixth = "6";
		String imageMenSeventh = "7";
		
		String imageMenFirstPath = "//img[@alt='AE 10\" Classic Board Short']";
		String imageMenSecondPath = "//img[@alt='AE Super Soft Icon V-Neck T-Shirt']";
		String imageMenThirdPath = "//img[@alt='Achilles Organic Cotton Oversized Unisex Sweatshirt']";
		String imageMenFourPath = "//img[@alt='Anthony Bamboo Viscose Oversized Short Sleeve T-Shirt With Arabic Printed Hem']";
		String imageMenFifthPath = "//img[@alt='Aryan Organic Cotton Oversized Unisex Short Sleeve Hoodie']";
		String imageMenSixthPath = "//img[@alt='Ace Recycled Crinkle Nylon Reversible Bomber Jacket']";
		String imageMenSeventhPath = "//img[@alt='Fleece Jogger']";
		
		WebElement image = null;
		WebDriverWait wait = new WebDriverWait(browser, 10);
		
		if (imageNumber.equalsIgnoreCase(imageMenFirst)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(imageMenFirstPath)));
			image.click();
		}
		else if (imageNumber.equalsIgnoreCase(imageMenSecond)) {	
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(imageMenSecondPath)));
			image.click();
		}
		else if (imageNumber.equalsIgnoreCase(imageMenThird)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(imageMenThirdPath)));
			image.click();
		}
		else if (imageNumber.equalsIgnoreCase(imageMenFour)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(imageMenFourPath)));
			image.click();
		}
		else if (imageNumber.equalsIgnoreCase(imageMenFifth)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(imageMenFifthPath)));
			image.click();
		}
		else if (imageNumber.equalsIgnoreCase(imageMenSixth)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(imageMenSixthPath)));
			image.click();
		}
		else if (imageNumber.equalsIgnoreCase(imageMenSeventh)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(imageMenSeventhPath)));
			image.click();
		}
		else {
			System.out.println("You should inform: 1, 2, 3, 4, 5, 6 or 7");
		}
		
	}
}