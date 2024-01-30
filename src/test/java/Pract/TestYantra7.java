package Pract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import GenericUtility.WebDriverUtils;

public class TestYantra7 {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='Appliances']")).click();
		Thread.sleep(2000);
		WebElement tv = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		Actions a=new Actions(driver);
		a.moveToElement(tv).perform();
		Thread.sleep(2000);
		WebElement samsung = driver.findElement(By.xpath("//a[text()='Samsung']"));
		a.click(samsung).perform();
		
		
}

}
