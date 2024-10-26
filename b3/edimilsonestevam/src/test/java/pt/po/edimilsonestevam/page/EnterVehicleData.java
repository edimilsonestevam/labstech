package pt.po.edimilsonestevam.page;

import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class EnterVehicleData extends Base {

	public EnterVehicleData(WebDriver browser) {
		super(browser);
		
	}

	public void fillEnterVehicleDataRegister() {
		
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
		
		System.out.println("• Filling Engine Performance [kW] Field...");
		
		System.out.println("• Filling Date of Manufacture Field...");
		
		System.out.println("• Filling Number of Seats Field...");
		
		System.out.println("• Filling Fuel Type Field...");
		
		System.out.println("• Filling List Price [$] Field...");
		
		System.out.println("• Filling License Plate Number Field...");
		
		System.out.println("• Filling Annual Mileage [mi] Field...");
		
	}
	
}
