package dataDrivenonceptUsingApachePoi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// excel file--? workbook ---> sheets ---> rows ---> cell

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\myFile2.xlsx");

		XSSFWorkbook workBook = new XSSFWorkbook();

		XSSFSheet sheet = workBook.createSheet("Dynamic Data");
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		/*
		 * XSSFRow row1= sheet.createRow(0); row1.createCell(0).setCellValue("java");
		 * row1.createCell(1).setCellValue(1234);
		 * row1.createCell(2).setCellValue("Automation");
		 * 
		 * 
		 * 
		 * 
		 * XSSFRow row2= sheet.createRow(1); row2.createCell(0).setCellValue("Python");
		 * row2.createCell(1).setCellValue(586);
		 * row2.createCell(2).setCellValue("engineer");
		 * 
		 * 
		 * XSSFRow row3= sheet.createRow(2); row3.createCell(0).setCellValue("C#");
		 * row3.createCell(1).setCellValue(456);
		 * row3.createCell(2).setCellValue("SDET");
		 */

		// System.out.println(row3.toString());

		
		{
			//XSSFRow currentRow = sheet.createRow(r);

			

				

				

			

		}

		System.out.println("File is Created");

		workBook.write(file);

		workBook.close();

		file.close();

	}

}
