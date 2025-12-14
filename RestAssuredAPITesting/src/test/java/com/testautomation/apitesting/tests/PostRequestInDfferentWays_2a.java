package com.testautomation.apitesting.tests;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;




public class PostRequestInDfferentWays_2a {
/*TOPIC :: CREATING POST REQUEST BODY IN DIFFERENT WAYS 
 * 1->Post Request Body Creation using Hashmap
 * 2--> Post Request Body Creation using org.json(JSONobject)
 * 3--->Post Request Body Creation using POJO CLASS
 * 4--->Post Request Body Creation using JSON FILE DATA
 *
 * 
 * 
 */
	//static int id;
	
	
	
	//1--> POST REQUEST BODY USING HashMap
	// @Test(priority=1)
	public void createStudents()
	{
		HashMap data = new HashMap();
		 data.put("name", "hajarkhalid");
		 data.put("location", "morocco");
		 data.put("phone", "5166722683");
		 
		 // this line will handle the nested array inside students json
		 String courseArr[]= {"c","c++"};
		 data.put("courses", courseArr);
		 
		 
		   given()
		   .contentType("application/json")
		    .body(data)
		    
		     .when()
		      .post("http://localhost:3000/students")
		       .then()
		        .statusCode(201)
		         .body("name", equalTo("hajarkhalid"))
		          .body("location", equalTo("morocco"))
		           .body( "phone", equalTo("5166722683"))
		             .body("courses[0]", equalTo("c"))
		              .body("courses[1]", equalTo("c++"))
		               .header("Content-Type" ,"application/json; charset=utf-8")
		               
		              
		               .log().all();
		    
		       
	}        
	
	

	//------------------------------------------------------------------------------------------------
//	2--> Post Request Body Creation using org.json 
	// pre-requiste install dependency in pom.cm org.json
	
	@Test(priority=2)
	void testPostusingJsonLibrary()
	{
		// we have to first create jsonObject ;IMPORT FROM JSON.ORG
		//here jsonobject convert
		JSONObject data = new JSONObject();
		data.put("name", "rubel");
		data.put("location", "USA");
		 data.put("phone", "3475936123");
		 String courseArr[]= {"Java","Selenium"};
		   data.put("courses", courseArr);

		   given()
		   .contentType("application/json")
		   //when using hashmap i can variable data easily but with jsonobject:: i need to create
		   //or convert into string from json and use .to string to convert than it will work
		    .body(data.toString())
		    
		     .when()
		      .post("http://localhost:3000/students")
		       .then()
		        .statusCode(201)
		         .body("name", equalTo("rubel"))
		          .body("location", equalTo("USA"))
		           .body( "phone", equalTo("3475936123"))
		             .body("courses[0]", equalTo("Java"))
		              .body("courses[1]", equalTo("Selenium"))
		               .header("Content-Type" ,"application/json; charset=utf-8")
		               
		              
		               .log().all();
	}
	
	//3-->>USING POJO CLASS(PLAIN OLD JAVA OBJECT )
	
	// @Test(priority=3)
	void  testPostusingPoJoCLass()
	{
		
		Pojo_postRequst_2b data = new Pojo_postRequst_2b();
		//this data will be called from pojo class that is Pojo_postRequst and assign the data to variable 
		 data.setName("bablu");
		 data.setLocation("France");
		 data.setPhone("515985");
		 String coursesArr[]= {"c","c++"};
		 data.setCourses(coursesArr);
		 
		
		

		   given()
		   .contentType("application/json")
		   //when using hashmap i can variable data easily but with jsonobject:: i need to create
		   //or convert into string from json and use .to string to convert than it will work
		    .body(data)
		    
		     .when()
		      .post("http://localhost:3000/students")
		       .then()
		        .statusCode(201)
		         .body("name", equalTo("bablu"))
		          .body("location", equalTo("France"))
		           .body( "phone", equalTo("515985"))
		             .body("courses[0]", equalTo("c"))
		              .body("courses[1]", equalTo("c++"))
		               .header("Content-Type" ,"application/json; charset=utf-8")
		               
		              
		               .log().all();
	}
	
	//4-->using external json file  
	//we can create json file under the project and external copy the data in that file 
	
	//@Test(priority=4)
	public void createJsonFile() throws FileNotFoundException
	
	{
		// we have to create file type object ;its coming from java 
		File f = new File(".\\Body.json");
		 //we have to use two special classes file reader ;import from filereader java.io
			FileReader fr= new FileReader(f);
			//we have to use json tokenizer 
			JSONTokener jt = new JSONTokener(fr);
			JSONObject data = new JSONObject(jt);
		
			 given()
			   .contentType("application/json")
	          	.body(data.toString())
	    
	     .when()
	      .post("http://localhost:3000/students")
	       .then()
	        .statusCode(201)
	         .body("name", equalTo("john Johnson"))
	          .body("location", equalTo("Australia"))
	           .body( "phone", equalTo("5143459671"))
	             .body("courses[0]", equalTo("Java"))
	              .body("courses[1]", equalTo("Maven"))
	               .header("Content-Type" ,"application/json; charset=utf-8")
	               
	              
	               .log().all();
	}
	
	

}
