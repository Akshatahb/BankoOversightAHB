package Pract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.WebDriverUtils;

public class Test1Yantra {
	
	public static void main(String[] args) {

		WebDriverUtils wlib = new WebDriverUtils();
		WebDriver driver= new ChromeDriver();
		wlib.waitForPageLoadTimeOut(driver, 30);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		wlib.openNewTab(driver);
		driver.navigate().to("https://www.facebook.com/");
		wlib.openNewTab(driver);
		driver.navigate().to("https://www.flipkart.com/");
		wlib.openNewTab(driver);
		driver.navigate().to("https://www.amazon.in/");
		wlib.openNewTab(driver);
		driver.navigate().to("https://www.myntra.com/");
		wlib.openNewTab(driver);
		driver.navigate().to("https://mybmtc.karnataka.gov.in/english");
		wlib.openNewTab(driver);
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		wlib.openNewTab(driver);
		driver.navigate().to("https://www.ksrtc.in/oprs-web/");
		wlib.openNewTab(driver);	
		driver.navigate().to("https://selenium.com/");
		wlib.openNewTab(driver);
		driver.navigate().to("https://www.google.com/");
		
		wlib.switchToWindow(driver,"IRCTC Next Generation eTicketing System");
		driver.close();
}

}
