package mouseActions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {

	public static String todaysdate()
	{
		Date d1=new Date();
		//return d1.toString();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		
		String date=sdf.format(d1);
		return date;
		
	}
	
	public static String timestamp()
	{
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}

	
	
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//screenshots//Google"+timestamp()+System.currentTimeMillis()+".png");
		
		FileHandler.copy(temp,dest);
		System.out.println("Screenshot captured!");
		
		

	}

}
