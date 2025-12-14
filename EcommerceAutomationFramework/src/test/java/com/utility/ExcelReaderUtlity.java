package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojo.User;

public class ExcelReaderUtlity {

	
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		// the extension of the file is xlsx file  class--> which come is XSSFWORKBOOK
		
		File excelFile = new File(System.getProperty("user.dir") + "//testData//LoginData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelFile);
		// the refrence of xssf workbook wihich type of file and what file should i read 
	           XSSFSheet excelSheet=	workBook.getSheet("LoginTestData");
	           // how to read data from iterator row.next)_
	           
	           List<User> userList = new ArrayList<User>();
	            Iterator<Row> rowIterator =     excelSheet.iterator();
	            rowIterator.next();// will help me to remove the first row
	            //if there data in r]ow it will return 
	            while(rowIterator.hasNext()) {
	               Row row=	rowIterator.next();
	               
	             Cell firstCell=  row.getCell(0);
	             Cell secondCell=  row.getCell(1);
	             System.out.println(firstCell.toString());
	             System.out.println(secondCell.toString());
	            }
	           
		
	}
}
