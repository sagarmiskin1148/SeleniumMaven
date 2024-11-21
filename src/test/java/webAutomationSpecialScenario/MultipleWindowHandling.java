package webAutomationSpecialScenario;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//homepage
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		
		//link
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//next page
		
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		
		//for child window
		for(String childId:allWindows)
		{
			
			if(!parentId.equals(childId))//if parent id is not equals with child id
			{
				driver.switchTo().window(childId);
				//email
				driver.findElement(By.name("EmailHomePage")).sendKeys("test18@gmail.com");
				//driver.close();//active window will close
				//driver.quit();//all open windows by selenium
			}
		}
		//parent window
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.name("username")).sendKeys("Priyanka");
		
		
		
		
		

	}

}
