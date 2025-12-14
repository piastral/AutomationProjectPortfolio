package collectionFrameworkCodingInterview;

public class Paindrome {
	// read the string from right side it will say the same
	// today 1 palindrome ,countOcuurence ,reverseAlhabetsLeave number 
	// tomorrow anagram,panagram,countvowel consonent,remove junk spaces ,remove white spaces string regex 
	// array [bubble sort , sorting algorithm s

	public static void main(String[] args) {
		String str = "miaaim";  //amam 
		String reverse= "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (reverse.equalsIgnoreCase(str)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is Not Palindrome");
		}

		
	}

}
