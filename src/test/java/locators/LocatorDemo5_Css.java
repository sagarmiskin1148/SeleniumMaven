package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_Css {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		//username tagname with id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//password tagname with id
		//driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
			
		//tagname with attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		//button
		//driver.findElement(By.cssSelector("input#login-button")).click();	

		//tagname with class name
		//driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
		//tagname witn class and attribute
		driver.findElement(By.cssSelector("input.btn_action[type='submit']")).click();
		
	}

}
