package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pt.po.edimilsonestevam.setup.Base;

public class EnterVehicleData extends Base {

	public EnterVehicleData(WebDriver browser) {
		super(browser);
		
	}

	public void fillEnterVehicleDataRegister(String informCarName, String informModel, int informCylinderCapacity, int informEnginePerformance, String informDateManufacture, int informNumberSeats, String informRightHandDriveYesNo, int informNumberSeatsMotor, String informFuelType, int informPayload, int informTotalWeight, int informListPrice, String informLicensePlateNumber, int informAnnualMileage) {
		
		System.out.println("Enter Vehicle Data");
		
		String idMakeField = "make";
		String idModelField = "model";
		String idCylinderCapacityField = "cylindercapacity";
		String idEnginePerformanceField = "engineperformance";
		String idDateManufactureField = "dateofmanufacture";
		String idNumberSeatsField = "numberofseats";
		String idRightHandDriveYesRadio = "righthanddriveyes";
		String idRightHandDriveNoRadio = "righthanddriveno";
		String idNumbersSeatsMotorField = "numberofseatsmotorcycle";
		String idFuelTypeField = "fuel";
		String idPayloadField = "payload";
		String idTotalWeightField = "totalweight";
		String idListPriceField = "listprice";
		String idLicensePlateNumberField = "licenseplatenumber";
		String idAnnualMileageField = "annualmileage";
		
		String carOptionFirst = "Audi";
		String xpathCarOptionFirst = "//option[@value='Audi']";
		
		String carOptionSecond = "BMW";
		String xpathCarOptionSecond = "//option[@value='BWM']";
		
		String carOptionThird = "Ford";
		String xpathCarOptionThird = "//option[@value='Ford']";
		
		String carOptionFourth = "Honda";
		String xpathCarOptionFourth = "//option[@value='Honda']";
		
		String carOptionFifth = "Mazda";
		String xpathCarOptionFifth = "//option[@value='Mazda']";
		
		String carOptionSixth = "Mercedes Benz";
		String xpathCarOptionSixth = "//option[@value='Mercedes Benz']";
		
		String carOptionSeventh = "Nissan";
		String xpathCarOptionSeventh = "//option[@value='Nissan']";
		
		String carOptionEighth = "Opel";
		String xpathCarOptionEighth = "//option[@value='Opel']";
		
		String carOptionNinth = "Porsche";
		String xpathCarOptionNinth = "//option[@value='Porsche']";
		
		String carOptionTenth = "Renault";
		String xpathCarOptionTenth = "//option[@value='Renault']";
		
		String carOptionEleventh = "Skoda";
		String xpathCarOptionEleventh = "//option[@value='Skoda']";
		
		String carOptionTwelfth = "Suzuki";
		String xpathCarOptionTwelfth = "//option[@value='Suzuki']";
		
		String carOptionThirteenth = "Toyota";
		String xpathCarOptionThirteenth = "//option[@value='Toyota']";
		
		String carOptionFourteenth = "Volkswagen";
		String xpathCarOptionFourteenth = "//option[@value='Volkswagen']";
		
		String carOptionFifteenth = "Volvo";
		String xpathCarOptionFifteenth = "//option[@value='Volvo']";
		
		String modelOptionFirst = "Scooter";
		String xpathModelOptionFirst = "//option[@value='Scooter']";
		
		String modelOptionSecond = "Three-Wheeler"; 
		String xpathModelOptionSecond = "//option[@value='Three-Wheeler']";
		
		String modelOptionThird = "Moped"; 
		String xpathModelOptionThird = "//option[@value='Moped']";
		
		String modelOptionFourth = "Motorcycle";
		String xpathModelOptionFourth = "//option[@value='Motorcycle']";
		
		String rightHandDriveYes = "Yes";
		String xPathRightHandDriveYes = "//label[text()='Yes']";
		
		String rightHandDriveNo = "No";
		String xPathRightHandDriveNo = "//label[text()='No']";
		
		String xpathNumberSeatsOptionFirst = "//option[@value='1']";;
		String xpathNumberSeatsOptionSecond = "//option[@value='2']"; 
		String xpathNumberSeatsOptionThird = "//option[@value='3']"; 
		String xpathNumberSeatsOptionFourth = "//option[@value='4']";
		String xpathNumberSeatsOptionFifth = "//option[@value='5']";
		String xpathNumberSeatsOptionSixth = "//option[@value='6']";
		String xpathNumberSeatsOptionSeventh = "//option[@value='7']";
		String xpathNumberSeatsOptionEighth = "//option[@value='8']";
		String xpathNumberSeatsOptionNinth = "//option[@value='9']";
		
		String xpathNumberSeatsMotorOptionFirst = "//select[@id='numberofseatsmotorcycle']/option[@value='1']";
		String xpathNumberSeatsMotorOptionSecond = "//select[@id='numberofseatsmotorcycle']/option[@value='2']";
		String xpathNumberSeatsMotorOptionThird = "//select[@id='numberofseatsmotorcycle']/option[@value='3']";
		
		String fuelTypeOptionFirst = "Petrol";
		String xpathFuelOptionFirst = "//option[@value='Petrol']";
		
		String fuelTypeOptionSecond = "Diesel";
		String xpathFuelTypeOptionSecond = "//option[@value='Diesel']";
		
		String fuelTypeOptionThird = "Electric Power";
		String xpathFuelTypeOptionThird = "//option[@value='Electric Power']";
		
		String fuelTypeOptionFourth = "Gas";
		String xpathFuelTypeOptionFourth = "//option[@value='Gas']";
		
		String fuelTypeOptionFifth = "Other";
		String xpathFuelTypeOptionFifth = "//option[@value='Other']";
		
		WebElement element = null;	
		WebDriverWait wait = new WebDriverWait(browser, 3);
		
		
		System.out.println("• Filling Make Field...");
		
		if (informCarName.equalsIgnoreCase(carOptionFirst)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionFirst)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionSecond)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionSecond)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionThird)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionThird)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionFourth)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionFourth)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionFifth)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionFifth)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionSixth)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionSixth)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionSeventh)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionSeventh)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionEighth)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionEighth)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionNinth)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionNinth)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionTenth)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionTenth)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionEleventh)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionEleventh)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionTwelfth)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionTwelfth)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionThirteenth)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionThirteenth)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionFourteenth)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionFourteenth)));
			element.click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionFifteenth)) {
			browser.findElement(By.id(idMakeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathCarOptionFifteenth)));
			element.click();
		}
		else {
			System.out.println("You should inform: Audi, BMW, Ford, Honda, Mazda, Mercedes Benz, Nissan, Opel, Porsche, Renault, Skoda, Suzuki, Toyota, Volkswagen or Volvo!");
		}
		
		
		System.out.println("• Filling Model Field...");
		
		if (informModel.equalsIgnoreCase(modelOptionFirst)) {
			browser.findElement(By.id(idModelField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathModelOptionFirst)));
			element.click();
		}
		else if (informModel.equalsIgnoreCase(modelOptionSecond)) {
			browser.findElement(By.id(idModelField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathModelOptionSecond)));
			element.click();
		}
		else if (informModel.equalsIgnoreCase(modelOptionThird)) {
			browser.findElement(By.id(idModelField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathModelOptionThird)));
			element.click();
		}
		else if (informModel.equalsIgnoreCase(modelOptionFourth)) {
			browser.findElement(By.id(idModelField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathModelOptionFourth)));
			element.click();
		}
		else {
			System.out.println("You should inform: Scooter, Three-Wheeler, Moped or Motorcycle!");
		}
		
		
		System.out.println("• Filling Cylinder Capacity Field...");
		
		browser.findElement(By.id(idCylinderCapacityField)).click();
		browser.findElement(By.id(idCylinderCapacityField)).sendKeys("informCylinderCapacity");
		
		
		System.out.println("• Filling Engine Performance Field...");
		
		browser.findElement(By.id(idEnginePerformanceField)).click();
		browser.findElement(By.id(idEnginePerformanceField)).sendKeys("informEnginePerformance");
		
		
		System.out.println("• Filling Date of Manufacture Field...");
		
		browser.findElement(By.id(idDateManufactureField)).click();
		browser.findElement(By.id(idDateManufactureField)).sendKeys(informDateManufacture);
		
		
		System.out.println("• Filling Number of Seats Field...");
		
		switch (informNumberSeats) {
		case 1:
			browser.findElement(By.id(idNumberSeatsField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsOptionFirst)));
			element.click();
			break;
		
		case 2:
			browser.findElement(By.id(idNumberSeatsField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsOptionSecond)));
			element.click();
			break;
		
		case 3:
			browser.findElement(By.id(idNumberSeatsField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsOptionThird)));
			element.click();
			break;
		
		case 4:
			browser.findElement(By.id(idNumberSeatsField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsOptionFourth)));
			element.click();
			break;
		
		case 5:
			browser.findElement(By.id(idNumberSeatsField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsOptionFifth)));
			element.click();
			break;
			
		case 6:
			browser.findElement(By.id(idNumberSeatsField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsOptionSixth)));
			element.click();
			break;
	
		case 7:
			browser.findElement(By.id(idNumberSeatsField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsOptionSeventh)));
			element.click();
			break;
		
		case 8:
			browser.findElement(By.id(idNumberSeatsField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsOptionEighth)));
			element.click();
			break;
		
		case 9:
			browser.findElement(By.id(idNumberSeatsField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsOptionNinth)));
			element.click();
			break;
			
		default:
			System.out.println("You should inform: 1, 2, 3, 4, 5, 6, 7, 8 or 9!");
		}
	
		
		System.out.println("• Filling Right Hand Drive Field...");
		
		if (rightHandDriveYes.equalsIgnoreCase(informRightHandDriveYesNo)) {
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathRightHandDriveYes)));
			element.click();
		}
		else if (rightHandDriveNo.equalsIgnoreCase(informRightHandDriveYesNo)) {
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathRightHandDriveNo)));
			element.click();
		}
		else {
			System.out.println("You should inform: Yes or No!");
		}
		
		
		System.out.println("• Filling Number of Seats Motor Field...");
		
		switch (informNumberSeatsMotor) {
		case 1:
			browser.findElement(By.id(idNumbersSeatsMotorField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsMotorOptionFirst)));
			element.click();	
			break;
		
		case 2:
			browser.findElement(By.id(idNumbersSeatsMotorField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsMotorOptionSecond)));
			element.click();
			break;
		
		case 3:
			browser.findElement(By.id(idNumbersSeatsMotorField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathNumberSeatsMotorOptionThird)));
			element.click();
			break;
			
		default:
			System.out.println("You should inform: 1, 2 or 3!");
		}
		
		
		System.out.println("• Filling Fuel Type Field...");
		
		if (informFuelType.equalsIgnoreCase(fuelTypeOptionFirst)) {
			browser.findElement(By.id(idFuelTypeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathFuelOptionFirst)));
			element.click();
		}
		else if (informFuelType.equalsIgnoreCase(fuelTypeOptionSecond)) {
			browser.findElement(By.id(idFuelTypeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathFuelTypeOptionSecond)));
			element.click();
		}
		else if (informFuelType.equalsIgnoreCase(fuelTypeOptionThird)) {
			browser.findElement(By.id(idFuelTypeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathFuelTypeOptionThird)));
			element.click();
		}
		else if (informFuelType.equalsIgnoreCase(fuelTypeOptionFourth)) {
			browser.findElement(By.id(idFuelTypeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathFuelTypeOptionFourth)));
			element.click();
		}
		else if (informFuelType.equalsIgnoreCase(fuelTypeOptionFifth)) {
			browser.findElement(By.id(idFuelTypeField)).click();
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathFuelTypeOptionFifth)));
			element.click();
		}
		else {
			System.out.println("You should inform: Petrol, Diesel, Electric Power, Gas or Other!");
		}
		
		
		System.out.println("• Filling Payload Field...");
		
		browser.findElement(By.id(idPayloadField)).click();
		browser.findElement(By.id(idPayloadField)).sendKeys("informPayload");
		
		
		System.out.println("• Filling Total Weight Field...");
		
		browser.findElement(By.id(idTotalWeightField)).click();
		browser.findElement(By.id(idTotalWeightField)).sendKeys("informTotalWeight");
		
		
		System.out.println("• Filling List Price Field...");
		
		browser.findElement(By.id(idListPriceField)).click();
		browser.findElement(By.id(idListPriceField)).sendKeys("informListPrice");
		
		
		System.out.println("• Filling License Plate Number Field...");
		
		browser.findElement(By.id(idLicensePlateNumberField)).click();
		browser.findElement(By.id(idLicensePlateNumberField)).sendKeys(informLicensePlateNumber);
		
		
		System.out.println("• Filling Annual Mileage Field...");
		
		browser.findElement(By.id(idAnnualMileageField)).click();
		browser.findElement(By.id(idAnnualMileageField)).sendKeys("informAnnualMileage");
		
	}
	
}
