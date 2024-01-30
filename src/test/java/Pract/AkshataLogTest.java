package Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AkshataLogTest {
	@Test
public void LoginPageTest()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	driver.findElement(By.id("username")).sendKeys("student");
	driver.findElement(By.id("password")).sendKeys("Password123");
	
	driver.findElement(By.id("submit")).click();
	
	Assert.assertEquals("Logged In Successfully",driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).getText());
}
}