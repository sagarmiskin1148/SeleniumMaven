package webAutomationSpecialScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTab_Window {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		//new Tab
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://www.facebook.com");
		
		//how to open redbus in 10 different tab
		for(int i=0;i<=9;i++)
		{
			WebDriver tab=driver.switchTo().newWindow(WindowType.TAB);
			tab.get("https://www.redbus.in");
		}
		
		//new Window
		WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);
		newWindow.get("https://www.amazon.in");
		
		
		
		
		
		
		
		

	}

}
