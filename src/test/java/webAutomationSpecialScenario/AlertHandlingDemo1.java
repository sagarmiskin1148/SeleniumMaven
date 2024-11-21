package webAutomationSpecialScenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		//username
		driver.findElement(By.id("login1")).sendKeys("Priyanka");
		
		//click on Signin
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(2000);
		//alert window-Alert is interface in selenium
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt.getText());
		alt.accept();
		
		
		//without handling alert write password
		//UnhandledAlertException: unexpected alert open: {Alert text : Please enter your password}
		driver.findElement(By.id("password")).sendKeys("priyanka");
		
		
		
		
	}

}
