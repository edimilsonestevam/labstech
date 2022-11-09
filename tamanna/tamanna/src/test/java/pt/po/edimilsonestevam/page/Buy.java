package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

		WebElement selectShoesSize = null;
		WebDriverWait wait = new WebDriverWait(browser, 5);
		
		if (shoesSize.contentEquals(shoesSizeFirst)) {

			selectShoesSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shoesSizeFirstPath)));
			selectShoesSize.click();

		} else if (shoesSize.contentEquals(shoesSizeSecond)) {

			selectShoesSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shoesSizeSecondPath)));
			selectShoesSize.click();

		} else if (shoesSize.contentEquals(shoesSizeThird)) {

			selectShoesSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shoesSizeThirdPath)));
			selectShoesSize.click();

		} else if (shoesSize.contentEquals(shoesSizeFour)) {

			selectShoesSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shoesSizeFourPath)));
			selectShoesSize.click();

		} else if (shoesSize.contentEquals(shoesSizeFifth)) {

			selectShoesSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shoesSizeFifthPath)));
			selectShoesSize.click();

		} else if (shoesSize.contentEquals(shoesSizeSixth)) {

			selectShoesSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shoesSizeSixthPath)));
			selectShoesSize.click();

		} else if (shoesSize.contentEquals(shoesSizeSeventh)) {

			selectShoesSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shoesSizeSeventhPath)));
			selectShoesSize.click();

		} else {

			System.out.println("You should inform: 37.5, 36.5, 38, 38.5, 39, 40 or 40.5");

		}
	}

	public void selectClothingSize(String clothingSize) {

		System.out.println("• Selecting Clothing Size...");

		String clothingSizeFirst = "XS";
		String clothingSizeSecond = "S";
		String clothingSizeThird = "M";
		String clothingSizeFour = "L";
		String clothingSizeFifth = "XL";
		String clothingSizeSixth = "XXL";
		String clothingSizeSeventh = "XXXL";

		String clothingSizeFirstPath = "//button[contains(text(),'XS')]";
		String clothingSizeSecondPath = "///body/div[@id='__next']/div[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/button[2]";
		String clothingSizeThirdPath = "//button[contains(text(),'M')]";
		String clothingSizeFourPath = "//body/div[@id='__next']/div[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/button[4]";
		String clothingSizeFifthPath = "//body/div[@id='__next']/div[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/button[5]";
		String clothingSizeSixthPath = "//body/div[@id='__next']/div[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/button[6]";
		String clothingSizeSeventhPath = "//button[contains(text(),'XXXL')]";

		WebElement selectSize = null;
		WebDriverWait wait = new WebDriverWait(browser, 5);

		if (clothingSize.contentEquals(clothingSizeFirst)) {

			selectSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(clothingSizeFirstPath)));
			selectSize.click();

		} else if (clothingSize.contentEquals(clothingSizeSecond)) {

			selectSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(clothingSizeSecondPath)));
			selectSize.click();

		} else if (clothingSize.contentEquals(clothingSizeThird)) {

			selectSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(clothingSizeThirdPath)));
			selectSize.click();

		} else if (clothingSize.contentEquals(clothingSizeFour)) {

			selectSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(clothingSizeFourPath)));
			selectSize.click();

		} else if (clothingSize.contentEquals(clothingSizeFifth)) {

			selectSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(clothingSizeFifthPath)));
			selectSize.click();

		} else if (clothingSize.contentEquals(clothingSizeSixth)) {

			selectSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(clothingSizeSixthPath)));
			selectSize.click();

		} else if (clothingSize.contentEquals(clothingSizeSeventh)) {

			selectSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(clothingSizeSeventhPath)));
			selectSize.click();

		} else {

			System.out.println("You should inform: S, L, M, XL, XXL, XXXL or 4XL");

		}
	}

	public void selectItemsQuantity(String itemsQuantity) {

		System.out.println("• Selecting Items Quantity...");

		String selectItemsQuantity = "quantity";
		String oneItemsQuantity = "//label[contains(text(),'1')]";
		String twoItemsQuantity = "//label[contains(text(),'2')]";
		String threeItemsQuantity = "//label[contains(text(),'3')]";
		String forItemsQuantity = "//label[contains(text(),'4')]";
		String fiveItemsQuantity = "//label[contains(text(),'5')]";
		String sixItemsQuantity = "//label[contains(text(),'6')]";
		String sevenItemsQuantity = "//label[contains(text(),'7')]";
		String eightItemsQuantity = "//label[contains(text(),'8')]";
		String nineItemsQuantity = "//label[contains(text(),'9')]";

		browser.findElement(By.name(selectItemsQuantity)).click();

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

	public void goShoppingBag() {

		System.out.println("• Going Shopping Bag...");

		String bagIcon = "//header/div[1]/nav[1]/div[1]/div[3]/div[2]/div[2]";
		String shoppingBagButton = "//button[contains(text(),'GO TO SHOPPING BAG')]";

		WebElement bag = null;
		WebElement goShoppingBag = null;

		WebDriverWait wait = new WebDriverWait(browser, 10);

		bag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(bagIcon)));
		bag.click();

		goShoppingBag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shoppingBagButton)));
		goShoppingBag.click();

	}

}