package pt.po.edimilsonestevam.page;

import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class EnterInsurantData extends Base{

	public EnterInsurantData(WebDriver browser) {
		super(browser);

	}

	public void fillEnterInsurantData() {
		
		System.out.println("Enter Insurant Data");
		
		String idFirstName = "firstname";
		String idLastName = "lastname";
		String idDateBirth = "birthdate";
		String idGenderMaale = "gendermale";
		String idGenderFemale = "genderfemale";
		String idStreetAddress = "streetaddress";
		String idCountry = "country";
		
		String xpathCountryFirst = "//option[@value='Afghanistan']";
		String xpathCountrySecond = "//option[@value='Albania']";
		String xpathCountryThird = "//option[@value='Algeria']";
		String xpathCountryFourth = "//option[@value='American Samoa']";
		String xpathCountryFifth = "//option[@value='Andorra']";
		String xpathCountrySixth = "//option[@value='Angola']";
		String xpathCountrySeventh = "//option[@value='Anguilla']";
		String xpathCountryEighth = "//option[@value='Antarctica']";
		String xpathCountryNineth = "//option[@value='Antigua and Barbuda']";
		String xpathCountryTenth = "//option[@value='Argentina']";
		String xpathCountryEleventh = "//option[@value='Armenia']";
		String xpathCountryTwelfth = "//option[@value='Aruba']";
		String xpathCountryThirteenth = "//option[@value='Australia']";
		String xpathCountryFourteenth = "//option[@value='Austria']";
		String xpathCountryFifteenth = "//option[@value='Azerbaijan']";
		String xpathCountrySixteenth = "//option[@value='Bahamas']";
		String xpathCountrySeventeenth = "//option[@value='Bahrain']";
		String xpathCountryEighteenth = "//option[@value='Bangladesh']";
		String xpathCountryNineteenth = "//option[@value='Barbados']";
		String xpathCountryTwentieth = "//option[@value='Belarus']";
		
	}
}