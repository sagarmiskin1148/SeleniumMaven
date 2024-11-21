package datadrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelDataRead {
  @Test
  public void fileRead() throws IOException
  {
	  File f1=new File("./"+"//TestData//Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Wb-->sheet--->row-->cell--->value
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //total rows
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Total Rows: "+rows);//6
	  
	  //total cells
	 int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	 System.out.println("Total Columns are: "+cells);
	 
	  //design file size array
	 Object data[][]=new Object[rows-1][cells];//rows are 6 only 5rows read
	  
	 //iterate array and read and store data in array
	  for(int r=1;r<rows;r++)
	  {
		  for(int c=0;c<cells;c++)
		  {
			  //array index is 0
			  data[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
			  System.out.print(data[r-1][c]+"  ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  //single data read
//	  String value=wb.getSheet("userdata").getRow(4).getCell(0).getStringCellValue();
//	  System.out.println(value);
	  
	  /*
	  XSSFSheet sheet1=wb.getSheet("userdata");
	  
	  XSSFRow row=sheet1.getRow(2);
	  
	  XSSFCell cell=row.getCell(0);
	  
	  String value=cell.getStringCellValue();
	  System.out.println(value);
	  
	  */
	  
	  
	  
	  
  }
}
