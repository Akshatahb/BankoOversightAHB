package Pract;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestYantra3 {
	
	@Test
	public void launchBrowser() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement link = driver.findElement(By.linkText(""));
		link.click();
		Set<String> winHandles = driver.getWindowHandles();
		
		//driver.get("https://www.instagram.com/");
		}


}
