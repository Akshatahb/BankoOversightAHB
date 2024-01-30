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
import ObjectRepo.CreditCustomerPage;
import ObjectRepo.CustomerDetailsPage;
import ObjectRepo.DashBoardPage;
import ObjectRepo.HomePage;
import ObjectRepo.PendingCustomerPage;
import ObjectRepo.RegistrationPage;
import ObjectRepo.StaffLoginPage;

public class CreditCustomerTest extends BaseClass{
	@Test(groups = "Regresssion")
	public void creditCustEndToEndTest() throws Exception {

		//Fileutils fLib=new Fileutils();
		//WebDriverUtils wLib=new WebDriverUtils();
		//ExcelUtils eLib=new ExcelUtils();
				
			
				
				//open browser 
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
				
				//click on stafflogin and login as staff
				
				
				DashBoardPage db=new DashBoardPage(driver);
				db.clickOnStaffLoginButton();
				String STAFFID = fLib.readDataFromProperty("staffid");
				String PASSWORD = fLib.readDataFromProperty("password");
				StaffLoginPage slp=new StaffLoginPage(driver);
				slp.staffLogin(STAFFID, PASSWORD);

				
				//approve account
				
				
				PendingCustomerPage pcPage=new PendingCustomerPage(driver);
				String accountNumber = pcPage.approveCustomer(driver, applicationNumber);


				//credit customer
				CreditCustomerPage credit=new CreditCustomerPage(driver);
				credit.creditCustomer(driver, accountNumber);
				

				//click on view account by customer number and verify
				
				CustomerDetailsPage details=new CustomerDetailsPage(driver);
				String amount = details.viewCustomerDetails(driver, accountNumber);

				if(amount.contains("1000")) {
					System.out.println("amount has been credited succesfully");
				}else {
					System.out.println("amount not credited");
				}
			
				driver.quit();
					
				
	}


}
