package dataDrivenonceptUsingApachePoi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicData {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\myFile3.xlsx");

		XSSFWorkbook workBook = new XSSFWorkbook();

		XSSFSheet sheet = workBook.createSheet("Dynamic Data");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your desired rows ");
		int noOfRows = sc.nextInt();

		System.out.println("Enter your desired column ");

		int noOfCells = sc.nextInt();

		for (int r = 0; r <= noOfRows; r++) {

			XSSFRow currentRow = sheet.createRow(r);

			for (int c = 0; c < noOfCells; c++) {
				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		workBook.write(file);
		workBook.close();
		file.close();

	}

}
