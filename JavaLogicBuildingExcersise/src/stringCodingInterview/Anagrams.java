package stringCodingInterview;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		
		
		//check if two string s are in same length 
		
		String s1 = "listen" ;
		String s2 = "silent" ;
		// 	1 st condition ill check that two string lentgh is same or not 
		
		if(s1.length()==s2.length()) {
			System.out.println(s1.length() + " " + s2.length());
			
			//2nd conditon ill store in character arraty 
			
		char ch1[]=	s1.toCharArray();
		
		char ch2[]=	s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
      
           	System.out.println(Arrays.equals(ch1, ch2));
	
	
		
		
		
		}
	}

}
