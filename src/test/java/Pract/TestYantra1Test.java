package Pract;

import java.awt.AWTException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestYantra1Test {
	@Test
	public  void testYantra1test() throws AWTException, InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("samsung"+Keys.ENTER);
		String pwh = driver.getWindowHandle();
		List<WebElement> phones = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG Galaxy F13')]"));
		
		for (WebElement phone : phones) 
		{
			phone.click();	
		}
		
		Thread.sleep(3000);
		Set<String> cwh = driver.getWindowHandles();
		for (String wh : cwh)
		{
			Thread.sleep(3000);
			if(!pwh.equals(wh)) {
			driver.switchTo().window(wh);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			}
		}
		driver.switchTo().window(pwh);
		driver.navigate().refresh();
		String noOfitems = driver.findElement(By.xpath("//a[@class='_3SkBxJ']/div[@class='KK-o3G']")).getText();
		System.out.println("total cart items : "+noOfitems);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
		String pwh = driver.getWindowHandle();
		List<WebElement> phones = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 14 (B')]"));
		
		for (WebElement ph : phones) 
		{
			ph.click();	
		}
		
		Thread.sleep(3000);
		Set<String> cwh = driver.getWindowHandles();
		for (String wh : cwh)
		{
			Thread.sleep(3000);
			if(!pwh.equals(wh)) {
			driver.switchTo().window(wh);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			}
		}
		driver.switchTo().window(pwh);
		driver.navigate().refresh();
		String cartNo = driver.findElement(By.xpath("//a[@class='_3SkBxJ']/div[@class='KK-o3G']")).getText();
		System.out.println("total cart items : "+cartNo);
		*/
		
	}



}
