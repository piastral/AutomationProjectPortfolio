package com.testautomation.apitesting.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationAndDeSerilization_7 {
/*tOPIC==>> SERIALIZATION 
 * THIS IS inbuild process in rest assured we need to undestand internally 
 * serialization;;>> lets say whenerv we are sending post request we are sending body also 
 * so the body will go in json format ---> then we will get response again in json format 
 * ---> whatevr we have created post request in rest assured lets say 
 * --> pojo class ,with help of gson ,json hashmap but technically we are creating data in json format only
 * 
 * --> here whast happening my java object or pojo class we  dont directly send that with our request 
 * ==> this object will parse through or will be transmitted via network in json format 
 * ==> why we dont send java object directly ??
 * ===> because it heavy weight and json is very light weight 
 * 
 * 
 * ==>[[ SERIALIZATION IS NOTHING BUT CONVERTING OUR JAVA OBJECT OR POJO INTO JSON FORMAT 
 * ===> AND THEN THE JSON GETS TRANSMITTED VIA NETWORK TOWARDS DATABASE OR IN FILE STORAGE ]]]
 * { CONVERTING POJO--JSON}}
 * 
 * ===>>>[[DESERILIZATION AGAIN WORKS OPOSOITE TAKES THE DATA FROM DATABASE CONVERT INTO 
 * JSON THEN TRANSMITTED VIA NETWORK THEN CONVERTED INTO OBJECT ...SO HERE JSON GETS 
 * CONVERTED INTO JAVA OBJECT]] 
 * {{CONVERTING JSON--POJO}}
 * 
 * ==> WE HAVE TO USE JACKSONBINDER==>or jackson library 
 * 
 * 1--> first we should have pojo class---> will be converted to json ----
 * 
 * 	
 */
	@Test (priority = 1)       // serilization 
	void convertPojoToJson() throws JsonProcessingException
	{
  // created java object using pojo class
		Pojo_postRequst_2b data = new Pojo_postRequst_2b();
		//this data will be called from pojo class that is Pojo_postRequst and assign the data to variable 
		 data.setName("bablu");
		 data.setLocation("France");
		 data.setPhone("515985");
		 String coursesArr[]= {"c","c++"};
		 data.setCourses(coursesArr);
		 
		 // converting java object into json data 
		 // to convert java object to json we have to use OBJECT MAPPER we should import from com.fasterxml.jackson.databind
		 
		ObjectMapper pojo2Json = new ObjectMapper();
		   // now convert java object to json 
		
		//this statemnt will convert this pojo object into json 
		// will return string but technically it contains json only
		String jsonData=pojo2Json.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		System.out.println(jsonData);
		
		//========================================================================================
		
		
	}
	
	//DESERILIZATION :: CONVERTING JSON TO POJO OBJECT 
	
	@Test(priority = 2)
	void convertJson2pojo() throws JsonMappingException, JsonProcessingException
	{
		String jsonData="{\r\n"
				+ "  \"name\" : \"bablu\",\r\n"
				+ "  \"location\" : \"France\",\r\n"
				+ "  \"phone\" : \"515985\",\r\n"
				+ "  \"courses\" : [ \"c\", \"c++\" ]\r\n"
				+ "}";
		
		  // now we will convert jsondata into pojo class /java object 
		 // we can convert via object mapper
		
		ObjectMapper json2pojo = new ObjectMapper();
		  
		//in this line since i have created pojo class so i am changing from json to pojo 
		// so i have pass 2 param one is the json data and anotherone is the class where pojo object gets created
		//Pojo_postRequst_2b this is nothing but just name of class NO NEED TO FEAR haha
		
		// convert json to pojo 
		Pojo_postRequst_2b student=	  json2pojo.readValue(jsonData,Pojo_postRequst_2b.class );
		  
		
		System.out.println("Name - "+ student.getName());
		System.out.println("Location - "+student.getLocation());
		System.out.println("Phone - "+ student.getPhone());
		System.out.println("Course1 - " + student.getCourses()[0]);
		System.out.println("Course2  -" +  student.getCourses()[1]);
	     
	    
             		
				  
	}
	 
	
	

}
