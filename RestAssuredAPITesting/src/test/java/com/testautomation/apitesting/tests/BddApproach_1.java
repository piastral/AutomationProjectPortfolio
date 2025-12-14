package com.testautomation.apitesting.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.annotations.Test;

import java.util.HashMap;



public class BddApproach_1 {
	static int id ;
	
	// by default it will follow BDD APPROACH(gherkin language) -->>contains number of keyword
	//by default REST ASSURED SUPPORT BDD STYLE OF WRITING TEST CASES 
	/*1-given()--->> whenever we are sending api request ,specify what content we are sending 
	 * set -cookies,add auth ,add param ,set headers info 
	 * ,2-when()--->> all the request we will send like ;post put get delete
	 * 3-then()--->> validate status code ,extract response ,extract header cookies & responsePayload
	 * we have to import static packages and add them manually 
	 * 1-this url will help us to get user list https://reqres.in/api/users/2
	 * 2-post ---> https://reqres.in/api/users 
	 * body payload({
    "name": "morpheus",
    "job": "leader"
}

update user ---> https://reqres.in/api/users/2  
body ---> {
    "name": "morpheus",
    "job": "zion resident"
}

delete user -->> https://reqres.in/api/users/2
	 */
	
//	@Test(priority=1)
	public void getUsers()
	{
		given()
		 .when()
		   .get("https://reqres.in/api/users?page=2")
		    .then()
		      .statusCode(200)
		         .body("page", equalTo(2))
		          .log().all();
		          
	}
	@Test(priority=2)
	public void createUsers()
	{
		HashMap data = new HashMap();
		data.put("job", "QA AUTOMATION ENGINEER");
		data.put("name", "Mohammed Sahed Masood");
		 
		//with given method send cookies body,content type
	 id= given()
		 .contentType("application/json")
		  .body(data)
		  //when method send request 
		 .when()
		 
		   .post("https://reqres.in/api/users")
		   //here we are capturing the id in real time and use it when updating the request 
		   //here we are using jsonpath to extract the id from response and store in static variable 
		   //and in real time we are capturing that id and using the same id we are updating the data
		    .jsonPath().getInt("id");
	         System.out.println("Validate The Id in CreateUsers " +id );
		  
		
	}
	
			@Test(priority=3 ,dependsOnMethods = {"createUsers"})	   
		public void updateUsers()
		{
			HashMap data = new HashMap();
			 data.put("job", "Devops Engineer");
			 data.put("name", "hajar khalid almountaicr");
			 
			 given()
			  .contentType("application/json")
			   .body(data)
			   
			    .when()
			     .put("https://reqres.in/api/users/"+id) 
			      .then()
			       .statusCode(200)
			        .log().all();
			       System.out.println("Validate The Id in updateUsers " +id );
			        
			
		}
	
@Test(priority =4)			
  public void deleteUsers()
 {
		given()
		 .when()
		  .delete("https://reqres.in/api/users/"+id)
		   .then()
		    .statusCode(204)
		     .log().all();
				
 }
	
	
	
	
	
	
	
	

	
	  
}
