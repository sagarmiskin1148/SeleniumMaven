package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo10_XpathAxies {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html");
		
		System.out.println("****Identify Ancestor tagname for John****");
		String ancestor=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Ancestor tagname is: "+ancestor);
		
		System.out.println("****Identify parent tagname for John****");
		String parent=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent tagname is: "+parent);
		
		System.out.println("**** Identify all child nodes/tagname for row 3****");
		List<WebElement> allChilds=driver.findElements(By.xpath("//tbody//tr[3]//child::td"));
		System.out.println("Total Child elements for Row 3: "+allChilds.size());
		
		for(WebElement i:allChilds)
		{
			System.out.println(i.getTagName()+" : "+i.getText());
		}
		
		System.out.println("*****Identify all following tag td for John*****");
		
		int fcount=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
		System.out.println("Total following tag td are: "+fcount);
		
		
System.out.println("*****Identify all preceding tag td for John*****");
		
		int pcount=driver.findElements(By.xpath("//td[text()='John']//preceding::td")).size();
		System.out.println("Total following tag td are: "+pcount);
		
		
		System.out.println("****Identify preceding sibling for john****");
		String text1=driver.findElement(By.xpath("//td[text()='John']//preceding-sibling::td")).getText();
		System.out.println("Preceding sibling for john is: "+text1);
		
		
		
		System.out.println("****Identify following sibling for john****");
		List<WebElement> list=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td"));
		System.out.println("Following siblings for john are: "+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getTagName()+" : "+i.getText());
		}
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
