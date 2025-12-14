package collectionFrameworkCodingInterview;

import java.util.HashMap;

import java.util.Map;

public class CountOccurenceOfList {
	
	public static void main(String[] args) {
		
		// occurence of each word
		
		String[] str  = { "apple","banana","apple","banana","orange"};
	                     

	Map<String ,Integer> map = new HashMap<>();
	 
	
	for(String word : str) {
		 map.put(word ,map.getOrDefault(word, 0) +1);
	 
	}
	System.out.println(map );	
		
	}
	                      
		                
		            
		
	}


