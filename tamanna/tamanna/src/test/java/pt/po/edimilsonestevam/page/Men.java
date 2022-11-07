package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import pt.po.edimilsonestevam.setup.Base;

public class Men extends Base {

	public Men(WebDriver browser) {
		super(browser);

	}

	public void chooseClothingCategory() {
		
		System.out.println("• Choosing Clothing Category...");
		
		String clothing = "//a[contains(text(),'Clothing')]";
		
		browser.findElement(By.xpath(clothing));
		
	}
	
	public void chooseClothing() {
		
		System.out.println("• Choosing Clothing...");
		
		String clothing = "//body/div[@id='__next']/div[1]/div[2]/main[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[1]/a[1]/div[1]/span[1]/img[1]";
		
		browser.findElement(By.xpath(clothing)).click();
		
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
		
		String currentUrl = browser.getCurrentUrl();
		
		String expectedNewArrivalsUrl = "www.tamanna.com/shop/men";
		String expectedMenClothingUrl = "www.tamanna.com/shop/men-clothing";
		String expectedMenShoesUrl = "www.tamanna.com/shop/men-shoes";
		String expectedMenAccessoriesUrl = "www.tamanna.com/shop/men-accessories";
		String expectedMenCareUrl = "www.tamanna.com/shop/men-care";
		String expectedMenBrandsUrl = "www.tamanna.com/men/brands";
		String expectedMenSaleUrl = "www.tamanna.com/shop/men?onSale=true";
		
		if (subcategory.equalsIgnoreCase(newArrivalsSubcategory)) {
			browser.findElement(By.linkText(newArrivalsSubcategory)).click();
			Assert.assertEquals("New Arrivals Subcategory", expectedNewArrivalsUrl, currentUrl);
		}
		else if (subcategory.equalsIgnoreCase(clothingSubcategory)) {
			browser.findElement(By.linkText(clothingSubcategory)).click();
			Assert.assertEquals("Clothing Subcategory", expectedMenClothingUrl, currentUrl);
		}
		else if (subcategory.equalsIgnoreCase(shoesSubcategory)) {
			browser.findElement(By.linkText(shoesSubcategory)).click();
			Assert.assertEquals("Shoes Subcategory", expectedMenShoesUrl, currentUrl);
		}
		else if (subcategory.equalsIgnoreCase(accessoriesSubcategory)) {
			browser.findElement(By.linkText(accessoriesSubcategory)).click();
			Assert.assertEquals("Accessories Subcategory", expectedMenAccessoriesUrl, currentUrl);
		}
		else if (subcategory.equalsIgnoreCase(careSubcategory)) {
			browser.findElement(By.linkText(careSubcategory)).click();
			Assert.assertEquals("Care Subcategory", expectedMenCareUrl, currentUrl);
		}
		else if (subcategory.equalsIgnoreCase(brandsSubcategory)) {
			browser.findElement(By.linkText(brandsSubcategory)).click();
			Assert.assertEquals("Brands Subcategory", expectedMenBrandsUrl, currentUrl);
		}
		else if (subcategory.equalsIgnoreCase(saleSubcategory)) {
			browser.findElement(By.linkText(saleSubcategory)).click();
			Assert.assertEquals("Sale Subcategory", expectedMenSaleUrl, currentUrl);
		}
		else {
			System.out.println("You should inform: New Arrivals, Clothing, Shoes, Accessories, Care, Brands or Sale");
		}
		
	}
}