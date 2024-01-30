package Pract;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract1 {
	

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/");
			driver.findElement(By.name("action_request")).click();
			driver.findElement(By.name("Name")).sendKeys("suyasha");
			driver.findElement(By.name("Email")).sendKeys("abc@gmail.com");
			driver.findElement(By.name("Contact")).sendKeys("123456");
			WebElement drpdwn = driver.findElement(By.name("Country"));
			Select s = new Select(drpdwn);
			s.selectByIndex(4);
	        driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
	      
			
		}

	}
