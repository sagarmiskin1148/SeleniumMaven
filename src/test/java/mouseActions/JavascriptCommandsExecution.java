package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class JavascriptCommandsExecution {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		WebElement ele1=driver.findElement(By.id("icp-touch-link-language"));
		
		Utility.scrollUpToElement(driver,ele1);
		/*
		//To create alert
		
		js.executeScript("alert('Hello All I am Js Alert!')");
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//To refresh page
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		System.out.println("*********************************");
		js.executeScript("history.go()");
		
		//To get title of the page 
		System.out.println(driver.getTitle());
		
		String title=js.executeScript("return document.title").toString();
		System.out.println("Title is: "+title);
		*/
		//scroll-down
		//js.executeScript("window.scrollTo(0,6000)");
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//Thread.sleep(2000);
		//scroll up
		//js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		//scroll up to the element-scrollIntoView()
		//
		//WebElement ele=driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
	
		
		//WebElement ele=driver.findElement(By.xpath("//span[normalize-space()='New launches from women-led businesses']"));
		//js.executeScript("arguments[0].scrollIntoView(true);",ele);
		//System.out.println(text);
		
		WebElement ele=driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
		js.executeScript("arguments[0].click()",ele);
		
		

	}

}
