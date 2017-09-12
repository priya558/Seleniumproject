package SeleniumProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
	
	//This is my first commit
  @Test
  public void ReadingData() throws Exception {
	  File src = new File("F:\\ExcelData\\ReadData.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet ws1 = wb.getSheet("sheet1");
	  int a = ws1.getLastRowNum();
	  int b = ws1.getRow(0).getLastCellNum();
	  int i ,j;
	  for(i=0;i<=a;i++)
	   {
		  
		  for(j=1;j<=b-1;j++)
		  {
		System.out.println(ws1.getRow(0).getCell(0).getStringCellValue());		
			  
		  }
		    }
	  
	  
	  
	  
	  
  }
}
