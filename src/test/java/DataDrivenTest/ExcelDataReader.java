package DataDrivenTest;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ExcelDataReader {
  @Test
  public void reader() throws IOException 
  {
	  //read a file by creating object of File class
	  File f1 = new File("./" + "\\TestData\\Data.xlsx");
	  FileInputStream fs = new FileInputStream(f1);
	  
	  //now we have to read data file by using data driver classes
	  //workbook-->sheet-->row-->cell
	  
	  //This is a code to read a single record
	  
	  //workbook class object
	  XSSFWorkbook wb = new XSSFWorkbook(fs);
	  //go to the sheet by passing sheet's name
//	  XSSFSheet sheet1 = wb.getSheet("userdata");
	  //go to the row
//	  XSSFRow row1 = sheet1.getRow(1);
	  //go to the cell
//	  XSSFCell cell1 = row1.getCell(0);
	  
//	  XSSFCell cell2 = row1.getCell(1);
	  
	  
	  // write above all code in one line
	 // String value = wb.getSheet("userdata").getRow(2).getCell(0).getStringCellValue();
	  //String value2 = wb.getSheet("userdata").getRow(2).getCell(1).getStringCellValue();

	  
	  //get value by getStringCellValue() it returns String type data so store it String data type
	  //String value = cell1.getStringCellValue();
	  
//	  String value2 = cell2.getStringCellValue();

	  //System.out.println(value);
	  //System.out.println(value2);
	  
	  //*****************************************************************//
	  
	  //now we will see how to read all data records from the file
	  
	  //to read data we need to add the records or data in Array
	  //all records-->data-->Array
	  
	  //to get all rows
	  int rows = wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Number if rows: " + rows);
	  
	  //to get all columns
	  int cells = wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Number if columns: " + cells);
	  
	  //Array implementation
	  
	  Object data[][] = new Object[rows-1][cells];
	  
	  for(int i=1; i<rows; i++)
	  {
		  for(int j=0; j<cells; j++)
		  {
			 data[i-1][j] = wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			 System.out.println(data[i-1][j]);
		  }
	  }
	  
	  
	  
	  
	  
	  

  }
}
