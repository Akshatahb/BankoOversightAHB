package Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.WebDriverUtils;

public class TestYantra5 {
	
	public static void main(String[] args) throws Throwable {
		WebDriverUtils wlib = new WebDriverUtils();
		WebDriver driver= new ChromeDriver();
		wlib.waitForPageLoadTimeOut(driver, 30);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//input[@maxlength='15']")).sendKeys("dattatreya");
	
	}

}
