package webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebDriverBrowserCommands {

	public static void main(String[] args)
	{
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://automationplayground.com/crm/");
		
		//to maximize screen/browser window
		driver.manage().window().maximize();
		
		//to get the title-getTitle()
		System.out.println("Application title is: "+driver.getTitle());
		
		//to get current url of the page- getCurrentUrl()
		System.out.println("Current url is: "+driver.getCurrentUrl());
		
		//to get page source-getPageSource()
		System.out.println(driver.getPageSource());

		//to close any browser- close() & quit()
		//driver.quit();
		
		//driver.close();
	}

}
