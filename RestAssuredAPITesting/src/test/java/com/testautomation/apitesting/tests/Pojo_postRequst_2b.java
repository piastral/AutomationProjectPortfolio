package com.testautomation.apitesting.tests;

public class Pojo_postRequst_2b {
	
// pojo classes uses encapsulation that means hiding the data we haave to use setter and gettr	
	////now we will assignt the data to variable and than we will retrieve the data 
	//setter method will assign the data to the variable 
	//getter method will get the values from variable
	
/*7



POJO(Plain Old Java Object) is nothing but a simple java class which has attributes(Variables) 
and their getter setter methods to manage pojo objects.
 * ===>> pojo class and its rules??
 * 1-> pojo has some rules 
 * 2--> class must be public 
 * 3--> properties/variables must be public 
 * 4--> must have public default constructor 
 * 5--> can have argument constructor also/optional 
 * 6--> every proerty should have public getter and setter 
 * 
 * ==>> its is class which is used for object represnetation of structed data . pojo contains 
 * all the keys as nodes and have getters and seeters to add the abstraction layer 
 * --> pojo class cant extend anyclass that means it shouldnt be child class of anyone 
 * ---> cant implement any interface 
 * --->no outside annotation 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String name;
	String location;
	String phone;
	String courses[];
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String N) {
		this.name = N;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	
	
	
	
	

}
