package SeleniumProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class UserLogin {
  @Test
  public void ReadData() throws Exception {
	  File src = new File("F:\\ExcelData\\ReadData.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet ws1 = wb.getSheet("sheet1");
	  int row = ws1.getLastRowNum();
	 // System.out.print(row);
	  int columns = ws1.getRow(0).getLastCellNum();
	  //System.out.println(columns);
	  //create a loop to read all the values in a row
	  for(int i = 0;i<=row;i++)
	  {
		  //Row row1 = ws1.getRow(i);
		  //create a loop to print all the values in row
		  for (int j=0;j < columns;j++)
		  {
			  String value=ws1.getRow(i).getCell(j).getStringCellValue();
			  System.out.println(value);
			  
		  }
		  
	  }
	  wb.close();
	  fis.close();
	  
  }
}
