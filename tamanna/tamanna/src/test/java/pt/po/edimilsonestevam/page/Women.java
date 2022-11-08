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
			
		} else if (womenSubcategory.equalsIgnoreCase(clothingSubcategory)) {
			
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(clothingSubcategory)));
			subMenu.click();
			
		} else if (womenSubcategory.equalsIgnoreCase(shoesSubcategory)) {
			
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(shoesSubcategory)));
			subMenu.click();
			
		} else if (womenSubcategory.equalsIgnoreCase(accessoriesSubcategory)) {
			
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(accessoriesSubcategory)));
			subMenu.click();
			
		} else if (womenSubcategory.equalsIgnoreCase(beautySubcategory)) {
			
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(beautySubcategory)));
			subMenu.click();
			
		} else if (womenSubcategory.equalsIgnoreCase(brandsSubcategory)) {
			
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(brandsSubcategory)));
			subMenu.click();
			
		} else if (womenSubcategory.equalsIgnoreCase(saleSubcategory)) {
			
			subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(saleSubcategory)));
			subMenu.click();
			
		} else {
			
			System.out.println("You should inform: New Arrivals, Clothing, Shoes, Accessories, Beauty, Brands or Sale");
			
		}

	}

	public void chooseWomenShoes(String womenShoesImageNumber) {

		System.out.println("• Choosing Women Shoes...");

		String womenShoesImageFirst = "1";
		String womenShoesImageSecond = "2";
		String womenShoesImageThird = "3";
		String womenShoesImageFour = "4";
		String womenShoesImageFifth = "5";
		String womenShoesImageSixth = "6";
		String womenShoesImageSeventh = "7";

		String womenShoesImageFirstPath = "//img[@alt=\"Nike Blazer - Women's Shoes\"]";
		String womenShoesImageSecondPath = "//img[@alt=\"New Balance 5740 - Women's Shoes\"]";
		String womenShoesImageThirdPath = "//img[@alt=\"New Balance 574 - Women's Shoes\"]";
		String womenShoesImageFourPath = "//img[@alt='Chain Detail Chunky Sandals']";
		String womenShoesImageFifthPath = "(//img[@alt='Chain Detail Chunky Sandals'])[2]";
		String womenShoesImageSixthPath = "//img[@alt='Animal Print Leather Backless Loafers']";
		String womenShoesImageSeventhPath = "//img[@alt='Studded Leather Backless Loafers']";

		WebElement image = null;
		WebDriverWait wait = new WebDriverWait(browser, 10);

		if (womenShoesImageNumber.equalsIgnoreCase(womenShoesImageFirst)) {
			
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(womenShoesImageFirstPath)));
			image.click();
			
		} else if (womenShoesImageNumber.equalsIgnoreCase(womenShoesImageSecond)) {
			
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(womenShoesImageSecondPath)));
			image.click();
			
		} else if (womenShoesImageNumber.equalsIgnoreCase(womenShoesImageThird)) {
			
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(womenShoesImageThirdPath)));
			image.click();
			
		} else if (womenShoesImageNumber.equalsIgnoreCase(womenShoesImageFour)) {
			
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(womenShoesImageFourPath)));
			image.click();
			
		} else if (womenShoesImageNumber.equalsIgnoreCase(womenShoesImageFifth)) {
			
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(womenShoesImageFifthPath)));
			image.click();
			
		} else if (womenShoesImageNumber.equalsIgnoreCase(womenShoesImageSixth)) {
			
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(womenShoesImageSixthPath)));
			image.click();
			
		} else if (womenShoesImageNumber.equalsIgnoreCase(womenShoesImageSeventh)) {
			
			image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(womenShoesImageSeventhPath)));
			image.click();
			
		} else {
			
			System.out.println("You should inform: 1, 2, 3, 4, 5, 6 or 7");
			
		}

	}

}