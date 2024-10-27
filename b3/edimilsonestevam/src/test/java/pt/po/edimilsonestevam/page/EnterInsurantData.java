package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class EnterInsurantData extends Base{

	public EnterInsurantData(WebDriver browser) {
		super(browser);

	}

	public void fillEnterInsurantData(String informFirstName, String informLastName, String informDateBirth) {
		
		System.out.println("Enter Insurant Data");
		
		String idFirstName = "firstname";
		String idLastName = "lastname";
		String idDateBirth = "birthdate";
		String idGenderMale = "gendermale";
		String idGenderFemale = "genderfemale";
		String idStreetAddress = "streetaddress";
		String idCountry = "country";
		
		String xpathCountryFirst = "//option[@value='Angola']";
		String xpathCountrySecond = "//option[@value='Argentina']";
		String xpathCountryThird = "//option[@value='Australia']";
		String xpathCountryFourth = "//option[@value='Austria']";
		String xpathCountryFifth = "//option[@value='Belgium']";
		String xpathCountrySixth = "//option[@value='Brazil']";
		String xpathCountrySeventh = "//option[@value='Canada']";
		String xpathCountryEighth = "//option[@value='Chile']";
		String xpathCountryNineth = "//option[@value='China']";
		String xpathCountryTenth = "//option[@value='Colombia']";
		String xpathCountryEleventh = "//option[@value='Costa Rica']";
		String xpathCountryTwelfth = "//option[@value='Croatia']";
		String xpathCountryThirteenth = "//option[@value='Czech Republic']";
		String xpathCountryFourteenth = "//option[@value='Denmark']";
		String xpathCountryFifteenth = "//option[@value='Ecuador']";
		String xpathCountrySixteenth = "//option[@value='Estonia']";
		String xpathCountrySeventeenth = "//option[@value='Finland']";
		String xpathCountryEighteenth = "//option[@value='France']";
		String xpathCountryNineteenth = "//option[@value='Georgia']";
		String xpathCountryTwentieth = "//option[@value='Germany']";
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
		
		System.out.println("• Filling Street Address Field...");
		
		System.out.println("• Filling Country Field...");
		
		System.out.println("• Filling Zip Code Field...");
		
		System.out.println("• Filling City Field...");
		
		System.out.println("• Filling Occupation Field...");
		
		System.out.println("• Filling Hobbies Field...");
		
		System.out.println("• Filling Website Field...");
		
		System.out.println("• Filling Picture Field...");
		
	}
}