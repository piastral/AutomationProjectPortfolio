package com.testautomation.apitesting.tests;
import static io.restassured.RestAssured.given;


import java.security.KeyPair;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


/*1--> Path Parameter and query parameter 
 * ---> https://reqres.in/api/users?page=2 (lets breakdown)
 * --->https://reqres.in ---> this domain when we type this it directly goes to the server 
 * and then --->https://reqres.in/api/users---> {api/users} --->it is PATH IT IT WILL GO TO API/USERS PATH
 * and than after question mark it is query paramater ---> https://reqres.in/api/users?page=2
 * ---->>[[that means we are saying go to api path then go to users then inside users find page number 2]]
 * 
 * in rest assured lets say we need to play around with some id in some page 
 * so the domain and path we can specify and query parameter we can set or store in one variable and use it
 * -----------------------------------------------------------------------
 * 2--> COOKIES && HEADERS 
 * --> WE CAN also handle cookies and headers 
 * when ever we are sending request a new cookies always gets generate by server so if we want to test 
 * it if it fails then good because cookies are dynamically sent by server it shouldnt be static 
 * if out test fails that mean we are gettign passed in cookies 
 * 	=======>
 * We can also validate header because cokkies will be changes always 
 * but headers will remain constant 
 * 1- we can verify server,also content-type
 * we can also add and() after method chaining 
 * ====
 * 
 * whenever i need to validate the respons i shouldnt use then
 */

public class PathAndQueryParameter_3 {
// https://reqres.in/api/users?page=2&id=5
//==========================================================================================================
	
//	@Test(priority=1)
	void testQueryAndPathParameter()
	{
		//we are trying to store our path parameter in one variable 
		//we are also trying to store two different query parameter in seperate method 
		// we dont need to define /api as path because it is common across all my endpoints 
		given()
		 	
		  .pathParam("myPath","users") //path parameter -->>{users} with curly braces 
		    .queryParam("page",2)            //   query paramater --->>page=2 
		    .queryParam("id", 5)        //  query paramater ---->id=5
		    
		 //if it is path paramaeter we need specify that along with  request in curly braces 
		    //if there is query param it will go along with request we dont need to explicitly mention
		 .when()
		  .get("https://reqres.in/api/{myPath}")
		 
		 
		   .then()
		    .statusCode(200)
		     .log().all();
		   
	}
//============================================================================================================	
	// Setting up cookies and headers 
	
	
//	@Test(priority = 2)
	void testCookies()
	{
		 given()
		 
		   
		   
		 .when()
		    .get("https://www.google.com/")
		     
		  
		 
		  .then()
		    .cookie("AEC","AVcja2daYeG9q_YkbqLnNyH5roHN4Isyp0GFDlN7ihLIBWDhX2XyT5VQ2zA")
		    .log().all();
		
	}
	
	
	//we are trying to cookie info and in return we are storing the response in one RESPONSE VARIABLE
	//because get method retuns  Response thats why we need to store in Response var so that re-use it 
	//so what we did here all the response after get request we have stored i response variable 
	//and then we can use response variable to filter out the specific need.
	
//===========================================================================================================	
	//@Test(priority=3)
	void getCookiesInfo()
	{
   Response res =given()
		 
		   .when()
		    .get("https://www.google.com/");
		     
		     
		 // get single cookie info from res variable //it return String store in String and then print 
           //String cookieValue=res.getCookie("AEC");
       //   System.out.println("Value of Cookie is ====>>>"+(cookieValue));
          
          //now i want to extract all the cookies  all cookies info
          // why 2 string because it returns 2 key value pair 
           //to read all we need use looping statement
           
       Map<String,String> allCookies =  res.getCookies();
       
       //key set is mehod which will only print keys not the values 
       System.out.println("ALL COOKIES INCLUDING KEY AND VALUES "+allCookies);
         Set<String> key =allCookies.keySet();
         System.out.println("This is KEYVALUES " +key);
          
     for(String keyPair:key)
     {
    	 // in the loop inside getCookie (use parameter keypair) everytime it will iterate and get each key
    	 //and its respective value in runtime 
    	 String cookieValue=res.getCookie(keyPair);
    	 System.out.println(key+ "           "+cookieValue  );
    	 
     }
     
     
         
         
     
	}
//==========================================================================================================	
	
	//@Test(priority=4)
	void getHeaders()
	{
		
	given() 
		  
		 
		 
		  .when()
		   .get("https://www.google.com/")
		   
		     
		   .then()
		    .header("Content-Type",  "text/html; charset=ISO-8859-1")
		     .header("Content-Encoding","gzip")
		      .header("Server","gws")
		      //this line will log only headers instead of all 
		       .log().headers();
		      
		    
	
	   
		
		
	}
//===========================================================================================================
	
	//validating the headers response
	
	//@Test(priority=5)
	void getHeadersInfo()
	{
		
	    Response res=  given() 
		 .when()
		   .get("https://www.google.com/");
		   
	   String singleHeader=  res.getHeader("Server");
	    
	   // System.out.println("The Value Of Server is::===> "+singleHeader);
	    
	     //capture all headers info .getname(will give keys) ...,get value will give the values 
	      
	        Headers myHeader =res.getHeaders();
	        for(Header allHeader :myHeader)
	        {
	        	System.out.println(allHeader.getName()+" = "+allHeader.getValue());
	        }
	}
		     
//===========================================================================================================	   
//VALIDATING THE LOG====>>>>>>
	//if we want only bodies log ill say log().body() not all
	// same with headers ,statuscode,cookies
	
	@Test(priority=6)
	void testLogs()
	{
		given()
		
		  
		. when()
		
		
		  .get("https://reqres.in/api/users?page=2")
		  
		   .then()
		     .log().all();
		   
		   
		
	}
//=========================================================================================================	
	
	   
		
		
	
	
	
	
	

}
