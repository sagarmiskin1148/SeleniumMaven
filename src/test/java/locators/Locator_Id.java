package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Id {

	public static void main(String[] args)
	{
		// create session
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("testng");
		
		
		/*
		//search box- By locators-address
		By searchbox=By.id("APjFqb");
		
		//identification
		WebElement ele=driver.findElement(searchbox);
		
		//validation
		System.out.println("IS Searchbox displayed?: "+ele.isDisplayed());
		System.out.println("Is searchbox is enabled?: "+ele.isEnabled());
		
		//action
		ele.sendKeys("java",Keys.ENTER);		
		*/
		
		
		
		
		
		
		
		

	}

}
