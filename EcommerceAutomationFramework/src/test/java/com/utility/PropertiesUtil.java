package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constants.Env;

public class PropertiesUtil {

	//read properties file 
	/*1-> first step we need to tell start reading the property from where ? from qa.properties how 
	 * 2-> for that we have soemthing in java called File --> will act as pointer
	 * 
	 */
	
	public static String readProperty(Env env , String propertyName)  {
		//file  class will tell where the file exist so i dont need to hardcode where my file is using simple system.getProperty (user.dir)
		//it will give me the path of my whole project directory 
	//config\QA.properties only this line needed to be added 
		
		File propFile = new File(System.getProperty("user.dir") + "\\config\\"+env+".properties"); // this line produce maintainence 
		System.out.println(propFile);
		//propfile is pointer will tell java  from which directry you should read the file 
		// to read file we need to introduce filereader which will actually read the file 
		
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(propFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} //which file you want to read propfile 
		
		//now i need to handle properties why because using properties ill load the file whatever the read will read it will be converting 
		
		Properties properties = new Properties(); // it will only accept properties file not json not text 
		try {
			properties.load(fileReader);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		String propValue =properties.getProperty(propertyName);
		System.out.println(propValue);
		
		return propValue;
	
	}
}
