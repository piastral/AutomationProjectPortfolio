package qaStudyGroupLogicBuilding;

import java.util.HashMap;

public class CountOccurences {
	
	/* line 19--> c[0] -->[a]
	 * line 20- > //  map.contains  Returns true if this map contains a mapping for the specified key. map.conatins(a) no
	 * 
	 * when map will exist when my map will use map.put(key,"value)
	 */

	public static void main(String[] args) {
		// using hashMap 
		HashMap<Character, Integer> map = new HashMap< >();
		String str ="mah madul";  // count occurrences  a[3] b[2] c[4] d[3] 
	String replace =str.replace(" ", "");
		
		char ch[]=  replace.toCharArray(); //ch[a] ch[a]
		for(char c : ch) { //c--> a[1] ,c-->a c-->a c--> 
			if(map.containsKey(c)) { //no ist Iteration its not there 
				map.put(c, map.get(c) +1); // 2nd iteration map.put(a, 2 )
			} else {
				map.put(c, 1); // c is my key --> e  value 1 a, 1 // now my map exist 2n
			}
		}
              System.out.println(map);
	}

}
