package Pract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract4 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//in selenium 3 we can make use of robot class
	
		
		//in selenium 4 we can open the tab like this
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		
		
	}

}
