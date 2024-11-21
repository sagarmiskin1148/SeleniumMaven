package webTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo_Id {

	public static void main(String[] args)
	{
		//create a session
		WebDriver driver=new ChromeDriver();
		
		//to open application
		driver.get("https://www.google.com");
		
		WebElement ele=driver.findElement(By.id("APjFqb"));
		
		//validate webElement
		System.out.println("Check search box is displayed?: "+ele.isDisplayed());
		System.out.println("Check search box is enabled?: "+ele.isEnabled());
		
		
		//actions
		//ele.sendKeys("devlabs");
		
		//action with keyboard step
		ele.sendKeys("devlabs",Keys.ENTER);
		
		
		
		
		

	}

}
