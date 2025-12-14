package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CsvReaderUtility {
	
	public static void main(String[] args) throws CsvValidationException, IOException {
		
		
		File csvFile = new File(System.getProperty("user.dir") + "//testData//LoginData.csv");
		FileReader fileReader = new FileReader(csvFile);
		
		try (CSVReader csvReader = new CSVReader(fileReader)) {
			csvReader.readNext(); //this is 0 index which contain emaill address and password but i want to read the next line
		String[] readCsvData= csvReader.readNext(); // this is 1st index which read email address actual data 
		System.out.println(Arrays.toString(readCsvData));
			
			    
		}
		
		
		
		
		
		
		
		
		
	}

}
