package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.constants.Env;
import com.google.gson.Gson;
import com.ui.pojo.Config;
import com.ui.pojo.Environment;

public class JSONUTILITY {
	
	
	public static void main(String[] args) {
		
		File jsonFile = new File(System.getProperty("user.dir") + "\\config\\config.json");
		System.out.println(jsonFile);
	}
	
	public static String readJson (String environment ) {
		
		Gson gson = new Gson();  //  parser 
		File jsonFile = new File(System.getProperty("user.dir")+"\\config\\config.json");
		
		FileReader jsonReader = null;
		try {
			jsonReader = new FileReader(jsonFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	Config config=	gson.fromJson(jsonReader, Config.class);
	
           String value =config.getEnvironments().get(environment).getUrl();
	
	 return value;
	}

}
