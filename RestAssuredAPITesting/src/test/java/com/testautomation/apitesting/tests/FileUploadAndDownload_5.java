package com.testautomation.apitesting.tests;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FileUploadAndDownload_5 {
/*TOPIC ::==> HOW TO UPLOAD FILE IN API USING REST ASSURED 
 * for practice we can use 
 * https://httpbin.org/post ===> here we can upload a file 
 * 
 * 
 * 
 * 	
 */
	
	@Test(priority=1)
	void uploadFile() 
	{
		// Create File Object 
		File fileUpload =new File("D:\\PostMan_RelatedFiles\\JsonFiles\\FileUpload.txt");
		 
		 //create request ... store url in one baseURI 
		String baseURI="https://httpbin.org/post";
		RequestSpecification  request = given().baseUri(baseURI);
		  
	//multipart takes two argument one is file and one ther is the
		  //reference which points to actual file location..then post the request
		 
	    Response res= request.multiPart("file",fileUpload).post();
	     
	     
	      System.out.println(res.asPrettyString());
	            assertEquals(res.statusCode(), 200);
	            
	            //INTEVRIEW QUESTION WHEN YOU UPLOAD FILE WHAT IS THE CONTENT TYPE ??
	            //ANS===>> multipart/form-data
		 
		 
		
		
		
	}
	
	//we can also upload image in the server 
	
	//@Test(priority=2)
	void uploadImage()
	{
		File fileUpload =new File("D:\\PostMan_RelatedFiles\\JsonFiles\\UpdateRequest.png");
		
		String baseURI="https://petstore.swagger.io/v2/pet/1/uploadImage";
		RequestSpecification  request = given().baseUri(baseURI);
		  Response res= request.multiPart("file",fileUpload).post();
		   System.out.println(res.asPrettyString());
             assertEquals(res.statusCode(), 200);
		
	}
	
	//@Test(priority = 3)
	void downloadFile()
	{
		 
		
		
		
	}
	

}
