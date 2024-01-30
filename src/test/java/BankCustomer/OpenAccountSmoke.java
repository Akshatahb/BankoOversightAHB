package BankCustomer;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtils;
import GenericUtility.Fileutils;
import GenericUtility.WebDriverUtils;
import ObjectRepo.ConfirmRegistrationPage;
import ObjectRepo.HomePage;
import ObjectRepo.RegistrationPage;

public class OpenAccountSmoke extends BaseClass{
	
	@Test(groups="smoke")
	public void OpenAccSmoke() throws Exception {
		
		//Fileutils fLib=new Fileutils();
		//WebDriverUtils wLib=new WebDriverUtils();
		//ExcelUtils eLib=new ExcelUtils();
				
			
				
				//open browser maximize and implicit wait
				//WebDriver driver=new ChromeDriver();
				
				//maximize the browser
				//wLib.windowMaximize(driver);
			
				
				//page load timeout
				//wLib.waitForPageLoadTimeOut(driver, 20);
				
				
				//entering the url
				//String URL=fLib.readDataFromProperty("url");
				//driver.get(URL);
				
				//click on open account
				HomePage hp=new HomePage(driver);
				hp.clickOnOpenAcc();
				
				
				
				//to send multiple data to multiple text fields
				
				HashMap<String, String> map = eLib.hashMapData("OpenAccount", 1);
				
				//enter the required data and click on submit button and return the data required for applying debit card
				RegistrationPage page=new RegistrationPage(driver);
				page.enterDataIntoForm(map, driver, "Female", "Texas", "San Diego", "Saving");
				
				//verify the details and click on confirm button it will generate a customer application number
				ConfirmRegistrationPage confirm=new ConfirmRegistrationPage(driver);
				String applicationNumber = confirm.clickOnConfirmButton(driver);	
				System.out.println("Application Number "+applicationNumber);
				
				driver.quit();
				
				}


}
