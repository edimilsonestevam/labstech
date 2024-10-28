package pt.po.edimilsonestevam.setup;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Core extends Base {

	public Core(WebDriver browser) {
		super(browser);
	
	}
	
	public void clickPreviewButton() {
		
		System.out.println("• Clicking Preview Button...");
		
		String idPreviewButton = "preventervehicledata";
		browser.findElement(By.id(idPreviewButton)).click();
		
	}
	
	public void clickInsurantDataNextButton() {
		
		System.out.println("• Clicking Insurant Data Next Button...");
		
		String idInsurantDataNextButton = "nextenterinsurantdata";
		browser.findElement(By.id(idInsurantDataNextButton)).click();
		
	}
	
	public void clickProductDataNextButton() {
		
		System.out.println("• Clicking Product Data Next Button...");
		
		String idProductDataNextButton = "nextenterproductdata";
		browser.findElement(By.id(idProductDataNextButton)).click();
		
	}
	
	public void clickOpenButton() {
		
		System.out.println("• Clicking Open Button...");
		
		String idOpenButton = "open";
		browser.findElement(By.id(idOpenButton)).click();
		
	}
	
	public void verifyInsurantDataTab(String verifyTabName) throws Exception {
		
		System.out.println("• Verifying Insurant Data Tab Name...");
		
		try {
           
			String idEnterInsurantDataTabName = "enterinsurantdata";
			
            WebElement tabName = browser.findElement(By.id(idEnterInsurantDataTabName));
            String actualTabName = tabName.getText()
            										.replaceAll("\\s+", " ")
            										.replaceAll("\\[\\s+", "[")
            										.replaceAll("\\s+\\]", "]")
            										.trim();
            assertEquals("Verifying the Tab Name", verifyTabName, actualTabName);
            
        } 
		catch (NoSuchElementException e) {
			
            throw new Exception("Success message element not found.", e);
            
        }
		
	}
	
	public void verifyProductDataTab(String verifyTabName) throws Exception {
		
		System.out.println("• Verifying Product Data Tab Name...");
		
		try {
           
			String idEnterProductDataTabName = "enterproductdata";
			
            WebElement tabName = browser.findElement(By.id(idEnterProductDataTabName));
            String actualTabName = tabName.getText()
            										.replaceAll("\\s+", " ")
            										.replaceAll("\\[\\s+", "[")
            										.replaceAll("\\s+\\]", "]")
            										.trim();
            assertEquals("Verifying the Tab Name", verifyTabName, actualTabName);
            
        } 
		catch (NoSuchElementException e) {
			
            throw new Exception("Success message element not found.", e);
            
        }
		
	}
	
	public void takeScreenShot(String featureName) {
		
		System.out.println("• Taking Screenshot...");
		
		String EnterInsurantData = "Enter Insurant Data";
		String EnterProductData = "Enter Product Data";
		String EnterVehicleData = "Enter Vehicle Data";
		String SelectPriceOption = "Select Price Option";
		String SendQuote = "Send Quote";
		
		File scrFile = ((TakesScreenshot)browser).getScreenshotAs(OutputType.FILE);
		
		if(featureName.equalsIgnoreCase(EnterInsurantData)) {
			try {
				FileUtils.copyFile(scrFile, new File("C:\\Users\\edimi\\Repositories\\labstech\\b3\\edimilsonestevam\\target\\EnterInsurantData.jpg"));
			} 
			catch (IOException e) {

				e.printStackTrace();
			}
		}
		else if(featureName.equalsIgnoreCase(EnterProductData)) {
			try {
				FileUtils.copyFile(scrFile, new File("C:\\Users\\edimi\\Repositories\\labstech\\b3\\edimilsonestevam\\target\\EnterProductData.jpg"));
			} 
			catch (IOException e) {

				e.printStackTrace();
			}
		}
		else if(featureName.equalsIgnoreCase(EnterVehicleData)) {
			try {
				FileUtils.copyFile(scrFile, new File("C:\\Users\\edimi\\Repositories\\labstech\\b3\\edimilsonestevam\\target\\EnterVehicleData.jpg"));
			} 
			catch (IOException e) {

				e.printStackTrace();
			}
		}
		else if(featureName.equalsIgnoreCase(SelectPriceOption)) {
			try {
				FileUtils.copyFile(scrFile, new File("C:\\Users\\edimi\\Repositories\\labstech\\b3\\edimilsonestevam\\target\\SelectPriceOption.jpg"));
			} 
			catch (IOException e) {

				e.printStackTrace();
			}
		}
		else if(featureName.equalsIgnoreCase(SendQuote)) {
			try {
				FileUtils.copyFile(scrFile, new File("C:\\Users\\edimi\\Repositories\\labstech\\b3\\edimilsonestevam\\target\\SendQuote.jpg"));
			} 
			catch (IOException e) {

				e.printStackTrace();
			}
		}
		else {
			System.out.println("You should inform: Enter Insurant Data, Enter Product Data, Enter Vehicle Data, Select Price Option or Send Quote!");
		}
	}
	
}