package collectionFrameworkCodingInterview;

import java.util.HashMap;

public class CountOccurencesOfEachChacterInAnString {
/* String str = "aaabbbccccddd" the outpu should be number of occurence happening in str show me the result 
 * meaning lets say here a---> 3 coming 3 times ,b--->3,c--->4,d--->3
 * 1 approach we can solve it using HashMap because of time complexity 
 * a--> is key --> 3 is repetion count values 
 * 	
 */
	public static void getOccurrences(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		// we are going to convert entire string into charachter array 
		 char ch[]=     str.toCharArray(); //[a][a][a][b][b][c][c][c][c][d][d][d] start from 0 - 11
		
		 // ill iterate 
		 for(char c :ch) {
			 // i m going to insert the character into hashmap 
			 if(map.containsKey(c)) {
				 map.put(c, map.get(c)+1);
			 }else {
				 map.put(c, 1);
			 }
		 }
		 System.out.println(str+ " " + map);
	}
	
	
  
	
	
	public static void main(String[] args) {
		
		String str ="aaabbccccddd";
		getOccurrences(str);
		 
		
	}

}
