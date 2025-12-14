package dataDrivenonceptUsingApachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
	
	// the hierarchy of excel --> we have file--> workbook-->sheets-->cell
	
	// importing fileInput stream class which will help to identify thw location of my excel file
	
	
	//getRowCount(System.getProperty("user.dir")+"\\testData\\Data.xlsx,Dynamic data);
	
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\Data.xlsx");
		
		// opening the identified workbook
		
		 XSSFWorkbook workBook = new XSSFWorkbook(file);
		 
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// coulmn is horizontal starts with 0 and counting 
		// row is vertical starts with 0 and counting in down
	  int lastRow = sheet.getLastRowNum();
	  int firstRow= sheet.getFirstRowNum();
	 int lastCellNum = 1 ;// lastcell num will return the cell value for that row
	 System.out.println("The lastRowNumber is :"+lastRow);
	 System.out.println("The lastCellNumber is :" +lastCellNum);
	 System.out.println("The first row is:"+ firstRow);
	 
	 //here important 
	 for(int r =0;r<=lastRow;r++)
	 {
		 
	XSSFRow currentRow=	 sheet.getRow(r);
		 for(int c=0;c<lastCellNum;c++)
		 {
		
		XSSFCell cell=currentRow.getCell(c);
		System.out.print(cell.toString() + "\t");
			 
		 }
		 System.out.println();
	 }
	 workBook.close();
	 
	 file.close();
	 
		
		
		
	}
	
	
	

}
