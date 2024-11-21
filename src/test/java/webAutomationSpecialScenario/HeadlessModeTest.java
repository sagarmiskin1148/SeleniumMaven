package webAutomationSpecialScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class HeadlessModeTest {

	public static void main(String[] args)
	{

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);
		System.out.println("Driver session is created!");
		driver.get("https://www.google.com");
		System.out.println("Google application is open!");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println("Trying to search TestNg");
		driver.findElement(By.name("q")).sendKeys("TestNG",Keys.ENTER);
		
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
