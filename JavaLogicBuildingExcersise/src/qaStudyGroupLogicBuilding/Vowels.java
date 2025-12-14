package qaStudyGroupLogicBuilding;

public class Vowels {

  

	public static void main(String[] args) {
		// 3 coding vowels consonent vowels ==>  a e i o u ==>> consonent 
		//  i need to find out how many vowels in string i have and how many consonents we are having 
		
		String str = "i love java" ; //index starts at 0 length-1 -> 9 0-8 
		String input =  str.replace(" ", ""); // 1 target 2 what you wanto replace 
		int vowelsCount = 0; // 5 
		int consonentCount =0;
   String vowels =""; // ioeaa aaeoi
    String Consonent ="";
      StringBuilder sb =null;
		 // 1-i need to find how many vowels i am having and how many consonent i am having 
		//2 print me the vowelsand consonent that is coming in this code 
        // 3 reverse vowels only .
		for(int i =0;i<=input.length()-1;i++) {
			        char ch =     input.charAt(i); //ch i love java ch
			       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') { 
			    	   vowelsCount++; // already a 
			   vowels=vowels+ch; // aeiou
			     sb = new StringBuilder(vowels); 
			     sb.reverse();
			    
			       } else if( ch  >= 'a' && ch <= 'z') { 
			    	  consonentCount++;
			    	Consonent=Consonent+ch;
			       }
			   
		}
		System.out.println("The Reverse vowels are " + sb );
		System.out.println(vowels);
		System.out.println(Consonent);
		System.out.println("Vowels are  " + vowelsCount);
		System.out.println("Consonent are " + consonentCount) ;
		
	}
}
		   
		  

	


