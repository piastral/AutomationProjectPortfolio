package com.testautomation.apitesting.tests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.testng.Assert.*;

import java.util.List;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
//by using jsonobject class we can parse the json data 
/*TOPIC===>> PARSING RESOPONSE BODY ===>>EXTRACT <<==== WITH JSON AND XML 
 * 1--> parsing meaning anaklyze the details the data 
 * 
 * what is json path ? AND WHAT IS THE USE OF JSON PATH 
 * ANS===>   JsonPath is a class in RestAssured that simplifies navigating and querying JSON data.
 *  It provides an easy way to extract values from a JSON response, especially when dealing with 
 *  complex nested objects or arrays.
 * =====================================================================>>
 * EXAMPLE
 * {
  "store": {
    "book": [
      {
        "category": "reference",
        "author": "Nigel Rees",
        "title": "Sayings of the Century",
        "price": 8.95
      },
      {
        "category": "fiction",
        "author": "Evelyn Waugh",
        "title": "Sword of Honour",
        "price": 12.99
      },
      {
        "category": "fiction",
        "author": "Herman Melville",
        "title": "Moby Dick",
        "isbn": "0-553-21311-3",
        "price": 8.99
      },
      {
        "category": "fiction",
        "author": "J. R. R. Tolkien",
        "title": "The Lord of the Rings",
        "isbn": "0-395-19395-8",
        "price": 22.99
      }
    ],
    "bicycle": {
      "color": "red",
      "price": 19.95
    }
  }
}
 * =====>>> This JSON has a root node store.
 *  ====>> The store contains an array of books and an object for a bicycle.
 * 
 * 
 * ==================================================================================================
 * 
 * 
 */


public class ParsingResponseBody_4 {

	
	//@Test(priority=1)	
	  void testJsonResponse()
	  {
		//Approach==>1
		/*
		 given()
		  .contentType(ContentType.JSON)
		  
		  .when()
		   .get("http://localhost:3000/store")
		  
		   .then()
		     .statusCode(200)
		      .header("Content-Type", "application/json; charset=utf-8")
		       .body("book[3].title", equalTo("The Lord of the Rings"))
		        .log();
		       
		*/
		//APPROCH==2:: WE WILL CAPTURE ENTIRE RESPONSE IN VARIABLE AND THEN WE HOLD THE ENTIRE RESPONSE IN THAT VARIABLE AND THEN WE WILL
		// DO SOME OPERATION { res will hold the entire response} ,we will use testng assertion 
		//NORMAL VALIDATION WE CAN PERFORM USING MATCHER PACKAGE ..BUT TO LOOP AROUND AND TRAVERSER THROUIGH ENTIRE BODY 
		//WE NEED TO STORE THE ENTIRE RESONSE IN ONE VARIABLE AND TRAVERSE THROIGHKY 
		 
		Response res= given()
		    .contentType(ContentType.JSON)
		  
		    .when()
		      .get("http://localhost:3000/store");
		//usng testng assert class VA;IDATION 1
	      assertEquals( res.getStatusCode() ,200);	
	       assertEquals(res.getHeader("Content-Type"),"application/json; charset=utf-8");
	        
	       // this is also the way we can validate using testNg 
	       // HERE WITH THE HELP of jsonpath and .get we can capture the title then we need to convert that into to string method 
	       //and store in STRING VARIABLE  AND THEN USE ASSERTION 
	      String bookName= res.jsonPath().get("book[3].title").toString();
	         assertEquals(bookName,"The Lord of the Rings");
	        
	  }
	
	// in this method we will take all title and then traverse till we find our exact title
	@Test(priority=2)
	void testResponseBodyData()
	{
		Response res= given()
			    .contentType(ContentType.JSON)
			  
			    .when()
			      .get("http://localhost:3000/store");
		System.out.println(res.asPrettyString());
		// to traverse or to parse entire json response we have to use JSONOBJECT CLASS 
		// whenever we are getting resposne that is response type ,if i want to traverse in json response we first need to convert into
		//string format ... than we have to pass in json object class 
		/*// over here inside book array there can n number of books there 
	     will get all the element from the array .length will give how many  values we have 
	     inside one array there can be so many 
			 object so we need to figure which object   we will use   
			                                                                                                                      
		 * 
		 * 
		 */
		//1- we are getting
		 // getJsonArray then we get the book after that we go inside the object then ill
		 // choose what i need // 2lets say i need title ..ill use getJsonObject then ill
		 // .get method then get title or anything else than convert2string String
		
		String responseData= res.asString(); // we should use here not tostring but as string 
		
		  JSONObject obj = new JSONObject(responseData);
		  
		  
		
		  boolean status =false;
		  System.out.println("THE TITLE OF ALL BOOKS  ==>>");
		  
		  for(int i=0;i<obj.getJSONArray("book").length();i++) 
		  
		  { 
		String bookTitle= obj.getJSONArray("book").getJSONObject(i).get("title").toString();
		     System.out.println(bookTitle);
		     if(bookTitle.equals("The Lord of the Rings"))
			  {
			  status = true;
			  
			  }
		       
			  
		  }    
			      
			 assertEquals(status, true);
				 
			 	
		   
		  
		
		  
		  
		  // validate total price of the book
		  double totalPrice=0;
		  for(int i=0;i<obj.getJSONArray("book").length();i++) 
		  {
			  String  price = obj.getJSONArray("book").getJSONObject(i).get("price").toString();
			  totalPrice= totalPrice+ Double.parseDouble(price);
			  
			  
		  }
		  
		  System.out.println("The Total Price of The Book is ===>> "+ totalPrice);
		  assertEquals(totalPrice,526.5);		  
		 
		
		//approach 4
		
	
		   
		   
		  
		
		  
	}
	       
	         
	            
		
		 
		  
		
		
	 
	
}
