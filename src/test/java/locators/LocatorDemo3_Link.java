package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_Link {

	public static void main(String[] args)
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//signin
		//driver.findElement(By.linkText("Sign In")).click();

		driver.findElement(By.partialLinkText("In")).click();
		
		//login
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox
		WebElement checkbox=driver.findElement(By.id("remember"));
		//if checkbox is not selected then do select it
		
		System.out.println("Before click Is checkbox is selected?: "+checkbox.isSelected());//false
		
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		
		System.out.println("After click Is checkbox is selected?: "+checkbox.isSelected());//false

		//submit button
		driver.findElement(By.className("btn")).click();
		
		
		//logout
		driver.findElement(By.linkText("Sign Out")).click();
		
		//message
		String text=driver.findElement(By.tagName("p")).getText();
		System.out.println("Text is: "+text);
		
		
		
	}

}
