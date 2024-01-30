package Pract;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Pract2 {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//in how many ways we can  send the text 
		//first way - sendkeys 
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("email")).clear();
		
		//2nd way - store it in a variable
		WebElement text = driver.findElement(By.id("email"));
		text.sendKeys("abc@gmail.com");
		
		//3rd way - robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_G);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_L);
		
		//4th way - javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"email\").value='suyasha'");
				
		//5th way - actions class
		Actions a = new Actions(driver);
		a.sendKeys("suyasha");

}
}
