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
	
	public void chooseMenClothing(String menClothingImageNumber) {
		
		System.out.println("• Choosing Clothing...");
		
		String menClothingImageFirst = "1";
		String menClothingImageSecond = "2";
		String menClothingImageThird = "3";
		String menClothingImageFour = "4";
		String menClothingImageFifth = "5";
		String menClothingImageSixth = "6";
		String menClothingImageSeventh = "7";
		
		String menClothingImageFirstPath = "//img[@alt='AE 10\" Classic Board Short']";
		String menClothingImageSecondPath = "//img[@alt='AE Super Soft Icon V-Neck T-Shirt']";
		String menClothingImageThirdPath = "//img[@alt='Achilles Organic Cotton Oversized Unisex Sweatshirt']";
		String menClothingImageFourPath = "//img[@alt='Anthony Bamboo Viscose Oversized Short Sleeve T-Shirt With Arabic Printed Hem']";
		String menClothingImageFifthPath = "//img[@alt='Aryan Organic Cotton Oversized Unisex Short Sleeve Hoodie']";
		String menClothingImageSixthPath = "//img[@alt='Ace Recycled Crinkle Nylon Reversible Bomber Jacket']";
		String menClothingImageSeventhPath = "//img[@alt='Fleece Jogger']";
		
		WebElement image = null;
		WebDriverWait wait = new WebDriverWait(browser, 10);
		
		if (menClothingImageNumber.equalsIgnoreCase(menClothingImageFirst)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menClothingImageFirstPath)));
			image.click();
		}
		else if (menClothingImageNumber.equalsIgnoreCase(menClothingImageSecond)) {	
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menClothingImageSecondPath)));
			image.click();
		}
		else if (menClothingImageNumber.equalsIgnoreCase(menClothingImageThird)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menClothingImageThirdPath)));
			image.click();
		}
		else if (menClothingImageNumber.equalsIgnoreCase(menClothingImageFour)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menClothingImageFourPath)));
			image.click();
		}
		else if (menClothingImageNumber.equalsIgnoreCase(menClothingImageFifth)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menClothingImageFifthPath)));
			image.click();
		}
		else if (menClothingImageNumber.equalsIgnoreCase(menClothingImageSixth)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menClothingImageSixthPath)));
			image.click();
		}
		else if (menClothingImageNumber.equalsIgnoreCase(menClothingImageSeventh)) {
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menClothingImageSeventhPath)));
			image.click();
		}
		else {
			System.out.println("You should inform: 1, 2, 3, 4, 5, 6 or 7");
		}
		
	}
}