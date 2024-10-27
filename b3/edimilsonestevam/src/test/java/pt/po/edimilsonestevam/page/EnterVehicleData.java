package pt.po.edimilsonestevam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class EnterVehicleData extends Base {

	public EnterVehicleData(WebDriver browser) {
		super(browser);
		
	}

	public void fillEnterVehicleDataRegister(String informCarName, String informModel, int informCylinderCapacity, int informEnginePerformance, int informDateManufacture, int informNumberSeats, String informRightHandDriveYesNo, int informNumberSeatsMotor, String informFuelType, int informPayload, int informTotalWeight, int informListPrice, String informLicensePlateNumber, int informAnnualMileage) {
		
		System.out.println("Enter Vehicle Data");
		
		String idMakeField = "make";
		String idModelField = "model";
		String idCylinderCapacityField = "cylindercapacity";
		String idEnginePerformanceField = "engineperformance";
		String idDateManufactureField = "dateofmanufacture";
		String idNumberSeatsField = "numberofseats";
		String idRightHandDriveYesIcon = "righthanddriveyes";
		String idRightHandDriveNoIcon = "righthanddriveno";
		String idNumbersSeatsMotorField = "numberofseatsmotorcycle";
		String idFuelTypeField = "fuel";
		String idPayloadField = "payload";
		String idTotalWeightField = "totalweight";
		String idListPriceField = "listprice";
		String idLicensePlateNumberField = "licenseplatenumber";
		String idAnnualMileageField = "annualmileage";
		
		String carOptionFirst = "Audi";
		String carOptionSecond = "BMW"; 
		String carOptionThird = "Ford"; 
		String carOptionFourth = "Honda";
		String carOptionFifth = "Mazda";
		String carOptionSixth = "Mercedes Benz";
		String carOptionSeventh = "Nissan";
		String carOptionEighth = "Opel";
		String carOptionNinth = "Porsche";
		String carOptionTenth = "Renault";
		String carOptionEleventh = "Skoda";
		String carOptionTwelfth = "Suzuki";
		String carOptionThirteenth = "Toyota";
		String carOptionFourteenth = "Volkswagen";
		String carOptionFifteenth = "Volvo";
		
		String modelOptionFirst = "Scooter";
		String modelOptionSecond = "Three-Wheeler"; 
		String modelOptionThird = "Moped"; 
		String modelOptionFourth = "Motorcycle";
		
		String numberSeatsOptionFirst = "1";
		String numberSeatsOptionSecond = "2"; 
		String numberSeatsOptionThird = "3"; 
		String numberSeatsOptionFourth = "4";
		String numberSeatsOptionFifth = "5";
		String numberSeatsOptionSixth = "6";
		String numberSeatsOptionSeventh = "7";
		String numberSeatsOptionEighth = "8";
		String numberSeatsOptionNinth = "9";
		
		String fuelTypeOptionFirst = "Petrol";
		String fuelTypeOptionSecond = "Diesel";
		String fuelTypeOptionThird = "Electric Power";
		String fuelTypeOptionFourth = "Gas";
		String fuelTypeOptionFifth = "Other";
		
		
		System.out.println("• Filling Make Field...");
		
		if (informCarName.equalsIgnoreCase(carOptionFirst)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionFirst)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionSecond)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionSecond)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionThird)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionThird)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionFourth)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionFourth)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionFifth)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionFifth)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionSixth)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionSixth)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionSeventh)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionSeventh)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionEighth)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionEighth)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionNinth)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionNinth)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionTenth)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionTenth)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionEleventh)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionEleventh)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionTwelfth)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionTwelfth)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionThirteenth)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionThirteenth)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionFourteenth)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionFourteenth)).click();
		}
		else if (informCarName.equalsIgnoreCase(carOptionFifteenth)) {
			browser.findElement(By.id(idMakeField)).click();
			browser.findElement(By.name(carOptionFifteenth)).click();
		}
		else {
			System.out.println("You should inform: Audi, BMW, Ford, Honda, Mazda, Mercedes Benz, Nissan, Opel, Porsche, Renault, Skoda, Suzuki, Toyota, Volkswagen or Volvo!");
		}
		
		
		System.out.println("• Filling Model Field...");
		
		if (informModel.equalsIgnoreCase(modelOptionFirst)) {
			browser.findElement(By.id(idModelField)).click();
			browser.findElement(By.name(modelOptionFirst)).click();
		}
		else if (informModel.equalsIgnoreCase(modelOptionSecond)) {
			browser.findElement(By.id(idModelField)).click();
			browser.findElement(By.name(modelOptionSecond)).click();
		}
		else if (informModel.equalsIgnoreCase(modelOptionThird)) {
			browser.findElement(By.id(idModelField)).click();
			browser.findElement(By.name(modelOptionThird)).click();
		}
		else if (informModel.equalsIgnoreCase(modelOptionFourth)) {
			browser.findElement(By.id(idModelField)).click();
			browser.findElement(By.name(modelOptionFourth)).click();
		}
		else {
			System.out.println("You should inform: Scooter, Three-Wheeler, Moped or Motorcycle!");
		}
		
		
		System.out.println("• Filling Cylinder Capacity Field...");
		
		browser.findElement(By.id(idCylinderCapacityField)).click();
		browser.findElement(By.id(idCylinderCapacityField)).sendKeys("informCylinderCapacity");
		
		
		System.out.println("• Filling Engine Performance [kW] Field...");
		
		browser.findElement(By.id(idEnginePerformanceField)).click();
		browser.findElement(By.id(idEnginePerformanceField)).sendKeys("informEnginePerformance");
		
		
		System.out.println("• Filling Date of Manufacture Field...");
		
		browser.findElement(By.id(idDateManufactureField)).click();
		browser.findElement(By.id(idDateManufactureField)).sendKeys("informDateManufacture");
		
		
		System.out.println("• Filling Number of Seats Field...");
		
		switch (informNumberSeats) {
		case 1:
			browser.findElement(By.id(idNumberSeatsField)).click();
			browser.findElement(By.name(numberSeatsOptionFirst)).click();	
			break;
		
		case 2:
			browser.findElement(By.id(idNumberSeatsField)).click();
			browser.findElement(By.name(numberSeatsOptionSecond)).click();
			break;
		
		case 3:
			browser.findElement(By.id(idNumberSeatsField)).click();
			browser.findElement(By.name(numberSeatsOptionThird)).click();
			break;
		
		case 4:
			browser.findElement(By.id(idNumberSeatsField)).click();
			browser.findElement(By.name(numberSeatsOptionFourth)).click();
			break;
		
		case 5:
			browser.findElement(By.id(idNumberSeatsField)).click();
			browser.findElement(By.name(numberSeatsOptionFifth)).click();
			break;
			
		case 6:
			browser.findElement(By.id(idNumberSeatsField)).click();
			browser.findElement(By.name(numberSeatsOptionSixth)).click();
			break;
	
		case 7:
			browser.findElement(By.id(idNumberSeatsField)).click();
			browser.findElement(By.name(numberSeatsOptionSeventh)).click();
			break;
		
		case 8:
			browser.findElement(By.id(idNumberSeatsField)).click();
			browser.findElement(By.name(numberSeatsOptionEighth)).click();
			break;
		
		case 9:
			browser.findElement(By.id(idNumberSeatsField)).click();
			browser.findElement(By.name(numberSeatsOptionNinth)).click();
			break;
			
		default:
			System.out.println("You should inform: 1, 2, 3, 4, 5, 6, 7, 8 or 9!");
		}
	
		
		System.out.println("• Filling Fuel Type Field...");
		
		if (informFuelType.equalsIgnoreCase(fuelTypeOptionFirst)) {
			browser.findElement(By.id(idFuelTypeField)).click();
			browser.findElement(By.name(fuelTypeOptionFirst)).click();
		}
		else if (informFuelType.equalsIgnoreCase(fuelTypeOptionSecond)) {
			browser.findElement(By.id(idFuelTypeField)).click();
			browser.findElement(By.name(fuelTypeOptionSecond)).click();
		}
		else if (informFuelType.equalsIgnoreCase(fuelTypeOptionThird)) {
			browser.findElement(By.id(idFuelTypeField)).click();
			browser.findElement(By.name(fuelTypeOptionThird)).click();
		}
		else if (informFuelType.equalsIgnoreCase(fuelTypeOptionFourth)) {
			browser.findElement(By.id(idFuelTypeField)).click();
			browser.findElement(By.name(fuelTypeOptionFourth)).click();
		}
		else if (informFuelType.equalsIgnoreCase(fuelTypeOptionFifth)) {
			browser.findElement(By.id(idFuelTypeField)).click();
			browser.findElement(By.name(fuelTypeOptionFifth)).click();
		}
		else {
			System.out.println("You should inform: Petrol, Diesel, Electric Power, Gas or Other!");
		}
		
		
		System.out.println("• Filling List Price [$] Field...");
		
		browser.findElement(By.id(idListPriceField)).click();
		browser.findElement(By.id(idListPriceField)).sendKeys("informListPrice");
		
		
		System.out.println("• Filling License Plate Number Field...");
		
		browser.findElement(By.id(idLicensePlateNumberField)).click();
		browser.findElement(By.id(idLicensePlateNumberField)).sendKeys(informLicensePlateNumber);
		
		
		System.out.println("• Filling Annual Mileage [mi] Field...");
		
		browser.findElement(By.id(idAnnualMileageField)).click();
		browser.findElement(By.id(idAnnualMileageField)).sendKeys("informAnnualMileage");
		
	}
	
}
