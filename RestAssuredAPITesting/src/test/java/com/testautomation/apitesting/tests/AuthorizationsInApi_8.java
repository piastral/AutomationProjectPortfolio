package com.testautomation.apitesting.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


public class AuthorizationsInApi_8 {
	
/* TOPICS ::==> AUTHORIZATION 
 * what is the difference between authentication and authorization...
 * authentication:: it will check the user is valid or not 
 * authorization :: user is valid it will check that user has access privelage (permission)
 * 
 * for an example ,one employeed need to work in database but along with database there is so many service
 * first,it will check that employee is valid or not or belongs to company or not 1ST LAYER OF SECURIT
 * WHERE authentication comes into the picture,now after succefully authenticated company will 
 * check this employee is authorized to work in database or NOT 2ND LAYER OF SECURITY
 * 
 * ===>> IN REST ASSURD WHAT KIND OF AUTH SUPPORTED
 * 1--> BASIC ---> JUST PROVIDE USER NAME AND PASSWORD 
 * 
 * 2--> DIGEST -
 * 
 * 3--> PREEMPIVE-
 * 
 * 4--> BEARER TOKEN
 * 
 * 
 * 5--> OAUTH 1.0,2.0
 * 
 * 
 *6--> API KIEY-->
 * 
 * 
 * 
 * 
 * 
 * 
 * 	
 */
	@Test(priority=1)
	void testBasicAuthentication() 
	
     {
		//authentication is part of given method 
		 given()
		  .auth().basic("postman","password")
		 
		  
		  .when()
		    .get("https://postman-echo.com/basic-auth")
		  
		   
		    .then()
		     .statusCode(200)
		      .body("authenticated", equalTo(true))
		       .log().all();
		 
	}
	
	//difference between basic and digest is same the mechanism but the intenal logic is diifferent 
	
	
	@Test(priority = 2)
	void digestAuthentication()
	{
	    
			//authentication is part of given method 
			 given()
			  .auth().digest("postman","password")
			 
			  
			  .when()
			    .get("https://postman-echo.com/basic-auth")
			  
			   
			    .then()
			     .statusCode(200)
			      .body("authenticated", equalTo(true))
			       .log().all();
			 
		
			
	}
	
	@Test(priority=3)
	void testPreemitiveAuthentication()
	{
	    
			//authentication is part of given method 
			 given()
			  .auth().preemptive().basic("postman","password")
			 
			  
			  .when()
			    .get("https://postman-echo.com/basic-auth")
			  
			   
			    .then()
			     .statusCode(200)
			      .body("authenticated", equalTo(true))
			       .log().all();
			 
		
			
	}
	
	
	

}
