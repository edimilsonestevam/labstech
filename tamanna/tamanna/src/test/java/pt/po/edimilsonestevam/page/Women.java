package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Women extends Base {

	public Women(WebDriver browser) {
		super(browser);

	}

	public void chooseShoesCategory() {
		
		System.out.println("• Choosing Shoe Category...");
		
		String shoesCategory = "Shoes";
		
		browser.findElement(By.linkText(shoesCategory));
		
	}
	
	public void chooseShoes () {
		
		System.out.println("• Choosing Shoes...");
		
	}
	
	public void selectShoesSize(String shoesSize) {
		
		System.out.println("• Selecting Shoes Size...");
		
		String shoesSizeFirst = "37.5";
		String shoesSizeSecond = "39";
		String shoesSizeThird = "36.5";
		String shoesSizeFour = "38.5";
		String shoesSizeFifth = "40.5";
		String shoesSizeSixth = "38";
		String shoesSizeSeventh = "20";
		
		String shoesSizeFirstPath = "//button[contains(text(),'37.5')]";
		String shoesSizeSecondPath = "//button[contains(text(),'39')]";
		String shoesSizeThirdPath = "//button[contains(text(),'36.5')]";
		String shoesSizeFourPath = "//button[contains(text(),'38.5')]";
		String shoesSizeFifthPath = "//button[contains(text(),'40.5')]";
		String shoesSizeSixthPath = "//body/div[@id='__next']/div[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[6]";
		String shoesSizeSeventhPath = "//body/div[@id='__next']/div[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[7]";
		
		if (shoesSize.contentEquals(shoesSizeFirst)) {
			browser.findElement(By.xpath(shoesSizeFirstPath)).click();
		}
		else if (shoesSize.contentEquals(shoesSizeSecond)) {
			browser.findElement(By.xpath(shoesSizeSecondPath)).click();
		}
		else if (shoesSize.contentEquals(shoesSizeThird)) {
			browser.findElement(By.xpath(shoesSizeThirdPath)).click();
		}
		else if (shoesSize.contentEquals(shoesSizeFour)) {
			browser.findElement(By.xpath(shoesSizeFourPath)).click();
		}
		else if (shoesSize.contentEquals(shoesSizeFifth)) {
			browser.findElement(By.xpath(shoesSizeFifthPath)).click();
		}
		else if (shoesSize.contentEquals(shoesSizeSixth)) {
			browser.findElement(By.xpath(shoesSizeSixthPath)).click();
		}
		else if (shoesSize.contentEquals(shoesSizeSeventh)) {
			browser.findElement(By.xpath(shoesSizeSeventhPath)).click();
		}
		else {
			System.out.println("You should inform: 37.5, 36.5, 38, 38.5, 39, 40 or 40.5");
		}
	}
}