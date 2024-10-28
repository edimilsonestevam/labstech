package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pt.po.edimilsonestevam.setup.Base;

public class EnterInsurantData extends Base{

	public EnterInsurantData(WebDriver browser) {
		super(browser);

	}

	public void fillEnterInsurantData(String informFirstName, String informLastName, String informDateBirth, String informGender, String informStreetAddress, String informCountry) {
		
		System.out.println("Enter Insurant Data");
		
		String idFirstName = "firstname";
		String idLastName = "lastname";
		String idDateBirth = "birthdate";
		
		String genderMale = "Male";
		String idGenderMale = "gendermale";
		
		String genderFemale = "Female";
		String idGenderFemale = "genderfemale";
		
		String idStreetAddress = "streetaddress";
		
		String idCountry = "country";
		
		String countryFirst = "Angola";
		String xpathCountryFirst = "//option[@value='Angola']";
		
		String countrySecond = "Argentina";
		String xpathCountrySecond = "//option[@value='Argentina']";
		
		String countryThird = "Australia";
		String xpathCountryThird = "//option[@value='Australia']";
		
		String countryFourth = "Austria";
		String xpathCountryFourth = "//option[@value='Austria']";
		
		String countryFifth = "Belgium";
		String xpathCountryFifth = "//option[@value='Belgium']";
		
		String countrySixth = "Brazil";
		String xpathCountrySixth = "//option[@value='Brazil']";
		
		String countrySeventh = "Canada";
		String xpathCountrySeventh = "//option[@value='Canada']";
		
		String countryEighth = "Chile";
		String xpathCountryEighth = "//option[@value='Chile']";
		
		String countryNinth = "China";
		String xpathCountryNinth = "//option[@value='China']";
		
		String countryTenth = "Colombia";
		String xpathCountryTenth = "//option[@value='Colombia']";
		
		String countryEleventh = "Costa Rica";
		String xpathCountryEleventh = "//option[@value='Costa Rica']";
		
		String countryTwelfth = "Croatia";
		String xpathCountryTwelfth = "//option[@value='Croatia']";
		
		String countryThirteenth = "Czech Republic";
		String xpathCountryThirteenth = "//option[@value='Czech Republic']";
		
		String countryFourteenth = "Denmark";
		String xpathCountryFourteenth = "//option[@value='Denmark']";
		
		String countryFifteenth = "Ecuador";
		String xpathCountryFifteenth = "//option[@value='Ecuador']";
		
		String countrySixteenth = "Estonia";
		String xpathCountrySixteenth = "//option[@value='Estonia']";
		
		String countrySeventeenth = "Finland";
		String xpathCountrySeventeenth = "//option[@value='Finland']";
		
		String countryEighteenth = "France";
		String xpathCountryEighteenth = "//option[@value='France']";
		
		String countryNineteenth = "Georgia";
		String xpathCountryNineteenth = "//option[@value='Georgia']";
		
		String countryTwentieth = "Germany";
		String xpathCountryTwentieth = "//option[@value='Germany']";
		
		String countryTwentyFirst = "Hong Kong";
		String xpathCountryTwentyFirst = "//option[@value='Hong Kong']";
		
		String idZipCode = "zipcode";
		String idCity = "city";
		
		String idOccupation = "occupation";
		String xpathOccupationFirst = "//option[@value='Employee']";
		String xpathOccupationSecond = "//option[@value='Public Official']";
		String xpathOccupationThird = "//option[@value='Farmer']";
		String xpathOccupationFourth = "//option[@value='Unemployed']";
		String xpathOccupationFifth = "//option[@value='Selfemployed']";
		
		String idHobbiesSpeeding = "speeding";
		String idHobbiesBungeejumping = "bungeejumping";
		String idHobbiesCliffdiving = "cliffdiving";
		String idHobbiesSkydiving = "skydiving";
		String idHobbiesOther = "other";
		
		String idWebsite = "website";
		String idPicture = "picture";
		
		WebElement element = null;	
		WebDriverWait wait = new WebDriverWait(browser, 3);
		
		
		System.out.println("• Filling First Name Field...");
		
		browser.findElement(By.id(idFirstName)).click();
		browser.findElement(By.id(idFirstName)).sendKeys(informFirstName);
		
		
		System.out.println("• Filling Last Name Field...");
		
		browser.findElement(By.id(idLastName)).click();
		browser.findElement(By.id(idLastName)).sendKeys(informLastName);
		
		
		System.out.println("• Filling Date Birth Field...");
		
		browser.findElement(By.id(idDateBirth)).click();
		browser.findElement(By.id(idDateBirth)).sendKeys(informDateBirth);
		
		
		System.out.println("• Filling Gender Field...");
		
		if (genderMale.equalsIgnoreCase(informGender)) {
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id(idGenderMale)));
			element.click();
		}
		else if (genderFemale.equalsIgnoreCase(informGender)) {
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id(idGenderFemale)));
			element.click();
		}
		else {
			System.out.println("You should inform: Male or Female!");
		}
		
		
		System.out.println("• Filling Street Address Field...");
		
		browser.findElement(By.id(idStreetAddress)).click();
		browser.findElement(By.id(idStreetAddress)).sendKeys(informStreetAddress);
		
		
		System.out.println("• Filling Country Field..."); //HERE
		
		if (informCountry.equalsIgnoreCase(countryFirst)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryFirst)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countrySecond)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountrySecond)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryThird)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryThird)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryFourth)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryFourth)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryFifth)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryFifth)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countrySixth)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountrySixth)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countrySeventh)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountrySeventh)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryEighth)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryEighth)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryNinth)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryNinth)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryTenth)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryTenth)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryEleventh)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryEleventh)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryTwelfth)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryTwelfth)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryThirteenth)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryThirteenth)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryFourteenth)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryFourteenth)));
			element.click();
		}
		else if (informCountry.equalsIgnoreCase(countryFifteenth)) {
			browser.findElement(By.id(idCountry)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCountryFifteenth)));
			element.click();
		}
		else {
			System.out.println("You should inform: Angola, Argentina, Australia, Austria, Belgium, Brazil, Canada, Chile, China, Colombia, Costa Rica, Croatia, Czech Republic, Denmark, Ecuador, Estonia, Finland, France, Georgia, Germany or Hong Kong!");
		}
		
		
		System.out.println("• Filling Zip Code Field...");
		
		System.out.println("• Filling City Field...");
		
		System.out.println("• Filling Occupation Field...");
		
		System.out.println("• Filling Hobbies Field...");
		
		System.out.println("• Filling Website Field...");
		
		System.out.println("• Filling Picture Field...");
		
	}
}