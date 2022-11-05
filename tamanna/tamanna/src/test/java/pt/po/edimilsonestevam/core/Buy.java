package pt.po.edimilsonestevam.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class Buy extends Base {

	public Buy(WebDriver browser) {
		super(browser);

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
		} else if (shoesSize.contentEquals(shoesSizeSecond)) {
			browser.findElement(By.xpath(shoesSizeSecondPath)).click();
		} else if (shoesSize.contentEquals(shoesSizeThird)) {
			browser.findElement(By.xpath(shoesSizeThirdPath)).click();
		} else if (shoesSize.contentEquals(shoesSizeFour)) {
			browser.findElement(By.xpath(shoesSizeFourPath)).click();
		} else if (shoesSize.contentEquals(shoesSizeFifth)) {
			browser.findElement(By.xpath(shoesSizeFifthPath)).click();
		} else if (shoesSize.contentEquals(shoesSizeSixth)) {
			browser.findElement(By.xpath(shoesSizeSixthPath)).click();
		} else if (shoesSize.contentEquals(shoesSizeSeventh)) {
			browser.findElement(By.xpath(shoesSizeSeventhPath)).click();
		} else {
			System.out.println("You should inform: 37.5, 36.5, 38, 38.5, 39, 40 or 40.5");
		}
	}

	public void selectItemsQuantity(String itemsQuantity) {

		System.out.println("• Selecting Items Quantity...");

		String idItemsQuantity = "quantity-selector";
		String oneItemsQuantity = "//label[contains(text(),'1')]";
		String twoItemsQuantity = "//label[contains(text(),'2')]";
		String threeItemsQuantity = "//label[contains(text(),'3')]";
		String forItemsQuantity = "//label[contains(text(),'4')]";
		String fiveItemsQuantity = "//label[contains(text(),'5')]";
		String sixItemsQuantity = "//label[contains(text(),'6')]";
		String sevenItemsQuantity = "//label[contains(text(),'7')]";
		String eightItemsQuantity = "//label[contains(text(),'8')]";
		String nineItemsQuantity = "//label[contains(text(),'9')]";

		browser.findElement(By.id(idItemsQuantity)).click();

		if (itemsQuantity.contentEquals("1")) {
			browser.findElement(By.xpath(oneItemsQuantity)).click();
		} else if (itemsQuantity.contentEquals("2")) {
			browser.findElement(By.xpath(twoItemsQuantity)).click();
		} else if (itemsQuantity.contentEquals("3")) {
			browser.findElement(By.xpath(threeItemsQuantity)).click();
		} else if (itemsQuantity.contentEquals("4")) {
			browser.findElement(By.xpath(forItemsQuantity)).click();
		} else if (itemsQuantity.contentEquals("5")) {
			browser.findElement(By.xpath(fiveItemsQuantity)).click();
		} else if (itemsQuantity.contentEquals("6")) {
			browser.findElement(By.xpath(sixItemsQuantity)).click();
		} else if (itemsQuantity.contentEquals("7")) {
			browser.findElement(By.xpath(sevenItemsQuantity)).click();
		} else if (itemsQuantity.contentEquals("8")) {
			browser.findElement(By.xpath(eightItemsQuantity)).click();
		} else if (itemsQuantity.contentEquals("9")) {
			browser.findElement(By.xpath(nineItemsQuantity)).click();
		} else {
			System.out.println("You should inform: 1, 2, 3, 4, 5, 6, 7, 8 or 9");
		}

	}

	public void addItemsCart() {

		System.out.println("• Adding Items Cart...");

		String addButton = "//button[contains(text(),'Add to cart')]";

		browser.findElement(By.xpath(addButton)).click();

	}

}