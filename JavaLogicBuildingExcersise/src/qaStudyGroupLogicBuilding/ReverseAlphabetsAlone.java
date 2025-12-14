package qaStudyGroupLogicBuilding;

public class ReverseAlphabetsAlone {
// leetcode easy 200
	// Reverse alphabets only. keep the number same

	public static void main(String[] args) {
		
		 String input = "abc123pqr45xyz";   // a, b,c, 1 2 3 p q  r 4 5 x y z // z y x 1 2 3 r  q p 4 5 c b  a b[1]
		 // two pointer technique ist pointer->a   end pointer z  <--
		 
		  input.toLowerCase();                         //[a][b][c]
		  //90 percent string problem we need to change into charArray [ pattern ]
		  
	               char ch[]=input.toCharArray();  //ch[]==>ch[0]-->a[] ch[1]-->b ....
	                
	                //1 st pointer 
	               int left =0;  //2nd pointer
	                int right = input.length()-1;
	                
	                while(left<right) {   // left==right 
	                	                  // left --> starts 0      right starts 13
	                	if(Character.isDigit(ch[left])) { // the character is saying is ch[left] ch[0] -> a is it digit means number ? 
	                		                               //no else if is character is digit ch[right[ ch[13] --> z is it dight No 
	                		                                 //else ch[left] ==> 'a'--> temp =a ch[left] --> ch [right] --z left 
	                		                                // ch[left]==> z[ch]right==> a
	                		left++;
	                	}
	                	else if (Character.isDigit(ch[right])) {
	                		right--;
	                	
	                	} else {
	                		char temp = ch[left];
	                		ch[left] =ch[right];
	                		ch[right] = temp;
	                		
	                		left++;
	                		right--;
	                				
	                	}
	     // alphabets           
	                
	               
	               
		  
		   
	
}
	                
	                System.out.println(ch );
	                	
	                	
	                	
	                }

}
