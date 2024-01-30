package Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Pract3 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.findElement(By.xpath("//img[@alt='Close']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement ele = (WebElement)js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#kils')");
	ele.sendKeys("suyasha");
	
	//or we can do using a method getshadowroot()
	//first find the element which is just above the shadow root that is shadow then get the shadow root and then
	
	WebElement shadow = driver.findElement(By.id("userName"));
	SearchContext shadowroot = shadow.getShadowRoot();
	shadowroot.findElement(By.cssSelector("#kils")).sendKeys("suyasha");
	
	
	
	}

}

