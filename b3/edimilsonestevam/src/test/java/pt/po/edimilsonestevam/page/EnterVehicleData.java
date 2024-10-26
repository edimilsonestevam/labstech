package pt.po.edimilsonestevam.page;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class EnterVehicleData extends Base {

	public EnterVehicleData(WebDriver browser) {
		super(browser);
		
	}

	public void fillEnterVehicleDataRegister(int informSeatsNumber) {
		
		System.out.println("Enter Vehicle Data");
		
		String idMakeField = "make";
		String idEnginePerformanceField = "engineperformance";
		String idDateManufactureField = "dateofmanufacture";
		String idNumberSeatsField = "numberofseats";
		String idFuelTypeField = "fuel";
		String idListPriceField = "listprice";
		String idLicensePlateNumberField = "licenseplatenumber";
		String idAnnualMileageField = "annualmileage";
		
		
		System.out.println("• Filling Make Field...");
		
		List<String> cars = Arrays.asList("Audi", "BMW", "Ford", "Honda", "Mazda", "Mercedes Benz", "Nissan", "Opel", "Porsche", "Renault", "Skoda", "Suzuki", "Toyota", "Volkswagen", "Volvo");
		
		
		System.out.println("• Filling Engine Performance [kW] Field...");
		
		System.out.println("• Filling Date of Manufacture Field...");
		
		System.out.println("• Filling Number of Seats Field...");
		
		switch (informSeatsNumber) {
		case 1:
			browser.findElement(By.id(idNumberSeatsField)).click();	
			break;
		
		case 2:
			browser.findElement(By.id(idNumberSeatsField)).click();
			break;
		
		case 3:
			browser.findElement(By.id(idNumberSeatsField)).click();
			break;
		
		case 4:
			browser.findElement(By.id(idNumberSeatsField)).click();
			break;
		
		case 5:
			browser.findElement(By.id(idNumberSeatsField)).click();
			break;
			
		case 6:
			browser.findElement(By.id(idNumberSeatsField)).click();
			break;
	
		case 7:
			browser.findElement(By.id(idNumberSeatsField)).click();
			break;
		
		case 8:
			browser.findElement(By.id(idNumberSeatsField)).click();
			break;
		
		case 9:
			browser.findElement(By.id(idNumberSeatsField)).click();
			break;
			
		default:
			System.out.println("You should inform: 1, 2, 3, 4, 5, 6, 7, 8 or 9!");
		}
		
		System.out.println("• Filling Fuel Type Field...");
		
		List<String> fuelType = Arrays.asList("Petrol", "Diesel", "Electric Power", "Gas", "Other");
		
		
		System.out.println("• Filling List Price [$] Field...");
		
		System.out.println("• Filling License Plate Number Field...");
		
		System.out.println("• Filling Annual Mileage [mi] Field...");
		
	}
	
}
