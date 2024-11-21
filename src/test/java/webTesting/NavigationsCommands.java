package webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavigationsCommands 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//google--->facebook
		driver.navigate().to("https://www.facebook.com");
		
		//static wait-Thread.sleep(2000)
		
		Thread.sleep(2000);
		
		//back
		driver.navigate().back();
		Thread.sleep(2000);
		
		//forward()
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//refresh()
		driver.navigate().refresh();
		
		
		
		

	}

}
