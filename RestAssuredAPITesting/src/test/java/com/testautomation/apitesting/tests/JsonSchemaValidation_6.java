package com.testautomation.apitesting.tests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.annotations.Test;



import  io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidation_6 {
/* TOPIC ===>> JSON SCHEMA VALIDATION 
 * how we can validate schema ....of the response ,when we send some request ,and once we received the response
 * and the response is there according to the schema or not 
 * what is the difference between response validation and schema validation???
 * ans===>RESPONSE VALIDATION:: WE WILL VALIDATE THE DATA WHATEVER WE ARE RECEIEVING IN MY RESPONSE 
 * 
 * ANS==> SCHEMA VALIDATION ::==> not only data but type of data lets say i get student name 
 * or employeed id and this name is string or id integer type or not so here we check the 
 * content type but in response validation we validate the data what we are receiveing not 
 * specific type of data
 * 
 * ==>> so how we proceed with this lets ay we receive response and then we cross check with our database
 * that the schema type in response is correct or not 
 * ==>
 * 
 * 
 * 
 * 
 * 	
 */
	
	@Test
	void jsonSchemaValid()
	{
		 // first we need to maintain json schema file in maven project src/test/resources
		 // we have to convert our json data into json shcema using jsonformatter.org website 
		// we have to add one dependecy json schema validator it takes the classpath where json schema file is stored 
		given()
		
		 .when()
		   .get("http://localhost:3000/store")
		     .then()
		       .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("storeJsonSchema.json"));
		  
		
		
	}
	
	

}
