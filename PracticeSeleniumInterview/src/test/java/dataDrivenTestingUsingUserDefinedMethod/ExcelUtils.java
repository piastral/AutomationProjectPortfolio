package dataDrivenTestingUsingUserDefinedMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static FileInputStream fi;
	public static OutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style; // with this i can make my cell in different colour

	public static int getRowCount(String fileDestination, String sheetName) throws IOException

	{
		fi = new FileInputStream(fileDestination);
		 wb = new XSSFWorkbook(fi);
          ws = wb.getSheet(sheetName);
           int rowCount = ws.getLastRowNum();
             wb.close();
              fi.close();

		return rowCount;

	}
	
	public static int getCellCount(String fileDestination , String sheetName ,int rowNum) throws IOException
	
	{
		fi = new FileInputStream(fileDestination);
		 wb = new XSSFWorkbook(fi);
         ws = wb.getSheet(sheetName);
              row = ws.getRow(rowNum);
         int totalCellCount= row.getLastCellNum();
             wb.close();
             fi.close();
             
             return totalCellCount;
             
	}
	
	public static String getCellData (String fileDestination , String sheetName ,int rowNum,int column) throws IOException
	{
		
		
		fi = new FileInputStream(fileDestination);
		 wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheetName);
             row = ws.getRow(rowNum);
             cell=row.getCell(column);
             
             String data;
             
             try {
            	 //two ways we can extract data 1- using to string 2- using pre defi9ned class from poi DATAFORMATTER
            	 DataFormatter formatter = new DataFormatter();
            	data= formatter.formatCellValue(cell); // return the fomratted value of cell as string regardless of cell type
            	 
             } catch (Exception e)
             {
            	data =""; 
             }
             wb.close();
             fi.close();
            
             return data;
		
		
	}
	
 
	public static void setCellData(String fileDestination , String sheetName ,int rowNum,int column ,String cellData) throws IOException
	{
		
//	this logic will help me to read data from same excel
		fi = new FileInputStream(fileDestination);
		 wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheetName);
        row=    ws.getRow(rowNum);//lets say you want roNum-5
     
        
        // now my logic is update pr create new cell into existing row 
        
       cell=  row.createCell(column);
       cell.setCellValue(cellData);
       
       fo= new FileOutputStream(fileDestination);
       wb.write(fo);
       wb.close();
       fi.close();
       fo.close();
        
       
	}
	
	public static void fillGreenColour(String fileDestination , String sheetName ,int rowNum,int column) throws IOException {
		fi = new FileInputStream(fileDestination);
		 wb = new XSSFWorkbook(fi);
          ws = wb.getSheet(sheetName);
            row=   ws.getRow(rowNum);
            cell=   row.getCell(column);
            
           style=   wb.createCellStyle();
            style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
              style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
              
              cell.setCellStyle(style);
              fo= new FileOutputStream(fileDestination);
              wb.write(fo);
              wb.close();
              fi.close();
              fo.close();
		
	}
	
	

	public static void fillRedColour(String fileDestination , String sheetName ,int rowNum,int column) throws IOException {
		fi = new FileInputStream(fileDestination);
		 wb = new XSSFWorkbook(fi);
          ws = wb.getSheet(sheetName);
            row=   ws.getRow(rowNum);
            cell=   row.getCell(column);
            
           style=   wb.createCellStyle();
            style.setFillBackgroundColor(IndexedColors.RED.getIndex());
              style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
              
              cell.setCellStyle(style);
              fo= new FileOutputStream(fileDestination);
              wb.write(fo);
              wb.close();
              fi.close();
              fo.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
