package webAutomationSpecialScenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException
	{
			
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		//alert1
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Thread.sleep(2000);
		//alert window
		Alert alt1=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt1.getText());
		
		//ok
		alt1.accept();
		
		//result
		WebElement result=driver.findElement(By.id("result"));
		System.out.println("Result text for alert1 is: "+result.getText());
		
		
		System.out.println("********************************");
		//alert2-confirm
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		Alert alt2=driver.switchTo().alert();
		System.out.println("Alert 2 text is: "+alt2.getText());
		//cancel
		alt2.dismiss();
		System.out.println("Result text for alert2 is: "+result.getText());

		System.out.println("********************************");
		//prompt alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		Alert alt3=driver.switchTo().alert();
		System.out.println("Alert 3 text is: "+alt3.getText());
		alt3.sendKeys("Hello All!");
		alt3.accept();
		System.out.println("Result text for alert3 is: "+result.getText());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
