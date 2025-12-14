package com.ui.dataproviders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.ui.pojo.TestData;
import com.ui.pojo.User;

public class LoginDataProvider {
	//here ill will be reading data provider things are different here 
	

	
	
	 @DataProvider(name="LoginTestDataProvider")
	 public  Iterator<Object[]> loginDataProvider() throws FileNotFoundException {
		
		 Gson gson = new Gson();
		  File jsonFile = new File(System.getProperty("user.dir") + "\\testData\\loginData.json");
			 FileReader jsonFileReader = new FileReader(jsonFile);
		
		    
	               TestData data  = gson.fromJson(jsonFileReader, TestData.class);
	               
	               List<Object[]>  dataToReturn = new ArrayList<Object[]>();
	               
	                 for( User user  : data.getData()) {
	                	 
	                	    dataToReturn.add(new Object[] {user});
	                 }
	                 
	                 return dataToReturn.iterator();
	               
	                
	                 
		    
		 
		 
		 
	 }

}
