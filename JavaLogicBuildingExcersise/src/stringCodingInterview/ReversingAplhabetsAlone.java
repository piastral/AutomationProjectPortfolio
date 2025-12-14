package stringCodingInterview;

public class ReversingAplhabetsAlone {

	public static void main(String[] args) {
		// here reversing alphabets leaving the number alone 
		
		  String input = "abc123pqr45xyz"; //left point -- a ,  right z 0<13
		  input.toLowerCase();
		   
		char ch[] =   input.toCharArray();
		int left =0; int right = input.length()-1;
		
		 while(left<right) {
			if(Character.isDigit(ch[left])) {
				left++;
			}else if(Character.isDigit(ch[right])) {
				right--;
			} else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] =  temp;
				
				left++;
				right--;
				
			}
		}
		String str= String.valueOf(ch);
		 System.out.println(str);

	}

}
