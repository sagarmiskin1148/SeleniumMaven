package datadrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	  XSSFWorkbook wb;
	@DataProvider(name="testdata")
	public Object[][] testData()
	{
	Object data[][]={{"Admin","admin123"},{"Pooja","test123"},{"Admin","admin123"},{"Amit","test123"}};
	return data;
	}
	
	@DataProvider(name="ExcelFile")
	public Object[][] fileData()
	{
		File f1=new File("./"+"//TestData//Data.xlsx");
		  FileInputStream fs;
		  Object data[][]=null;
		try {
			fs = new FileInputStream(f1);
			wb=new XSSFWorkbook(fs);

			  //total rows
			  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
			  System.out.println("Total Rows: "+rows);//6
			  
			  //total cells
			 int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
			 System.out.println("Total Columns are: "+cells);
			 
			  //design file size array
			data=new Object[rows-1][cells];//rows are 6 only 5rows read
			  
			 //iterate array and read and store data in array
			  for(int r=1;r<rows;r++)
			  {
				  for(int c=0;c<cells;c++)
				  {
					  //array index is 0
					  data[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
					  
				  }
				
			  }
			 
			//  return data;  
		} 
		 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		  
		  //Wb-->sheet--->row-->cell--->value
		  
		
		  
	}
	
}
