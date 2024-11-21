package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args)
	{
			//Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.name("password")).sendKeys("test123");
		
		
		//button
		//driver.findElement(By.className("btn btn-primary")).click();
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		//warning
		String text=driver.findElement(By.className("alert")).getText();
		System.out.println("Warning is: "+text);
	}

}
