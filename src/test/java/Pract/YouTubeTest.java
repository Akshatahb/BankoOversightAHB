package Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.WebDriverUtils;

public class YouTubeTest {
	@Test
	public static void youTubeSongTest() throws Throwable {
		WebDriverUtils wlib = new WebDriverUtils();
		WebDriver driver= new ChromeDriver();
		wlib.waitForPageLoadTimeOut(driver, 30);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("song");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys(" ");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//b[text()=' new']"));
		wlib.waitForVisibilityOfElement( 30,driver, search);	
		search.click();
		
	}
}
