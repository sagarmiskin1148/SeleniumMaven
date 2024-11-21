package mouseActions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		//button
		WebElement btn=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		//right click= contextClick()
		
		Actions act=new Actions(driver);
		act.contextClick(btn).perform();
		
		//list
		List<WebElement> list1=driver.findElements(By.xpath("(//ul)[3]//li//span"));
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Delete"))
			{
				i.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		//alert window
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert Text: "+alt.getText());
		
		alt.accept();
		
		Utility.getScreenshot(driver);
		
		
		
		
		
		
		
		


	}

}
