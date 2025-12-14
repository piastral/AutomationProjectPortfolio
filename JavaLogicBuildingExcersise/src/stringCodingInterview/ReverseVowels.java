package stringCodingInterview;

public class ReverseVowels {

	public static void main(String[] args) {
		String str = " I love Java";
		  str.toLowerCase();
		  int vowelsCount =0;
		  int consonentCount =0;
		   String vowels=""; 
		   String consonent="";
		 //  StringBuilder sb = new StringBuilder(vowels);
		 StringBuilder sb=null;
		 
		    for(int i =0;i<=str.length()-1;i++) {
		     char ch=	str.charAt(i);
		    	if(ch=='a' || ch=='e' || ch =='i' || ch =='o' || ch =='u') {
		    		 vowelsCount++; 
		    		 
		    		 vowels=vowels+String.valueOf(ch);
		    	      sb = new StringBuilder(vowels);
		    		  sb.reverse();
		    		
		    		// System.out.println(vowels);
		    	}else if (ch>= 'a' && ch<='z') {
		    		consonentCount++;
		    		consonent=  consonent+String.valueOf(ch);
		    	}
		    }
			
			  System.out.println(vowelsCount); 
			  System.out.println(consonentCount);
			  System.out.println("Vowels is :: ==> "+vowels); 
			  System.out.println("The Vowels is Reversed Using String Builder ::-->>  " +sb);
			  System.out.println(consonent);
			 
		
/*
		   3
		   oeaa
		   lvv
*/
	}

}
