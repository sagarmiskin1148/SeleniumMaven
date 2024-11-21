package testngDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import helper.PropertiesFile;

public class PropertiesFileDataRead {
  @Test
  public void fileRead() throws IOException
  {
//	  File f1=new File("./"+"//config.properties");
//	  FileInputStream fs=new FileInputStream(f1);
//	  
//	  Properties p1=new Properties();
//	  p1.load(fs);
//	  
//	  System.out.println(p1.getProperty("url"));
//	  System.out.println(p1.getProperty("un"));
//	  
	  PropertiesFile ps=new PropertiesFile("config.properties");
	  System.out.println(ps.getData("url"));
	  System.out.println(ps.getData("bname"));
	  
	  
	  
	  
	  
	  
	  
  }
}
