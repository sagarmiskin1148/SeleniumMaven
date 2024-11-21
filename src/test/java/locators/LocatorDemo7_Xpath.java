package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_Xpath {

	public static void main(String[] args)
	{
		// Create driver session
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//signin
		driver.findElement(By.xpath("//a[@id='SignIn']")).click();
		//emailid
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@gmail.com");
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		//checkbox
		driver.findElement(By.xpath("//input[@id='remember']")).click();
		//submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
